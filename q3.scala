abstract class Shape:
    def calculate_area(): Double
class Circle(val radius:Double) extends Shape:
    def calculate_area(): Double=
        3.14*radius*radius
@main
def main: Unit =
    val myCircle = new Circle(7)
    println(myCircle.calculate_area())
