
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(8, 9, 30);
        System.out.println("EXPECTED:");
        System.out.println("08:09:30");
        System.out.println("ACTUAL:");
        System.out.println(time1);


        System.out.println();


        time1.tick();
        System.out.println("EXPECTED:");
        System.out.println("08:09:31");
        System.out.println("ACTUAL:");
        System.out.println(time1);


        System.out.println();


        Time time2 = new Time(3, 16, 59);
        System.out.println("EXPECTED:");
        System.out.println("03:16:59");
        System.out.println("03:17:00");
        System.out.println("ACTUAL:");
        System.out.println(time2);
        time2.tick();
        System.out.println(time2);
        System.out.println();
        Time time3 = new Time(7, 59, 59);
        System.out.println("EXPECTED:");
        System.out.println("07:59:59");
        System.out.println("08:00:00");
        System.out.println("ACTUAL:");
        System.out.println(time3);
        time3.tick();
        System.out.println(time3);


        System.out.println();


        Time time4 = new Time(23, 59, 59);
        System.out.println("EXPECTED:");
        System.out.println("23:59:59");
        System.out.println("00:00:00");
        System.out.println("ACTUAL:");
        System.out.println(time4);
        time4.tick();
        System.out.println(time4);


        System.out.println();


        Time time5 = new Time(23, 59, 59);


        Time time6 = new Time(0, 0, 1);
        System.out.println("EXPECTED:");
        System.out.println("23:59:59");
        System.out.println("00:00:00");
        System.out.println("ACTUAL:");
        System.out.println(time5);
        time5.add(time6);
        System.out.println(time5);


        System.out.println();


        Time time7 = new Time(0, 0, 0);
        Time time8 = new Time(23, 59, 59);
        System.out.println("EXPECTED:");
        System.out.println("00:00:00");
        System.out.println("23:59:59");
        System.out.println("ACTUAL:");
        System.out.println(time7);
        time7.add(time8);
        System.out.println(time7);


        System.out.println();


        System.out.println("EXPECTED:");
        System.out.println("23:59:59");
        System.out.println("23:59:58");
        System.out.println("ACTUAL:");
        System.out.println(time7);
        time7.add(time8);
        System.out.println(time7);




    }
}

