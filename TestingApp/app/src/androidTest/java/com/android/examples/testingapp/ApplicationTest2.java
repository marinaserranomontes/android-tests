package com.android.examples.testingapp;

import android.content.Context;
import android.test.ApplicationTestCase;

public class ApplicationTest2 extends ApplicationTestCase<MyApplication>{

    public ApplicationTest2(Class<MyApplication> applicationClass) {
        super(applicationClass);
    }

    public ApplicationTest2() {
        super(MyApplication.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Override
    public Context getSystemContext() {
        return super.getSystemContext();
    }

    public void testCreateApp(){
        createApplication();
    }

}
