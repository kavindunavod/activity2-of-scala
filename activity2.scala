object activity2 {


  def main(args: Array[String]) : Unit = {
      var k=2; var i=2; var j=2
      var m=5; var n =5;
      var f=12.0f; var g = 4.0f; var c='X'

      println("k + 12*m answer is:" + k +12*m)
      println(" m/j answer is:" + m/j)
      println("n%j answer is:" + n%j)
      println("m/j*j answer is:" + m/j*j)
      println("f+10*5+g answer is:" + f+10*5+g)

      /*we cannot do this way
      println("++i*n answer is:" + ++i* n) */

    //the correct way is
      i+=1
      var q= i*n
      println("i+=1 * n  is: " + q)




  }

}
