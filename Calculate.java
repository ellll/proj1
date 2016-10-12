public class Calculate {
    public static void main (String[] arg) {
        System.out.println("Calculate...");
        float first = Integer.valueOf(arg[0]);
        float second = Integer.valueOf(arg[1]);
        float summ = first + second;
        float subt = first - second;
        float mult = first * second;
        float div = first/second;
        double inv = Math.pow(first , second);
        System.out.println("Сумма summ = " + summ);
        System.out.println("Разность subt = " + subt);
        System.out.println("Уножение mult = " + mult);
        System.out.println("Деление div = " + div);
        System.out.println("Возведение в степень inv = " + inv);
    }
}