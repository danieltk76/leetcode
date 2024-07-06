

public class singleNumber 
{
    public static int singleNum(int[] nums)
    {
        int result = 0;
        for (int num : nums)
        {
            result ^= num;
        }   
        return result;
        
    }
}
