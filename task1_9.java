public class task1_9{
    static int sumOfCubes(int array[]) 
    {
        // Сумма массива вв кубе
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + (array[i]*array[i]*array[i]);
        }
        return sum;

    }
    public static void main(String[] args) throws Exception {
        // Зааполнение массива
        int array[] = {2};
        // Вывод суммы элементов массива в кубе
        System.out.println(sumOfCubes(array));
    }
}
