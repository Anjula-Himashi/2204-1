object Q4 {
    def main(args:Array[String]): Unit = {
      println(price(60))
    }
  def price(x:Int):Double={
    var z=24.95*x;
    var y=Total(z)+(50)+(10*0.75)
    return y
  }

  def Total(k:Double):Double={
      var a=k*(6/10.0)
      return a
  }
}
