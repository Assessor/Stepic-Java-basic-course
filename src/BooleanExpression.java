public class BooleanExpression {
    public static void main(String[] args) {
        boolean b = booleanExpression(false, false, true, true);
        System.out.println(b);
    }

    private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
    }
}
