public class p2 {
    public static void main(String[] args) {
        add(100,1);
        add(1, 10);

    }

    public static void add(int start, int end) {
        if (end < start){
            System.out.println("error, Invalid input");
            return;
        }
        int sum = 0;
        for (int counter = start; counter <= end; counter++) {
            sum += counter;
        }
        System.out.println(sum);

    }

}
