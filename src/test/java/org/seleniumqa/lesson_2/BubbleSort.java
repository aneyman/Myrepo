package Lesson_1;

public class BubbleSort {

    //метод сортировки пузырьком
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }
    }
    /*
        public static void fibonacci(int m) {
            int[] myFibArray;
            int k = 0;
            myFibArray = new int[m];
            myFibArray[0] = 1;
            myFibArray[1] = 1;
            for (k = 2; k < m; k++) ;
            {
                myFibArray[k] = myFibArray[k - 1] + myFibArray[k - 2];
            }
            for (k = 0; k < m-1; k++)
            {
                System.out.print(" " + myFibArray[k]);
            }
        }
        */
//заполнение массива случайными символами
    public static void arrInit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);

        }
    }

    //вывод массива
    public static void arrOutput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }


    public static void main(String[] args) {
        int n = 10;
        int[] myArray;
        myArray = new int[n];
        System.out.println("Исходный массив");
        //заполнение и вывод массива
        arrInit(myArray);
        arrOutput(myArray);

        bubbleSort(myArray);

        //вывод массива
        System.out.println("");
        System.out.println("Отсортированный массив");
        arrOutput(myArray);

        //fibonacci(n);
    }

}