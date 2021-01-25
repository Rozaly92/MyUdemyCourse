package algorithms;

public class Algorithms {
    public static void main(String[] args) {
      /*  System.out.println("the min element");
        int[] array = {23,45,12,6,78,456,24,14,76,99,243,67,213};
        int min = array[0];
        int minindex=0, maxindex=0;
        int max = array[0];
        for(int i = 0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minindex = i;
            }
            else  if (array[i] > max)
            { max = array[i];
            maxindex = i;
            }
        }
            System.out.println("The minimal element of this array is: " + min + "  index: "+minindex);
        System.out.println("The maxim element of this array is: " + max + "  index: "+maxindex );*/

        //buble sort
        int [] arr = new int[] {64,65,76,90,73,14,78,43,768,3,2,45,23,454,87,98,45,23};
        printArray(arr);
         }
    private static void printArray(int [] arr)
    {
        for(int i =0; i < arr.length; i++)
        {
                System.out.print(arr[i] + " ");
        }

    }
}
