package com.aniket.work.core.dataframe;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@NoArgsConstructor
@AllArgsConstructor
public class ThrottleDataframe<D> implements Iterable<Dataframe<D>> {

    @Override
    public Iterator<Dataframe<D>> iterator() {
        return null;
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
