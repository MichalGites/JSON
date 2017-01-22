package pl.akademiakodu.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        JSONParser parser = new JSONParser();
        parser.readJSON("{\n" +
                "    \"colorsArray\":[{\n" +
                "            \"colorName\":\"red\",\n" +
                "            \"hexValue\":\"#f00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"green\",\n" +
                "            \"hexValue\":\"#0f0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"blue\",\n" +
                "            \"hexValue\":\"#00f\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"cyan\",\n" +
                "            \"hexValue\":\"#0ff\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"magenta\",\n" +
                "            \"hexValue\":\"#f0f\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"yellow\",\n" +
                "            \"hexValue\":\"#ff0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"colorName\":\"black\",\n" +
                "            \"hexValue\":\"#000\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");
    }
}
