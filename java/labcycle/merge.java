import java.util.Scanner;

class merge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n, i;

        System.out.print("Enter the size of first array: ");
        n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first array:");
        for(i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter the size of second array: ");
        n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second array:");
        for(i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        n = n1 + n2;

        int[] merge_arr = new int[n];

        for(i = 0; i < n1; i++)
            merge_arr[i] = arr1[i];

        for(i = 0; i < n2; i++)
            merge_arr[n1 + i] = arr2[i];

        System.out.println("Merged array:");

        for(i = 0; i < n; i++)
            System.out.print(merge_arr[i] + " ");
    }
}