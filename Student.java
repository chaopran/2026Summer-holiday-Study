package Project1;
public class Student extends Person{
    private String id;
    public Student() {
    }
    public Student(String id, String name,int age) {
        super(name,age);
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) throws IllegalArgumentException{
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("学号不能为空");
        }
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//判断对象是否是同一个对象
        if (o == null || getClass() != o.getClass())//判断对象是否是同一个对象
            return false;
        Student student = (Student) o;
        return id.equals(student.getId());
    }
    @Override
    public int hashCode(){
        return id.hashCode();
    }
    @Override
    public void work() {
        System.out.println("学生在学习");
    }
}