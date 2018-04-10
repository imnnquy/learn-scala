package employee

import `trait`.WorkerTrait

class Developer extends  WorkerTrait{
  override def doHerJob(jd: String) = {
    println("I'm developing this: " + jd)
    true
  }
}
