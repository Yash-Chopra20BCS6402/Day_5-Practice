object BalancedParentheses extends App {
  def generateParentheses(n: Int): List[String] = {
    if (n == 0) List("")
    else {
      for {
        i <- 0 until n
        left <- generateParentheses(i)
        right <- generateParentheses(n - i - 1)
      } yield s"($left)$right"
    }.toList
  }

  val n = 3
  val result = generateParentheses(n)
  result.foreach(println)
}
