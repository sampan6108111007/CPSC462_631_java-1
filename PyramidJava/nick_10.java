public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=5; suriya >= nick; suriya--)
                {
                    System.out.print(" ");
                }
                 for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(suriya);
                }
                System.out.print(6-nick);
                for (suriya=nick; suriya >= 1; suriya--)
                {
                    System.out.print(suriya);
                }
            
            System.out.println();
            }
	}
}
