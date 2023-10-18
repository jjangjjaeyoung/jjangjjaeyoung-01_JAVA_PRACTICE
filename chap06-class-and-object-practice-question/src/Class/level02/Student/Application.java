package Class.level02.Student;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("학년 :");
        int grade = sc.nextInt();
        System.out.print("반 :");
        int classroom = sc.nextInt();
        System.out.print("이름 :");
        String name = sc.nextLine();
        System.out.print("키 :");
        double height = sc.nextDouble();
        System.out.print("성별 :");
        char gender = sc.nextLine().charAt(0);

        StudentVO stu =  new StudentVO(grade, classroom, name, height, gender);

        System.out.println();


    }
}
