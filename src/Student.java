import java.util.Scanner;
import java.util.Arrays;
public class Student {
    Scanner reader=new Scanner(System.in);
    private String studentID;
    private String studentName;
    private String []extraActivities;

    public Student(String studentID,String studentName, int numExtraActivities){
        this.studentID=studentID;
        this.studentName=studentName;
        this.extraActivities= new String[numExtraActivities];
    }
   public Student(){}


    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void addExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }
    public void ExtraActivities(String activity,int index){
        if (index>=0 && index< extraActivities.length) {
            extraActivities[index]=activity;
            
        }
        else{
            System.out.println("Invalid index");
        }
    

    }

    public String toString(){
        return"Student ID: "+studentID + "\nStudent Name:"+studentName+"\nExtra Activities:"+ Arrays.toString(extraActivities);
    }



    public static void addExtraActivity(String activity, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addExtraActivity'");
    }

}
    