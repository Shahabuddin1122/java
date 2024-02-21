public class NumberConvertion {
    public static void main(String[] args) {
//        String binary = "0101110";
//        int Decimal = Integer.parseInt(binary,2);
//        System.out.println(Decimal);
//        String octal = "3457";
//        int Decimal = Integer.parseInt(octal,8);
//        System.out.println(Decimal);
        int decimal = 35;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }
}
