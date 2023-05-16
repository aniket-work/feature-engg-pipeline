package com.aniket.work.core.datasensors;


import com.aniket.work.core.dataframe.Dataframe;

/**
    The DataSensor interface represents a data sensor that can read and provide dataframes of type DS.
    @param <DS> the type of the dataframes read by the sensor
 */
public interface DataSensor<DS> {

    /**
     Starts the data sensor.
     This method can be overridden to provide custom logic for starting the sensor.
     @throws Exception if an error occurs while starting the sensor
     */
    default void start() throws Exception{}

    /**
     Reads and retrieves a dataframe from the sensor.
     @return the dataframe of type DS read by the sensor
     @throws Exception if an error occurs while reading the dataframe
     */
    Dataframe<DS> read() throws Exception;

    /**
     Stops the data sensor.
     This method can be overridden to provide custom logic for stopping the sensor.
     @throws Exception if an error occurs while stopping the sensor
     */
    default void stop() throws Exception{}
}
