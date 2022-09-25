public class Task1
{
    public static int fact(int n)
    {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }

    public static void table(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++)
                System.out.printf("%4d", i * j);
            System.out.println("");
        }
    }

    public static int sum(int n){
        int b = 0;
        while (n != 0) {
            b += n % 10;
            n /= 10;
        }
        return b;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0 & year % 400 == 0) {
            return true;
        } else
            return false;
    }

    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else
            return 365;
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n) {
        if (n.equals("Понедельник")) {
            return 1;
        } else if (n.equals("Вторник")) {
            return 2;
        } else if (n.equals("Среда")) {
            return 3;
        } else if (n.equals("Четверг")) {
            return 4;
        } else if (n.equals("Пятница")) {
            return 5;
        } else if (n.equals("Суббота")) {
            return 6;
        } else
            return 7;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++)
            System.out.print(array[i] + ", ");
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length - 1; j++)
                System.out.print(array[i][j] + ", ");
            System.out.println(array[array.length - 1][array[0].length - 1] + "]");
        }
    }

    public static int[] sort(int[] array){
        for (int i = array.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}