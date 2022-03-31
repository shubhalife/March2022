import java.util.*;

/* matrix 
1. addition of matrices
2. multiplication of matrices
3.subtraction of matrices
4.table 1 to 30
5.transpose of matrix
*/ 
class Operation{
	int a[][]= new int[3][3];
	int b[][] = new int[3][3];
	int c[][] =new int[3][3];
	int q;
	Scanner sc = new Scanner(System.in);
	
	void scan(){
		
		System.out.println("Enter elements of 1st 3x3 matrix");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j]=sc.nextInt();	
			}	
		}

		System.out.println("Enter elements of 2nd 3x3 matrix");		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				b[i][j]=sc.nextInt();	
			}	
		}
		
	}
	
	void call(){// init block for matrix input, invoked each time new class object is created.
		
		System.out.println(" 0. exit 1.addition of matrices   2.subtraction of matrices   3. multiplication of matrices   4.table 1 to 30   5.transpose of matrix");
		q= sc.nextInt();		
	}
	
	
	void getdata(int a[][]){                                  
		int p[][] = new int[3][3];
		p=a;
		
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p[i].length; j++){
				System.out.print(p[i][j]+" ");	
			}
				System.out.println();
		}		
		
	}// end of getdata
	
	void add(){
		for(int i=0; i < a.length; i++){
			for(int j=0; j< a[i].length; j++){
			c[i][j] = a[i][j] + b[i][j];
			}
		}
	}
	
	void sub(){
		for(int i=0; i < a.length; i++){
			for(int j=0; j< a[i].length; j++){
			c[i][j] = a[i][j] - b[i][j];
			}
		}
	}
	
	void mult(){
		
	for(int i=0;i<a.length;i++){    
	for(int j=0;j<a[i].length;j++){    
	c[i][j]=0;      
	for(int k=0;k<a.length;k++)      
	{      
	c[i][j]+=a[i][k]*b[k][j];      
	}//end of k loop   
	}//end of j loop      
	} 
	
	}

	void transpose(){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				c[i][j] = a[j][i];
			}
			
		}	
		}
		
	void table(){
		int p[][] = new int[10][30];
		int row=1, col =1;
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p[i].length; j++){ 
				p[i][j] = row*col;
				col++;
			}
			row++;
			col = 1;
		}	
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p[i].length; j++){
				System.out.print(p[i][j]+" \t| ");
			}
			System.out.println();
		}
			
		}	
}

class Matrix{
	public static void main(String... args)
	{
		Operation p1 = new Operation();
		//p1.getdata(p1.a);
		//p1.getdata(p1.b);
		do{
			p1.call();
		switch(p1.q){
			case 0:
			System.out.println("Bye bye");
			break;
			case 1:
			p1.scan();
			p1.add();
			p1.getdata(p1.c);
			break;
			case 2:
			p1.scan();
			p1.sub();
			p1.getdata(p1.c);
			break;
			case 3:
			p1.scan();
			p1.mult();
			p1.getdata(p1.c);
			break;
			case 4:
			p1.table();
			break;
			case 5:
			p1.scan();
			p1.transpose();
			p1.getdata(p1.c);
			break;
			default:
			System.out.println("Invalid input");
			break;
		}
		}while(p1.q !=0);
		//System.out.println("Hello");
	}
	
}