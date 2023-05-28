import java.util.Scanner;

public class Lesson9HomeWork {
    static int score = 0;
    static final Question[] questions = new Question[3];

    public static void main(String[] args) {
        Scanner scanAnswer = new Scanner(System.in);
        createTest();
        introduction(scanAnswer);
        testing(scanAnswer, questions);
        testResults(questions);
    }

    static void createTest() {
        questions[0] = new Question(1, "Чему равно значение выражения 7-5?");
        questions[0].fillInAnswers(1, "3", false);
        questions[0].fillInAnswers(2, "4", false);
        questions[0].fillInAnswers(3, "2", true);
        questions[0].fillInAnswers(4, "1", false);
        questions[1] = new Question(2, "Какова сумма всех углов в треугольнике?");
        questions[1].fillInAnswers(1, "90°", false);
        questions[1].fillInAnswers(2, "180°", true);
        questions[1].fillInAnswers(3, "360°", false);
        questions[2] = new Question(3, "Переведите дробь 1/8 в проценты и укажите верное значение.");
        questions[2].fillInAnswers(1, "8%", false);
        questions[2].fillInAnswers(2, "25%", false);
        questions[2].fillInAnswers(3, "12,5%", true);
        questions[2].fillInAnswers(4, "1,25%", false);
        questions[2].fillInAnswers(5, "1,8%", false);
    }

    static void introduction(Scanner scanAnswer) {
        //Приветствие
        System.out.println("Доброго времени суток! Предлагаю пройти тест школьного уровня по математике.");
        System.out.println("Представьтесь, пожалуйста.");
        String name = scanAnswer.nextLine();
        System.out.println();
        System.out.println("Итак, " + name + ", вам предстоит ответить на 3 вопроса.");
        System.out.println("За правильный ответ на каждый вопрос вы получите 1 балл.");
        System.out.println();
    }

    static void testing(Scanner scanAnswer, Question[] questions) {
        for (int i = 0; i < questions.length; i++) {
            questions[i].printQuestion();
            questions[i].printAnswers();
            System.out.println("Введите номер правильного ответа...");
            String answer = scanAnswer.nextLine();
            if (questions[i].checkIsRightAnswer(answer)) {
                score++;
            }
        }
    }

    static void testResults(Question[] questions) {
        System.out.println("Подведем итоги:");
        for (int i = 0; i < questions.length; i++) {
            questions[i].printUsersAnswer();
        }
        switch (score) {
            case 0 -> System.out.println("Вы набрали 0 баллов. Рекомендуем получше изучить математику.");
            case 1 -> System.out.println("Вы набрали 1 балл. Это лучше чем ничего.");
            case 2 -> System.out.println("Вы набрали 2 балла. Неплохой результат.");
            case 3 -> System.out.println("Вы набрали 3 балла. Отличный результат!");
        }
    }
}

