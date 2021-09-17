import java.text.*;

class p10
{
public static void main(String args[])
{
double i=78.999999999999;
DecimalFormat df=new DecimalFormat("#.####");
System.out.println(" i= "+df.format(i));
String str=String.format("%.3f",i);
System.out.println(str);
}
}