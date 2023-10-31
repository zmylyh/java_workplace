public class p1 {
    public static void main(String[] args) {
        add(1, 10);
        add(20, 30);
        add(35, 45);

    }

    public static int add(int start, int end) {
        int sum = 0;
        for (int counter = start; counter <= end; counter++) {
            sum += counter;
        }
        System.out.println(sum);
        return sum;

    }
}
