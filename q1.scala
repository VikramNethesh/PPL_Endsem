case class Student(id: Int, name: String, grade: Double, dept: String)
val students = List(Student(1,"Alice",88.5,"CS"), Student(2,"Bob",72.0,"EE"), Student(3,"Eva",81.3,"ME"))
val studentMap = students.map(s => s.id -> s).toMap
val departments = students.map(_.dept).toSet
val topStudents = students.filter(_.grade > 80).sortBy(_.name)
@main
def q1: Unit =
    topStudents.foreach(s => println(s"${s.name} (${s.dept}) - ${s.grade}"))
