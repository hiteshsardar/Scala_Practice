package Scala.Practice

object Functions extends App {

  def aFunction(str : String, no : Int) : String = {
    str + " " + no
  }
  println("aFunction : " + aFunction("Hitesh", 20))



  def aParameterLessFunction() : Int = 500
  println(aParameterLessFunction())
  println(aParameterLessFunction)



//  **********  Recursive Function  **********
  def recursiveFunction(str : String, no : Int) : String = {
    if(no == 1) str
    else str + " " + recursiveFunction(str, no - 1)
  }
  println("Recursive Function : " + recursiveFunction("Hitesh", 5))



//  **********  Nested Function  **********
  def aBigFunction(no : Int) : Int = {
    def aSmallFunction(no1 : Int, no2 : Int) : Int = no1 + no2

    aSmallFunction(no, no - 1)
  }
  println("Nested Function : " + aBigFunction(11))



//  **********  Recursive Factorial  **********
  def recursiveFactorial(no : Int) : Int =
    if(no == 0) 1
    else no * recursiveFactorial(no - 1)
  println("Factorial : " + recursiveFactorial(5))



//  **********  Recursive Fibonacci Series  **********
  def recursiveFibonacci(no : Int) : Int =
    if(no <= 2) 1
    else recursiveFibonacci(no - 2) + recursiveFibonacci(no - 1)
  println("Fibonacci : " + recursiveFibonacci(8))



//  **********  Recursive Prime  **********
  def primeCheck(no : Int) : Boolean = {
    def isPrime(no1 : Int) : Boolean =
      if(no1 <= 1) true
      else no % no1 != 0 && isPrime(no1 - 1)

    isPrime(no / 2)
  }

  if(primeCheck(19)) println("Prime no")
  else println("Not a Prime no")

  if(primeCheck(25)) println("Prime no")
  else println("Not a Prime no")


}
