package content

import androidx.compose.runtime.Composable
import components.Footer
import components.Header
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import styles.MTMain

@Composable
internal fun MainScreen(app: String?) {
    Div(attrs = {
        classes(MTMain.mainGroup)
    }) {
        Header()

        val isValidApp = app in arrayOf("", null)
        if (!isValidApp) {
            Div(attrs = {
                classes(MTMain.errorBlock)
            }) {
                Text("App selected is not valid, we are showing you the app index")
            }
        }

        Div(attrs = {
            classes(MTMain.mainContent)
        }) {
            Text("It's working")
        }

        Footer()
    }
}
