package practice08;

public class Klass {
    private Integer number;
    private Student leader = null;

    public void assignLeader(Student stu){
        leader = stu;
    }

    public Student getLeader(){
        return leader;
    }
    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        //Class 2
        return "Class "+number;
    }

    public Klass(Integer number) {
        this.number = number;
    }
}
