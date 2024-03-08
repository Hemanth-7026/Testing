package Act;
public class Main {

    public static void main(String[] args) {
        try {
            Main.exceptionTest("Will print to console");
            Main.exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionTest(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}