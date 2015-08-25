package com.android.examples.testingapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import examples.android.com.testingapp.R;


public class MainActivity extends Activity {
    public Book myBook;
    public TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView = (TextView)findViewById(R.id.book_view);
        myBook = new Book("The little Prince", "Antoine de Saint Exupéry");

        mView.setText(myBook.getTitle());
    }


}
