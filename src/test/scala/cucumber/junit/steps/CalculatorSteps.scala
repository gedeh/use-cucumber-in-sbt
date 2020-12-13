package cucumber.junit.steps

import io.cucumber.scala.ScalaDsl
import io.cucumber.scala.EN
import org.scalatest.matchers.should.Matchers
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.atomic.AtomicInteger

class Calculator {

  def sum(a: Int, b: Int): Int = a + b
  def multiply(a: Int, b: Int): Int = a * b

}

class CalculatorSteps extends ScalaDsl with EN with Matchers {

  val calculator: AtomicReference[Calculator] = new AtomicReference[Calculator]()
  val result: AtomicInteger = new AtomicInteger()

  Given("""a calculator""") { () =>
    calculator.set(new Calculator)
  }

  When("""{int} + {int} is submitted""") { (a: Int, b: Int) =>
    val sum = calculator.get().sum(a, b)
    result.set(sum)
  }

  When("""{int} x {int} is submitted""") { (a: Int, b: Int) =>
    val multiply = calculator.get().multiply(a, b)
    result.set(multiply)
  }

  Then("""it should show result {int}""") { (expected: Int) =>
    val actual = result.get()
    actual should be (expected)
  }

}