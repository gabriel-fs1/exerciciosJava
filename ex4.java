public class ex4 {
	public static void main(String[] args) {
		
	int[] numeros = {2, 5, 2, 4, 7, 9, 1, 3, 5};
	
    int x = 0;
    
    for(int num : numeros) {
    	if(num % 2 != 0) {
    		x += num;
    	}
    }
    
    System.out.println("A soma dos números ímpares é: " + x);
		
	}
}