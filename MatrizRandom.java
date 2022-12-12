import java.util.Random;
public class MatrizRandom {

	public static void main(String[] args) {
    int v[][] = new int [3][3];
    int i, j;
    Random ler = new Random();
    for(i=0;i<3;i++) {
    	for(j=0;j<3;j++) {
    		v[i][j] = ler.nextInt()%50;
    	}
    }
    //apresentar os valores
    for(i=0;i<3;i++) {
    	System.out.println();
    	for(j=0;j<3;j++) {
    		System.out.println("["+v[i][j]+"]");
    	}
    }
	}

}
