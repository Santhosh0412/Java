import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int N = 1931;
        if (checkCircular(N))
        System.out.println(N+" is a circular prime number");
        else
        System.out.println(N+" is not a circular prime number");
    }
	static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
    static boolean checkCircular(int N)
	{
		int count = 0, temp = N;
		while (temp>0) {
			count++;
			temp /= 10;
		}
    	int num = N;
		while (isPrime(num)) {
		int rem = num % 10;
		int div = num / 10;
		num = (int)((Math.pow(10, count - 1)) * rem)+ div;
		if (num == N)
			return true;
		}
        return false;
	}
}     