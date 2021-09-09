package Scala.Chapter_1

object MapInScala extends App {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))
  println(capital("Japan"))
}
