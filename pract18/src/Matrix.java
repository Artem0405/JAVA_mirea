public class Matrix<T> {
    private T[][] matrix;

    // Конструктор, принимающий матрицу
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    // Метод для сложения матриц
    public Matrix<T> add(Matrix<T> other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for matrix addition");
        }

        T[][] result = (T[][]) new Object[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] instanceof Number && other.matrix[i][j] instanceof Number) {
                    result[i][j] = (T) (Number) (((Number) matrix[i][j]).doubleValue() + ((Number) other.matrix[i][j]).doubleValue());
                } else {
                    throw new IllegalArgumentException("Matrix elements must be numeric for matrix addition");
                }
            }
        }

        return new Matrix<>(result);
    }

    // Метод для умножения матриц
    public Matrix<T> multiply(Matrix<T> other) {
        if (matrix[0].length != other.matrix.length) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for matrix multiplication");
        }

        T[][] result = (T[][]) new Object[matrix.length][other.matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < other.matrix[0].length; j++) {
                result[i][j] = multiplyRowAndColumn(matrix[i], getColumn(other.matrix, j));
            }
        }

        return new Matrix<>(result);
    }

    // Вспомогательный метод для умножения строки матрицы на столбец
    private T multiplyRowAndColumn(T[] row, T[] column) {
        if (row.length != column.length) {
            throw new IllegalArgumentException("Row and column dimensions must be the same for matrix multiplication");
        }

        T product = null;
        for (int i = 0; i < row.length; i++) {
            if (row[i] instanceof Number && column[i] instanceof Number) {
                double value = ((Number) row[i]).doubleValue() * ((Number) column[i]).doubleValue();
                if (product == null) {
                    product = (T) (Number) value;
                } else {
                    product = (T) (Number) (((Number) product).doubleValue() + value);
                }
            } else {
                throw new IllegalArgumentException("Matrix elements must be numeric for matrix multiplication");
            }
        }

        return product;
    }

    // Вспомогательный метод для получения столбца матрицы
    private T[] getColumn(T[][] matrix, int column) {
        T[] result = (T[]) new Object[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][column];
        }
        return result;
    }
}
