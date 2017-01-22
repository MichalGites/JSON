package pl.akademiakodu.json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Michał on 2017-01-22.
 */

public class JSONParser {

    // pusty konstruktor
    public JSONParser(){}

    public void readJSON (String s){
        // walidujemy dane po kolei najpierw obiekt JSON
            try {
                JSONObject bigO = new JSONObject(s);
                // następnie główna tablica - argument to nazwa tej tablicy
                JSONArray dataArray = bigO.getJSONArray("data");
                // pętla po wszystkich obiektach (wierszach) tablicy
                for (int i=0; i<dataArray.length();i++){
                    // dostęp do pojedynczego wiersza głównej tablicy
                    JSONObject row = dataArray.getJSONObject(i);
                    // dostęp do tablicy będącej elementem pojedynczego wiersza tabluicy głównej
                    JSONArray actionsArray = row.getJSONArray("actions");
                    // pętla po wszytskich wierszach tej tablicy podrzędnej
                    for (int x = 0; x<actionsArray.length();x++){
                        // dostęp do pojedynczego wiersza tablicy podrzędnej
                        JSONObject rowActions = actionsArray.getJSONObject(x);
                        // wyświetlenie danych z pojedynczego wiersza tablicy podrzędnej
                        Log.e("debug", "Nazwa akcji: "+rowActions.getString("name"));
                        Log.e("debug", "Link akcji: "+rowActions.getString("link"));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
    }

}
