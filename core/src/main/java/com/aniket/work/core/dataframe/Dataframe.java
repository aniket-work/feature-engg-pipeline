package com.aniket.work.core.dataframe;

/**
 * Dataframe is a single datapoint in time, which can take any form, like if we are looking at database, then its
 * single entry in table, if we consider it as inserting on kafka it's a single message on kafka partition
 * @param <D> : Nature of Dataframe (aka type of dataframe)
 */
public interface Dataframe<D> {

    MetaData getMetaData();

    D getData();
}
