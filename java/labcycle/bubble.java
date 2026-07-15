class bubble
{
    public static void main(String[] args)
    {
        int i, j, temp;

        int[] arr = {3, 2, 1};

        for(i = 0; i < 3; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 2; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(i = 0; i < 3; i++)
            System.out.print(arr[i] + " ");
    }
}