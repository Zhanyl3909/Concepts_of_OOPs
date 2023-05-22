//Overloading

class Dog {
		public void bark() {
				System,out.println("woof");
		}
   public void bark(int number) {    //same name, different parameters
    	for(int i=0; i<number; i++) {
	  	System.out.println("woof");
		}
	}
}


//Overriding

class Dog {
		public void bark() {
				System,out.println("woof");
		}
}

class GermanShepherd extends Dog { 
		@Override
		public void bark() {                   //same name, same parameters
			System,out.println("woof woof woof");
	}
}


/*
 Method Overloading

- Method Overloading means providing two or more separate methods, in a class, with the same name, but different parameters.
- Method return type may or may not be different, and that allows us to reuse the same method name
- Overloading is very handy, it reduces duplicated code, and we don’t have to remember multiple method names.
- To the code calling an overloaded method, it looks like a single method can be called, with different sets of argument.
- Java developers often refer to method overloading, as compile-time polymorphism. This means the compiler is determining the 
right method to call, based on the method name & argument list!
*/



/*
 Method Overriding

- Method Overriding, means defining a method in a child class, that already exists in the parent class,
with the same signature(the same name, same arguments)
- By extending the parent class, the child class gets all the methods defined in the parent class 
(those methods are also known as derived methods)
- We can’t override static methods, only instance methods can be overridden
*/
