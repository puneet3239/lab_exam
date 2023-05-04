import java.util.Scanner;
class reverse{
int n;
void getdata(int i)
{n=i;}

int putdata()
{int rev=0;
while(n>0)
{rev=(rev*10)+n%10;
n=n/10;}
//System.out.println("reverse ="+rev);
return (rev);}
public static void main(String args[]){
	reverse rr=new reverse();
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		a=sc.nextInt();
	     rr.getdata(a);
	 int z=    rr.putdata();
	 System.out.println(z);}}

