package pl.akademiakodu.json;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Michał on 2017-01-22.
 */

public class JSONParser {

    // pusty konstruktor
    public JSONParser(){

        new AsyncWWW().execute("http://projekt.techloft.pl/akademiakodu/dane.php");

    }

    public void readJSON (String s){
        try {
            JSONObject bigO = new JSONObject(s);
            JSONArray markersArray = bigO.getJSONArray("markers");
            for (int i = 0; i<markersArray.length();i++) {
                JSONObject row = markersArray.getJSONObject(i);
                Log.e("debug", "Informacja: "+row.getString("information"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    // operacje na Internecie w Androidzie robimy zawsze w oddzielnym watku a wiec AsyncTask

    public String makeCall (String url){
        String response = null;
        // konwersja ciagu znakow na URL
        StringBuilder builder = new StringBuilder();
        Log.e("internet", "Lacze ze strona internetowa");
        try {
            URL trueUrl = new URL (url);
            // strumieniowe otwarcie polaczenia ze strona internetowa
            HttpURLConnection conn = (HttpURLConnection) trueUrl.openConnection();
            // przechwycenie strumienia polaczenia i odczytanie danych z niego
            InputStream inputStream = new BufferedInputStream(conn.getInputStream());
            // BufferedReader czyli wszystkie linijki naszej strony
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Log.e("internet", "Pobieram dane ze strony");
            while ((response = bufferedReader.readLine()) != null){
                // za pomoca buildera odczytujemy dane ze strony dodajac przypisane response typu String oraz nowa linie
                // zeby kollejna linijka strony byla kolejna linijka buildera, nie zleje sie w jedno dzieki temu
                builder.append(response).append("\n");
            }
            inputStream.close();
            Log.e("internet", builder.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();

    }

    private class AsyncWWW extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {
            Log.e("internet", "Uruchomienie z poziomu innego watku");
            return makeCall(strings[0]);
        }

        @Override
        protected void onPostExecute(String s){
            readJSON(s);
        }
    }

}
