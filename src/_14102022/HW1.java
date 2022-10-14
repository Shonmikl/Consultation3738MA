package _14102022;
/*
First level: Есть устройство, на табло которого показывается количество секунд,
оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра
 — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000»
 (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
 (т.е. рабочий день закончился).

Напишите метод, который будет получать из командной строки текущее время
(int hour, int minutes)
int restHour;
int restMinutes;
int restSeconds;
 */

import java.util.Scanner;

/**
 * 1. Какие есть переменные, методы, параметры методов
 * 2. Объявить переменные методы
 * 3. Написать логику
 * 4. Проверить на работоспособность
 * 5. Пофиксить
 * 4. Рефакторинг
 */
public class HW1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int START = 28800;
    private static final short CONSTANT = 60;

    private static void getResult(int hour, int minute) {
        int sumMinutes = ((hour - 9) * CONSTANT) + minute;
        int restHour = 8 - (hour - 9);
        int restMinutes = (START / CONSTANT) - sumMinutes;
        int restSeconds = START - (((hour - 9) * 3600) + (minute * CONSTANT));

        System.out.println("Rest hours are: [" + restHour + "] hours");
        System.out.println("Rest minutes are: [" + restMinutes + "] minutes");
        System.out.println("Rest seconds are: [" + restSeconds + "] seconds");
    }

     static void input() {
        int h;
        int m;
        System.out.println("Please input hours.....");
        h = SCANNER.nextInt();

        System.out.println("Please input minutes.....");
        m = SCANNER.nextInt();

        getResult(h, m);
    }

    public static void main(String[] args) {
        input();
    }
}