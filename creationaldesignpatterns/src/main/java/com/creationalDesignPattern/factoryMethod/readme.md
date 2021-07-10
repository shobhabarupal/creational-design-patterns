There are 4 main component in the UML diagram :
1) Product -> Abstract class or interface -> Message
2) Concrete product -> Implementation of the product interface -> TextMessage/JSONMessage
3) Creator -> abstract class or interface which will have a abstract factory method -> MessageCreator
4) Concrete creator -> Implementation of abstract creator -> JSOMessageCreator/TextMessageCreator

Implementation Consideration:
-------------------------------
1) The creator can be a concrete class and provide a default implementation for the factory method. In such cases you'll create some "default" object in base creator.
2) You can also use the simple factory way of accepting additional argument to choose between different object types.
Subclasses can then override factory method to selectively create different objects for some criteria.


Design consideration:
---------------------
1) Creator hierarchy reflects the product hierarchy. We end up with a concrete creator per object type.
2) Template method design pattern often makes the use of factory methods.
3) Another creational design pattern called "abstract factory" makes use of factory method pattern.


Example:
--------
1) java.util.AbstractCollection (or java.util.Collection interface)  has an abstract method called iterator().
2) The most defining characteristics of factory method pattern is "subclasses providing the actual instances".
    So static methods returning object instances are technically not GoF factory methods.

Pitfalls:
---------
1) More complex to implement. More classes are involved and need unit testing.
2) 