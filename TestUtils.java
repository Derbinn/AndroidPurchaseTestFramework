package com.mypackage; 

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;

import android.util.Log;

import static androidx.test.espresso.assertion.ViewAssertions.matches;

public class TestUtils {

    // Method to wait for screen to load
    public static void waitForScreenToLoad(int viewId, String screenName) {
        Espresso.onView(ViewMatchers.withId(viewId))
                .check(matches(ViewMatchers.isDisplayed()));
        Log.d("ScreenTransition", "Transitioned to " + screenName);
    }
}
