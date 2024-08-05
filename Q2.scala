def calculateSquare(numbers: List[Int]) : List[Int] = {
  numbers.map(num => num * num)
}

val inputNumbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val squaredNumbers: List[Int] = calculateSquare(inputNumbers)

object Q2 {
  def main(args: Array[String]): Unit = {
    println(squaredNumbers)
  }
}
