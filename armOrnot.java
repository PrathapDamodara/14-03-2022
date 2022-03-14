class armstrong
{
    static void armstrong(int num,int number,int temp,int sum)
    {
        sum=0;
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            sum = sum + temp*temp*temp;
            number /= 10;
        }

        if(sum == num){
            System.out.println(num + " is an Armstrong number");
            }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
class armOrnot
{
    public static void main(String args[])
    {
        armstrong.armstrong(121,0,0,0);
    }
}  