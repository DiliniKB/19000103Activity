object Q1 extends App{
  def Prime (a:Int):Boolean = {
    def PrimeCheck(b:Int):Boolean ={
      if (b<=1)
        return true
      else if (a%b!=0)
        PrimeCheck(b-1)
      else
        return false
    }
    PrimeCheck(a/2)
  }
}
