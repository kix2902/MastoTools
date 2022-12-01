package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import styles.MTFooter

@Composable
fun Footer() {
    Div(attrs = {
        classes(MTFooter.footer)
    }) {
        Span { Text("Website made by ") }
        A(attrs = {
            href("https://paquita.masto.host/@kix2902")
            target(ATarget.Blank)
            title("@kix2902@paquita.masto.host")
        }) {
            Span(attrs = {
                classes(MTFooter.linkstyle)
            }) {
                Text("@kix2902@paquita.masto.host")
            }
        }
    }
}
