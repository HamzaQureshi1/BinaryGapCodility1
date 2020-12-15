
public class BinaryGapCodility {
    public static void main(String[]args)  {

        int input = 546562;
        String result = Integer.toBinaryString(input); // convert number into binary string eg "1001"

        int gapCount = 0;
        int longestGapCount = 0;

        for (int i =0; i <result.length(); i++)

        {
            if (result.substring(i,i+1).equals("1"))

            {
                if (gapCount > longestGapCount) {longestGapCount =gapCount;}
                gapCount=0;}

            else {
                gapCount ++;}
        }

        System.out.println(longestGapCount);

    }}
