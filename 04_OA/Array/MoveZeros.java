public class MoveZeros {
public static void main(String args[])
{

    public int[] moveZeroes(int[] arr) {
 
        int left  = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[left] = arr[i];
                left++;
            }
        }
        for(int i = left; i < arr.length; i++)
        {
           arr[i] = 0;
        }
        return arr;
  }
}
}