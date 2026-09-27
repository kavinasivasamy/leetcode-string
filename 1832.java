class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char b='a';b<='z';b++){
        if(sentence.indexOf(b)==-1){
            return false;
        }
    }
    return true;
}
}
