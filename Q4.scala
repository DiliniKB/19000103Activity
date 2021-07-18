object Q4 {
  def isEven(a:Int):Unit= {
    if (a == 0) println("Even")
    else if (a == 1) println("Odd")
    else if (a < 0) isEven(-a)
    else isEven(a - 2)
  }
}
