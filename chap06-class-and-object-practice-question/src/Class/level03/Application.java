package Class.level03;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        EmployeeDTO emp = new EmployeeDTO();

        Scanner sc = new Scanner(System.in);


        System.out.print("사원번호 : ");
        int number = sc.nextInt();
        System.out.print("이름 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("부서 : ");
        String dept = sc.nextLine();
        System.out.print("직책 : ");
        String job = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        System.out.print("급여: ");
        int salary = sc.nextInt();
        System.out.print("보너스포인트 : ");
        double bonusPoint = sc.nextDouble();
        System.out.print("전화번호 : ");
        sc.nextLine();
        String phone = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();


        emp.setNumber(number);
        emp.setName(name);
        emp.setDept(dept);
        emp.setJob(job);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setSalary(salary);
        emp.setBonusPoint(bonusPoint);
        emp.setPhone(phone);
        emp.setAddress(address);

        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getJob());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBonusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
    }
}
