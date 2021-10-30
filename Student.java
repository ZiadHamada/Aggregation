public class Student {
    private int studentID;
    private float studentGPA;
    Subject subject = new Subject();
    Address address = new Address();

    public Student(){

    }
    public Student(int studentID, float studentGPA, Subject subject, Address address){
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.subject = subject;
        this.address = address;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void setStudentGPA(float studentGPA){
        this.studentGPA = studentGPA;
    }
    public String getStudentID(){
        return "Student ID: " + studentID;
    }
    public String getStudentGPA(){
        return "Student GPA: " + studentGPA;
    }

    public void setSubject(String subjectID, String subjectName, int subjectHours){
        subject.setSubjectID(subjectID);
        subject.setSubjectName(subjectName);
        subject.setSubjectHours(subjectHours);
    }
    public String getSubject(){
        return "Subject ID: " +  subject.getSubjectID() + "\tSubject Name: " + subject.getSubjectName() + "\tSubject Hours: " + subject.getSubjectHours();
    }

    public void setAddress(int streetNO, String city, String country){
        address.setStreetNO(streetNO);
        address.setCity(city);
        address.setCountry(country);
    }
    public String getAddress(){
        return "Street Number: " + address.getStreetNO() + "\tCity: " + address.getCity() + "\tSCountry: " + address.getCountry();
    }

    void display(){
        System.out.println("Student ID: " + studentID + "\tStudent GPA: " + studentGPA);
        System.out.println("Subject ID: " + subject.getSubjectID() + "\tSubject Name: " + subject.getSubjectName() + "\tSubject Hours: " + subject.getSubjectHours());
        System.out.println("Street Number: " + address.getStreetNO() + "\tCity: " + address.getCity() + "\tCountry: " + address.getCountry());
    }
}
