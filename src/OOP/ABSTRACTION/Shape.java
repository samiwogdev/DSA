package OOP.ABSTRACTION;

 abstract class Shape {
    String color;

    public Shape(String color){ // abstract class can have a constructor
      this.color = color;
        System.out.println("Shape Constructor called");
    }

    public Shape(){ //default constructor
        System.out.println("Shape Default constructor called");
    }

    abstract double area(); //abstract method
    public abstract String toString(); //abstract method

    public String getColor(){ //concrete method
        return color;
    }
}

