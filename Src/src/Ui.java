public class Ui {
    public String showWelcomeMessage() {
        String welcomeMsg = "Input a number from 1 ~ 5\n" +
                "type 'end' to end program\n";
        return welcomeMsg;
    }
    public String caseOne() {
        String msg = "From 1 to [Number A], count all the palindromic primes";
        return msg;
    }

    public String caseTwo() {
        String msg = "From 1 to 100,000, given [Numbers A & B], find all the numbers between those" +
                " two which are palindromic prime after removing one digit.";
        return msg;
    }
    public String caseThree() {
        String msg = "Count the frequency of each word in any given [Text String], print out the top 10 words with their individual frequency, " +
                "and print out the sentence where the top 10 words appeared for the first and last time.";
        return msg;
    }
    public String caseFour() {
        String msg = "Performing a GET request on \"https://dev.beepbeep.tech/v1/sample_customer\"";
        return msg;
    }
    public String inputPrompt() {
        String msg = "input: ";
        return msg;
    }
}