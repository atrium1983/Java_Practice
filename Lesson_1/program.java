package Lesson_1;

/**
 * program
 */

public class program {
    public static void main(String[] args) {
            System.out.println("Hello world");
            String s = "     2";
            System.out.println(s);
            short age = 10;
            int salary = 123456;
            System.out.println(age);
            System.out.println(salary);
            double f = 123.45D;
            System.out.println(f);
            char ch = '1';
            System.out.println(Character.isDigit(ch)); // true
            ch = 'a';
            System.out.println(Character.isDigit(ch)); // false
            boolean flag1 = 123 <= 234; 
            System.out.println(flag1); // true
    }
}