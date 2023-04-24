import java.util.Scanner;

public class Lesson6HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0; //счётчик правильных ответов
        String answer; //переменная для сканера
        //[№][вопрос][варианты ответа][№правильного ответа][флаг(правильно/неправильно)]
        String[][] tests = new String[3][7];
        //заполнение номеров вопросов
        for (int i = 0; i < tests.length; i++) {
            tests[i][0] = Integer.toString(i + 1);
        }
        //заполнение таблицы с вопросами и ответами
        tests[0][1] = "Чему равно значение выражения 7-5?";
        tests[0][2] = "3";
        tests[0][3] = "4";
        tests[0][4] = "2";
        tests[0][5] = "3";
        tests[1][1] = "Какова сумма всех углов в треугольнике?";
        tests[1][2] = "90°";
        tests[1][3] = "180°";
        tests[1][4] = "360°";
        tests[1][5] = "2";
        tests[2][1] = "Переведите дробь 1/8 в проценты и укажите верное значение.";
        tests[2][2] = "8%";
        tests[2][3] = "25%";
        tests[2][4] = "12,5%";
        tests[2][5] = "3";
        //Приветствие
        System.out.println("Доброго времени суток! Предлагаю пройти тест школьного уровня по математике.");
        System.out.println("Представьтесь, пожалуйста.");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Итак, " + name + ", вам предстоит ответить на 3 вопроса.");
        System.out.println("За правильный ответ на каждый вопрос вы получите 1 балл.");
        System.out.println();
        //Само тестирование
        for (int i = 0; i < tests.length; i++) { //Вывод вопроса
            System.out.println("Вопрос №" + tests[i][0] + ". " + tests[i][1]);
            System.out.println();
            for (int j = 0; j < 3; j++) { //Вывод варианта ответов
                System.out.println(Integer.toString(j + 1) + ") " + tests[i][j + 2]);
            }
            System.out.println();
            System.out.println("Введите номер ответа цифрой.");
            answer = sc.nextLine();
            if (answer.equals(tests[i][5])) { //Проверка ответа
                tests[i][6] = "Правильный ответ";
                score += 1;
            } else tests[i][6] = "Неправильный ответ";
            System.out.println();
        }
        //Итоги тестирования
        System.out.println("Подведем итоги:");
        for (int i = 0; i < tests.length; i++) {
            System.out.println("№" + tests[i][0] + ": " + tests[i][6]);
        }
        System.out.println();
        switch (score) {
            case 0 -> System.out.println("Вы набрали 0 баллов. Рекомендуем получше изучить математику.");
            case 1 -> System.out.println("Вы набрали 1 балл. Это лучше чем ничего.");
            case 2 -> System.out.println("Вы набрали 2 балла. Неплохой результат.");
            case 3 -> System.out.println("Вы набрали 3 балла. Отличный результат!");
        }
    }
}


