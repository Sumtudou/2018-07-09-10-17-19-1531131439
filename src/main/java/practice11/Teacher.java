package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.classes = klass;
        for (Klass classItem : klass) {
            classItem.addInClassTeacher(this);
        }
    }

    public void studentChanges(Student stu, Integer type) {
        if (type == 1) {  // student comein class
            for (Klass item : classes) {
                if (item.isStudentInClass(stu)) {
                    System.out.print("I am " + getName() + ". I know " + stu.getName() +
                            " has joined " + item.getDisplayName() + ".\n");
                }
            }
        } else { // student become leader
            for (Klass item : classes) {
                if (item.isStudentInClass(stu)) {
                    System.out.print("I am " + getName() + ". I know " + stu.getName()
                            + " become Leader of " + item.getDisplayName() + ".\n");
                }
            }
        }
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
        for (Klass item : classes) {
            if (item.isStudentInClass(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}