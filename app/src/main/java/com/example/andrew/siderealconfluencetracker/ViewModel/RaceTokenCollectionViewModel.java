package com.example.andrew.siderealconfluencetracker.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableDouble;
import android.databinding.ObservableInt;
import android.util.Log;
import android.view.View;

import com.example.andrew.siderealconfluencetracker.Model.Races.Race;
import com.example.andrew.siderealconfluencetracker.Model.Resources.TokenResourceType;


public class RaceTokenCollectionViewModel extends ViewModel
{
    private static final String TAG ="ViewModel";

    private Race race;

    public ObservableInt blueCount;
    public ObservableInt blackCount;
    public ObservableInt brownCount;
    public ObservableInt cylinderCount;
    public ObservableInt whiteCount;
    public ObservableInt greenCount;
    public ObservableInt yellowCount;
    public ObservableInt shipCount;

    public ObservableDouble pointValue;

    public RaceTokenCollectionViewModel()
    {
        this.race = new Race();
        this.pointValue.set(race.getTokenResources().getTotalPointValue());
        this.blueCount.set(race.getTokenResources().getBlue());
        this.yellowCount.set(race.getTokenResources().getYellow());
    }

    public void onCreate()
    {
        this.race = new Race();
        this.pointValue.set(race.getTokenResources().getTotalPointValue());
        this.blueCount.set(race.getTokenResources().getBlue());
        this.yellowCount.set(race.getTokenResources().getYellow());
    }
    public void onPause() { }
    public void onResume() { }
    public void onDestroy() { }

    public void onIncrementResourceClick(TokenResourceType resourceType)
    {
        Log.i(TAG, "Increment clicked: ".concat(resourceType.toString()));
        race.getTokenResources().incrementResource(resourceType);
        setChangedResource(resourceType);
    }

    public void onDecrementResourceClick(TokenResourceType resourceType)
    {
        Log.i(TAG, "Decrement clicked: ".concat(resourceType.toString()));
        race.getTokenResources().decrementResource(resourceType);
        setChangedResource(resourceType);
    }

    private void setChangedResource(TokenResourceType resourceType)
    {
        switch (resourceType)
        {
            case CYLINDER: cylinderCount.set(race.getTokenResources().getCylinder()); break;
            case BLUE: blueCount.set(race.getTokenResources().getBlue()); break;
            case BLACK: blackCount.set(race.getTokenResources().getBlack()); break;
            case YELLOW: yellowCount.set(race.getTokenResources().getYellow()); break;
            case BROWN: brownCount.set(race.getTokenResources().getBrown()); break;
            case GREEN: greenCount.set(race.getTokenResources().getGreen()); break;
            case WHITE: whiteCount.set(race.getTokenResources().getWhite()); break;
            case SHIP: shipCount.set(race.getTokenResources().getShip()); break;
        }
    }

    public void onGetPointValueClick()
    {
        Log.i(TAG, "Get point total clicked");
        pointValue.set(race.getTokenResources().getTotalPointValue());
    }
}
