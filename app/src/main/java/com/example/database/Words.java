package com.example.database;

import android.provider.BaseColumns;
import android.provider.SearchRecentSuggestions;


public class Words {
    public Words(){

    }
    public static abstract class Word implements BaseColumns{
        public static final String Table_name="words";
        public static final String Column_name_word="word";
        public static final String Column_name_meaning="meaning";
        public static final String Column_name_sample="sample";

    }

}
