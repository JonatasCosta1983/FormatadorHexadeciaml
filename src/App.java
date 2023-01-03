public class App {
    public static void main(String[] args) throws Exception {
        String dadoBruto = " 64 4b 44 41 53 4b 44 53";
        String hexadecimal = dadoBruto.replace(" ", "\\x");

        System.out.printf("Hexadeciaml %s %n", hexadecimal);
    }
}
