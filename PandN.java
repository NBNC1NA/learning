import java.io.*;
class postiveornegative {
public static void main(String[] args) throws IOException 
{
InputStreamReader obj = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(obj);
int num;
System.out.print("enter a first number");
num = Integer.parseInt(br.readLine());

if(num>0)
{
System.out.println("the number is positive"+num);
}
 else if(num<0)
{
System.out.println("the number is negative"+num);
}
else 
{
System.out.println("number is zero or not definded");
}
}
}
