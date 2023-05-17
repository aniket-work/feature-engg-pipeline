package com.aniket.work.core.dataframe;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

@AllArgsConstructor
public class ThrottleDataframe<D> implements Iterable<Dataframe<D>> {

    private List<Dataframe<D>> dataframes = new ArrayList<>();

    public void throttle(final Dataframe<D> dataframe){dataframes.add(dataframe);}
    public void throttleAll(final List<Dataframe<D>> dataframes){dataframes.addAll(dataframes);}

    public void unThrottleAll(final List<Dataframe<D>> dataframes){dataframes.removeAll(dataframes);}
    public void unThrottle(final Dataframe<D> dataframe){dataframes.remove(dataframe);}

    @Override
    public Iterator<Dataframe<D>> iterator() {
        return dataframes.iterator();
    }

    @Override
    public void forEach(Consumer<? super Dataframe<D>> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Dataframe<D>> spliterator() {
        return Iterable.super.spliterator();
    }
}
