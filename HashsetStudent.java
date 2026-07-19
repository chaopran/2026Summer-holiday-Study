package Project1;
import java.util.HashSet;
import java.util.Iterator;
public class HashsetStudent {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("张三");
        names.add("李四");
        names.add("张三");
        System.out.println(names.add("王五"));
        System.out.println(names.add("王五"));
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("1001","张三",18));
        students.add(new Student("1001","张三",18));
        System.out.println(students.size());
        Student s1 = new Student("1001","张三",18);
        Student s2 = new Student("1001","张三",18);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
