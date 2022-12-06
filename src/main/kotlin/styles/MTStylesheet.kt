package styles

import org.jetbrains.compose.web.css.*

object MTCSSVariables {
    val fontSize by variable<CSSUnitValue>()
    val footerFontSize by variable<CSSUnitValue>()
    val footerLinkFontSize by variable<CSSUnitValue>()
    val titleFontSize by variable<CSSUnitValue>()
}

object MTStylesheet : StyleSheet() {
    init {
        universal style {
            MTCSSVariables.fontSize(20.px)
            MTCSSVariables.footerFontSize(16.px)
            MTCSSVariables.footerLinkFontSize(18.px)
            MTCSSVariables.titleFontSize(100.px)

            fontFamily("Josefin Sans", "sans-serif")
            fontSize(MTCSSVariables.fontSize.value())
            margin(0.px)
        }

        media(mediaMaxWidth(1024.px)) {
            universal style {
                MTCSSVariables.fontSize(18.px)
                MTCSSVariables.footerFontSize(14.px)
                MTCSSVariables.footerLinkFontSize(16.px)
                MTCSSVariables.titleFontSize(80.px)
            }
        }

        media(mediaMaxWidth(640.px)) {
            universal style {
                MTCSSVariables.fontSize(16.px)
                MTCSSVariables.footerFontSize(13.px)
                MTCSSVariables.footerLinkFontSize(14.px)
                MTCSSVariables.titleFontSize(50.px)
            }
        }
    }
}
