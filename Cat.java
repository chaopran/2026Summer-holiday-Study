package Project1;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName() + "正在吃鱼");
    }
}
