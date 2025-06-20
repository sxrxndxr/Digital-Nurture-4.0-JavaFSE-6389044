public class Forecasting {
    public static double predict(double current, double growthRate, int months) {
        if (months == 0)
            return current;
        return predict(current * (1 + growthRate), growthRate, months - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000;
        double growthRate = 0.05;
        int months = 6;
        double futureValue = predict(currentValue, growthRate, months);
        System.out.println("Predicted value after " + months + " months: Rs." + futureValue);
    }
}