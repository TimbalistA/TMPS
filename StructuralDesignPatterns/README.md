Laboratory Work #2
--
Theory
--
Adapter
--
To use an adapter:

* The client makes a request to the adapter by calling a method on it using the target interface.
* The adapter translates that request on the adaptee using the adaptee interface.
* Client receive the results of the call and is unaware of adapter’s presence.

![](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/classDiagram.jpg)

Facade
--
![](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/facadeA.png)

Flyweight Design Pattern
--
Flyweight pattern is one of the structural design patterns as this pattern provides ways to decrease object count thus improving application required objects structure. Flyweight pattern is used when we need to create a large number of similar objects (say 105). One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been constructed.

Why do we care for number of objects in our program?

* Less number of objects reduces the memory usage, and it manages to keep us away from errors related to memory like java.lang.OutOfMemoryError.
* Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.
