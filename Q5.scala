object Q5 extends App{
  def sumEven(n:Int):Int={
   if (n>1) {
    if (n%2 != 0) {
      return sumEven(n - 1)
    } else {
      return (n+sumEven(n-2))
    }
   }
    else {
     return 0;
   }
  }
}
