package com.aniket.work.core.marshaller;

import com.aniket.work.core.dataframe.Dataframe;
import com.aniket.work.core.dataframeprocessor.DataframeProcessor;

/**
    The DataframeMarshaller interface extends the DataframeProcessor interface and defines the contract for marshalling input
    Dataframes of type IN into output Dataframes of type OUT. It specifies a method for processing the input Dataframe and
    generating a new Dataframe with marshalled data.
    @param <IN> the type of the input Dataframe
    @param <OUT> the type of the output Dataframe
 */
public interface DataframeMarshaller<IN, OUT> extends DataframeProcessor<IN, OUT> {

    /**
     Processes the input Dataframe and generates a new Dataframe with marshalled data.
     @param dataframe the input Dataframe to be marshalled
     @return the marshalled Dataframe of type OUT
     */
    @Override
    Dataframe<OUT> processDataframe(Dataframe<IN> dataframe);
}