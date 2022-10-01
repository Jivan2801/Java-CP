class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.colour);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name,int age)
    {
        System.out.println(name+" "+age);
    }
}

public class OOPS{
    public static void main(String[] args) {
    // Pen pen1 = new Pen();
    // pen1.colour = "blue";
    // pen1.type="gel";
    // Pen pen2 = new Pen();
    // pen2.colour = "black";
    // pen2.type="ballpen";
    // pen2.printColor();
    // pen2.write();   
    Student s1 = new Student();
    s1.name = "Rounak";
    s1.age = 22;
    // Student s2 = new Student(s1);
    s1.printInfo(s1.age);
    }
}