
// Variable Declaration
val anInt1 : Int = 20
val anInt2 = 30
val aShort1 : Short = 20456
val aShort2 = 30456
val aLong1 : Long = 204546456464L
val aLong2 = 304646464646L
val aFloat1 : Float = 208796.845f
val aFloat2 = 3076887.54645
val aDouble1 : Double = 208796.845
val aDouble2 = 3076887.54645
val aString1 : String = "Hitesh Sardar"
val aString2 = "Sardar Hitesh"

println("Integer : " + anInt1 + " ==> " + anInt2)
println("Short : " + aShort1 + " ==> " + aShort2)
println("Long : " + aLong1 + " ==> " + aLong2)
println("Float : " + aFloat1 + " ==> " + aFloat2)
println("Double : " + aDouble1 + " ==> " + aDouble2)
println("String : " + aString1 + " ==> " + aString2)
val list = List(1, 2, 6)



// String interpolation
val str1 = "Ram"
println("${str1} is a good boy.")
println(s"$str1 is a good boy.")



// Method Declaration with return Type
def max1(x: Int, y: Int): Int = {
  if (x > y) x else y
}
max1(15, 66)



// Method Declaration without return Type
def max2(x: Int, y: Int) = if (x > y) x else y
max2(66, 20)



// Uniform access principle
// A method without parameters can be written without paren :
def msg = "Hello, world!"
msg



// Operators are methods
def ++(x:Int):Int = x + 1
++(1)

def +(x:Int, y:Int):Int = x + y
1 + 4

val numbers = List(1, 2, 3)
numbers map (x => x + 1)
numbers sortWith ((x, y) => x > y)
numbers filter { x => x % 2 == 0 }



// Class parameters
class Rational1(n: Int, d: Int) {
  val no:Int = n
}
new Rational1(5, 8).no



// Auxiliary constructors
class Rational2(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d
  def this(n:Int) = this(n,1)
}
new Rational2(5).denom



// Make fields out of class parameters
class Rational3(val numer: Int, val denom: Int)
val rat1 = new Rational3(88, 55)
rat1.numer
rat1.denom



// Rational Exercise
class Rational4(n: Int, d: Int) {
  val number: Int = n
  val denom: Int = d

  def this(n:Int) = this(n,1)
  def add(rational: Rational4): Rational4 ={
    val newNumer = number * rational.denom + rational.number * denom
    val newDenom = denom * rational.denom

    new Rational4(newNumer,newDenom)
  }

  def sub(rational: Rational4): Rational4 ={
    val newNumer = number * rational.denom - rational.number * denom
    val newDenom = denom * rational.denom

    new Rational4(newNumer,newDenom)
  }

  def mult(rational: Rational4): Rational4 ={
    val newNumer = number * rational.number
    val newDenom = denom * rational.denom

    new Rational4(newNumer,newDenom)
  }

  def div(rational: Rational4): Rational4 ={
    val newNumer = number * rational.denom
    val newDenom = denom * rational.number

    new Rational4(newNumer,newDenom)
  }
  override def toString = n + "/" + d
}

val rat2 = new Rational4(3, 5)
rat2.add(rat2)
rat2 add rat2
rat2.sub(rat2)
rat2 sub rat2
rat2.mult(rat2)
rat2 mult rat2
rat2.div(rat2)
rat2 div rat2

val rat3 = new Rational4(3, 5)
val rat4 = new Rational4(5, 3)
rat3.add(rat4)
rat3 add rat4
rat3.sub(rat4)
rat3 sub rat4
rat3.mult(rat4)
rat3 mult rat4
rat3.div(rat4)
rat3 div rat4



// Lazy vals
lazy val numer = {
  println("computing............")
  2 + 2
}
numer
numer
numer



// Operators are just methods
class Rational5(n: Int, d: Int) {
  val number: Int = n
  val denom: Int = d

  def this(n:Int) = this(n,1)
  def +(rational: Rational5): Rational5 = {
    val newNumer = numer * rational.denom + rational.number * denom
    val newDenom = denom * rational.denom

    new Rational5(newNumer,newDenom)
  }

  def -(rational: Rational5): Rational5 = {
    val newNumer = numer * rational.denom - rational.number * denom
    val newDenom = denom * rational.denom

    new Rational5(newNumer,newDenom)
  }

  def *(rational: Rational5): Rational5 = {
    val newNumer = number * rational.number
    val newDenom = denom * rational.denom

    new Rational5(newNumer,newDenom)
  }

  def /(rational: Rational5): Rational5 = {
    val newNumer = number * rational.denom
    val newDenom = denom * rational.number

    new Rational5(newNumer,newDenom)
  }

  override def toString = n + "/" + d
}

val rat5 = new Rational5(3, 5)
val rat6 = new Rational5(5, 3)
rat5 + rat6
rat5 - rat6
rat5 * rat6
rat5 / rat6



// Self references
class Rational6(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d

  def lessThan(rational:Rational6):Boolean = {
    numer * rational.denom < rational.numer * denom
  }

  def max(rational: Rational6):Rational6 = {
    if (lessThan(rational)) rational else this
  }
  override def toString = n + "/" + d
}

val rat7 = new Rational6(3, 6)
val rat8 = new Rational6(2, 9)

rat7 max rat8



// Method overloading
class Rational7(n: Int, d: Int) {
  val g =  3
  val numer = n / g
  val denom = d / g

