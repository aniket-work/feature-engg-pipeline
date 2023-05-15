package com.aniket.work.core.dataframe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@SuperBuilder
@NoArgsConstructor
public class ReUsableDataframe<D> implements Dataframe<D> {

    protected MetaData metaData;
    protected D data;
}
