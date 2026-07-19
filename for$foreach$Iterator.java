package Project1;
import java.util.Iterator;
import java.util.ArrayList;
public class for$foreach$Iterator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1001","张三",18));
        students.add(new Student("1002","李四",19));
        students.add(new Student("1003","王五",20));
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }// for
        for(Student s : students){
            System.out.println(s);
        }//增强foreach循环
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }//迭代器方法
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getAge() > 18){
                students.remove(i);
                i--;
            }
        }
        Iterator<Student> it1 = students.iterator();
        while(it1.hasNext()){
            Student s = it1.next();
            if(s.getAge() > 18){
                it1.remove();
            }
        }
        System.out.println(students);
    }
}
