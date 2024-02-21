class Solution {
    public boolean isHappy(int n) {
        int slow=n;//set the slow pointer to n
        int fast=n;//and also fast to n
        do{
            slow=square(slow);//increase slow by one step
            fast=square(square(fast));//but increase fast by two step so that if there if loop the fast will catch up to slow 
        }while(slow!=fast);//if they come equal than loop end
        if(slow==1){//if slow become 1 than return true 
            return true;
        }
        return false;//if loop is there than return false
        
    }
    //function to find square addition of digits
    public int square(int num){
        int ans=0;//to store the result
        while(num>0){
            int rem=num%10;//take the remender from num 
            ans+=rem*rem;//take the square of remender and add to ans
            num/=10;//decrease the num
        }//repeat the process till num is zero
        return ans;
    } 
}
