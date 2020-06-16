import java.util.Arrays;

class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] value;

    public AsciiCharSequence(byte[] bytes) {
        this.value = bytes;
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return (char) value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[Math.abs(end - start)];
        int j = 0;
        for (int i = start; i < end; i++) {
            result[j++] = value[i];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        return new String(this.value);
    }
}