package content

import androidx.compose.runtime.Composable
import components.Footer
import components.Header
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import styles.MTMain

@Composable
internal fun MainScreen() {
    Div(attrs = {
        classes(MTMain.mainGroup)
    }) {
        Header()

        Div(attrs = {
            classes(MTMain.mainContent)
        }) {
            Text("It's working")
        }

        Footer()
    }
}
