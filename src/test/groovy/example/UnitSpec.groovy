package example


import spock.lang.Specification
/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
class UnitSpec extends Specification {

  void "test something"() {
    println("foo")
    expect:
    true
  }

}
