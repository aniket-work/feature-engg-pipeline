package com.aniket.work.core.dataframeprocessor;

import com.aniket.work.core.dataframe.Dataframe;

/**
 The DataframeProcessor interface defines the contract for processing a Dataframe.
 It specifies a method to process a Dataframe of type IN and produce a new Dataframe of type OUT.
 There is a possibility to chain such dataframe processor, in order to maintain consistency across chain
 upon error or null/ empty result from a processor from chain, will result in ignoring rest of the processors in chain
 @param <IN> the type of the input Dataframe
 @param <OUT> the type of the output Dataframe
 */
public interface DataframeProcessor <IN, OUT> {

    /**
     Process the input Dataframe and produce a new Dataframe.
     @param dataframe the input Dataframe to be processed
     @return the processed Dataframe of type OUT
     */
    Dataframe<OUT> processDataframe(Dataframe<IN> dataframe);
}
