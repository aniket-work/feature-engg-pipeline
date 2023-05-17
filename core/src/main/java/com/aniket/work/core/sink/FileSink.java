package com.aniket.work.core.sink;

import com.aniket.work.core.dto.Acknowledgment;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 The FileSink class represents a data sink that writes data to a file.
 It implements the DataSink interface for handling data writing operations.
 */
@AllArgsConstructor
public class FileSink implements DataSink<String> {

    @NonNull
    private Path path;

    /**
     Starts the file sink.
     This method overrides the default implementation in the DataSink interface.
     @throws Exception if an error occurs during the start operation.
     */
    @Override
    public void start() throws Exception {
        DataSink.super.start();
    }

    /**
     Writes the data to the file and returns an acknowledgment.
     @return An acknowledgment representing the status of the sink operation.
     @throws Exception if an error occurs during the sink operation.
     */
    @Override
    public Acknowledgment sink() throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()))) {
            writer.write(getData());// Write the data to the file
        } catch (IOException e) {// Handle any IO errors
            throw new Exception("Error writing data to file: " + e.getMessage());
        }
        return new Acknowledgment("Sink successful", "FileSink", "SUCCESS");// Return a success acknowledgment
    }

    /**

     Stops the file sink.
     This method overrides the default implementation in the DataSink interface.
     @throws Exception if an error occurs during the stop operation.
     */
    @Override
    public void stop() throws Exception {
        DataSink.super.stop();
    }
    /**

     Utility method to get the data to be written to the file.
     This can be modified based on your requirements.
     @return The data to be written.
     */
    private String getData() {
        return "Sample data";// Return the data to be written
    }
}