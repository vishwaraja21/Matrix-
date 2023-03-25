public class Arraynum {
    public static void main(String[] args)
    {
        int[] Array1 = {1, 2, 3, 4, 5};
        int[] Array2 = new int[Array1.length];

        for(int i = 0; i < Array1.length; i++)
        {
            Array2[i] = Array1[i];
        }

        System.out.println("Elements of Array2:");
        for (int i = 0; i < Array2.length; i++)
        {
            System.out.print(Array2[i] + " ");
        }
    }
}