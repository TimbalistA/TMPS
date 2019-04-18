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

Proxy Design Pattern
--
Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.

Behavior:

As in the decorator pattern, proxies can be chained together. The client, and each proxy, believes it is delegating messages to the real server:
![](http://contribute.geeksforgeeks.org/wp-content/uploads/19702635_1413820232028220_8628994446322905016_o.jpg)

When to use this pattern?:

Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.
