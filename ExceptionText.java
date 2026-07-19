package Project1;

public class ExceptionText {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println("不能除以零");
        }
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }finally{
            System.out.println("程序结束");
        }
        try{
            Person p = new Person("张三",10);
            p.setAge(-10);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
        try{
            Person p = new Person("张三",10);
            p.setName("");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Student s = new Student("1001","张三",10);
            s.setId("");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
