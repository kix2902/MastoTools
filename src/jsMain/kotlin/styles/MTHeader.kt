package styles

import org.jetbrains.compose.web.css.*

object MTHeader : StyleSheet(AppStylesheet) {
    val header by style {
        width(100.percent)
        fontWeight(700)
    }

    val title by style {
        color(Color.black)
        fontSize(100.px)
        textDecoration("none")
    }
}
