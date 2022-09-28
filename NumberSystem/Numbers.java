package NumberSystem;

public class Numbers {
	public static long factorial(int num)
	{
		if(num==0||num==1) return 1;
		return num*(factorial(num-1));
	}
	public static int length(int num)
	{
		int count=0;
		for(;num!=0;num/=10)count++;
		return count;
	}
	public static int power(int base,int exp)
	{
		if (exp==0) return 1;
		return base*power(base,exp-1);
	}
	public static int sumOfDigit(int num)
	{
		if (num==0) return 0;
		int rem= num%10;
		return rem+sumOfDigit(num/10);
	}
	public static int reverse(int num)
	{
		int rev =0;
		while(num>0) {
		int rem = num%10;
		rev= rev*10+rem;
		num/=10;
		}
	    return rev;
	}
    public static int Armstrong(int num)
    {
    	int result =0;
    	int len = Numbers.length(num);
    	while(num!=0)
    	{
    		int rem = num%10;
    		result= result+Numbers.power(rem, len);
    		num/=10;
    	}
    	return result;
    }
    public static long strong(int num)
    {
    	long result =0;
    	while(num!=0)
    	{
    		int rem=num%10;
    		result = result+ Numbers.factorial(rem);
    		num/=10;
    	}
    	return result;
    }
    public static boolean AutoMorphic(int num)
    {
    	if (num<0)return false;
    	int len = Numbers.length(num);
    	int sqrNo = Numbers.power(num, 2);
    	int temp= sqrNo%Numbers.power(10, len);
    	if(temp==num) return true;
    	else return false;
    }
    public static boolean Nevin(int num)
    {
    	if (num<0) return false;
    	int sum =Numbers.sumOfDigit(num);
    	if(num%sum==0) return true;
    	else return false;
    }
    public static boolean MagicNo(int num)
    {
    	if (num<0) return false;
    	int sum=Numbers.sumOfDigit(num);
    	int rev = Numbers.reverse(sum);
    	if (rev*sum==num) return true;
    	else return false;
    }

}

