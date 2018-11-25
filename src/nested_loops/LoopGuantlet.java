package nested_loops;

public class LoopGuantlet {
public static void main(String[] args) {
	
	for(int i = 0; i<101; i++) {
		System.out.println(i);
	}
	
	for(int i = 100; i>0; i--) {
		System.out.println(i);
	}
	
	for(int i = 2; i<20; i++) {
		if(i%2==0)
		System.out.println(i);
	}
	
	for(int i = 1; i<99; i++) {
		if(i%2!=0)
		System.out.println(i);
	}
	
	for(int i = 1; i<500; i++) {
		if(i%2!=0)
		System.out.println(i+" is ODD");
	}
	
	for(int i = 7; i<777; i++) {
		if(i%7==0)
		System.out.println(i);
	}
	
int years = 2007;
		for(int j = 1; j<11; j++) {
			
		System.out.println("in "+years+" I was "+j);
		years++;
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		for(int i = 1; i<101; i++) {
			System.out.println();
		}
		
		for(int a = 0; a<9; a+=3) {
			for(int b = 1; b<4; b++) {
				System.out.print(b+a+" ");
			}
			System.out.println();
		}
		
		for(int a = 0; a<100; a+=10) {
			for(int b = 1; b<11; b++) {
				System.out.print(b+a+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<6; i+=1) {
			for(int j = 0; j<i; j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
