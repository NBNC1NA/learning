import java.io.* ;
class area
{
public static void main(String[] args) throws IOException {
InputStreamReader obj = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(obj);
int l,b,ar=0,pr=0;
System.out.println("enter length and breadth of a recatngle");
l=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
ar = l*b;
pr  = 2 * (l+b);
System.out.println("the area is"+ar);
System.out.println("the paramter of rectangle"+pr);
}}