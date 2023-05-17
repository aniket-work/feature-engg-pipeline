package com.aniket.work.core.filter;

import com.aniket.work.core.dataframe.Dataframe;

import java.lang.reflect.Field;


public class FieldMatchingDFFilter<T> implements DataframeFilter<T> {

    private String fieldName;
    private String fieldValue;

    public FieldMatchingDFFilter(String fieldName, String fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    @Override
    public Dataframe<T> processDataframe(Dataframe<T> dataframe) {
        T data = dataframe.getData();
        try {
            Field field = data.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object value = field.get(data);

            if (value != null && value.toString().equals(fieldValue)) {
                return dataframe; // Include the dataframe in the result
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
