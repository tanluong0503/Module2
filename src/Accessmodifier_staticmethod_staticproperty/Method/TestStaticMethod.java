package Accessmodifier_staticmethod_staticproperty.Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(1, "Trung dau dat");
        Student s2 = new Student(2, "Tien dau tom ");
        Student s3 = new Student(3, "Luong dau lanh");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}


