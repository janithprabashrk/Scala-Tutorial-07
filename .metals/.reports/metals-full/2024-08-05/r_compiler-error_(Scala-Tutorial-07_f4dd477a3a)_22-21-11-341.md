file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Tutorial-07/Q2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition inputList is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Tutorial-07/Q3.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Tutorial-07/Q1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 76
uri: file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Tutorial-07/Q2.scala
text:
```scala
def calculateSquare(numbers: List[Int]) : List[Int] = {
  numbers.map(num =@@> num * num)
}

val inputNumbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val squaredNumbers: List[Int] = calculateSquare(inputNumbers)

object Q2 {
  def main(args: Array[String]): Unit = {
    println(squaredNumbers)
  }
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition inputList is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Tutorial-07/Q3.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Tutorial-07/Q1.scala
One of these files should be removed from the classpath.