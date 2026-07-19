package Project1;
import java.util.Scanner;
public class Teststudent{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========学生管理系统========");
        System.out.println("1.添加学生");
        System.out.println("2.查询学生");
        System.out.println("3.删除学生");
        System.out.println("4.退出");
        System.out.println("请输入你的选择：");
        int choice = input.nextInt();
        switch(choice){

            case 4: return;
        }
        Student s1 = new Student("1001","张三", 18);
        System.out.println(s1);
    }
}
