class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            if(magazine.indexOf(ransomNote.charAt(i)) == -1){
                return false;
            }else{
                magazine=magazine.substring(0,magazine.indexOf(ransomNote.charAt(i))) +magazine.substring(magazine.indexOf(ransomNote.charAt(i)) +1 ); 
            }
        }
        return true;
    }
}