package Day38;

class Solution {
    public boolean judgeCircle(String moves) {
        int upCount=0;
        int downCount=0;
        int leftCount=0;
        int rightCount=0;
        for(char ch : moves.toCharArray()){
            if(ch=='U'){
                upCount++;
            }
            if(ch=='D'){
                downCount++;
            }
            if(ch=='L'){
                leftCount++;
            }
            if(ch=='R'){
                rightCount++;
            }
        }
        return upCount==downCount && leftCount==rightCount;
    }
}