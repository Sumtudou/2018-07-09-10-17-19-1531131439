package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    // private Klass klass = null;
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.classes = klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }


    public String introduce() {
        if (classes.size() != 0) {
            return super.introduce() + " I am a Teacher. I teach " + formatClasses(classes);
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    protected String formatClasses(LinkedList<Klass> classes) {
        //2, 3
        String resStr = "Class ";
        for (int i = 0; i < classes.size(); i++) {
            if (i == 0) {
                resStr += classes.get(i).getNumber().toString();
            } else {
                resStr += ", " + classes.get(i).getNumber().toString();
            }
        }
        resStr += ".";
        return resStr;
    }

    public boolean isTeaching(Student student) {
        for(Klass item : classes){
            if(item.isStudentInClass(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }


}