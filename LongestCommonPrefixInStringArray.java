import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefixInStringArray
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of String Elements");
		int x=scan.nextInt();
		String[] strArray=new String[x];
		
		System.out.println("Enter the "+x+" number of String Elements into Array");
		for(int i=0;i<strArray.length;i++)
		{
//			converting to lower case
			strArray[i]=scan.next().toLowerCase();
		}
		
		System.out.println("Common Prefix :"+checkLongestCommonStringInArray(strArray));

	}


	static String checkLongestCommonStringInArray(String[] strArray) 
	{
        /* if size is 0, return empty string */
        if (strArray.length == 0) 
            return ""; 
  
        if (strArray.length == 1)
            return strArray[0]; 
  
        /* sort the array of strings */
        Arrays.sort(strArray); 
  
        /* find the minimum length from first and last string */
        int end = Math.min(strArray[0].length(), strArray[strArray.length-1].length());
        System.out.println("End"+end);
        
        /* find the common prefix between the first and last string */
        int i = 0; 
        while (i < strArray.length && strArray[0].charAt(i) == strArray[strArray.length-1].charAt(i)) 
        {
    		i++; 
        }
        return strArray[0].substring(0, i); 
    } 
}
