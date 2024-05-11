class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int max=0;
     List list= new ArrayList();
     //get the maximum choc count
      for(int kid:candies) {
       max= Math.max(max,kid);
      } 

      for(int kidcandies:candies){
      list.add(kidcandies+extraCandies>=max);
      }

    return list;
    }
}