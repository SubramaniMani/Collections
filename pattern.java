package loops;

public class pattern {

	public static void main(String[] args) {
		
		
		pattern object = new pattern ();
		
		
		//object.pattern();
		//object.equals();
		//object.number();
	     // object.pattern1();
		//object.pattern2();
		//object.pattren3();
		// object.pattren4();
		//object.pattren5();
		//object.pattren6();
		//object.pattren7();
		//object.pattren8();
		//object.pattren9();
		//object.pattren10();
		//object.pattren11();
		//object.heart();
		//object.pattren12();
		
		
		
		
		
		
		
	}

private void pattren12() {
	
	for(int row=1;row<=7;row++) {
	      
	    for(int col=1;col<=8;col++)
	    {  
	    if(col==1  || col+row==6 && col<=5 || row-col==2)
	    
	      System.out.print("* ");
	    else
	      System.out.print("  ");
	    }
	    System.out.println();
	}
		
		
	}

private void heart() {
	for(int row=1; row<=6; row++)
		{
			for(int col=1; col<=6; col++)
			{
				if(col==2 && row==1 || col==4 && row==1 || row==2 && col==1 || col==3 && row==2 ||col==5 && row==2|| row==3 && col==1 || col==5 && row==3 || row==4 && col==2 || row==4 && col==4 || col==3 && row==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
		}
			System.out.println();
		}
	}

private void pattren11() {
	for(int row=1;row<=7;row++) {
	      
	    for(int col=1;col<=7;col++)
	    {  
	    if(col+row==8 && row<=4 ||  row==col && col<=4 || col==1 ||col==7  )
	    
	      System.out.print("* ");
	    else
	      System.out.print("  ");
	    }
	    System.out.println();
	}
	}

private void pattren10() {
	for(int row=1;row<=7;row++) {
	      
	    for(int col=1;col<=7;col++)
	    {  
	    if(col+row==8  ||  row==col && col<=4 )
	    
	      System.out.print("* ");
	    else
	      System.out.print("  ");
	    }
	    System.out.println();
	    
	}  
	}

private void pattren9() {
		for(int row =1; row<=5; row++)
		{
			for(int col=1; col<=5; col--)
			{
				if(col-5<=row)
				{
				System.out.print(" ");
			}
			else
			System.out.print("* ");
		}
		
	}
		System.out.println();
}

private void pattren8() {                                // A B C D E
		                                                 // A B C D 
	for(char row='E'; row>='A'; row--)                   // A B C 
	{                                                    // A B 
		for(char col='A'; col<=row; col++)               // A
		{
			System.out.print(col+" ");
		}
		System.out.println();
	}
		
	}

private void pattren7() {                             // 1
		                                              // 1 2
	                                                  // 1 2 3
	for(int row=1 ; row<=5; row++)                    // 1 2 3 4
	{                                                 // 1 2 3 4 5
		for(int col=1; col<=row; col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
	}
		
	}

private void pattren6() {
	for(int row =1; row<=7 ; row ++)
	{
		for(int col =1; col<=7; col++)
		{
			if( col==1 || col==row || col==7)
			{
			if(col==1 && row==1 && col==1 && row==7)	
			{	
			System.out.print(" ");
		    }
			else	
		System.out.print("* ");
		}
			else 
	System.out.print("  ");
	}	
		System.out.println();
	}


	}

private void pattren5() {
	for(int row =1; row<=7 ; row ++)
	{
		for(int col =1; col<=7; col++)
		{
			if( col==1 || row ==1 || row==4|| row ==2 && col==7  || row==3 && col==7)
			{
			if(col==1 && row==1 && col==1 && row==7)	
			{	
			System.out.print(" ");
		    }
			else	
		System.out.print("* ");
		}
			else 
	System.out.print("  ");
	}	
		System.out.println();
	}

	}

private void pattren4() {
	for(int row =1; row<=7 ; row ++)
	{
		for(int col =1; col<=7; col++)
		{
			if(row==1 || col==1 ||  row ==7 || col==7  )
			{
			if(col==7 && row==1 || row==7 && col==7)	
			{	
			System.out.print(" ");
		    }
			else	
		System.out.print("* ");
		}
			else 
	System.out.print("  ");
	}	
		System.out.println();
	}

		
	}

private void pattren3() {
	for(int row =1; row<=7 ; row ++)
	{
		for(int col =1; col<=7; col++)
		{
			if(row==1 || col==1 ||  row ==7 || col==7  )
			{
			if(col==1 && row==1 || col==1 && row==7)	
			{	
			System.out.print(" ");
		    }
			else	
		System.out.print("* ");
		}
			else 
	System.out.print("  ");
	}	
		System.out.println();
	}
}
	

private void pattern2() {
	
	int no = 10;
	
	for(int row =1; row<=4 ; row ++)
	{
		for(int col =4; col<=row; col++)
		{
			System.out.print( no + " ");
		}
		no--;
		
	}
	System.out.println();
		
		
	}

private void pattern1() {

	// seven star print single code 
	
	for(int row =1; row<=7 ; row ++)
	{
		for(int col =1; col<=7; col++)
		{
			if(row==1 || col==4)
			{	
			System.out.print("* ");
		}
			else	
		System.out.print("  ");
		}
	System.out.println();
	}	
	}


	private void number() {
		int no =1;
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
			
		}
	}

	private void equals() {

		
	for(int row=1; row<=4; row++)
	{
		for(int col=1; col<=row; col++)
		{
			System.out.print( col);
		}
		System.out.println("   ");
		
	}
	System.out.println("    ");
	
		
		
	}

	private void pattern() {
		for(char row='A'; row<='D'; row++)
		{
			for(char col='A'; col<=row; col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	}


