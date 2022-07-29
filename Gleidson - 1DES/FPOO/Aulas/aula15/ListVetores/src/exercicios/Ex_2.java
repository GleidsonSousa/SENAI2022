package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Ex_2 {

	public static Scanner scan =  new Scanner (System.in);
	public static void main(String[] args) throws IOException{
		int [] n = new int [10];
		System.out.println("Digite 10 números inteiros.");
		n [0]=  scan.nextInt();
		n [1]=  scan.nextInt();
		n [2]=  scan.nextInt();
		n [3]=  scan.nextInt();
		n [4]=  scan.nextInt();
		n [5]=  scan.nextInt();
		n [6]=  scan.nextInt();
		n [7]=  scan.nextInt();
		n [8]=  scan.nextInt();
		n [9]=  scan.nextInt();
		System.out.println("Números na Ordem Normal:");
		System.out.println(n[0]+"\t"+n[1]+"\t"+n[2]+"\t"+n[3]+"\t"+n[4]+"\t"+n[5]+"\t"+n[6]+"\t"+n[7]+"\t"+n[8]+"\t"+n[9]);
		
		
		int [] inverso	 = new int [10];
		inverso [0]=  n [9];
		inverso [1]=  n [8];
		inverso [2]=  n [7];
		inverso [3]=  n [6];
		inverso [4]=  n [5];
		inverso [5]=  n [4];
		inverso [6]=  n [3];
		inverso [7]=  n [2];
		inverso [8]=  n [1];
		inverso [9]=  n [0]; 
	
		System.out.println("Números na Ordem inversa:");
		System.out.println(n[9]+"\t"+n[8]+"\t"+n[7]+"\t"+n[6]+"\t"+n[5]+"\t"+n[4]+"\t"+n[3]+"\t"+n[2]+"\t"+n[1]+"\t"+n[0]);
		
		     
		 	}
		 }
	

