How to break creationalDesignPattern.singleton class:
-----------------------------
1) Using reflection : We can use reflaction to access private constructor from any class and then create another object.
    prevention: We can prevent this by using ENUM because enum doesn't have any constructor which is exposed to users although JVM uses the enum constructor.

2) Serialization: Serialization is used to convert an object of byte stream and save in a file or send over a network.
    Suppose you serialize an object of a creationalDesignPattern.singleton class. Then if you de-serialize that object it will create a new instance and hence break the creationalDesignPattern.singleton pattern.
    prevention: we have to implement method readResolve() method to return creationalDesignPattern.singleton instance.
3) Clone: By cloning the creationalDesignPattern.singleton we can create two objects.
    prevention: We can override clone method to either throw error or return the same instance.


Implementation consideration:
-----------------------------
1) Use eager initialisation method as it is simple and the preferred way.
2) The classic creationalDesignPattern.singleton implementation pattern uses double check locking and volatile keyword.
3) The 3rd approach which is inner class approach provide best of above 2. We dont have to deal with sychronisation and it is lazy loading.

Design consideration:
---------------------
1) Singleton creation does not need any parameters so getInstance() method should not take any parameter.
    In case if you need support for constructor arguments, you need a simple factory or factory method pattern instead.
2) Make sure your singletons are not carrying a lot of mutable global state.

Note:- Now a days creationalDesignPattern.singleton has become anti pattern that means using creationalDesignPattern.singleton in a production code is bad design.

Example:
--------
1) Runtime class (Eager creationalDesignPattern.singleton)

Pitfalls:
---------
1) Singleton pattern can deceive you about true dependencies since they are globally accessible.
2) They are hard to unit test as mocking can not be possible.
3) Common way to implement creationalDesignPattern.singleton is using static variable. Note that static variables are per class loader not per JVM.
    so they may not be true creationalDesignPattern.singleton in an OSGi or web application.
4) A creationalDesignPattern.singleton carrying around a large mutable global state is a good indication of an abused Singleton pattern.
    Mutable global state is considered bad design that is why creationalDesignPattern.singleton has become anti design now a days.
