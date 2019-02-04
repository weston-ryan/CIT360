package com.example.neldo.atm;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class AndroidExample {
    @Test
    public void useAppContext() throws Exception {
               Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.neldo.atm", appContext.getPackageName());
    }
}
