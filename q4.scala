sealed trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case class Bird(species: String) extends Animal

def describe(animal: Animal): String = animal match
  case Dog(name) => s"This is a dog named $name."
  case Cat(name) => s"This is a cat named $name."
  case Bird(species) => s"This is a bird of species $species."

@main def run(): Unit =
  val animals = List(Dog("Rex"), Cat("Whiskers"), Bird("Parrot"))
  animals.foreach(a => println(describe(a)))
