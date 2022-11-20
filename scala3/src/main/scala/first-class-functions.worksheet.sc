
val a = List(1, 2, 3).map(i => i * 2)
val b = List(1, 2, 3).map(_ * 2)


val nums = (1 to 10).toList

val x = nums.filter(_ > 3)
            .filter(_ < 7)
            .map(_ * 10)
