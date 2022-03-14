class NaturalNumebrs
{
    static void Son(int i,int sum,int n)
    {
        n=10;
        sum=0;
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers: "+sum);
    }
}
class SofNstatic
{
    public static void main(String args[])
    {
        NaturalNumebrs.Son(1,10,0);
    }
}