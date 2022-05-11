package br.com.app.travellingapp.util;

import androidx.annotation.NonNull;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int quatindadeDeDias) {
        if (quatindadeDeDias > 1) {
            return quatindadeDeDias + PLURAL;
        }
        return quatindadeDeDias + SINGULAR;
    }
}
