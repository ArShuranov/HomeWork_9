
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(task_1());
        System.out.println();
        task_2();
        System.out.println();
        task_3();

    }

    public static String task_1() {
        String firstName = "Ivan";
        String middletName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middletName;
        return("ФИО сотрудника - " + fullName);
    }

    public static void  task_2() {
        String firstName = "Ivan";
        String middletName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middletName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }
    public static void  task_3() {
        String fullName = "Иванов Семён Семёнович";
        String result =fullName.replace("ё", "е");
        System.out.println(result);
    }

}