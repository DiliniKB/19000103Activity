object Q3 extends App{
  def Sum(a:Int): Int={
    if (a<=0)
      return 0
    else return (a+ Sum(a-1))
  }
}
