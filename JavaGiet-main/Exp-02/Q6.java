class Reverse {
    public static void main(String args[]) {

        int a[][] = new int[2][2];

        a[0][0] = Integer.parseInt(args[0]);
        a[0][1] = Integer.parseInt(args[1]);
        a[1][0] = Integer.parseInt(args[2]);
        a[1][1] = Integer.parseInt(args[3]);

        System.out.println("Reverse array:");

        for (int i = 1; i >= 0; i--) {

            for (int j = 1; j >= 0; j--) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}