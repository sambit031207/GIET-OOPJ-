class Test {
    public static void main(String args[]) {

        int a[] = {10, 20, 30, 40, 50, 20};

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}