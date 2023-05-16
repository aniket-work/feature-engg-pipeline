package com.aniket.work.core.datasensors;

import com.aniket.work.core.dataframe.Dataframe;
import com.aniket.work.core.dataframe.FileDataframe;
import com.aniket.work.core.dataframe.JSONDataframe;
import com.aniket.work.core.dataframe.MetaData;
import com.aniket.work.core.util.FeatureEnggUtils;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Iterator;

import static java.lang.String.format;
@AllArgsConstructor
public class FileDataSensor implements DataSensor<Path> {

    @NonNull
    private Path path;

    private long dataIndex;

    private final static String sensorName = "FILE_DATA_SENSOR";

    @Override
    public void start() throws Exception {
        checkFolder();
        DataSensor.super.start();
    }

    @Override
    public FileDataframe read() throws Exception {
        Iterator<Path> iterator = Files.list(path).filter(Files::isRegularFile).iterator();
        return iterator.hasNext() ? FileDataframe.builder()
                .metaData(new MetaData(++dataIndex, sensorName, LocalDateTime.now()))
                .data(iterator.next())
                .build() : null;
    }

    @Override
    public void stop() throws Exception {
        DataSensor.super.stop();
    }

    private void checkFolder() {
        FeatureEnggUtils.delegateGivenCheck(Files.exists(path), format("Folder for %s doesn't exist", sensorName));
        FeatureEnggUtils.delegateGivenCheck(Files.isDirectory(path), format("Folder for %s isn't really a directory", sensorName));
        FeatureEnggUtils.delegateGivenCheck(Files.isReadable(path), format("Folder for %s isn't really readable", sensorName));
    }
}
