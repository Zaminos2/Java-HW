public class Main {
    public static void main(String[] args) {
        char a = '0';
        char b = '0';
        char c = '0';

        int i = Character.getNumericValue(a);
        System.out.println(i);

        int o = b - '0';
        System.out.println(o);

        int p = Character.digit(c,10);
        System.out.println(p);
    }
}