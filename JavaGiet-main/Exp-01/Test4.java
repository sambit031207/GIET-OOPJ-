import java.util.Scanner;

class Test4 {
    int num, rem, sum;

    public void cal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("The sum of digits is " + sum);
    }

    public static void main(String args[]) {
        Test4 obj = new Test4();
        obj.cal();
    }
}