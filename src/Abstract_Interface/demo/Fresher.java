package Abstract_Interface.demo;

public class Fresher extends Employee {
    private String graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {
    }


    public Fresher(String graduation_date, String graduation_rank, String education) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public Fresher(int id, String fullName, String birthDay, String phone, String email, String employee_type, String employee_count, int certificatedID, String certificateName, String certificateRank, String certificatedDate, String graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificatedID, certificateName, certificateRank, certificatedDate);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }




    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Graduation Date: " + graduation_date +
                ", Graduation Rank: " + graduation_rank +
                ", Education: " + education;
    }

    @Override
    public void showMe() {
        System.out.println(toString());
    }
}
