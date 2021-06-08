package com.exercise3;
import java.util.*;
public class matrix {
	int matr[][],rows,cols;
	matrix()
	{
		
	}
 matrix(int rows,int cols)
{
	 matr=new int[rows][cols];
	 this.rows=rows;
	 this.cols=cols;
}
 public void setMatrix()
 {
	 Scanner s=new Scanner(System.in);
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<cols;j++)
		 {
			 System.out.println("Enter the ("+i+j+") value");
			 int value=s.nextInt();
			 matr[i][j]=value;
		 }
	 }
 }
 public int[][] getMatrix()
 {
	 return matr;
 }
public int[][] add(int[][] mat1, int[][] mat2) {
	 int r=(mat1.length>mat2.length)?mat1.length:mat2.length;
	 int c=(mat1[0].length>mat2[0].length)?mat1[0].length:mat2[0].length;
	 int res[][]=new int[r][c];
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			res[i][j]=mat1[i][j]+mat2[i][j];
		 }
	 }
	return res;
}
}
