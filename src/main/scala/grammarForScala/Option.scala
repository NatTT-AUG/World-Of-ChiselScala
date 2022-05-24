package grammarForScala

class Option {

  val l = Seq.tabulate(5)(i => if (i % 2 == 1) Some(i) else None)

  l foreach { x =>
    if (x.isDefined) println(x.get)
  }

  // l(1).getOrElse(-1)

  // l(0) foreach println
  // l.flatten

  // l foreach { _ match {
  //     case Some(i) => println(i)
  //     case None => println("was empty")
  // }}
}
