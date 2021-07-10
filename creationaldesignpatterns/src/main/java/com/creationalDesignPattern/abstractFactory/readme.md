When to use:
------------
1) Abstract factory is used when we have 2 or more objects which work(design to work) together forming a kit or set and
    there can be multiple sets or kits that can be created by client code.

Implementations steps:
-----------------------
1) We start by studying the products sets
    - Create abstract factory as an abstract class or interface     ----> ResourceFactory
    - Abstract factory defines abstract methods for creating products    ---> createInstance() and createStorage()
    - Provide concrete implementation of factory for each set of products  ---> GoogleCloudResourceFactory and AwsResourceFactory
2) Abstract factory makes use of factory method pattern. You can think of abstract factory as an object with multiple factory methods.


Implementation consideration:
-----------------------------
1) Factories can be implemented as Singlotons, We typically need only one instance of it anyway.
    But make sure to familiarize yourself with drawbacks of Singleton.
