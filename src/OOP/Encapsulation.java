package OOP;

public class Encapsulation {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private String geekRole;
    private int geekAge;

    // get method for age to access
    // private variable geekAge

    public String getGeekName(){
        return this.geekName;
    }

    public String getGeekRole(){
        return this.geekRole;
    }

    public int getGeekAge() {
        return this.geekAge;
    }

    // set method for name to access
    // private variable geekName
    public void setGeekName(String geekName){
        this.geekName = geekName;
    }

    public void setGeekRole(String geekRole){
        this.geekRole = geekRole;
    }

    public void setGeekAge(int geekAge){
        this.geekAge = geekAge;
    }
}
