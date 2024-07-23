class MatrixPattern {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int value;
                if (j % 2 == 0) {
                    value = count * count;
                } else {
                    value = count;
                }
                System.out.print(value + " ");
                count++;
            }
            System.out.println();
        }
    }
}

