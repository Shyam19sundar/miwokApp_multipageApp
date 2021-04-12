package com.example.android.miwok;

public class Word {
        private String mDefaltTranslation;
        private String mMiwokTranslation;
        private int mImageresourceid= NO_IMAGE;
        private static final int  NO_IMAGE =-1;

        public Word(String defalttranslation, String miwoktranslation){
            mDefaltTranslation=defalttranslation;
            mMiwokTranslation=miwoktranslation;
        }

        public Word(String DefaltTranslation, String MiwokTranslation, int Imageresourceid){
            mDefaltTranslation=DefaltTranslation;
            mImageresourceid=Imageresourceid;
            mMiwokTranslation=MiwokTranslation;
        }

        public int getImageresourceid(){return mImageresourceid;}

        public String getdefalttranslation(){
            return mDefaltTranslation;
        }

        public String getmiwoktranslation(){
            return mMiwokTranslation;
        }

        public boolean hasimage(){
            return mImageresourceid!=NO_IMAGE;
        }

}



