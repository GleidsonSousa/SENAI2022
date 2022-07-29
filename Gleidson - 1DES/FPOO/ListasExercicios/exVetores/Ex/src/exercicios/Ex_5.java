package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Ex_5 {

	
		public static Scanner scan =  new Scanner (System.in);
		public static void main(String[] args) throws IOException{
			int [] a = new int [10];
			System.out.println("Digite 20 números inteiros.");
			a [0]=  scan.nextInt();
			a [1]=  scan.nextInt();
			a [2]=  scan.nextInt();
			a [3]=  scan.nextInt();
			a [4]=  scan.nextInt();
			a [5]=  scan.nextInt();
			a [6]=  scan.nextInt();
			a [7]=  scan.nextInt();
			a [8]=  scan.nextInt();
			a [9]=  scan.nextInt();
			int [] b = new int [10];
			b [0]=  scan.nextInt();
			b [1]=  scan.nextInt();
			b [2]=  scan.nextInt();
			b [3]=  scan.nextInt();
			b [4]=  scan.nextInt();
			b [5]=  scan.nextInt();
			b [6]=  scan.nextInt();
			b [7]=  scan.nextInt();
			b [8]=  scan.nextInt();
			b [9]=  scan.nextInt();
			
			int [] dif = new int [10];
			dif [0]=  a[0] - b [0];
			dif	[1]=  a[1] - b [1];
			dif	[2]=  a[2] - b [2];
			dif	[3]=  a[3] - b [3];
			dif	[4]=  a[4] - b [4];
			dif	[5]=  a[5] - b [5];
			dif	[6]=  a[6] - b [6];
			dif	[7]=  a[7] - b [7];
			dif	[8]=  a[8] - b [8];
			dif	[9]=  a[9] - b [9];
			System.out.println("A Diferença de digitos entre os números digitados é:");
			System.out.println(a[0]+" e "+ b[0]+" = "+dif[0]+" Digitos."+"\t"+a[1]+" e "+ b[1]+" = "+dif[1]+" Digitos."+"\t"+a[2]+" e "+ b[2]+" = "+dif[2]+" Digitos."+"\t");
			System.out.println(a[3]+" e "+ b[3]+" = "+dif[3]+" Digitos."+"\t"+a[4]+" e "+ b[4]+" = "+dif[4]+" Digitos."+"\t"+a[5]+" e "+ b[5]+" = "+dif[5]+" Digitos."+"\t");
			System.out.println(a[6]+" e "+ b[6]+" = "+dif[6]+" Digitos."+"\t"+a[7]+" e "+ b[7]+" = "+dif[7]+ " Digitos."+"\t"+a[8]+" e "+ b[8]+" = "+dif[8]+" Digitos."+"\t");
			System.out.println(a[9]+" e "+ b[9]+" = "+dif[9]+" Digitos\n");
					
			int [] soma = new int [10];
			soma [0]=  a[0] + b [0];
			soma [1]=  a[1] + b [1];
			soma [2]=  a[2] + b [2];
			soma [3]=  a[3] + b [3];
			soma [4]=  a[4] + b [4];
			soma [5]=  a[5] + b [5];
			soma [6]=  a[6] + b [6];
			soma [7]=  a[7] + b [7];
			soma [8]=  a[8] + b [8];
			soma [9]=  a[9] + b [9];
			System.out.println("A Soma dos números digitados é:");
			System.out.println(a[0]+" e "+ b[0]+" = "+dif[0]+"\t"+a[1]+" e "+ b[1]+" = "+dif[1]+"\t"+a[2]+" e "+ b[2]+" = "+dif[2]+"\t");
			System.out.println(a[3]+" e "+ b[3]+" = "+dif[3]+"\t"+a[4]+" e "+ b[4]+" = "+dif[4]+"\t"+a[5]+" e "+ b[5]+" = "+dif[5]+"\t");
			System.out.println(a[6]+" e "+ b[6]+" = "+dif[6]+"\t"+a[7]+" e "+ b[7]+" = "+dif[7]+"\t"+a[8]+" e "+ b[8]+" = "+dif[8]+"\t");
			System.out.println(a[9]+" e "+ b[9]+" = "+dif[9]+"\n");
			int [] mult = new int [10];
			mult [0]=  a[0] * b [0];
			mult [1]=  a[1] * b [1];
			mult [2]=  a[2] * b [2];
			mult [3]=  a[3] * b [3];
			mult [4]=  a[4] * b [4];
			mult [5]=  a[5] * b [5];
			mult [6]=  a[6] * b [6];
			mult [7]=  a[7] * b [7];
			mult [8]=  a[8] * b [8];
			mult [9]=  a[9] * b [9];
			System.out.println("A Multiplicação dos números digitados é:");
			System.out.println(a[0]+" e "+ b[0]+" = "+mult[0]+"\t"+a[1]+" e "+ b[1]+" = "+mult[1]+"\t"+a[2]+" e "+ b[2]+" = "+mult[2]+"\t");
			System.out.println(a[3]+" e "+ b[3]+" = "+mult[3]+"\t"+a[4]+" e "+ b[4]+" = "+mult[4]+"\t"+a[5]+" e "+ b[5]+" = "+mult[5]+"\t");
			System.out.println(a[6]+" e "+ b[6]+" = "+mult[6]+"\t"+a[7]+" e "+ b[7]+" = "+mult[7]+"\t"+a[8]+" e "+ b[8]+" = "+mult[8]+"\t");
			System.out.println(a[9]+" e "+ b[9]+" = "+mult[9]+"\n");
			
			 }    
		}