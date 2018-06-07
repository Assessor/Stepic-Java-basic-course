/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 */
public class СharExpression {
    public static void main(String[] args) {
        char c = charExpression(29);
        System.out.println(c);
        System.out.println();
    }

    private static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
