package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Celsius temp = new Celsius(this.getValue());
        float tempo = (float) ((temp.getValue()*(1.8))+32);
        temp = new Celsius(tempo);
        return temp;
    }

    public String toString()
    {
        return "" + this.getValue() + " C";
    }
}