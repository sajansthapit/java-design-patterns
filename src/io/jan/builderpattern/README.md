#Builder Design Pattern
*Creational Pattern*

Builder pattern solved the issue with large number of optional parameters and inconsistent state by providing a way 
to build the object step-by-step and provide a method that will actually return the final Object.

Builder pattern aims to separate the construction of a complex object from its representation so that the same construction
process can create different representations.
The process of constructing an object should be generic so that it can be used to create different representations of the same
object.

**Coding explanation**

In example2 the **Computer** class has only getter methods and no public constructor. So that the only way to get a Computer
object is through the **ComputerBuilder** class.

