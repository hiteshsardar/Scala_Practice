package Scala.Practice

object Recursion extends App {
  def fact(no : Int) : BigInt =
    if(no <= 1) 1
    else  {
      val result = no * fact(no - 1)
      result
    }
  println("Recursion : " + fact(10))
  println("Recursion : " + fact(5000))
//  println("Recursion : " + fact(50000))



//  Tail Recursion
  def factorial(no : Int) : BigInt ={
    def calcFactoroal(no1 : Int, next : BigInt) : BigInt =
      if(no1 <= 1) next
      else calcFactoroal(no1 - 1, no1 * next)

    calcFactoroal(no, 1)
  }
  println("Tail Recursion : " + factorial(10))
  println("Tail Recursion : " + factorial(5000))
  println("Tail Recursion : " + factorial(50000))
}
