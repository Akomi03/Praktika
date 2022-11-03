public class StringTest {
    String test;

    @Override
    public String toString() {
        return test;
    }

    public static void main(String[] args) {
        StringTest st = new StringTest();
        System.out.println(st);
    }

}
