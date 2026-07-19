package Project1;

public class Bird extends Animal implements Fly{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName() + "正在吃虫子");
    }
    @Override
    public void fly(){
        System.out.println(getName() + "正在飞翔");
    }
}
