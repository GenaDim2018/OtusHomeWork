class Question {
    private final int questionNumber;
    private final String questionText;
    private final AnswerOptions[] questionAnswerOptions = new AnswerOptions[5];
    private String usersAnswer;

    Question(int num, String text) {
        questionNumber = num;
        questionText = text;
    }


    void printQuestion() {
        System.out.println("Вопрос №" + questionNumber);
        System.out.println(questionText);
    }

    void printAnswers() {
        for (int i = 0; i < questionAnswerOptions.length; i++) {
            if (questionAnswerOptions[i] != null) {
                questionAnswerOptions[i].printAnswer();
            }
        }
    }

    void fillInAnswers(int num, String text, boolean isRight) {
        questionAnswerOptions[num - 1] = new AnswerOptions(num, text, isRight);
    }

    boolean checkIsRightAnswer(String answer) {
        usersAnswer = answer;
        return questionAnswerOptions[Integer.parseInt(answer) - 1].sayIsRight();
    }

    void printUsersAnswer() {
        System.out.println(questionNumber + ") " + usersAnswer);
    }
}
