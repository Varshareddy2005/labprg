import java.util.Scanner;
public class VowelornotSwitch{
public static void main(String args[]){
 boolean isVowel=false;
 System.out.println("enter a character/alphabet:");
 Scanner sc=new Scanner(System.in);
 char ch=sc.next().charAt(0);
 switch(ch){
 case'A':
 case'E':
 case'I':
 case'0':
 case'U':
 case'a':
 case'e':
 case'u':
 case'o':
 case'i': isVowel=true;
 }
 if(isVowel==true){
 System.out.println(ch+"is a vowel");
 }
 else{
 System.out.println(ch+"is a consonent");
 }
}
}