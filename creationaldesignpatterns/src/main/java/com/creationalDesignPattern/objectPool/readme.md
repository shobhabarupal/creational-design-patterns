Implementation consideration:
-----------------------------
1) Resetting object state should not be costly otherwise we may end up losing performance savings.
2) Pre-caching objects meaning creating objects in advance may be helpful as it wont slow down however it may add-up to start up time and memory consumption.
3) Object pool's synchronization should consider the reset time needed and avoid resetting in synchronized context if possible
    because it may block some thread unnecessary just to reset.

Design consideration:
---------------------
1) Object pool can be parameterised to cache and return multiple objects and the get() method can provide selection criteria.
2) Pooling object in only beneficial if they involves costly initialisation bacause of external resource like connection or thread.
    Do not pool just to save memory.
3) Do not pool long lived objects or only to save frequent calls to new. Pooling may actually negatively impact performance in such cases.


Examples:
---------
1) ThreadPoolExecutor
2) dbcp library for database connection pooling . Class -> org.apache.commons.dbcp.BasicDataSource.


Pitfalls:
---------
1) Successful implementation depends on correct use by client because client has to return the objects back to pool else it can create memory leak.
2) Reusable objects needs to take care of resetting its state efficiently. Some object might not be suitable because of this requirement.
3) Difficult to use in refactoring legacy code as the client code and reusable object both need to be aware about pool.
4) You have to decide what happens when pool is empty and there is demand.You can either wait or create a new object.
    Both options have issues of there own. waiting may impact performance and creating always new object can lead to a large number of pool objects.