import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            one.add(i);
        }
        for (int j = 0; j < one.size(); j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        int t = 0;
        while (t < 10) {
            t = one.get(t);
            t++;
            System.out.print(t + " ");
        }
        System.out.println();
        for (int u: one ) {
            System.out.print(u + " ");

        }
    }
}