package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }


        public String toString()
        {
            // TODO: Complete this method
            return value + "C";
        }

        @Override
        public Temperature toCelsius() {
            return new Celsius(value);
        }

        @Override
        public Temperature toFahrenheit() {
            return new Fahrenheit((value*9/5)+32);

        }
}
