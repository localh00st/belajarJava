import java.util.*;

public class hurufX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		int n;
		System.out.print("masukan nilai : ");
		n = input.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if ( i == j || j == n-i+1){
					System.out.print("x");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
    }
    
}
