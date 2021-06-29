package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutPrimitives {

    @Koan
    public void wholeNumbersAreOfTypeInt() {
        int var = 1;
        assertEquals(getType(1), int.class); // hint: int.class
    }

    @Koan
    public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
        Object number = 1;
        assertEquals(getType(number), getType(number)); //TODO Don't think this is the best solution

        // Primitives can be automatically changed into their object type via a process called auto-boxing
        // We will explore this in more detail in intermediate.AboutAutoboxing
    }

    @Koan
    public void integersHaveAFairlyLargeRange() {
        assertEquals(Integer.MIN_VALUE, -2147483648);
        assertEquals(Integer.MAX_VALUE, 2147483647);
    }

    @Koan
    public void integerSize() {
        assertEquals(Integer.SIZE, 32);  // This is the amount of bits used to store an int
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeLong() {
        long var = 0;
        assertEquals(getType(1L), getType(var));
    }

    @Koan
    public void primitivesOfTypeLongHaveAnObjectTypeLong() {
        Object number = 1L;
        Object numberTwo = 1L;
        numberTwo = number;
        assertEquals(getType(number), getType(numberTwo));
    }

    @Koan
    public void longsHaveALargerRangeThanInts() {
        //long number = -922337203685477580;
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        assertEquals(Long.MIN_VALUE, min);
        assertEquals(Long.MAX_VALUE, max);
    }

    @Koan
    public void longSize() {
        assertEquals(Long.SIZE, 64);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeShort() {
        short num = 1;
        assertEquals(getType((short) 1), getType(num)); // The '(short)' is called an explicit cast - to type 'short'
    }

    @Koan
    public void primitivesOfTypeShortHaveAnObjectTypeShort() {
        Object number = (short) 1;
        Object num2;
        num2 = number;
        assertEquals(getType(number), getType(num2));
    }

    @Koan
    public void shortsHaveASmallerRangeThanInts() {
        short min = Short.MIN_VALUE;
        short max = Short.MAX_VALUE;
        assertEquals(Short.MIN_VALUE, min);  // hint: You'll need an explicit cast
        assertEquals(Short.MAX_VALUE, max);
    }

    @Koan
    public void shortSize() {
        assertEquals(Short.SIZE, 16);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeByte() {
        assertEquals(getType((byte) 1), getType((byte) 10));
    }

    @Koan
    public void primitivesOfTypeByteHaveAnObjectTypeByte() {
        Object number = (byte) 1;
        Object num2;
        num2 = number;
        assertEquals(getType(number), getType(num2));
    }

    @Koan
    public void bytesHaveASmallerRangeThanShorts() {
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        assertEquals(Byte.MIN_VALUE, min);
        assertEquals(Byte.MAX_VALUE, max);

        // Why would you use short or byte considering that you need to do explicit casts?
    }

    @Koan
    public void byteSize() {
        assertEquals(Byte.SIZE, 8);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeChar() {
        char num = 10;
        assertEquals(getType((char) 1), getType(num));
    }

    @Koan
    public void singleCharactersAreOfTypeChar() {
        char character = 'b';
        assertEquals(getType('a'), getType(character));
    }

    @Koan
    public void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
        Object number = (char) 1;
        Object num2;
        num2 = number;
        assertEquals(getType(number), getType(num2));
    }

    @Koan
    public void charsCanOnlyBePositive() {
        int min = Character.MIN_VALUE;
        int max = Character.MAX_VALUE;
        assertEquals((int) Character.MIN_VALUE, min);
        assertEquals((int) Character.MAX_VALUE, max);

        // Why did we cast MIN_VALUE and MAX_VALUE to int? Try it without the cast.
    }

    @Koan
    public void charSize() {
        assertEquals(Character.SIZE, 16);
    }

    @Koan
    public void decimalNumbersAreOfTypeDouble() {
        double num = 1.5;
        assertEquals(getType(1.0), getType(num));
    }

    @Koan
    public void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
        double num = 1.5;
        assertEquals(getType(1d), getType(num));
    }

    @Koan
    public void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
        double num = 1.5;
        assertEquals(getType(1e3), getType(num));
        assertEquals(1.0e3, 1000.0);
        assertEquals(1E3, 1000.0);
    }

    @Koan
    public void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
        Object number = 1.0;
        Double num = 1.0;
        assertEquals(getType(number), getType(num));
    }

    @Koan
    public void doublesHaveALargeRange() {
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        assertEquals(Double.MIN_VALUE, min);
        assertEquals(Double.MAX_VALUE, max);
    }

    @Koan
    public void doubleSize() {
        assertEquals(Double.SIZE, 64);
    }

    @Koan
    public void decimalNumbersCanAlsoBeOfTypeFloat() {
        float num = 3.5f;
        assertEquals(getType(1f), getType(num));
    }

    @Koan
    public void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
        float num = 3.5f;
        assertEquals(getType(1e3f), getType(num));
        float num2 = 1.0e3f;
        assertEquals(1.0e3f, num2);
        float num3 = 1E3f;
        assertEquals(1E3f, num3);
    }

    @Koan
    public void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
        Object number = 1f;
        Object num2;
        num2 = number;
        assertEquals(getType(number), getType(num2));
    }

    @Koan
    public void floatsHaveASmallerRangeThanDoubles() {
        float min = Float.MIN_VALUE;
        float max = Float.MAX_VALUE;
        assertEquals(Float.MIN_VALUE, min);
        assertEquals(Float.MAX_VALUE, max);
    }

    @Koan
    public void floatSize() {
        assertEquals(Float.SIZE, 32);
    }

    private Class<?> getType(int value) {
        return int.class;
    }

    private Class<?> getType(long value) {
        return long.class;
    }

    private Class<?> getType(float value) {
        return float.class;
    }

    private Class<?> getType(double value) {
        return double.class;
    }

    private Class<?> getType(byte value) {
        return byte.class;
    }

    private Class<?> getType(char value) {
        return char.class;
    }

    private Class<?> getType(short value) {
        return short.class;
    }

    private Class<?> getType(Object value) {
        return value.getClass();
    }

}
