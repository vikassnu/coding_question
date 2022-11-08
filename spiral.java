 class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int left=0;//1
        int right=c-1;//0
        int up=0;//1
        int down=r-1;//3
        ArrayList<Integer> res = new ArrayList<>();
        int count=1;
        int choice=0;
        while(count<=r*c){
        switch(choice){
            case 0:
                for(int i=left;i<=right;i++){
                    if(res.size()<r*c){
                    res.add(matrix[up][i]);}
                    count++;
                    
                }
                up++;
                choice++;
            case 1:
                for(int j=up;j<=down;j++){
                    if(res.size()<r*c){
                    res.add(matrix[j][right]);}
                    count++;
                  
                }
                right--;
                choice++;
            case 2:
                for(int k=right;k>=left;k--){
                    if(res.size()<r*c){
                    res.add(matrix[down][k]);}
                    count++;
                     
                }
                down--;
                choice++;
            case 3:
                for(int k=down;k>=up && count<=r*c;k--){
                    if(res.size()<r*c){
                    res.add(matrix[k][left]);}
                    count++;
                    
                }
                left++;
                choice++;
                
                choice = choice%4;
                
        }}
        return res;
        
        
    }
}
