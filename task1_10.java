public class task1_10{
    static boolean abcmatch(int a, int b, int c) 
    {
        // Сумма массива вв кубе
        int sum = a;
        for (int i = 0; i < b; i++)
        {
            sum = sum + a;
            a = sum;
        }
        int itog = (sum%c);
        if (itog == 0){
            return true;
        }else {
            return false;
        }


    }
    public static void main(String[] args) throws Exception {
        // Значение a
        int a = 5;
        // Значение b
        int b = 2;
        // Значение c
        int c = 1;
        // Вывод суммы элементов массива в кубе
        System.out.println(abcmatch(a,b,c));
    }
}
