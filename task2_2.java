public class task2_2 {

    static int differenceMaxMin(int array[]) 
    {
        // Нахождение минимального элемента массива
        int min = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i]< min) {
               min = array[i];
            } 
        }
        System.out.println("Минимальное значение массива: " + min);
        // Нахождение максимального элемента массива
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
               max = array[i];
            }        
        }
        System.out.println("Максимальное значение массива: " + max);
        return max - min;
    }
    public static void main(String[] args) throws Exception {
        // Размер массива
        int array[] = {1,2,7,5,2,-24,65,12,78,0,2,-10,4};
        // Вывод суммы массива
        System.out.println(differenceMaxMin(array));
    }
}
