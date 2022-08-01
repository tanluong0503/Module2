package Abstract_Interface.demo;

public class Experience extends Employee {
    private String expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String fullName, String phone, String email) {
        super(id, fullName, phone, email);
    }

    public Experience(String expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(int id, String fullName, String birthDay, String phone, String email, String employee_type, String employee_count, int certificatedID, String certificateName, String certificateRank, String certificatedDate, String expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificatedID, certificateName, certificateRank, certificatedDate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()
                +
                ", Exp In Year: " + expInYear +
                ", Pro Skill: " + proSkill
                ;
    }

    @Override
    public void showMe() {
        System.out.println(this);
    }
}
