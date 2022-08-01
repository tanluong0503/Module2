package Abstract_Interface.demo;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String university_name;

    public Intern() {
    }

    public Intern(int id, String fullName, String birthDay, String phone, String email, String employee_type, String employee_count, int certificatedID, String certificateName, String certificateRank, String certificatedDate, String majors, String semester, String university_name) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificatedID, certificateName, certificateRank, certificatedDate);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }


    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Majors: " + majors +
                ", Semester: " + semester +
                ", University Name: " + university_name;
    }

    @Override
    public void showMe() {
        System.out.println(this);

    }


}
