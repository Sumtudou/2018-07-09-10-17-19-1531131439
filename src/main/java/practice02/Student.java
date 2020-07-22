package practice02;

public class Student extends Person{
    private  Integer klass;
    public Student(String name,Integer age ,Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        //I am a Student. I am at Class 2.
        return "I am a Student. I am at Class "+klass+".";
    }


}
