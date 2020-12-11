/*
* Author : elizabethyang
*Date : 11-Dec-2020
*Description: 
*1. Une methode permettant de calculer et d’afficher la somme des éléments d’un tableau d’entiers.
*2. Une méthode permettant de compter et d’afficher le nombre de chiffres pairs 
*   contenus dans un tableau d’entiers.
*3. Une méthode qui reçoit en paramètre un tableau d’entiers et qui retourne le même tableau amputé 
*   du plus petit nombre de cet élément.
*/
public class LesTableauxEtMethodes
	{

		public static void main(String[] args)
			{
				int[] monTab= {12,3,14,7,13,9,80,4,1,8};
				System.out.println(isPari(monTab));
				

			}
		// calculer et d'afficher la somme des éléments
		static int SommeDesElements(int [] a)
			
			{
				int somme=0;
				for(int i=0;i<a.length;i++);
					{
						int i=0;
						somme+=a[i];
						System.out.println(i);
					}
					return somme+a.length;
			}
		// compter et d'afficher le nombre de chiffres pairs
		static int[] chiffresPairs(int [] nbr)
		{
				int nbr1=24;
				int isPair=0;
				if(isPair(nbr1))
					System.out.println("Pair");
				else
					
					System.out.println("impair");
				return nbr;
				
			}
			
			private static boolean isPair(int nbr1)
			{
				// TODO Auto-generated method stub
				return false;
			}
			static boolean isPari(int nbr)
			{
					if(nbr%2==0)
						return true;
					else
						return false;
			
			}
	

	}




