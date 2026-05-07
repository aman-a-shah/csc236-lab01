public class Reduce {
    static void main() {
        int steps = 0;
        int i = 1000;

        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i -= 1;
            }
            steps += 1;
        }

        System.out.println(steps);
    }
}
