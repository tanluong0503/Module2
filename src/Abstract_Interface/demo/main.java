package Abstract_Interface.demo;

public class main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
//        employees[3] = new Experience(3,"Lượng","02135648","luong@gmail.com");
        employees[0] = new Experience(1,"Luong","2003","0977194578","luong@gmail.com","gioi","1233",1,"1","1","1","5","dang cap");
        employees[1] = new Fresher(3,"Tiên","2003","012345789","tien@gmail.com","1","1",1,"1","1","1","1","1","1");
        employees[2] = new Intern(2,"Vu","1996","09567896","3787","4623784","1",1,"8341294671","89483","rtsduja","fyasuk","úuds","fkjhd");
        for (Employee employee : employees) {
            if (employee instanceof Experience) {
                employee.showMe();
            }
            if (employee instanceof Fresher) {
                employee.showMe();
            }
            if (employee instanceof Intern) {
                employee.showMe();
            }
        }

    }
}
