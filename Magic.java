public class Magic {
	public static void main(String[] args) {
    
    int myNumber = 10;

    // will refer to myNumber as the original number from now on

    int stepOne = myNumber*myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

		System.out.println(stepSix);

    // try changing the original number - no matter what the original number is, it always prints out 3 in the terminal! 

	}
}
