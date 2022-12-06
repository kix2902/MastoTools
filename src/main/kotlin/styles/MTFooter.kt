package styles

import org.jetbrains.compose.web.css.*

object MTFooter : StyleSheet(MTStylesheet) {
    val footer by style {
        width(100.percent)
    }

    val footerText by style {
        fontSize(MTCSSVariables.footerFontSize.value())
    }

    val footerLink by style {
        fontSize(MTCSSVariables.footerFontSize.value() + 2.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                display(DisplayStyle.Block)
            }
        }
    }
}
