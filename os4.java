public class Main
{

    public static void main(String args[]) {

        long t = System.currentTimeMillis();
        long a = 0;
        int b = 3;
        int c = 3;
        int i1 = 100000000;

        for (int i = 1; i <= i1; i++)
        {
            a += (b * 2 + c - i);
        }

        System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - t) + "миллисекунд");
        System.out.println("Результат работы: " + a);
    }

}
