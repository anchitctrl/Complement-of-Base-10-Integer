class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int power=0;
        int res=0;
        for(int i=0;i<n;i++){
            power=power+(int)Math.pow(2,i);
            if(power>=n){
                res=power-n;
                break;
            }
        }
        return res;
    }
}
