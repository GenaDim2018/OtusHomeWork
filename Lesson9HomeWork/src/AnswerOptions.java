class AnswerOptions {

    private int answerNumber;
    private String answerText;
    boolean isRight;
    //private boolean isRightAnswer;

    AnswerOptions(int num, String text, boolean isRightAnswer) {
        answerNumber = num;
        answerText = text;
        isRight = isRightAnswer;
    }

    void printAnswer() {
        System.out.println(answerNumber + ". " + answerText);
    }

    boolean sayIsRight() {
        return isRight;
    }
}
