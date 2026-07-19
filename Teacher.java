package Project1;
public class Teacher extends Person{
    private String subject;
    public Teacher(){
    }
    public Teacher(String subject, String name,int age){
        super(name,age);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Teacher{"  +
                "subject='" + subject + '\'' +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
    @Override
    public void work(){
        System.out.println("老师在教课");
    }
}
