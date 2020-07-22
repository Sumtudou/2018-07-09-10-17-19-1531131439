package practice09;

import java.util.*;

public class Klass {
    private Integer number;
    private Student leader = null;
    private Set<Student> inClassStudent = new HashSet<>();

    public void appendMember(Student stu){
        inClassStudent.add(stu);
    }

    private boolean isStudentInClass(Student student){
        return inClassStudent.contains(student);
    }

    public void assignLeader(Student stu){
        if(isStudentInClass(stu))
            leader = stu;
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
