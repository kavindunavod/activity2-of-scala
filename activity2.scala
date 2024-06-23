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
    /*

    Java vs Scala
Succinctness and Elegance
When it comes to syntax, Scala trumps Java by being more concise and expressive. It achieves this by eliminating redundant code through mechanisms such as type inference, higher-order functions, and case classes.
On the other hand, Java necessitates verbosity; it demands that developers spell out types explicitly and engage in more formalities when carrying out basic tasks such as class and method definitions.
The Best of Both Worlds
Scala is an amalgamation of object-oriented and functional programming. This hybrid nature allows it to offer first-class functions along with support for immutability— not to mention the rich expressiveness brought about by pattern matching.
The introduction of some functional programming features in Java includes lambdas plus the Stream API (like Java 8); nonetheless, Java is essentially an object-oriented language.
Scala's type inference system is advanced, which makes it less necessary to declare types explicitly.
Most variables in Java require explicit type declarations, despite the introduction of some type inference with the var keyword in Java 10
     */



  }

}
