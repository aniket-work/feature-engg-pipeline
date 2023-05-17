package com.aniket.work.core.filter;

import com.aniket.work.core.dataframe.Dataframe;

public class NonePayloadDFFilter implements DataframeFilter<String> {

    @Override
    public Dataframe<String> processDataframe(Dataframe<String> dataframe) {
        String data = dataframe.getData();
        if(data == null || data.isEmpty()){return null;}else{return dataframe;}
    }
}
