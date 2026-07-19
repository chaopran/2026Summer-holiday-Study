package Project1;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListStudent {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("1001","张三",18));
        students.add(new Student("1002","李四",19));
        students.addFirst(new Student("0001","管理员",30));
        students.addLast(new Student("9999","测试",20));
        System.out.println(students);
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
        students.removeFirst();
        students.removeLast();
        System.out.println(students);
    }
}
