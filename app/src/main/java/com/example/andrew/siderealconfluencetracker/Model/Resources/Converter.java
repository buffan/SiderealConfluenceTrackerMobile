package com.example.andrew.siderealconfluencetracker.Model.Resources;

import android.media.session.MediaSession;

public class Converter
{
    private TokenResourceCollection inputs;
    private TokenResourceCollection outputs;

    public Converter(TokenResourceCollection inputs, TokenResourceCollection outputs)
    {
        this.inputs = inputs;
        this.outputs = outputs;
    }

    public TokenResourceCollection getInputs()
    {
        return inputs;
    }

    public TokenResourceCollection getOutputs()
    {
        return outputs;
    }
}
