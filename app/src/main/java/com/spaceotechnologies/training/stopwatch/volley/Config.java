package com.spaceotechnologies.training.stopwatch.volley;

import java.util.Formatter;

/**
 * Created by Kostez on 02.09.2016.
 */
public class Config {

    public static final String DATA_URL = "http://api.oboobs.ru";
    public static final String IMAGE_DATA_URL = "http://media.oboobs.ru";

    public static final String TAG_MODEL = "model";
    public static final String TAG_IMAGE_URL = "preview";
    public static final String TAG_ID = "id";
    public static final String TAG_RANK = "rank";
    public static final String TAG_AUTHOR = "author";

    public static String getRequest(int offset, int limit) {
        return new Formatter().format("/boobs/%d/%d/date/", offset, limit).toString();
    }

}