class Solution {
    public int reverse(int x) {
       int push=0;
        while(x!=0)
       {
           int pop = x%10;
           x /= 10;
           if(push<(Integer.MAX_VALUE/10)&&push>(Integer.MIN_VALUE/10))
                push=push*10 + pop;
           else if((push==(Integer.MAX_VALUE/10) && (pop<7))||((push==(Integer.MIN_VALUE/10)) && (pop>-8)))
               push=push*10+pop;
           else
               return 0;
           
       }
        return push;
        
    }
}