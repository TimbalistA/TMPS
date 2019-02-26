
#First Laboratory Work

Task: Create a program in which you will use 5 Creational Design Patterns:

* Abstract Factory
* Builder 
* Factory
* Prototype
* Singleton

Abstract Factory Design Pattern
--
![](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/AbstractFactoryPattern-2.png)

* AbstractFactory : Declares an interface for operations that create abstract product objects.
* ConcreteFactory : Implements the operations declared in the AbstractFactory to create concrete product objects.
* Product : Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.
* Client : Uses only interfaces declared by AbstractFactory and AbstractProduct classes.

Implementation:

As an example,I supposed that I wanted to build a global home factory. For this we need home factories in each location like EnglandHouseFactory, FranceHouseFactory and ItalyHouseFactory. Now, our application should be smart enough to identify the location where it is being used, so we should be able to use appropriate home factory without even knowing which home factory implementation will be used internally. This also saves us from someone calling wrong factory for a particular location.

Here we need another layer of abstraction which will identify the location and internally use correct home factory implementation without even giving a single hint to user. This is exactly the problem, which abstract factory pattern is used to solve.
