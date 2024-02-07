import java.io.*;
class CheckGorN {
public static void main(String[] args) throws IOException 
{
InputStreamReader obj = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(obj);
int num1,num2;
System.out.print("enter a first number");
num1 = Integer.parseInt(br.readLine());
System.out.println("enter a 2nd Number");
num2 = Integer.parseInt(br.readLine());
if(num1>num2)
{
System.out.println(num1+"is greter than"+num2);
}
 else if(num1<num2)
{
System.out.println(num2+"is greater than"+num1);
}
else 
{
System.out.println("numbers are equal");
}
}
}
