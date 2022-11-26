package styles

import org.jetbrains.compose.web.css.*

object MTMain : StyleSheet(MTStylesheet) {
    val mainGroup by style {
        property("margin", "0 auto")
        paddingTop(20.px)
        paddingBottom(20.px)
        width(1024.px)
        textAlign("center")

        media(mediaMaxWidth(1024.px)) {
            self style {
                width(100.percent)
            }
        }
    }

    val mainContent by style {
        width(100.percent)
        paddingTop(50.px)
        paddingBottom(50.px)
    }
}
