public class Main {
    public static void main(String args[]) {
        int a=0;
        int b=3;
        int c=3;
        int i1=100000000;
        long m = System.currentTimeMillis();
        for (int i = 0; i < i1; i++){
            a = a+(b*2 + c - i);
        }


        System.out.println("Результат работы: " + a);
        System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - m));
    }
}
