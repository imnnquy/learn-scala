package employee

import `trait`.WorkerTrait

class Tester extends  WorkerTrait{
  override def doHerJob(jd: String) = {
    println("I'm testing this: " + jd)
    true
  }
}
