
// fp

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Regular, Thick

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives


import CrustSize.*

val currentCrustSize = Small

currentCrustSize match
  case Small => println("Uh too small")
  case _ => println("Totally ok")

// this is not an enum 
enum Nat:
  case Zero
  case Succ(pred: Nat)

case class Person(
  name: String,
  vocation: String
)

// // make instance
val p = Person("Reginald Kenneth Dwight", "Singer")


p.name
// p.name = "Joe"

val p2 = p.copy("Elton", "Singer")
p2
