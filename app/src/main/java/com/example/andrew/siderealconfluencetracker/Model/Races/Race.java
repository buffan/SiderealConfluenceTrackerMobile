package com.example.andrew.siderealconfluencetracker.Model.Races;

import com.example.andrew.siderealconfluencetracker.Model.Resources.Converter;
import com.example.andrew.siderealconfluencetracker.Model.Resources.TokenResourceCollection;

public class Race {
    private TokenResourceCollection tokenResources;

    public Race()
    {
        tokenResources = new TokenResourceCollection.TokenResourceCollectionBuilder().build();
    }

    public TokenResourceCollection getTokenResources()
    {
        return tokenResources;
    }

    public void addTokenResources(TokenResourceCollection resources)
    {
        tokenResources = tokenResources.add(resources);
    }

    public void subtractTokenResources(TokenResourceCollection resources)
    {
        tokenResources = tokenResources.subtract(resources);
    }

    public void runConverter(Converter converter)
    {
        tokenResources.add(converter.getOutputs());
        tokenResources.subtract(converter.getInputs());
    }

}
