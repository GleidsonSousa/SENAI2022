package modelo;

public class Divi {

	public static void main(String[] args) {
		int V1 = 13;
		int V2 = 3;
		int e = (int) Math.pow(V1,V2);
		float raiz = (float) Math.sqrt(e);
		
		System.out.printf("%d+%d = %d\n",V1,V2,V1+V2);
		System.out.printf("%d-%d = %d\n",V1,V2,V1-V2);
		System.out.printf("%d*%d = %d\n",V1,V2,V1*V2);
		System.out.printf("%d/%d = %d\n",V1,V2,V1/V2);
		System.out.printf("o resto é %d\n",V1%V2);
		System.out.printf("%d elevado a %d é %d\n",V1,V2,e);
		System.out.printf("A raiz de %d é %.2f\n",e,raiz);

	}

}