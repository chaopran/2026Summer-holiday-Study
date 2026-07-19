package Project1;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName() + "正在吃骨头");
    }
}
