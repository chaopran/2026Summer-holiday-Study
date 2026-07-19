package Project1;
public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void work(){
        System.out.println("人在工作");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name) throws IllegalArgumentException{
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("姓名不能为空");
        }
        this.name = name;
    }
    public void setAge(int age) throws AgeException{
        if(age<0){
            throw new AgeException("年龄不能小于0");
        }
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
