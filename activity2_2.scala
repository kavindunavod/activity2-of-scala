object activity2_2 {


  def main(args: Array[String]) : Unit = {

    // Variable Declaration and Initialization
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 4.0f

    def func1() : Unit = {
      b-=1
      println(b * a + c * d)

    }

    def func2() : Unit = {
      println(a)
      a += 1
    }

    def func3() : Unit = {
      println(-2 * (g - k) + c)
    }

    def func4() : Unit = {
      println(c)
      c += 1
    }

    def func5() : Unit = {
      c += 1
      val temp = c
      c=temp*a
      println(c)
      a += 1
    }

    func1()
    func2()
    func3()
    func4()
    func5()
  }

}
s
