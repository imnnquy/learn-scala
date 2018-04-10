import employee.{Developer, Tester}

object MainObject {

  def main(args: Array[String]) : Unit = {
    def developer = new Developer()
    developer.doHerJob("API to get list of employees")
    def tester = new Tester()
    tester.doHerJob("Employees list API")
  }

}
