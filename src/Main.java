//  ДЗ 6.1 к уроку 6 «Массивы» части 1-й
public class Main {
    public static void main(String[] args) {
        System.out.println();
//  ДЗ 6.1.1,2,3,4
        {
            int[] integerNumbers = new int[3]; // ДЗ 1
            for (int i = 0; i < 3; i++) integerNumbers[i] = i+1;
            float[] floatNumbers = {1.57f, 7.654f, 9.986f};
            String[] wordArray = {"Мой", "первый", "строковый", "Java-массив"};
            showArray(integerNumbers); // ДЗ 2
            showArray(floatNumbers);
            showArray(wordArray);
            System.out.println();
            showReverseArray(integerNumbers); // ДЗ 3
            showReverseArray(floatNumbers);
            showReverseArray(wordArray);
            System.out.println();
            for (int i = 0; i < integerNumbers.length; i++) // ДЗ 4
                if (integerNumbers[i] % 2 != 0) integerNumbers[i] = integerNumbers[i] + 1;
            System.out.print("Целочисленный массив, значения элементов которого приведены к чётности " +
                    "путём увеличения на \"1\": ");
            showArray(integerNumbers);
        }

        System.out.println();
    }

// ДЗ6.1.2,3
    static void showArray(int[] someArray) {
        for (int i = 0; i < someArray.length - 1; i++) System.out.printf("%d, ", someArray[i]);
        System.out.printf("%d.\n", someArray[someArray.length - 1]);
    }
    static void showArray(float[] someArray) {
        for (int i = 0; i < someArray.length - 1; i++) System.out.printf("%.3f, ", someArray[i]);
        System.out.printf("%.3f.\n", someArray[someArray.length - 1]);
    }
    static void showArray(String[] someArray) {
        for (int i = 0; i < someArray.length - 1; i++) System.out.printf("%s ", someArray[i]);
        System.out.printf("%s.\n", someArray[someArray.length - 1]);
    }
    static void showReverseArray(int[] someArray) {
        for (int i = someArray.length - 1; i > 0; i--) System.out.printf("%d, ", someArray[i]);
        System.out.printf("%d.\n", someArray[0]);
    }
    static void showReverseArray(float[] someArray) {
        for (int i = someArray.length - 1; i > 0; i--) System.out.printf("%.3f, ", someArray[i]);
        System.out.printf("%.3f.\n", someArray[0]);
    }
    static void showReverseArray(String[] someArray) {
        for (int i = someArray.length - 1; i > 0; i--) System.out.printf("%s ", someArray[i]);
        System.out.printf("%s.\n", someArray[0]);
    }

}