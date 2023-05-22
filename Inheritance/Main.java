
//Repeating 
class Rectangle {
  private int x;
  private int y;
  private int weight;
  private int height;

public Rectangle() {
  this.x = 0;
  this.y = 0;
  this.weight = 0;
  this.height = 0;
}

public Rectangle(int weight, int height) {
  this.x = 0;
  this.y = 0;
  this.weight = weight;
  this.height = height;
}

public Rectangle(int x, int y, int weight, int height) {
  this.x = x;
  this.y = y;
  this.weight = weight;
  this.height = height;
}

}

//Chaining Constructor

class Rectangle {
  private int x;
  private int y;
  private int weight;
  private int height;

public Rectangle() {
  this(0,0)
}

public Rectangle(int weight, int height) {
  this(0,0, weight, height)
}

//the 3rd constructor does all the work
public Rectangle(int x, int y, int weight, int height) {
  this.x = x;
  this.y = y;
  this.weight = weight;
  this.height = height;
}

}


//super 
class Shape {
  private int x;
  private int y;
  

public Shape(int x, int y) {
	this.x = x;
	this.y = y;
  }
}

class Rectangle extends Shape {
	 private int width;
	 private int height;

public Rectangle(int x, int y) {
	this(x, y, 0, 0);
}

public Rectangle(int x, int y, int width, int height) {
	 super(x,y);
	 this.width = width;
	 this.height = height;
  }
}


/*
Difference between this() and super() in java ?

this() is used to access one constructor from another with in the same class while super() is used to access superclass constructor. Either this() or super() exists it must be the first statement in the
constructor.

*/
