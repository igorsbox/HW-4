package com.example.hw_4

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4


import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickButtonDashboard() {
        onView(withId(R.id.navigation_dashboard)).perform(click()).check(matches(isDisplayed()))
    }

    @Test
    fun clickButtonHome() {
        onView(withId(R.id.navigation_home)).perform(click()).check(matches(isDisplayed()))
    }

    @Test fun checkDashboardButtonIsDisplayed() {
        onView(withId(R.id.navigation_home)).check(matches(isDisplayed()))
    }

    @Test fun checkHomeButtonIsDisplayed() {
        onView(withId(R.id.navigation_dashboard)).check(matches(isDisplayed()))
    }

}