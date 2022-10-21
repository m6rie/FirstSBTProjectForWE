package sbttesting

import scala.util.control.Breaks.{break, breakable}

object TestBreak {
  //If you just use break, you will get an exception
  //Put the code inside a breakable statement to stop it from happening
  breakable {
    for (i <- 1 to 10 by 2) {
      if (i == 7) {
        break
      }
      else {
        println(i)
      }
    }
  }
}
