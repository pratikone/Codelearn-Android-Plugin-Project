package com.example.test.activity;

import com.example.twit.MainActivity;
import com.example.twit.R;
import com.example.test.runner.SampleTestRunner;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


@RunWith(SampleTestRunner.class)
public class SampleTest {
	

	
	@Test
    public void testBasicResourceValue() throws Exception {
        String helloFromActivity = new MainActivity().getResources().getString(R.string.hello_world);
        assertThat(helloFromActivity, equalTo("Hello world!"));
    }
}
