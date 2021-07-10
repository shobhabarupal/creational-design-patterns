Design consideration:
---------------------
1) Prototypes are useful when you have large objects where majority of state is unchanged between instances and
    you can easily identify that state.
2) A creationalDesignPattern.prototype registry is a class where in you can register various creationalDesignPattern.prototype which other code can access to clone out instances.
    This solves the issue of getting access to initial instances.
3) Prototypes are very useful when working with Composite and Decorator pattern.


Implementation Consideration:
-------------------------------
1) Pay attention to the deep copy and shallow copy of reference. Immutable fields on clones save the trouble of deep copy.
2) Make sure to reset the mutable state of object before returning the creationalDesignPattern.prototype.
   Its a good idea to implement this in a method to allow subclass to initialise themselves.
3) Clone method is protected in Object class and must be overridden to public to be callable from outside the class.


Examples:
---------
1) Object.clone() method is an example. This method is provided by the Object class and can clone any object but classes still needs to Cloneable(implements Cloneable)


Pitfalls:
---------
1) Usability depends upon numbet of immutable properties or can be shallow copied.
    An object where state is comprised of large mutable object is complicated to clone as we need deep copy.
2) in java default clone() method only perform shallow copy so if you need deep copy you have to implement it.
3) Subclasses may not be able to support clone so now the client code becomes complecated as you have to code for situation
    where an implementation may not support clone.