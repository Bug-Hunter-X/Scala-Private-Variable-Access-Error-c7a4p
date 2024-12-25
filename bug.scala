```scala
class MyClass {
  private var privateVar = 0

  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  def getPrivateVar: Int = {
    privateVar
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass
    myObject.updatePrivateVar(10)
    println(myObject.getPrivateVar) // prints 10
    
    // Accessing privateVar directly (Error)
    println(myObject.privateVar) // This will cause a compilation error. 
  }
}
```