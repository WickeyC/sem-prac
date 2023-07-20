Class Income_taxCalculation
{
public static void main(String args[])
{
double income_income_tax = 0.0 , income;
Scanner sc=new Scanner(System.in);
System.out.println(&quot;Enter your yearly gross income &quot;);
income=sc.nextDouble();
if(income&lt;=30000)
income_tax=0;
else if(income&lt;=60000)
income_tax=0.10*(income-30000));
else if(income&lt;=90000)
income_tax=(0.15*(income-60000));
else if(income&lt;=150000)
income_tax=(0.20*(income-90000));
else
income_tax=(0.25*(income-15000));
System.out.println(&quot;Total tax to pay is &quot;+income_tax);
}
}