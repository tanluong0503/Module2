package Abstract_Interface.demo;

public abstract class Employee {
    private int id;
    private String fullName;
    private String birthDay;
    private int phone;
    private String email;
    private String employee_type;
    private String employee_count;
    private int CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private String CertificatedDate;

    public Employee() {
    }

    public Employee(int id, String fullName, String birthDay, int phone, String email, String employee_type, String employee_count) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.employee_count = employee_count;
    }

    public Employee(int certificatedID, String certificateName, String certificateRank, String certificatedDate) {
        CertificatedID = certificatedID;
        CertificateName = certificateName;
        CertificateRank = certificateRank;
        CertificatedDate = certificatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    public String getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(String employee_count) {
        this.employee_count = employee_count;
    }

    public int getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public String getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        CertificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ", employee_count='" + employee_count + '\'' +
                ", CertificatedID=" + CertificatedID +
                ", CertificateName='" + CertificateName + '\'' +
                ", CertificateRank='" + CertificateRank + '\'' +
                ", CertificatedDate='" + CertificatedDate + '\'' +
                '}';
    }

    public abstract void showMe();
}
