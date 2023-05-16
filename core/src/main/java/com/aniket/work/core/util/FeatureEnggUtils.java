package com.aniket.work.core.util;


public abstract class FeatureEnggUtils {

    private FeatureEnggUtils(){}

    public static void delegateGivenCheck(boolean assertion, String message) {
        if (!assertion) {
            throw new IllegalArgumentException(message);
        }
    }
}
