Design consideration:
--------------------
1) Simple factory will in turn may use other design patterns like builder to create the object.
2) In case you want ti specialise your simple factory in sub classes, you need factory method design pattern instead.


Implementation consideration:
-----------------------------
1) Simple factory can just be a method in existing class. Adding a seperate class however allows other parts of your code to use simple factory more easily.
2) Simple factory does not need any state tracking so it is best to create a static method.


Examples:
--------
1) java.text.NumberFormat -> getInstance method is simple factory



Pitfalls:
---------
1) The criteria used by simple factory to decide which object to instantiate can get more complex overtime. If you find yourself in such situation then use factory method design pattern.
