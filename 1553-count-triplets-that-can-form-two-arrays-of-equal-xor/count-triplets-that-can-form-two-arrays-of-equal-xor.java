class Solution {
    public int countTriplets(int[] arr) {
        int a[]=new int[arr.length+1];
        
        for(int i=0;i<arr.length;i++)
        {
            a[i+1]=a[i]^arr[i];
        }
        int c=0;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            {
                for(int k=j;k<=arr.length;k++)
                {
                    int x=a[i-1]^a[j];
                    int y=a[j]^a[k];
                    if(x==y)
                        c++;
                }
            }
        }
        return c;
    }
}