package com.aniket.work.core.mapper;

import com.aniket.work.core.dataframe.Dataframe;
import com.aniket.work.core.dataframeprocessor.DataframeProcessor;

/**
    The DataframeMapper interface extends the DataframeProcessor interface and serves as a contract for mapping input Dataframes
    of type IN to output Dataframes of type OUT. It defines a method for processing the input Dataframe and producing a new
    Dataframe with transformed or mapped data.
    @param <IN> the type of the input Dataframe
    @param <OUT> the type of the output Dataframe
 */
public interface DataframeMapper<IN, OUT> extends DataframeProcessor<IN, OUT> {

    /**
        Processes the input Dataframe and produces a new Dataframe with transformed or mapped data.
        @param dataframe the input Dataframe to be mapped
        @return the mapped Dataframe of type OUT
     */
    @Override
    Dataframe<OUT> processDataframe(Dataframe<IN> dataframe);
}
