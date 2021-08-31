public class IntegerReverse {
    static int reverseNumber(int x){
        int res=0;

        while(x!=0){

            int rem=x%10;
            int product= res*10+rem;
            if((product-rem)/10!=res){
                return 0;
            }
            res=product;
            x=x/10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }
}
