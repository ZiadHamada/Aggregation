public class Subject {
    private String subjectID;
    private String subjectName;
    private int subjectHours;

    public Subject(){

    }
    public Subject(String subjectID, String subjectName, int subjectHours){
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
    }

    public void setSubjectID(String subjectID){
        this.subjectID = subjectID;
    }
    public String getSubjectID(){
        return subjectID;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectHours(int subjectHours){
        this.subjectHours = subjectHours;
    }
    public int getSubjectHours(){
        return subjectHours;
    }
}
