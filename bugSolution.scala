```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    try {
      require(newAge >= 0, "Age cannot be negative")
      _age = newAge
    } catch {
      case e: IllegalArgumentException => println(s"Error setting age: "+ e.getMessage)
      // Optionally: log the error or handle it more robustly 
    }
  }
}

object Main extends App {
  val myObj = new MyClass("Alice")
  myObj.age = 30 
  myObj.age = -5  //This will print an error message instead of crashing
}
```