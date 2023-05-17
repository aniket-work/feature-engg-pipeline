package com.aniket.work.core.sink;

import com.aniket.work.core.dto.Acknowledgment;

/**
    This interface represents a data sink, which is responsible for writing data to a specific destination.
    It provides methods for starting, writing, and stopping the data sink.
    @param <DS> The type of data to be written by the data sink.
*/
public interface DataSink<DS> {

    /**
     Starts the data sink. Implementations may override this method to perform any necessary initialization steps.
     @throws Exception if an error occurs during the start operation.
     */
    default void start() throws Exception {}

    /**
     Writes the data to the destination and returns a data frame representing the written data.
     @return A data frame containing the written data.
     @throws Exception if an error occurs during the write operation.
     */
    Acknowledgment sink() throws Exception;

    /**
     Stops the data sink. Implementations may override this method to perform any necessary cleanup or finalization steps.
     @throws Exception if an error occurs during the stop operation.
     */
    default void stop() throws Exception {}
}


