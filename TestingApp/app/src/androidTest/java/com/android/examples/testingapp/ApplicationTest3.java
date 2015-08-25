package com.android.examples.testingapp;

import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.widget.TextView;

import examples.android.com.testingapp.R;

public class ApplicationTest3 extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mActivity;
    TextView mView;

    public ApplicationTest3(Class activityClass) {
        super(activityClass);
    }

    public ApplicationTest3(){
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity
                .findViewById(R.id.book_view);
    }

    public void testPreconditions() {
        assertNotNull(mView);
    }

    public void testText() {
        assertEquals(mActivity.myBook.getTitle(), (String) mView.getText());
    }
}
