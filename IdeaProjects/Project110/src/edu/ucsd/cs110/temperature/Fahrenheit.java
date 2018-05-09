package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Fahrenheit temp = new Fahrenheit(this.getValue());
        float tempo = (float) ((temp.getValue()-32)/1.8);
        temp = new Fahrenheit(tempo);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return "" + this.getValue() + " F";
    }
}
