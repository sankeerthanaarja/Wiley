package com.exercise3;
import java.util.*;
public class MatrixMain {

	public static void main(String[] args) {
		int rows,cols;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows:");
		rows=s.nextInt();
		System.out.println("Enter Cols:");
		 cols=s.nextInt();
        matrix m1=new matrix(rows,cols);
        m1.setMatrix();
        int  mat1[][]=m1.getMatrix();
        System.out.println("Enter Rows:");
		 rows=s.nextInt();
		System.out.println("Enter Rows:");
		cols=s.nextInt();
        matrix m2=new matrix(rows,cols);
        m2.setMatrix();
        int mat2[][]=m2.getMatrix();
        int ans[][];
        ans=m2.add(mat1, mat2);
        for(int i=0;i<ans.length;i++)
   	 {
   		 for(int j=0;j<ans[0].length;j++)
   		 {
   			 System.out.print(ans[i][j]);
   		 }
   		 System.out.println();

	}
	}
}
