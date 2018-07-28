package test;

import java.io.*;

class UserMainCode{
	static int n=0,element;
	static boolean res;
	public static boolean checkTriplets(int arr[])
	{
		for(int i : arr){ //enhanced for loop
			n++;
		}
		int count[] = new int[100];
		
		for(int i=0;i<n;i++) //code snippet to check for a triplet
		{
			element=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(element == arr[j])
				{
					count[element]++;
					if(count[element]==3)
					{
						return true; //returns true if it's a triplet
					}
				}
			}
		} 
		return false; ////returns false if it's not a triplet
	}
}

public class TripletCheck 
{
	public static void main(String ar[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the size of the array :\n");
		int size = Integer.parseInt(br.readLine()); //accepts the size from the user
		int arr[]= new int[size];
		System.out.println("Enter the elements of the array one by one");
		for(int i=0;i<size;i++) //stores the elements of the array
		{
				arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(UserMainCode.checkTriplets(arr));
	}
}
