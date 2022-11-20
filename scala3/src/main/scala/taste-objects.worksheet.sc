// object StringUtils:
//   def isNullOrEmpty(s: Option[String]): Boolean = 
//     case s: Option[String] => true
//     case _ => false


// StringUtils.isNullOrEmpty(Option("asd"))
// StringUtils.isNullOrEmpty(Option(null))
// StringUtils.isNullOrEmpty(null)

import scala.math.*

class Circle(radius: Double):
  import Circle.*
  def area: Double = calculateArea(radius)

// This method is not on the instance itself.
object Circle:
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)

val circle1 = Circle(5.0)
circle1.area   // Double = 78.53981633974483

trait AddService:
  def add(a: Int, b: Int) = a + b

trait MultiplyService:
  def multiply(a: Int, b:Int) = a * b

object MathService extends AddService, MultiplyService

import MathService.*

println(add(1,2))
