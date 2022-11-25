package styles

import org.jetbrains.compose.web.css.*

object AppStylesheet : StyleSheet() {
    init {
        universal style {
            fontFamily("Josefin Sans","sans-serif")
            fontSize(20.px)
        }
    }
}
