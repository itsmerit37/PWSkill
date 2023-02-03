Question:1
A:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(i==1 ||j==1&i>1||j==n/2|| i==n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}

-------------------------------
B:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(j==1|| i==n ||i==1 & j<=(n/2)-1 || j==n/2 || i==n/2 )
{
System.out.print(" * ");
}
else
{
System.out.print("    ");
}
}
System.out.println("  ");

}
}

}

-------------------------------
C:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(j==1|| i==n ||i==1 )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}

-------------------------------
D:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(j==1|| i==n ||i==1 & j<=(n/2)-1 || j==n/2 )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}


-------------------------------
E:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(i==1 ||j==1|| i==n/2 |i==n)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}

-------------------------------
F:
import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(i==1 ||j==1|| i==n/2 )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}

-------------------------------
G:

import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
	if(j==1 ||i==1   ||( (i==n||i>=n/2 &j>=(n/2)-2) & j<=(n/2)-2) ||i==n/2 & j>=(n/2)-2 || j==n/2 & i>=n/2  )
{
System.out.print(" * ");
}
else
{
System.out.print("    ");
}
}
System.out.println("  ");

}
}

}


-------------------------------
H:

import java.util.Scanner;

public class CafeManagementSystemApplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(j==n/2 ||j==1|| i==n/2 )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}

}

=============================================================
Question:2
//Write A Program to print traingle

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n*2;j++)
			{ 
				if(i==n||j-i<=n & i+j>=n+1)
				{
				System.out.print(" * ");
			}
				else
				{
					System.out.print("   ");
				}
		}
			System.out.println(" ");

	}

	}
}
===================================================================

Question:3
//Program To Print Hut

import java.util.Scanner;

public class hut {
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n=scan.nextInt();

for( int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0 &j<=(n-1)/2||j==0&i<=(n-1)/2||i+j<=(n-1)/2
|| i==0&j>=(n-1)/2
||j==n-1 & i==(n-1)/2 ||j-i>=(n-1)/2
||j==0 ||j==(n-1) || i==(n-1))
{
System.out.print(" * ");

}
else
{
System.out.print("   ");
}
}
    System.out.println();
}
}
}
==================================================================================
Question:4

//Program For Printing PW SKILLS

import java.util.Scanner;

public class pattern {
public static void main(String args[]) {
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if((i==1 || j==1 || i==(n)/2  || i<(n)/2 &j==(n)/2))
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print(" ");

for(j=1;j<=(n-3);j++)
{
if(j==1||j==(n-3)||(i+j==n+1 & i>(n+2)/2)||(i-j==3 & i>(n+2)/2) )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print(" ");
for(j=1;j<=n/2;j++)
{
if(i==1 ||i==n||i==n/2||(j==1 & i<=n/2)||j==(n)/2 & i>=n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print(" ");
for(j=1;j<=(n+2)/2;j++)
{
if(j==1||i+j==(4+n)/2 & i<=n/2||i-j==(n/2)-1 & i>=(n/2))
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print(" ");
for(j=1;j<=n;j++)
{
if(i==1||i==n||j==n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print(" " );
for(j=1;j<=(n+2)/2;j++)
{
if(j==1 || i==n & j<6 )
{
System.out.print(" * ");
}else
{
System.out.print("   ");
}
}

System.out.print(" ");
for(j=1;j<=(n+2)/2;j++)
{
if(j==1 || i==n & j<6 )
{
System.out.print(" * ");
}else
{
System.out.print("   ");
}
}

System.out.print(" ");
for(j=1;j<=n/2;j++)
{
if(i==1 ||i==n||i==n/2||(j==1 & i<=n/2)||j==(n)/2 & i>=n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println(" ");

}
}
}

============================================================================
Question:5
//Program For Printing My Name (PRIYA)


import java.util.Scanner;

public class namePattern {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n/2;j++)
{
if(i==1 & j<=(n/2)-1 & j>1|| j==1 & i>1||i==(n/2) & j<=(n/2)-1||i<n/2 &j==n/2 & i>1)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print("  ");
for(j=1;j<=n/2;j++)
{
if(i==1 & j<=(n/2)-1 & j>1|| j==1 & i>1||i==(n/2) & j<=(n/2)-1||i<n/2 &j==n/2 & i>1|| i>=n/2 & i-j==n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print("  ");
for(j=1;j<=n/2;j++)
{
if(i==1|| i==n|| j==n/3)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print("   ");
for(j=1;j<=n-1;j++)
{
if(i>n/2 & j==(n/2)||( (i+j==n+1 || i-j==1) & i<=n/2) )
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.print("  ");
for(j=1;j<=n/2;j++)
{
if(i==1||j==1||j==n/2|| i==n/2)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("  ");

}
}
}
===================================================================================