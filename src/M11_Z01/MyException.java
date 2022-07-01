package M11_Z01;

public class MyException extends Exception{
    double number1, number2;

    public MyException(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return String.format("Результат деления числа1=%.2f на числа2=%.2f менее 1", number1, number2);
    }
}
