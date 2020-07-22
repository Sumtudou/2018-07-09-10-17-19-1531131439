package practice07;

public class Teacher extends Person{
    private Klass klass = null;

    public Teacher(String name, Integer age,Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        if(klass != null){
            return super.introduce()+" I am a Teacher. I teach "+getKlass().getDisplayName()+".";
        }else {
            //I teach No Class.
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public  String introduceWith(Student student){
        String stuName = student.getName();
        //My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
        //My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.
        if (this.getKlass().equals(student.getKlass())){
            return super.introduce()+" I am a Teacher. I teach "+stuName+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+stuName+".";
        }
    }
}
