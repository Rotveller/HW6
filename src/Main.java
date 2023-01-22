public class Main {
    public static void main (String[]args){
        System.out.println("Task1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Task2");
        for (int a = 10; a >= 0; a=a-1){
            System.out.println(a);
        }
        System.out.println("Task3");
        for (int s = 0; s<=17; s = s+1){
            if (s%2==0){
            System.out.println(s);}
        }
        System.out.println("Task4");
        for (int q = 10; q>=-10; q=q-1) {
            System.out.println(q);
        }
        System.out.println("Task5");
        for (int e = 1904; e<=2096; e=e+4){
            System.out.println(e+" год является високосным");
        }
        System.out.println("Task6");
        for (int r = 7; r <=98; r=r+7){
            System.out.println(r);
        }
        System.out.println("Task7");
        for (int s = 1; s <=512; s=s*2){
            System.out.println(s);
        }
        System.out.println("Task8");
        float salary = 29000;
        for (int i = 1; i <= 12; i=i+1){
            System.out.println("Месяц "+i+" сумма накоплений равна" + i*salary + " рублей ");
        }
        System.out.println("Task9");
        float salary2 = 29000;
        float total = 0;
        for (int у = 0; у <= 12; у++){
            total = total + total/100;
            total = total + salary2;
            System.out.println("Месяц "+у+" сумма накоплений равна " + total + " рублей ");}
        System.out.println("Task10");
        for (int t = 1; t <= 10; t++){
            int table = t *2;
            System.out.println("2 * " +t + " = " + table);}
    }
}