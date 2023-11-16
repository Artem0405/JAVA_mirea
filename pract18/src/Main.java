public class Main {
    public static void main(String[] args) {
        // Пример использования класса MyClass
        Integer intValue = 10;
        String strValue = "Hello";
        Double doubleValue = 3.14;
        MyClass<Integer, String, Double> obj = new MyClass<>(intValue, strValue, doubleValue);

        System.out.println("Значение value1: " + obj.getValue1());
        System.out.println("Значение value2: " + obj.getValue2());
        System.out.println("Значение value3: " + obj.getValue3());
        obj.printClassNames();

        // Пример использования класса MinMax
        Integer[] intArray = {1, 2, 3, 4, 5};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Минимальный элемент массива: " + minMax.getMin());
        System.out.println("Максимальный элемент массива: " + minMax.getMax());

        // Пример использования класса Calculator
        System.out.println("Результат сложения: " + Calculator.sum(5, 10));
        System.out.println("Результат умножения: " + Calculator.multiply(5.5, 2.0));
        System.out.println("Результат деления: " + Calculator.divide(10, 2));
        System.out.println("Результат вычитания: " + Calculator.subtract(7, 3));

        // Пример использования класса Matrix
        Integer[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix<Integer> matrixObj1 = new Matrix<>(matrix1);
        Matrix<Integer> matrixObj2 = new Matrix<>(matrix2);

        Matrix<Integer> sumMatrix = matrixObj1.add(matrixObj2);
        System.out.println("Результат сложения матриц:");
        printMatrix(sumMatrix);

        Matrix<Integer> productMatrix = matrixObj1.multiply(matrixObj2);
        System.out.println("Результат умножения матриц:");
        printMatrix(productMatrix);
    }

    // Вспомогательный метод для вывода содержимого матрицы
    private static <T> void printMatrix(Matrix<T> matrix) {
        T[][] matrixData = matrix.getMatrix();
        for (T[] row : matrixData) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

