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
                "   \"data\": [\n" +
                "      {\n" +
                "         \"id\": \"X999_Y999\",\n" +
                "         \"from\": {\n" +
                "            \"name\": \"Tom Brady\", \"id\": \"X12\"\n" +
                "         },\n" +
                "         \"message\": \"Looking forward to 2010!\",\n" +
                "         \"actions\": [\n" +
                "            {\n" +
                "               \"name\": \"Comment\",\n" +
                "               \"link\": \"http://www.facebook.com/X999/posts/Y999\"\n" +
                "            },\n" +
                "            {\n" +
                "               \"name\": \"Like\",\n" +
                "               \"link\": \"http://www.facebook.com/X999/posts/Y999\"\n" +
                "            }\n" +
                "         ],\n" +
                "         \"type\": \"status\",\n" +
                "         \"created_time\": \"2010-08-02T21:27:44+0000\",\n" +
                "         \"updated_time\": \"2010-08-02T21:27:44+0000\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"id\": \"X998_Y998\",\n" +
                "         \"from\": {\n" +
                "            \"name\": \"Peyton Manning\", \"id\": \"X18\"\n" +
                "         },\n" +
                "         \"message\": \"Where's my contract?\",\n" +
                "         \"actions\": [\n" +
                "            {\n" +
                "               \"name\": \"Comment\",\n" +
                "               \"link\": \"http://www.facebook.com/X998/posts/Y998\"\n" +
                "            },\n" +
                "            {\n" +
                "               \"name\": \"Like\",\n" +
                "               \"link\": \"http://www.facebook.com/X998/posts/Y998\"\n" +
                "            }\n" +
                "         ],\n" +
                "         \"type\": \"status\",\n" +
                "         \"created_time\": \"2010-08-02T21:27:44+0000\",\n" +
                "         \"updated_time\": \"2010-08-02T21:27:44+0000\"\n" +
                "      }\n" +
                "   ]\n" +
                "}");
    }
}
