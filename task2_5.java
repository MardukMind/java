public class task2_5 {
 
    public static void main(String[] args) throws Exception {
        // Ввод числа
        String a = "123.4500000000";
        // Находим позицию . в заданой строке
        int position = a.indexOf(".");
        // Находим длину строки и вычитаем позицию нахождения . в строке (+1 потому что длина строки начинается с 1, а позиция с 0)
        int itog = a.length() - (position + 1);
        System.out.println(itog);
    }
}
