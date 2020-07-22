package practice11;
import java.util.HashSet;
import java.util.Set;

public class Klass {
    private Integer number;
    private Student leader = null;
    private Set<Student> inClassStudent = new HashSet<>();
    private Set<Teacher> inClassTeacher = new HashSet<>();  //contains teacher

    public void addInClassTeacher(Teacher teacher){
        inClassTeacher.add(teacher);
    }

    public void appendMember(Student stu){
        inClassStudent.add(stu);
        stu.setKlass(this); //If stu doesn't belong to this class at first, change it here
        for(Teacher teacher: inClassTeacher){
            teacher.studentChanges(stu,1);
        }
    }

    boolean isStudentInClass(Student student){
        return inClassStudent.contains(student);
    }

    public void assignLeader(Student stu){
        if(isStudentInClass(stu)){
            leader = stu;
            for(Teacher teacher: inClassTeacher){
                teacher.studentChanges(stu,2);
            }
        }
        else
            System.out.print("It is not one of us.\n");
    }

    public Student getLeader(){
        return leader;
    }
    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public Klass(Integer number) {
        this.number = number;
    }
}