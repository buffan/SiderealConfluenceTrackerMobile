package com.example.andrew.siderealconfluencetracker;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrew.siderealconfluencetracker.Model.Races.Race;
import com.example.andrew.siderealconfluencetracker.Model.Resources.TokenResourceType;
import com.example.andrew.siderealconfluencetracker.ViewModel.RaceTokenCollectionViewModel;
import com.example.andrew.siderealconfluencetracker.databinding.ActivityMainBinding;

import java.util.Locale;
import java.util.Observer;

public class MainActivity extends AppCompatActivity
{
    Race myRace = new Race();
    RaceTokenCollectionViewModel viewModel = new RaceTokenCollectionViewModel(myRace);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
        //setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }


    /*
    public void incrementBlue(View view) {
        myRace.getTokenResources().incrementResource(TokenResourceType.BLUE);
        Toast.makeText(this, String.format(Locale.getDefault(), "Blues: %d", myRace.getTokenResources().getBlue()), Toast.LENGTH_SHORT).show();
    }

    public void decrementBlue(View view) {
        myRace.getTokenResources().decrementResource(TokenResourceType.BLUE);
        Toast.makeText(this, String.format("Blues: %d", myRace.getTokenResources().getBlue()), Toast.LENGTH_SHORT).show();
    }

    public void incrementYellow(View view) {
        myRace.getTokenResources().incrementResource(TokenResourceType.YELLOW);
        Toast.makeText(this, String.format("Yellows: %d", myRace.getTokenResources().getYellow()), Toast.LENGTH_SHORT).show();
    }

    public void decrementYellow(View view) {
        myRace.getTokenResources().decrementResource(TokenResourceType.YELLOW);
        Toast.makeText(this, String.format("Yellows: %d", myRace.getTokenResources().getYellow()), Toast.LENGTH_SHORT).show();
    }
    */
}
