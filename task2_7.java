public class task2_7 {

    public static void main(String[] args) throws Exception {
        // Исходное значение
        String str = "59001";
        // Счетчик правильных совпадений символов
        int t = 0;
        // Счетчик неправильных совпадений символов
        int f = 0;
        // Перевод str в массив
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            // Проверка массива на совпадение цифр
            if (charArray[i] == '1' || charArray[i] == '2' || charArray[i] == '3' || charArray[i] == '4' || charArray[i] == '5' || charArray[i] == '6' || charArray[i] == '7' || charArray[i] == '8' || charArray[i] == '9' || charArray[i] == '0'){
                //System.out.println("True");
                t++;
            }
            else {
                //System.out.println("False");
                f++;
            }
        }
        
        if (f > 0){
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
