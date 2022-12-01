import content.MainScreen
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.url.URLSearchParams
import styles.MTStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(MTStylesheet)

        val params = URLSearchParams(window.location.search)

        val app = params.get("app")

        val isValidApp = app in arrayOf("info", "throot", "", null)
        when (app) {
            "info" -> {
                Div(attrs = {
                    style {
                        textAlign("center")
                        fontSize(4.em)
                    }
                }) {
                    Text("Mastodon Info")
                }
            }

            else -> MainScreen(isValidApp)
        }
    }
}
