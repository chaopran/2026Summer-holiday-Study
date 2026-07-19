package Project1;
import java.util.HashMap;
import java.util.Scanner;
public class HashmapStudent {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();
        students.put("1001",new Student("1001","张三",18));
        students.put("1002",new Student("1002","李四",19));
        students.put("1003",new Student("1003","王五",20));
        for(String Id : students.keySet()){
            System.out.println(students.get(Id));
        }//遍历HashMap
        Scanner input = new Scanner(System.in);
        System.out.println("请输入查询学号：");
        String id = input.next();
        Student s = students.get(id);
        if(s==null){
            System.out.println("未找到该学生");
        }
        else System.out.println(s);
        System.out.println("请输入删除学号：");
        String id1 = input.next();
        if(students.containsKey(id1)){
            students.remove(id1);
            System.out.println("删除成功");
        }else{
            System.out.println("未找到该学生");
        }
        System.out.println(students);
    }
}
