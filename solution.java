package plus_one;

public class solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
        	if(digits[i]==9)
        		digits[i]=0;
        	else
        	{
        		digits[i]++;
        	    System.out.println(digits);
        		return digits;
        	}
        }
        
        int[] array=new int[n+1];
        array[0]=1;
	    System.out.println(array);
        return array;
    }
}
