package components

import androidx.compose.runtime.Composable
import kotlinx.browser.window
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import styles.MTHeader

@Composable
fun Header() {
    Div(attrs = {
        classes(MTHeader.header)
    }) {
        A(attrs = {
            href(window.location.origin)
            title("MastoTools")
            classes(MTHeader.title)
        }) {
            Text("MastoTools")
        }
    }
}
