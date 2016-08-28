package com.paularagones.fybercodechallenge;

import com.paularagones.fybercodechallenge.Activities.FormActivity;
import com.paularagones.fybercodechallenge.Models.SystemConstants;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Activity;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.EditText;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Mack and Aragones on 28/08/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FunctionalTest {

    private String uid;
    private String apiKey;
    private int appId;
    private String pub0;

    @Rule
    public ActivityTestRule<FormActivity> formActivityActivityTestRule
            = new ActivityTestRule<>(FormActivity.class);

    @Test
    public void testTextsRecognition() {
        onView(withId(R.id.uid)).perform(clearText());
        onView(withId(R.id.uid)).perform(typeText(SystemConstants.SAMPLE_UID), closeSoftKeyboard());

        onView(withId(R.id.api_key)).perform(clearText());
        onView(withId(R.id.api_key)).perform(typeText(SystemConstants.SAMPLE_API_KEY), closeSoftKeyboard());

        onView(withId(R.id.app_id)).perform(clearText());
        onView(withId(R.id.app_id)).perform(typeText(String.valueOf(SystemConstants.SAMPLE_APP_ID)), closeSoftKeyboard());

        onView(withId(R.id.pub_0)).perform(clearText());
        onView(withId(R.id.pub_0)).perform(typeText(SystemConstants.SAMPLE_PUB_0), closeSoftKeyboard());

        onView(withId(R.id.uid)).check(matches(withText(SystemConstants.SAMPLE_UID)));
        onView(withId(R.id.api_key)).check(matches(withText(SystemConstants.SAMPLE_API_KEY)));
        onView(withId(R.id.app_id)).check(matches(withText(String.valueOf(SystemConstants.SAMPLE_APP_ID))));
        onView(withId(R.id.pub_0)).check(matches(withText(SystemConstants.SAMPLE_PUB_0)));

    }

}
