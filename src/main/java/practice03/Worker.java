package practice03;

public class Worker extends Person {

    public Worker(String name ,Integer age) {
        super(name, age);
    }

    public String introduce() {
        //super.introduce();
       // System.out.println(" Teaching for the future of world.");
        return "I am a Worker. I have a job.";
    }


}
