class Solution {
    public boolean searchMatrix(int[][]a, int k) {


 
        int row=0,col=a[0].length-1;

        while(row<a.length && col>=0)
        {
            if(a[row][col]==k)
            {row++;
                col++;
              
                return true;}
            else {if(k<a[row][col])
                col--;
            else
                row++;}
        }

return false;
    

        
    }
}