public class Question6 
{
    public static void main(String[] args) {
        int x = 2; 
        int y = 3;
        int z = 4; 

        // Create a 3D array
        int[][][] threeDArray = new int[x][y][z];

        // Populate the 3D array with some values
        int value = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    threeDArray[i][j][k] = value++;
                }
            }
        }

        // Print the 3D array
        System.out.println("3D Array:\n");
        for (int i = 0; i < x; i++) {
          
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

