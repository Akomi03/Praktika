public class Main {
    public static void main(String[] args) {
        int[] test= new int[]{15,64,1,1586,846,-54,486,-42,85,48};
        min(test);
    }
    public static void min(int[] intfeld){
        int min = intfeld[0];
        for (int i = 0; i < intfeld.length; i++) {
            if (intfeld[i] < min){
                min = intfeld[i];
            }
        }
        System.out.println(min);
    }
}