package com.example.andrew.siderealconfluencetracker.Races;

import com.example.andrew.siderealconfluencetracker.Resources.Resource;

public class Race {
    public int blueInInventory;
    public int yellowInInventory;

    public Race()
    {
        blueInInventory = 0;
        yellowInInventory = 0;
    }

    public void AddResource(Resource.TokenResource resourceType, int quantity)
    {
        switch (resourceType)
        {
            case BLUE:
                blueInInventory += quantity;
                break;
            case YELLOW:
                yellowInInventory += quantity;
                break;
        }
    }

}
