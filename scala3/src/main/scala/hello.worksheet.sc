
val x = if 1 < 2 then 1 else 2

val ints = List(3,2,3,4,5)

for i <- ints do println(i)

for
  i <- ints
  if i > 2
do
  println(i)

for
  i <- 1 to 3
  j <- 'a' to 'c'
  if i == 2
  if j == 'b'
do
  println(s"i = $i, j = $j")

// val doubles = for i <- ints yield i * 2
val doubles = for (i <- ints) yield i * 2

val names = List("chris", "ed", "muarice")
val capNames = for name <- names yield name.capitalize


