class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum=0,l=customers.length;
        int x=customers[0][0];
        for(int i=0;i<customers.length;i++)
        {
            x=Math.max(x,customers[i][0])+customers[i][1];
            sum=sum+x-customers[i][0];
            
        }
        
        return sum/l;
    }
}