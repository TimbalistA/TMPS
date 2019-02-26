First Laboratory Work
--

Task: Create a program in which you will use 5 Creational Design Patterns:

* Abstract Factory
* Builder 
* Factory
* Prototype
* Singleton

Abstract Factory Design Pattern Design Pattern
--
![](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/AbstractFactoryPattern-2.png)

UML class diagram example for the Abstract Factory Design Pattern.

* AbstractFactory : Declares an interface for operations that create abstract product objects.
* ConcreteFactory : Implements the operations declared in the AbstractFactory to create concrete product objects.
* Product : Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.
* Client : Uses only interfaces declared by AbstractFactory and AbstractProduct classes.

Implementation:

As an example,I supposed that I wanted to build a global home factory. For this we need home factories in each location like EnglandHouseFactory, FranceHouseFactory and ItalyHouseFactory. Now, our application should be smart enough to identify the location where it is being used, so we should be able to use appropriate home factory without even knowing which home factory implementation will be used internally. This also saves us from someone calling wrong factory for a particular location.

Here we need another layer of abstraction which will identify the location and internally use correct home factory implementation without even giving a single hint to user. This is exactly the problem, which abstract factory pattern is used to solve.

Builder Design Pattern
--
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

Here you can see how i implemented this pattern:

![image](https://user-images.githubusercontent.com/36602388/53428933-54dbb880-39f4-11e9-9675-951a02da31a6.png)

Currently there are only three fields, but all of them should be useful. What can I say when the field becomes 20!

In order not to duplicate the fields in the building class, I simply start the inner class. It has access to private fields of parent class and can display them directly.

Factory Design Pattern
--
![image](https://user-images.githubusercontent.com/36602388/53429676-c36d4600-39f5-11e9-89e1-0e97907f3030.png)

UML class diagram to understand the Factory Method design pattern.

Implementaion:

I developed the Factory Method pattern in the java program using - Jewellery Store. The Store makes various types of jewellery for the customer.

Jewellery.java

![image](https://user-images.githubusercontent.com/36602388/53429989-527a5e00-39f6-11e9-92f0-f79beab00b49.png)

In the above code I have created an abstract class Jewellery. In this abstract class I have defined two abstract methods such as addGold() and addDiamond(). Also I have implemented makeJewellery() method in which I printed “Jewellery will be ready in 2 days”.

RoseGoldJewellery.java

![image](https://user-images.githubusercontent.com/36602388/53430297-e6e4c080-39f6-11e9-8816-915a63d5886b.png)

In the above code I have created a class RoseGoldJewellery which extends an abstract class Jewellery. In this class I have implemented the abstract methods addGold(), addDiamond()  which are defined in the abstract class known as Jewellery. The same I implemented in WhiteGoldJewellery.java.

BaseJewelleryStore.java

![image](https://user-images.githubusercontent.com/36602388/53430564-6bcfda00-39f7-11e9-8f06-2fee927bac9f.png)

In the above code I have created an abstract class BaseJewelleryStore in which I have implemented an abstract method createJewellery() having an argument of string type.

JewelleryStore.java

![image](https://user-images.githubusercontent.com/36602388/53430679-acc7ee80-39f7-11e9-8879-eed891e2348e.png)

In the above code I have created a class JewelleryStore which extends BaseJewelleryStore class. In this class I have implemented an abstract method createJewellery() which is defined in BaseJewelleryStore class. In createJewellery() method I implemented a switch case for jewellery such as rose gold and white gold. Also, I have called methods addGold(), addDiamond() and makeJewellery() using Jewellery class object called jewellery.

FactoryDesignPattern.java

![image](https://user-images.githubusercontent.com/36602388/53431002-53ac8a80-39f8-11e9-8c26-9d9f69f6b7a6.png)

In the above code I have created FactoryDesignPattern class which consists of main() method. In this main() method I have created BaseJewelleryStore class object known as jewelleryStore. Using this object I have called createJewellery() method for both rose gold and white gold jewellery.

Prototype Design Pattern
--
Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations.

Prototype patterns is required, when object creation is time consuming, and costly operation, so we create object with existing object itself. One of the best available way to create object from existing objects are clone() method. Clone is the simplest approach to implement prototype pattern.

Singleton Design Pattern
--

The singleton design pattern is used to restrict the instantiation of a class and ensures that only one instance of the class exists in the JVM. In other words, a singleton class is a class that can have only one object (an instance of the class) at a time per JVM instance. There are various ways to design/code a singleton class.

To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

* Private constructor to restrict instantiation of the class from other classes.
* Private static variable of the same class that is the only instance of the class.
* Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.






























