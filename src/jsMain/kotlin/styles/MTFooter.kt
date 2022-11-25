package styles

import org.jetbrains.compose.web.css.*

object MTFooter : StyleSheet(AppStylesheet) {
    val footer by style {
        width(100.percent)
        fontSize(16.px)
    }

    val linkstyle by style {
        fontSize(18.px)
    }
}
