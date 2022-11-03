public class StringTest {
    public String test = "Hallo";

    public static void main(String[] args) {
        StringTest st = new StringTest();
        System.out.println(st);
    }

    @Override
    public String toString() {
        return test;
    }


}
