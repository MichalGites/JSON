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
            // teraz tablica - argumentem jest nazwa tablicy z pliku JSON
            JSONArray colorArray = bigO.getJSONArray("colorsArray");
            // teraz wszystkie elementy tablicy
            for (int i=0; i<colorArray.length();i++){
                // każdy element to JSONObject bo ma nawiasy klamrowe
                JSONObject row = colorArray.getJSONObject(i);
                // jako argument podajemy klucz po którym będzie szukało wartości
                Log.e("debug", "Nazwa koloru: "+ row.getString("colorName"));
                Log.e("debug", "Wartość hex: "+ row.getString("hexValue"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
