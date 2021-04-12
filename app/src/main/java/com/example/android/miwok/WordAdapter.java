package com.example.android.miwok;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    private int mcolorresourceid;

   public WordAdapter(Activity context, ArrayList<Word> words,int colorresourceid) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mcolorresourceid=colorresourceid;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView= convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentword =(Word) getItem(position);

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentword.getdefalttranslation());

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView .setText(currentword.getmiwoktranslation());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image_resource);

        if(currentword.hasimage()){
            imageView.setImageResource(currentword.getImageresourceid());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textcontainer=(View)listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mcolorresourceid);

        textcontainer.setBackgroundColor(color);



        return listItemView;
    }
}
