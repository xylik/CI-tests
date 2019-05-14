package codeflow.io.page

import codeflow.io.R
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

class MainPage: BasePage() {
    private val screen = MainScreen()

    override fun waitForPage() {
       waitByResource("codeflow.io:id/rootCL")
    }

    fun showTextView(): MainPage {
        screen.showTextBtn.click()

        return this
    }

    fun isTextViewVisible(): MainPage {
        screen.text{ isVisible() }

        return this
    }

    fun isTextViewHidden(): MainPage {
        screen.text{ isInvisible() }

        return this
    }

    fun isVisible(): MainPage {
        screen.root { isVisible() }

        return this
    }

    class MainScreen: Screen<MainScreen>() {
        val root = KView{ withId(R.id.rootCL) }

        val showTextBtn = KButton{ withId(R.id.showHideTextBTN) }

        val text = KTextView{ withId(R.id.textTV) }
    }
}
