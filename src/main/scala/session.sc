object session {

  def sqrtIter(guess : Double, x : Double) : Double =
    if(isGoodEnough(guess, x)) guess else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess : Double, x : Double) : Boolean =
    abs((guess * guess) - x) < 0.00000000001

  def abs(x : Double) : Double =
    if(x < 0) -x else x

  def improve(guess : Double, x : Double) : Double =
    (guess + x / guess) / 2

  def sqrt(x : Double) : Double = sqrtIter(1.0, x)

  sqrt(0.001)
  sqrt(0.0000001)
  sqrt(3)
  sqrt(4)
}