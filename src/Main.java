//  ДЗ 6.1 к уроку 6 «Массивы» части 1-й
public class Main {
    public static void main(String[] args) {
        System.out.println();
//  ДЗ 6.1.1,2,3
        {
            int[] integerNumbers = new int[3];
            for (int i = 0; i < 3; i++) integerNumbers[i] = i+1;
            float[] floatNumbers = {1.57f, 7.654f, 9.986f};
            String[] wordArray = {"Мой", "первый", "строковый", "Java-массив"};
            showArray(integerNumbers);
            showArray(floatNumbers);
            showArray(wordArray);
            System.out.println();
            showReverseArray(integerNumbers);
            showReverseArray(floatNumbers);
            showReverseArray(wordArray);
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