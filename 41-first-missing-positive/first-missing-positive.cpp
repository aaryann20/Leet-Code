class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n=nums.size();
        vector<bool> s(n+1,false);

        for(int no: nums){
            if(no>0 && no<=n ){
                s[no]=true;
            }    
        }
        for(int i=1;i<=n;i++){
            if(!s[i]){
                return i;
            }
        }
        return n+1;
    }
};