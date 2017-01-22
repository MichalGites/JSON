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
        parser.readJSON("{\"markers\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"point\":\"new GLatLng(40.266044,-74.718479)\", \n" +
                "\t\t\t\"homeTeam\":\"Lawrence Library\",\n" +
                "\t\t\t\"awayTeam\":\"LUGip\",\n" +
                "\t\t\t\"markerImage\":\"images/red.png\",\n" +
                "\t\t\t\"information\": \"Linux users group meets second Wednesday of each month.\",\n" +
                "\t\t\t\"fixture\":\"Wednesday 7pm\",\n" +
                "\t\t\t\"capacity\":\"\",\n" +
                "\t\t\t\"previousScore\":\"\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"point\":\"new GLatLng(40.211600,-74.695702)\",\n" +
                "\t\t\t\"homeTeam\":\"Hamilton Library\",\n" +
                "\t\t\t\"awayTeam\":\"LUGip HW SIG\",\n" +
                "\t\t\t\"markerImage\":\"images/white.png\",\n" +
                "\t\t\t\"information\": \"Linux users can meet the first Tuesday of the month to work out harward and configuration issues.\",\n" +
                "\t\t\t\"fixture\":\"Tuesday 7pm\",\n" +
                "\t\t\t\"capacity\":\"\",\n" +
                "\t\t\t\"tv\":\"\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"point\":\"new GLatLng(40.294535,-74.682012)\",\n" +
                "\t\t\t\"homeTeam\":\"Applebees\",\n" +
                "\t\t\t\"awayTeam\":\"After LUPip Mtg Spot\",\n" +
                "\t\t\t\"markerImage\":\"images/newcastle.png\",\n" +
                "\t\t\t\"information\": \"Some of us go there after the main LUGip meeting, drink brews, and talk.\",\n" +
                "\t\t\t\"fixture\":\"Wednesday whenever\",\n" +
                "\t\t\t\"capacity\":\"2 to 4 pints\",\n" +
                "\t\t\t\"tv\":\"\"\n" +
                "\t\t}\n" +
                "] }");
    }
}
