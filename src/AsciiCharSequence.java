import java.util.Arrays;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
 */
public class AsciiCharSequence implements CharSequence {
    private byte[] charSequence;

    private AsciiCharSequence(byte[] byteSequence) {
        this.charSequence = byteSequence;
    }

    @Override
    public int length() {
        return this.charSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) charSequence[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(charSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(charSequence);
    }
}
