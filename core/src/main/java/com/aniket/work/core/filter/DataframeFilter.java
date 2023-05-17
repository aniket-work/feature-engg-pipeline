package com.aniket.work.core.filter;

import com.aniket.work.core.dataframe.Dataframe;
import com.aniket.work.core.dataframeprocessor.DataframeProcessor;

/**
    The DataframeFilter interface extends the DataframeProcessor interface and specifies the contract for filtering a Dataframe.
    It defines a method to filter a Dataframe of type FL and produce a new Dataframe of the same type.
    Filters can be used to selectively extract and manipulate data based on specific criteria.
    By implementing this interface, a class can define its own filtering logic for a Dataframe.
    @param <FL> the type of the Dataframe to be filtered
*/
public interface DataframeFilter<FL> extends DataframeProcessor<FL, FL> {

    /**
     Filters the input Dataframe and produces a new filtered Dataframe.
     @param dataframe the input Dataframe to be filtered
     @return the filtered Dataframe of the same type FL
     */
    @Override
    Dataframe<FL> processDataframe(Dataframe<FL> dataframe);
}
