package content

import androidx.compose.runtime.Composable
import components.Footer
import components.Header
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import styles.MTMain

@Composable
internal fun MainScreen(isValidApp: Boolean) {
    Div(attrs = {
        classes(MTMain.mainGroup)
    }) {
        Header()

        Div(attrs = {
            classes(MTMain.mainContent)
        }) {
            if (!isValidApp) {
                P(attrs = {
                    style {
                        color(Color.white)
                        backgroundColor(Color.red)
                        fontWeight(700)
                        padding(20.px)
                    }
                }) {
                    Text("App selected is not valid, we are showing you the app index")
                }
            }
            Text("It's working")
        }

        Footer()
    }
}
