object Q3 {
    def main(args:Array[String]): Unit = {
    println(vol(5))
    }

    def vol(x:Double):Double ={
      var y= (4/3.0)*Math.PI*x*x*x;
      return y;
    }
}
