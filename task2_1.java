public class task2_1 {

    public static void main(String[] args) throws Exception {
    String text = "hello";
    int n = 5;
    StringBuilder repeat = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        for (int j = 0; j < n; j++) {
            repeat.append(text.charAt(i));
        }
    }
    System.out.println(repeat);
    }
}
