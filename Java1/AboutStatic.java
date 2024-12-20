class Student{
    static String schoolname;
    int id;
    int marks;

    public static void details(Student obj){
        System.out.println("School name: "+schoolname+" ,ID: "+obj.id+" ,marks: "+obj.marks);
    }
}

class OuterClass {

    int i; // Instance variable
    static int j; // Static variable or Class variables 

    // Static nested class or Static member inner classes
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class "+OuterClass.j);
        }
    }

    public void display(){
        System.out.println("Outer Class Display");
    }
}

class A{
    static int num;
    static{
        num=7;
        System.out.println("Assigned Number 7");
    }

    public void display(){
        System.out.println("In A");
    }
}

public class AboutStatic {

    static{
        System.out.println("Statement got executed when the class is loaded");
    }
    static{
        System.out.println("Second Statement");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        

        Student s1=new Student();
        Student.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        Student.schoolname="BITS";
        s2.id=2;
        s2.marks=95;

        Student.details(s2);
        Student.details(s1);

        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();

        System.out.println("Inside Main Method");

        A a=new A();
        a.display();

        Class.forName("A");
                
    }
}
