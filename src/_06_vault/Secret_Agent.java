package _06_vault;

public class Secret_Agent {
	public void findCode(Vault v){
		for (int i=0; i<10000001; i++) {
			if (v.tryCode(i)) {
				System.out.println(i);
			}
			
		}
	}
	
	
	
	
	
	
}
