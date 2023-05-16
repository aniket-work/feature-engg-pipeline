package com.aniket.work.core.datasensors;

import com.aniket.work.core.dataframe.JSONDataframe;
import com.aniket.work.core.dataframe.MetaData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.util.Objects;

public class JSONDataSensor implements DataSensor<Object> {

    private Class<?> jsonClass;
    private long dataIndex;
    private String data;
    private ObjectMapper objectMapper;
    private final static String sensorName = "JSON_DATA_SENSOR";

    public JSONDataSensor(Class<?> jsonClass, String data){
        this.jsonClass  = jsonClass;
        this.data       = data;
    }

    @Override
    public void start() throws Exception {
        DataSensor.super.start();
        objectMapper = new ObjectMapper();
    }

    @Override
    public JSONDataframe read() throws Exception {
        Object jsonObject = objectMapper.readValue(this.data, this.jsonClass);

        return Objects.isNull(jsonObject)? null : JSONDataframe.builder()
                .metaData(new MetaData(++dataIndex, sensorName, LocalDateTime.now()))
                .data(jsonObject)
                .build();
    }

    @Override
    public void stop() throws Exception {
        DataSensor.super.stop();
    }
}
