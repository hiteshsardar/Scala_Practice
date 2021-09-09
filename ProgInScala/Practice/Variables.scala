package Scala.Practice

object Variables extends App {

//  Types of variable declaration
  val anInt1 : Int = 20
  val anInt2 = 30
  val aShort1 : Short = 20456
  val aShort2 = 30456
  val aLong1 : Long = 204546456464l
  val aLong2 = 304646464646l
  val aFloat1 : Float = 208796.845f
  val aFloat2 = 3076887.54645
  val aDouble1 : Double = 208796.845
  val aDouble2 = 3076887.54645
  val aString1 : String = "Hitesh Sardar"
  val aString2 = "Sardar Hitesh"

//  Vals are immutable
//  anInt1 = 50
//  anInt2 = 60

  println("Integer : " + anInt1 + " ==> " + anInt2)
  println("Short : " + aShort1 + " ==> " + aShort2)
  println("Long : " + aLong1 + " ==> " + aLong2)
  println("Float : " + aFloat1 + " ==> " + aFloat2)
  println("Double : " + aDouble1 + " ==> " + aDouble2)
  println("String : " + aString1 + " ==> " + aString2)


//  Code Block
  val aCodeBlock = {
    val x = 10
    val y  = x + 5

//    if(y > 12) "Hitesh" else "Sardar"
    if(y > 12) 80 else "Sardar"
  }
  println(aCodeBlock)


  val checkCodeBlock = {
    2 < 3
  }
  println(checkCodeBlock)


  val checkCodeBlock2 = {
    if (checkCodeBlock) 259 else 69863
    1500
  }
  println(checkCodeBlock2)
}
