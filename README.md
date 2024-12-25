# Scala Private Variable Access

This example showcases a common error in Scala: attempting to directly access a private variable from outside its defining class.  Scala's encapsulation mechanisms prevent this for good reason.  The solution demonstrates the correct way to access and modify private members: through public accessor methods.

## Running the Code

You'll need a Scala compiler and runtime environment (sbt is recommended). Compile and run the provided `bug.scala` and `bugSolution.scala` files to observe the difference between erroneous and correct access patterns.