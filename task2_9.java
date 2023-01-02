public class task2_9 {

    public static boolean isSuffix(String word, String suffix) {
        // Записываем в переменную suff из переменной suffix начиная с 1 элемента, так так 0 это "-"
        String suff = suffix.substring(1);
        for (int i = 0; i < suff.length(); i++) {
            // Начинаем посимвольную проверку с конца слова 
            if (!(word.charAt(word.length() - 1 - i) == suff.charAt(suff.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrefix(String word, String prefix) {

        // Перевод строки в символьный массив
        char[] wordArray = word.toCharArray();
        // Перевод строки в символьный массив
        char[] prefArray = prefix.toCharArray();
        int j = 0;
        // Цикл для проверки совпадения 
        for (int i = 0; i < prefix.length()-1; i++) {
            if (prefArray[i] == wordArray[i]) 
            {
                // Прибавляем единицу в переменную для будущего сравнения с длиной префикса
                j++;
            }
        }
        // Сравнение переменой с количеством совпадений с длиной префикса
        if (j == prefix.length()-1) {
            return true;
        }
        else {
        return false;
        }
    }
    public static void main(String[] args) throws Exception {
        // Исходное значение
        String word = "autohnophobiaa";
        String prefix = "auto-";
        String suffix = "-phobia";
        System.out.println(isPrefix(word,prefix));
        System.out.println(isSuffix(word,suffix));
    }
}
