public class InterestManager {
    int day;

    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        for (int i=1; i<366; i+= 10) {
            double balance = interestManager.calculateAmount(i, 1000000);
            System.out.println(i);
            System.out.println(balance);
        }

    }

    public double getInterestRate(int day) {
        double rate = 0.0;
        if (1 <= day && day <= 90) {
            rate = 0.005;
        } else if (91 <= day && day <= 180) {
            rate = 0.01;
        } else if (181 <= day && day <= 364) {
            rate = 0.02;
        } else if (day >= 365) {
            rate = 0.056;
        } else {
            rate = 0.0;
        }
        return rate;
    }

    public double calculateAmount(int day, long amount) {
        return amount + amount * getInterestRate(day);
    }
}