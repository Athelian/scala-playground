def sum(a: Int, b: Int) = a + b
sum(1, 2) // type inference

def concatenate(s1: String, s2: String) = s1 + s2
concatenate("hello", "world")

val x = sum(1, 2)
val y = concatenate("foo", "bar")

def makeConnection(url: String, timeout: Int = 5000): Unit =
  println(s"url=$url, timeout=$timeout")

// named methods
makeConnection(url = "https://localhost:3000")

// add methods to predefined types:
extension(s: String)
  def makeInt(radix: Int): Int = Integer.parseInt(s, radix)

"1".makeInt(10)
"2".makeInt(10)

