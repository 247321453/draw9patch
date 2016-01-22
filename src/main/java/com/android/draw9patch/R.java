package com.android.draw9patch;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2016/1/22.
 */
public class R {
    private static final String BUNDLE_NAME = "com.android.draw9patch.string";

    private static final ResourceBundle RESOURCE_BUNDLE;

    static {
        RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());
    }

    public static String getString(String key) {
        String str = "";
        if (key == null)
            return "";
        key = key.trim();
        try {
            str = RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            str = key.replace("_", " ");
        }
        try {
            str = new String(str.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            str = key.replace("_", " ");
        }
        return str;
    }
    public final static class string{
        public static final String png_fileter = getString("png_fileter");
    }
}
