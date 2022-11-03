public class CallByReference {
    static void methode(String sInnen, String tInnen) {
        sInnen = "World";
        tInnen.toUpperCase();
        System.out.println(sInnen);
        System.out.println(tInnen);
    }

    public static void main(String[] args) {
        String sAussen = "Hello";
        String tAussen = "klein";
        methode(sAussen, tAussen);
        System.out.println(sAussen);
        System.out.println(tAussen);
    }
}

