
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class NewClass {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
System.out.println("1.öğrenci notu:");
int ogrenci_1 = scanner.nextInt();

System.out.println("2.öğrenci notu:");
int ogrenci_2 = scanner.nextInt();

System.out.println("3.öğrenci notu:");
int ogrenci_3 = scanner.nextInt();

System.out.println("4.öğrenci notu:");
int ogrenci_4 = scanner.nextInt();

int toplam =(ogrenci_1+ogrenci_2+ogrenci_3+ogrenci_4)/(4);

 if( ogrenci_1 >= toplam){

             System.out.println("öğrenci_1 geçti");
}
else{
     System.out.println("öğrenci_1 kaldı");
}
 if( ogrenci_2 >= toplam){

             System.out.println("öğrenci_2 geçti");
}
else{
     System.out.println("öğrenci_2 kaldı");
}
 if( ogrenci_3 >= toplam){

             System.out.println("öğrenci_3 geçti");
}
else{
     System.out.println("öğrenci_ 3 kaldı");
}
 if( ogrenci_4 >= toplam){

             System.out.println("öğrenci_4 geçti");
}
else{
     System.out.println("öğrenci_4 kaldı");
}

       
}
}