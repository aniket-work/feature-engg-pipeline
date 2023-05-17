package com.aniket.work.core.filter;

import com.aniket.work.core.dataframe.Dataframe;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class SpecificContainsDFFilter implements DataframeFilter<String> {

    @NonNull
    private String specificContains;

    @Override
    public Dataframe<String> processDataframe(Dataframe<String> dataframe) {
        String data = dataframe.getData();
        if(data != null && data.contains(specificContains)){return dataframe;}else{return null;}
    }
}
