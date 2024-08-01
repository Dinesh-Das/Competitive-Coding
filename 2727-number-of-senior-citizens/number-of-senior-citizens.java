class Solution {
    public int countSeniors(String[] details) {
        int seniorCitizen=0;
        int age;
        for(String detail:details){
            age=Integer.parseInt(detail.substring(11,13));
            if(age > 60){
                seniorCitizen++;
            }
        }
        return seniorCitizen;
    }
}