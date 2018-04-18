package com.example.andrew.siderealconfluencetracker.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableDouble;
import android.databinding.ObservableInt;

import com.example.andrew.siderealconfluencetracker.Model.Races.Race;
import com.example.andrew.siderealconfluencetracker.Model.Resources.TokenResourceType;


public class RaceTokenCollectionViewModel extends ViewModel
{
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
        this.pointValue.set(0);
    }

    public void onCreate() { this.race = new Race(); }
    public void onPause() { }
    public void onResume() { }
    public void onDestroy() { }

    public void onIncrementResourceClick(TokenResourceType resourceType)
    {
        race.getTokenResources().incrementResource(resourceType);
        setChangedResource(resourceType);
    }

    public void onDecrementResourceClick(TokenResourceType resourceType)
    {
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
        pointValue.set(race.getTokenResources().getTotalPointValue());
    }
}
