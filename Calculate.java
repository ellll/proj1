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
        System.out.println("����� summ = " + summ);
        System.out.println("�������� subt = " + subt);
        System.out.println("�������� mult = " + mult);
        System.out.println("������� div = " + div);
        System.out.println("���������� � ������� inv = " + inv);
    }
}