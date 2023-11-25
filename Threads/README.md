# Java Concurrency 
## Threads


### Thread Priority

Thread priority in Java determines the scheduling preference of a thread in relation to other threads. The thread scheduler uses the priority value to decide which threads should be executed first when multiple threads are ready to run. In Java, thread priorities are represented by integer values ranging **from 1 to 10,** **where 1 is the lowest priority and 10 is the highest priority.**

Higher-priority threads have a greater chance of being executed before lower-priority threads. However, thread priority should not be relied upon for precise thread execution order or fairness, as the actual behavior depends on the underlying operating system.

To set the priority of a thread in Java, you can use the `setPriority()` method of the `Thread` class. Here's an example:

```java
Thread thread = new Thread();
thread.setPriority(Thread.MAX_PRIORITY); // Set the thread priority to the highest

```

It's important to note that thread priority should be used judiciously and in conjunction with other synchronization mechanisms to ensure correct program behavior and avoid issues like starvation or thread starvation.

In general, it's recommended to write thread-safe code that doesn't rely heavily on thread priorities to achieve desired outcomes.
