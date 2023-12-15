# Abstract & Generalization 

### Overview

An abstract method has a method signature, and a return type, but doesn’t have a method body. Because if this, we say an abstract method is unimplemented. The purpose is to describe behavior, which any object of that type will always have.  

### Abstract Classes

An abstract class is a class that is **incomplete,** so can’t create an instance of an abstract class. 

An abstract class’s purpose, is to define the behavior it’s subclasses are required to have, so it always participates in **inheritance** 

```java
 abstract class Animal {
   public abstract void move();
}
```

Abstract methods can only be declared on an abstract class or interfaces.
