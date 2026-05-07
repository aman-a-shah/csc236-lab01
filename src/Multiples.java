public class Multiples {
    static void main() {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%3 == 0) {
                counter += 1;
            } else if (i%5 == 0) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
