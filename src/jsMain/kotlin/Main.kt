import kotlinx.browser.document
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    document.title = "MastoTools"

    renderComposable(rootElementId = "root") {
        Div(attrs = {
            style {
                textAlign("center")
                fontSize(4.em)
            }
        }) {
            Text("It's working")
        }
    }
}

