
	import java.util.Scanner;  
	import java.lang.Math;  
	public class amstrongNumber1 {

static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;     
temp=n;   //assigning n into a temp variable 
  
while(temp>0)  //loop execute until the condition becomes false  
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
last = temp % 10;   //determines the last digit from the number 
sum +=  (Math.pow(last, digits));   
temp = temp/10;   //removes the last digit 
}  
  
if(n==sum)   //compares the sum with n  

return true;     //returns if sum and n are equal 

else return false;   //returns false if sum and n are not equal  
}   
//driver code  
public static void main(String args[])     
{     
int num;   
@SuppressWarnings("resource")
Scanner sc= new Scanner(System.in);

System.out.print("Enter the limit: ");  

num=sc.nextInt();  //reads the limit from the user  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  
//function calling  
if(isArmstrong(i))  
//prints the armstrong numbers  
System.out.print(i+ ", ");  
}   
}  