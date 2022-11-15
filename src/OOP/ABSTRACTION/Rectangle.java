package OOP.ABSTRACTION;

 class Rectangle extends Shape{
     double length;
     double width;

     public Rectangle(double length, double width, String color){
         super(color);
         this.width = width;
         this.length = length;
         System.out.println("Calling Rectangle constructor");
     }

     public Rectangle(){
         super();
     }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is "
                + super.color
                + " and area is : "
                + area();
    }
}
