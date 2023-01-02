public class task2_4 {

    public static void main(String[] args) throws Exception {
        // Зааполнение массива
        int array[] = {3,3,-2,408,3,3};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            // Нахождение суммы предыдущих элементов и текущего
            sum = sum + array[i];
            // Перезапись элемента массива на сумму предыдущих
            array[i] = sum;
            // Вывод 
            System.out.println(array[i]);
        }
    }
}
