#Adapter Design Pattern 
*Structural Pattern*

Adapter is about creating an intermediary abstraction that translates, or maps, the old component to the new system.

For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USD on the other. Since they are incompatible with each other, we use an adapter 
that converts one to other.

**Coding Explanation**

Suppose we have a **Bird** class with fly() and makeSound() methods. And also a **Toy Duck** class with squeak() method.
Now suppose our client changes the requirement and they wants the toyDuck to makeSound.
Simple solution  is that we will just change the implementation class to the new adapter class and tell the client to pass the instance of the bird (which wants to squeak()) to that class.
n aims to 