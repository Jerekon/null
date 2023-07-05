public class Main {
    static void pandemic(int[][] field, int[][] agents) {
        for (int[] agent : agents) {
            int i = agent[0];
            int j = agent[1];
            if (field[i][j] == 0) {
                field[i][j] = 1;
            } else {
                field[i][j] = field[i][j] * 2;
            }
        }

    }

    static void print(int[][] field) {
        for (int[] row : field ) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        pandemic(field, agents);
        print(field);

    }


}
