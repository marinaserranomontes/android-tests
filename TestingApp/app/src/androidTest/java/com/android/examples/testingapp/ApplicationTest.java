package com.android.examples.testingapp;

import android.content.Context;
import android.test.AndroidTestCase;
import android.test.mock.MockContext;

public class ApplicationTest extends AndroidTestCase {
    Context mContext;
    Book myBook;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mContext = new MockContext();

        setContext(mContext);

        assertNotNull(mContext);
        myBook = new Book("The little Prince", "Antoine de Saint Exupéry");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSomething(){
        assertEquals(8, 8);
    }

    public void testBookTitle(){
        assertNotNull(myBook.getTitle());
    }
}