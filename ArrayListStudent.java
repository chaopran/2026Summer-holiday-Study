package Project1;
import java.util.*;
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("1001","张三",18));
        students.add(new Student("1002","李四",19));
        students.add(new Student("1003","王五",20));
        System.out.println(students);
        System.out.println("请输入学号");
        Scanner input = new Scanner(System.in);
        String id = input.next();
        boolean flag = false;
        for(Student s:students){
            if(s.getId().equals(id)){
                System.out.println(s);
                flag = true;
                break;
            }
        }
        if(flag== false) System.out.println("未找到该学生");
        System.out.println("请输入删除学号");
        String id1 = input.next();
        int index = -1;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId().equals(id1)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("未找到该学生");
        }else{
            students.remove(index);
            System.out.println("删除成功");
        }
        System.out.println(students);
        input.close();
    }
}
