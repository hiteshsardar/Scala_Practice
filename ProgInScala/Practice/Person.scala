package ProgInScala.Practice
import scala.util.Sorting

case class Person(name:String, age:Int) extends Ordered[Person] {
  def compare(that: Person) = this.age - that.age
}

object MainApp
{
  def main(args: Array[String]):Unit={
    val people = Array(Person("bob", 30), Person("ann", 32), Person("carl", 19))
    val sortedPeople= Sorting.quickSort(people)

    people.foreach(e => println(e))
    println(people.toList)
//    println(sortedPeople)
    //outout => Array(Person(carl,19), Person(bob,30), Person(ann,32))
  }
}