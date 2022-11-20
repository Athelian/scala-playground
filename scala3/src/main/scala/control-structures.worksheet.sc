
val i = 1

val result = i match
  case 1 => println("one")
  case 2 => println("two")
  case _ => println("other")


trait Human
case class Person(name: String) extends Human

val p = Person("Jim")

def isFred(maybeFred: Person) = 
  p match
  case Person(name) if name == "Fred" =>
    println(s"$name says, Yubba dubba doo")
  case _ => 
    println(s"It's not Fred!")

isFred(p)

def getClassAsString(x: Matchable) = x match
  case s: String => s"'$s' is a string"
  case i: Int => "Int"

getClassAsString("hello")

