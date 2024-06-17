object Q5 {
  def main(args: Array[String]): Unit = {
  println(time(4,3))
  }
  def easydis(i:Int):Int={
    return i*8;
  }
  def tempdis(j:Int):Int={
    return j*7;
  }
  def time(p:Int , q:Int): Int = {
    var time=easydis(p)+tempdis(q)
    return time
  }
}
