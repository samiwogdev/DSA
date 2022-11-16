package OOP.ABSTRACTION;

 class Circle extends Shape{
     double radius;

     public Circle(String color, double radius){
         super(color);  // calling Shape constructor
        // super();  //default constructor
         this.radius = radius;
         System.out.println("Circle constructor called");
     }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is "
                + super.color
                + " and area is : "
                + area();
    }

    public String getColor(){ //shape class  concrete method
         return color;
    }
}
