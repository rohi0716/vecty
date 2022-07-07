package arrayDemo;

public class ArrayDemo2 {

	public static void main(String[] args) 
	{
        int a[]= {10,25,45,65,34,67};  //declaration and initialization of array
		
		int x=a.length;     //use of lenght keyword to find size of array
		System.out.println("Size of the array is "+x);
	
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
