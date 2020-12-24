import java.util.*;
public class Karekok_kuvvet {

	public static void main(String[] args) {
 
		System.out.println("1 ile 100 arasinda bir 'Cift Sayi' giriniz. Program sizin icin karesini ve karekokunu hesaplasin..");
		Scanner girdi=new Scanner (System.in);
		int sayi;
		
		do {
			 sayi=girdi.nextInt();
			    
		    if (sayi <1 || sayi >100 || sayi%2!=0) {
					
		    	while (sayi <1 || sayi >100 || sayi%2!=0) {
		    		
					System.out.println("Hatali sayi girdiniz.. Lutfen 1 ile 100 arasinda bir cift sayi giriniz");
					Scanner girdi2=new Scanner (System.in);
					sayi = girdi2.nextInt();
					  }
		            }			
	        System.out.println(sayi + " nin karesi: " +Math.pow(sayi, 2));
		    System.out.println(sayi + " nin karekoku: " +Math.sqrt(sayi));
			} 
		
		while (sayi>= 1 && sayi <= 100 && sayi%2==0);
			
    }
  }
