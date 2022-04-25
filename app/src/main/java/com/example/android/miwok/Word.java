package com.example.android.miwok;

public class Word {

   private String miwok_translation;
   private String default_translation;

   public Word(String miwok ,  String def){
       miwok_translation = miwok;
       default_translation = def;
   }

   public String getDefault_translation(){
       return default_translation;
   }

   public String getMiwok_translation(){
       return miwok_translation;
   }

}
