
package Jobsheet7dany;

import java.util.Scanner;


public class SaranBahan2Resep {
    public static void main(String[] args) {
    String identitas = "Dany Achmad Virgian / XRPL 5 / 10";
    System.out.println("Identitas : "+ identitas);
    System.out.print("\nSaran Resep dari Bahan Milik Anda\n");  
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bahan Pertama : ");
    System.out.println("1. Pisang ");
    System.out.println("2. Telur ");
    System.out.print("Masukkan no pilihan Anda : ");
    int bahan1 = scanner.nextInt();
    if(bahan1 == 1 || bahan1 == 2)
    {
    System.out.println("Bahan Kedua :");
    if(bahan1 == 1) {
        System.out.println("1. Susu");
        System.out.println("2. Minyak Goreng ");
        System.out.println("3. Tidak Ada");
    }else{
        System.out.println("1. Minyak Goreng");
        System.out.println("2. Roti");
        System.out.println("3. Tidak Ada");
    }
    System.out.print("masukkan no pilihan Anda :");
    int bahan2 = scanner.nextInt();
    
    }else {
        System.out.println("Mohon maaf, pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
    }
        int bahan2 = scanner.nextInt();
    if(bahan2 >= 1 && bahan2 <= 3) {
        if(bahan1==1) {
            switch(bahan2)
            {
                case 1 : System.out.println(
                        "Anda dapat membuat milk shake banana"); break;
                case 2 : System.out.println(
                        "And dapat membuat sandwich telur"); break;
                case 3 : System.out.println(
                        "Anda dapat membuat pisang rebus");
            }
        } else {
            switch(bahan2) 
            {
                
                
                case 1 : System.out.println(
                        "Anda dapat membuat telur mata sapi");break;
                case 2 : System.out.println(
                        "Anda dapat membuat sandwich telur");break;
                case 3 : System.out.println(
                        "Anda dapat membuat telur rebus");
            }
        }
    } else {
        System.out.println("Mohon Maaf, pilihan tidak ditemukan," +"tidak dapat memberikan saran resep");
    }
                            
                        
                    
    }
    
        
    }
        
    
    
    
    

    
    
    
    

