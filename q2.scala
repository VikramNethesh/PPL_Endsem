class Person(val name: String):
  def sayName: Unit =
    println(name)

class Student(name: String, val id: Int) extends Person(name):
  def getId: Unit =
    println(id)

@main def main: Unit =
  val justaguy = new Person("Vikram")
  val studentVikram = new Student("Vikram", 1)
  justaguy.sayName
  studentVikram.sayName
  studentVikram.getId
