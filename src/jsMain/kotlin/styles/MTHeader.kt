package styles

import org.jetbrains.compose.web.css.*

object MTHeader : StyleSheet(MTStylesheet) {
    val header by style {
        width(100.percent)
        fontWeight(700)
    }

    val title by style {
        color(Color.black)
        textDecoration("none")
        fontSize(MTCSSVariables.titleFontSize.value())
    }
}
