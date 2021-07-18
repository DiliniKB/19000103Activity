import Q1.Prime
object Q2 extends App{
  def primeSeq(a:Int){
    if (a>2) primeSeq(a-1)
    if (Q1.Prime(a)) println(a)
  }
}
