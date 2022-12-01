package styles

import org.jetbrains.compose.web.css.*

object MTFooter : StyleSheet(MTStylesheet) {
    val footer by style {
        width(100.percent)
        fontSize(MTCSSVariables.fontSize.value() - 2.px)
    }

    val linkstyle by style {
        fontSize(18.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                display(DisplayStyle.Block)
            }
        }
    }
}
