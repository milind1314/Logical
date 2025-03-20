public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 14;
        int b = 8;
        System.out.println(" before swap -> a = "+a+" :: b = "+b);
        b = b+a;
        a = b-a;
        b = b-a;

        System.out.println("after swap -> a = "+a+" :: b = "+b);

    }
}
