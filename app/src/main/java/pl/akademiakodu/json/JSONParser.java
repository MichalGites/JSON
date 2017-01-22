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

}
