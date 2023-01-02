public class task2_8 {

    public static void main(String[] args) throws Exception {
        // Исходное значение
        String str1 = "ratio";
        String str2 = "operator";

        // Перевод str в массив
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        // Записываем в переменную первый и последний символ первой строки 
        char a_str1 = charArray1[0];
        char b_str1 = charArray1[charArray1.length-1];
        // Записываем в переменную первый и последний символ пвторой строки
        char a_str2 = charArray2[0];
        char b_str2 = charArray2[charArray2.length-1];
        // Выполняем проверка на совпадению согласно условию 
        if (( a_str1 == b_str2) && ( b_str1 == a_str2)) {
            System.out.println("True");  
        }
        else {
            System.out.println("False");
        }
        //System.out.println(a_str1);
        //System.out.println(b_str1);
        //System.out.println(a_str2);
        //System.out.println(b_str2);
    }
}
