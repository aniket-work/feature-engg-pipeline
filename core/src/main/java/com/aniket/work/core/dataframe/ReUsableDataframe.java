package com.aniket.work.core.dataframe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@SuperBuilder
public class ReUsableDataframe<D> implements Dataframe<D> {

    public MetaData metaData;
    public D data;
}
