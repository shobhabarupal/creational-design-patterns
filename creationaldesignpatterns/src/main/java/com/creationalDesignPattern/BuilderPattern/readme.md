Builder pattern:
---------------
There are mainly 4 component of the builder pattern
1) Director -> Director is going to create the object. A director can be a seperate class or client can play the role of the director.
2) Abstract Builder(optional) -> This is an interface which will have methods to create the part of the object and method to assemble the final object.
3) Concrete builder -> This is the implementation class of the Builder interface.
4) Product -> This is the class which will be final product of the builder pattern

Director know each and every step of how to build the product.

Method one:
-----------
Method one of the builder pattern shows every bits and pieces of the UML diagram.

Method two: This is the method that is being used in the builder pattern.
------------
In method 2 we are going to use Concrete builder as an inner class to Product class.
This is the preferred way of implementation as it is easy to create an immutable object with this method.

Having a builder inside the product class is a good design practice as it is easy to find a builder for that product.


When to use Builder:
--------------------
1) We have a complex process to create an object.
2) In builder we remove logic related to object construction from "client" code and abstract in seperate class.
3) When we have lot of parameters in the product then it becomes hectic to handle object creation using constructor.

Design consideration:
--------------------
1) No need of separate director class.
2) Abstract builder is also not required if "product" itself is not part of any inheritance hierarchy.

Example:
--------
1) java.lang.StringBuilder
2) buffer classes in java.nio package like ByteBuffer, CharBuffer
3) java.util.Calendar.Builder in java 8


Pitfalls: considering no of new classes that has to be added, effort required to refactor the existing code, complexity to understand a particular pattern
---------
1) 'method chaining' can be an issue the new comers to java programming.
2) Client can initialise object partially and call build method.
    If there are some required properties missing then build method needs to handle those by providing default value or throwing an error.