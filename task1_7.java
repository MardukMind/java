public class task1_7 {
    static int addupto(int array[]) 
    {
        // Заполнение массива поочередно
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
        }
        // Сумма массива
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;

    }
    public static void main(String[] args) throws Exception {
        // Размер массива
        int array[] = new int[3];
        // Вывод суммы массива
        System.out.println(addupto(array));
    }
}