  def + (rational: Rational7): Rational7 =
    new Rational7( numer * rational.denom + rational.numer * denom, denom * rational.denom )

  def + (i: Int): Rational7 =
    new Rational7(numer + i * denom, denom)

  def - (rational: Rational7): Rational7 =
    new Rational7(numer * rational.denom - rational.numer * denom,denom * rational.denom)

  def - (i: Int): Rational7 =
    new Rational7(numer - i * denom, denom)

  def *(rational: Rational7): Rational7 =
    new Rational7(numer * rational.numer, denom * rational.denom)

  def * (i: Int): Rational7 =
    new Rational7(numer * i, denom)

  def / (rational: Rational7): Rational7 =
    new Rational7(numer * rational.denom, denom * rational.numer)

  def / (i: Int): Rational7 =
    new Rational7(i * denom, numer)

  override def toString = numer + "/" + denom
}
val rat9 = new Rational7(5, 9)
val rat10 = new Rational7(6, 8)
rat9 + rat10
rat9 + 23
rat9 - rat10
rat9 - 23
rat9 * rat10
rat9 * 23
rat9 / rat10
rat9 / 23



// Default Arguments
class Rational8(n: Int, d: Int = 1) {
  val numer: Int = n
  val denom: Int = d

  override def toString = n + "/" + d
}
new Rational8(5).numer
new Rational8(5).denom



// Repeated Parameters
def sum(arr:Int*):Int = arr.sum
sum(1,2,3,4,5,6)



// Singleton Objects
object Hello{
  val msg = "Hello World!"
}
Hello.msg



// Companion objects
class Rational9 (n: Int, d: Int) {
  import Rational9.gcd //gcd is private private
  val g: Int = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  override def toString = n + "/" + d
}
object Rational9{
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val rat11 = new Rational9(5, 15)
rat11.g
val rat12 = new Rational9(6, 0)
rat12.g



// Predef
class Rational10(n: Int, d: Int) {
  val number: Int = n
  val denom: Int = d

  require(d != 0, "d value should not be zero.")

  def + (rational: Rational10): Rational10 =
    new Rational10(number * rational.denom + rational.number * denom, denom * rational.denom)

  override def toString = number + "/" + denom
}
//new Rational10(10, 0)
new Rational10(5, 3)



// Case classes
case class Person(name: String)
val person = Person("sky")
person.name



// Case class benefits
val person1 = Person("sky")
val person2 = Person("sky")
val person3 = Person("bob")

person1 == person2
person1 == person3

case class Employee(name:String,comapanyName:String,location:String)
val emp = Employee("bob","Google" , "USA")
emp.copy(name = "Rob")



// Convert Rational class into case class
case class Rational11(n: Int, d: Int) {
  val number: Int = n
  val denom: Int = d

  require(d != 0, "d value should not be zero.")

  def + (rational: Rational11): Rational11 =
    new Rational11(number * rational.denom + rational.number * denom, denom * rational.denom)

  override def toString = number + "/" + denom
}
Rational11(5, 9)



// collection instances
List(1, 2, 3)            // List[Int] collection
Seq(1, 2, 3)             // Default List[Int] collection
IndexedSeq(1, 2, 3)      // Default Vector[Int] collection
List(1, 2, "z")          // Default List[Any] collection



// Type parameters
class ParameterizedClass1[T](t:T)
new ParameterizedClass1(1)
new ParameterizedClass1(9.86)

case class ParameterizedCaseClass2[T](t:T)
ParameterizedCaseClass2(1)
ParameterizedCaseClass2("Hitesh")



// Tuples
val tuple = ("bob", 28 , true, 8.99)
tuple._1
tuple._2
tuple._3
tuple._4
tuple

def longestWord(words: Array[String]):(String,Int) = {
  var word = words(0)
  var idx = 0

  for (i <- 1 until words.length)
    if (words(i).length > word.length) {
      word = words(i)
      idx = i
    }

  (word, idx) // no need to define class
}
val longest = longestWord("The quick brown1 fox".split(" "))
longest
longest._1
longest._2
val (word, idx) = longest
word



// Some important collection methods
val list1 = List(1, 2, 4, 6, 9)
val list2 = List(11, 22, 44, 66, 99)

list1 ++ list2
val seq = list1.toSeq
val set = list2.toSet
list1.isEmpty
list2.size
list1.contains(8)
list1.head
list1.tail
list.take(2)
list2 :+ 77
//list1 :: 77



// Functional collections
//import scala.collection.immutable._
val num = List(1, 2, 3)
num map{no: Int => no * no}
num map {num => num * num}



// Function literal
num map{x => x + 2}
num map{(x:Int) => x + 2}
num map{_ + 2}
num map{_ => + 2}



// Function values
val addOne1 = (x: Int) => x + 1
num map addOne1



// Function types
val addOne2: Int => Int = x => x + 1
addOne2(2)
addOne2.apply(23)
num map addOne2


num map { no => List.fill(no)(no) }


def max(list:List[Int]):Int={
  def findmax(list1: List[Int], maxno: Int): Int ={
    if(list1.isEmpty) maxno else {
      val current = list1.head

      if(current < maxno) findmax(list1.tail, maxno)
      else findmax(list1.tail, current)
    }
  }

  findmax(list, list.head)
}

max(List(1, 6 , 99, 8))