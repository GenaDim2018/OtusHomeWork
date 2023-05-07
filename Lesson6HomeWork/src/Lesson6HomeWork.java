import java.util.Scanner;

public class Lesson6HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0; //счётчик правильных ответов
        //String answer; //переменная для сканера
        //[вопрос][варианты ответа]
        String[][] tests = new String[3][];
        //[ответ][№правильного ответа][верно/неверно]
        String[][] checkResult = new String[3][3];
        //заполнение массива tests вопросами и ответами
        tests[0] = new String[5];
        tests[0][0] = "Чему равно значение выражения 7-5?";
        tests[0][1] = "3";
        tests[0][2] = "4";
        tests[0][3] = "2";
        tests[0][4] = "1";
        tests[1] = new String[4];
        tests[1][0] = "Какова сумма всех углов в треугольнике?";
        tests[1][1] = "90°";
        tests[1][2] = "180°";
        tests[1][3] = "360°";
        tests[2] = new String[6];
        tests[2][0] = "Переведите дробь 1/8 в проценты и укажите верное значение.";
        tests[2][1] = "8%";
        tests[2][2] = "25%";
        tests[2][3] = "12,5%";
        tests[2][4] = "1,25%";
        tests[2][5] = "1,8%";
        //заполнение массива checkResult верными ответами
        checkResult[0][1] = "3";
        checkResult[1][1] = "2";
        checkResult[2][1] = "3";
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
            System.out.println("Вопрос №" + (i + 1) + ". " + tests[i][0]);
            System.out.println();
            for (int j = 1; j < tests[i].length; j++) { //Вывод вариантов ответов
                    System.out.println(j + ") " + tests[i][j]);
            }
            System.out.println();
            System.out.println("Введите номер ответа цифрой.");
            checkResult[i][0] = sc.nextLine();
            if (checkResult[i][0].equals(checkResult[i][1])) { //Проверка ответа
                checkResult[i][2] = "Верно";
                score += 1;
            } else checkResult[i][2] = "Неверно";
            System.out.println();
        }
        //Итоги тестирования
        System.out.println("Подведем итоги:");
        for (int i = 0; i < checkResult.length; i++) {
            System.out.println("№" + (i + 1) + ": " + checkResult[i][0] + " " + checkResult[i][2]);
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


