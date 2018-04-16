package com.example.andrew.siderealconfluencetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrew.siderealconfluencetracker.Races.Race;
import com.example.andrew.siderealconfluencetracker.Resources.Resource;

public class MainActivity extends AppCompatActivity {

    Race myRace;

    TextView blueCount;
    TextView yellowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRace = new Race();

        blueCount = (TextView) findViewById(R.id.blueCounter);
        blueCount.setText(Integer.toString(myRace.blueInInventory));

        yellowCount = (TextView) findViewById(R.id.yellowCounter);
        yellowCount.setText(Integer.toString(myRace.yellowInInventory));
    }

    public void IncrementBlue(View view) {
        myRace.AddResource(Resource.TokenResource.BLUE, 1);
        Toast.makeText(this, String.format("Blues: %d", myRace.blueInInventory), Toast.LENGTH_SHORT).show();
    }

    public void DecrementBlue(View view) {
        myRace.AddResource(Resource.TokenResource.BLUE, -1);
        Toast.makeText(this, String.format("Blues: %d", myRace.blueInInventory), Toast.LENGTH_SHORT).show();

    }

    public void IncrementYellow(View view) {
        myRace.AddResource(Resource.TokenResource.YELLOW, 1);
        Toast.makeText(this, String.format("Yellows: %d", myRace.yellowInInventory), Toast.LENGTH_SHORT).show();

    }

    public void DecrementYellow(View view) {
        myRace.AddResource(Resource.TokenResource.YELLOW, -1);
        Toast.makeText(this, String.format("Yellows: %d", myRace.yellowInInventory), Toast.LENGTH_SHORT).show();

    }
}
