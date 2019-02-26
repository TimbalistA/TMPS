First Laboratory Work
--

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

Builder
--
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

Here you can see how i implemented this pattern:

![image](https://user-images.githubusercontent.com/36602388/53428933-54dbb880-39f4-11e9-9675-951a02da31a6.png)

Currently there are only two fields, but all of them should be useful. What can I say when the field becomes 20!

In order not to duplicate the fields in the building class, we simply start the inner class. It has access to private fields of parent class and can display them directly.





