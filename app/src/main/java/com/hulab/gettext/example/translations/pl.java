// This file has been dynamically generated by po-compile.
// Do not modify it, all changes will be lost.

package com.hulab.gettext.example.translations;

public class pl extends com.hulab.gettext.Messages {

    public pl() {
        plurals.put(
            new Plural("%# file.", "%# files."),
            new String[] {
                "%# plik.",
                "%# pliki.",
                "%# plików.",
            }
        );
    }

    @Override
    protected int plural(int n) {
        return (n==1 ? 0 : n%10>=2 && n%10<=4 && (n%100<10 || n%100>=20) ? 1 : 2);
    }
}