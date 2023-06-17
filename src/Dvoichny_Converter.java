public class Dvoichny_Converter {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    private static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if(decimalNumber > 0){
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber /= 2;
            }
            return binaryNumber;
        } else {
            return binaryNumber;
        }
    }
    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
    }
}
