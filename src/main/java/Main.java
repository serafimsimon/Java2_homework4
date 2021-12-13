import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
/*Для Метода 1*/
        final int a = 255;

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(23);
        l.add(255);
        l.add(23);
        l.add(255);
        l.add(1);
        System.out.println("Список чисел: ");
        System.out.println(l);
        System.out.println("Индекс первого вхождения в список числа " + a + " = ["  + search(l, a, (list) -> list.indexOf(a)) + "]");
        System.out.println();

        /*Для метода 2*/
        final String meStr = "полиморфизм";
        System.out.println("Слово [" + meStr + "] наоборот: [" + revers(meStr, str -> {
            StringBuilder builder = new StringBuilder(meStr);
            return builder.reverse().toString();
        })+ "]");
        System.out.println();

/*Для метода 3*/
        System.out.println("Максимальный элемент в списке " + l + " равен  " + maximum(l, (list) -> Collections.max(list)));

/*Для метода 4*/
        System.out.println("Среднее значение элемента в этом списке " + average(l, (list) ->{
        int sum = 0;
        for(int i : l) sum +=i;
        return ((double)sum)/l.toArray().length;
        }
    ));
        System.out.println();

/*Для метода 5*/
        List<String> MyStr = new ArrayList<>();
        MyStr.add("азы");
        MyStr.add("ананас");
        MyStr.add("собака");
        MyStr.add("абы");
        MyStr.add("кусок");
        MyStr.add("авокадо");
        MyStr.add("ава");
        System.out.println();
        System.out.println("Список слов: "+ MyStr);
        System.out.println("Слова из данного списка, начинающиеся на букву 'а' и содержащие ровно 3 буквы: " + searchStr(MyStr, (list) -> {
            List<String> MyStrA = new ArrayList<>();
            for (String elements : MyStr) {
                if (elements.startsWith("а") && elements.length() == 3) {
                    MyStrA.add(elements);
                }
            }
            return MyStrA;
        }));
    }
/*Метод 1, который возвращает индекс первого вхождения заданного целого числа в списке*/
    public static Integer search(List<Integer> list, Integer n, Function<List<Integer>, Integer> function){
        return function.apply(list);
    }

/*Метод 2, переворачивающий строку*/
public static String revers (String str, StrRevers revers) {
    return revers.revers(str);
}

/*Метод 3, который возвращает наибольшее целое число в списке */

    public static Integer maximum (List<Integer> list, Function<List<Integer>, Integer> function){
        return function.apply(list);
}

/*Метод 4, возвращающий среднее значение из списка целых чисел*/
public static Double average (List<Integer> list, Function<List<Integer>, Double> function){
    return function.apply(list);}


/*Метод 5, возвращающий список всех строк, которые начинаются с буквы "а" и имеют три буквы*/

    public static List<String> searchStr (List<String> list, SearchA searchA) {
        return searchA.searchA(list);}


}
