package codeflow.io


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import codeflow.io.page.MainPage
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private val rule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun whenShowTextClicked_thenTextView_shouldBeVisible() {
        rule.launchActivity(null)

        MainPage()
            .isVisible()
            .isTextViewHidden()
            .showTextView()
            .isTextViewVisible()
    }
}
