# coding_question
spiral_matrix_traversal
// driver code

import java.io.*;
import java.util.*;
class GFG{
public static void main(String args[]) throws IOException{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
int r = sc.nextInt();
int c = sc.nextInt();
int matrix[][] =  new int[r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
matrix[i][j] = sc.nextInt();}}
Solution ob = new Solution();
ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
for(Integer val:ans){
   System.out.print(val+" ");}
System.out.println();}
}
}
