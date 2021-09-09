package Scala.Chapter_1

import java.math.BigInteger

object Fact extends App {

//  In Java, if we can use BigInteger class to get factorial of a no, then we have to write the following code
  def factorial(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO) BigInteger.ONE
      else x.multiply(factorial(x.subtract(BigInteger.ONE)))
  println("Factorial using Java : " + factorial(BigInteger.valueOf(30)))



//  In Scala, we can write the following codes for getting factorial of a no
  def fact(no : Int) : BigInt =
    if(no <= 1) 1 else no * fact(no - 1)
  println("Factorial using Scala : " + factorial(BigInteger.valueOf(30)))
}
