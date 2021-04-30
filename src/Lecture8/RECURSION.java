package Lecture8;

import java.util.ArrayList;

public class RECURSION {

	public static void main(String[] args) {
		System.out.println(CountMazePath(2, 2, 0, 0));
		System.out.println(getMaze(2, 2, 0, 0));
		printMazePath(2, 2, 0, 0," ");
		System.out.println(CountMazePathWD(2, 2, 0, 0));
		System.out.println(getMazeWD(2, 2, 0, 0));
		printMazePathWD(2, 2, 0, 0," ");
		boolean[][]board=new boolean [4][4];
		System.out.println(CountNQueens(board,0));
	//	DisplayNQueens(board,0);
	}

	public static int CountMazePath(int er, int ec, int cr, int cc) {
		int count = 0;
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		count = count + CountMazePath(er, ec, cr, cc + 1);
		count = count + CountMazePath(er, ec, cr + 1, cc);
		return count;
	}

	public static ArrayList<String> getMaze(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		int count = 0;
		ArrayList<String> hResult = getMaze(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMaze(er, ec, cr + 1, cc);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int j = 0; j < vResult.size(); j++) {
			myResult.add("V" + vResult.get(j));
		}
		return myResult;
	}

	public static void printMazePath(int er, int ec, int cr, int cc, String result) {
    if(er==cr&&cr==cc)
    {
    	System.out.println(result);
    	return;
    }
    if (cr > er || cc > ec)
    {
	return;
	}
   printMazePath(er,ec,cr,cc+1,result+"H");
   printMazePath(er,ec,cr+1,cc,result+"V");  
}
	public static int CountMazePathWD(int er, int ec, int cr, int cc) {
		int count = 0;
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		count = count + CountMazePathWD(er, ec, cr, cc + 1);
		count = count + CountMazePathWD(er, ec, cr + 1, cc);
		count = count + CountMazePathWD(er, ec, cr + 1, cc+1);
		return count;
	}
	public static ArrayList<String> getMazeWD(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		int count = 0;
		ArrayList<String> hResult = getMazeWD(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazeWD(er, ec, cr + 1, cc);
		ArrayList<String> DResult = getMazeWD(er, ec, cr + 1, cc+1);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int j = 0; j < vResult.size(); j++) {
			myResult.add("V" + vResult.get(j));
		}
		for (int k = 0; k < DResult.size(); k++) {
			myResult.add("D" + DResult.get(k));
		}
		
		return myResult;
	}
	public static void printMazePathWD(int er, int ec, int cr, int cc, String result) {
	    if(er==cr&&cr==cc)
	    {
	    	System.out.println(result);
	    	return;
	    }
	    if (cr > er || cc > ec)
	    {
		return;
		}
	   printMazePath(er,ec,cr,cc+1,result+"H");
	   printMazePath(er,ec,cr+1,cc,result+"V");
	   printMazePath(er,ec,cr+1,cc+1,result+"D");  
	}
	public static boolean isItSafe(boolean [][]board,int row,int col)
	{
		for(int i=row;i>=0;i--)
		{
			if(board[i][col]==true)
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--)
		{
			if(board[i][j]==true)
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j<board[row].length;i--,j++)
		{
			if(board[i][j]==true)
			{
				return false;
			}
		}
		return true;
	}
	public static int CountNQueens(boolean [][]board,int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++)
		{
			if(isItSafe(board,row,col))
			{
				board[row][col]=true;
				count=count+CountNQueens(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	public static void DispalyNQueens(boolean [][]board,int row)
	{
		if(row==board.length)
		{
			return;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++)
		{
			if(isItSafe(board,row,col))
			{
				board[row][col]=true;
				count=count+CountNQueens(board,row+1);
				board[row][col]=false;
			}
		}
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board.length;j++)
		{
			System.out.println(board[i][j]);
		}
	}
	}
}