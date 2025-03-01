public class MathMagic {
    public static void main (String[] args) {
        int myNumber = 1; // Número original //
        int step0ne = myNumber * myNumber;
        int stepTwo = step0ne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    }
}