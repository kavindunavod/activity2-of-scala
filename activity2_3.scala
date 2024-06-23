import scala.io.StdIn

object activity2_3 {

  def func1(n_hour: Int, o_hour: Int): Int = {
    println("enter number of working hours: ")
    val hour1 = StdIn.readLine().toInt

    println("enter number of OT hours: ")
    val hour2 = StdIn.readLine().toInt
    val result=(hour1*n_hour + hour2*o_hour)*88/100
    return result
    
  }

  def main(args: Array[String]): Unit = {
    var normal_hour = 250
    var ot_hour = 85
    val salary=func1(normal_hour, ot_hour)
    println("total salary is: " + salary)
  }
}
