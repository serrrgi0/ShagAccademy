package lesson4;

/**
 * Created by Serrrgi0 on 18.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Super.Sub sub = new Super.Sub();
        System.out.println(sub.x);
        Inner.Sub ss = new Inner().new Sub();
        System.out.println(ss.x);
        Counter someCounter = new Counter(){

            @Override
            public int count(int a, int b) {
                return a * b -( b % a);
            }
        };
        int c =someCounter.count(8,7);
        System.out.println(c);
    }
interface  Counter {
    int count(int a, int b);
}
}

