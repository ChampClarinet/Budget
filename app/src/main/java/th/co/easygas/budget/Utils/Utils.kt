package th.co.easygas.budget.Utils

import java.math.RoundingMode
import java.text.DecimalFormat

class Utils {

    companion object {
        fun roundTwoDigits(input: Double): Double {
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.CEILING
            return df.format(input).toDouble()
        }
    }

}