package Lecture7;

import java.util.ArrayList;

public class Return_subsequences {

	public static void main(String[] args) {
		String str="abc";
//		System.out.println(getss(str));
//		System.out.println((str));
		//getSS(str," ");
		ASCIIfunc(str," ");		}
public static ArrayList<String> getss(String str)
{
if(str.length()==0){
	ArrayList<String>baseResult=new ArrayList<>();
	baseResult.add("");
	return baseResult;
}
char cc=str.charAt(0);
String ros=str.substring(1);
ArrayList<String>recResult=getss(ros);
ArrayList<String>myResult=new ArrayList<>();
for(int i=0;i<recResult.size();i++)
{
	myResult.add(recResult.get(i));
	myResult.add(cc+recResult.get(i));
	
}
return myResult;
}
public static ArrayList<String> ASCII(String str)
{
if(str.length()==0){
	ArrayList<String>baseResult=new ArrayList<>();
	baseResult.add("");
	return baseResult;
}
char cc=str.charAt(0);
String ros=str.substring(1);
ArrayList<String>recResult=ASCII(ros);
ArrayList<String>myResult=new ArrayList<>();
for(int i=0;i<recResult.size();i++)
{
	myResult.add(recResult.get(i));
	myResult.add(cc+recResult.get(i));
	myResult.add((int)cc+recResult.get(i));
}
return myResult;
}
public static ArrayList<String> getPermutations(String str)
{
if(str.length()==0){
	ArrayList<String>baseResult=new ArrayList<>();
	baseResult.add("");
	return baseResult;
}
char cc=str.charAt(0);
String ros=str.substring(1);
ArrayList<String>recResult=getPermutations(ros);
ArrayList<String>myResult=new ArrayList<>();//modify
for(int i=0;i<recResult.size();i++)
{
	myResult.add(recResult.get(i));
	myResult.add(cc+recResult.get(i));
	
}
return myResult;
}
public static void getSS(String str,String result){
	if(str.length()==0){
		System.out.println(result);
		return;
		}
	char cc=str.charAt(0);
	String ros=str.substring(1);
   getSS(ros,result);
   getSS(ros,result+cc);

	}
public static void ASCIIfunc(String str,String result){
	if(str.length()==0){
		System.out.println(result);
		return;
		}
	char cc=str.charAt(0);
	String ros=str.substring(1);
   ASCIIfunc(ros,result);
   ASCIIfunc(ros,result+cc);
   ASCIIfunc(ros,result+(int)cc);
	}
public static void getPermu(String str,String result)
{
	if(str.length()==0){
		System.out.println(result);
		return;
		}
 for(int i=0;i<str.length();i++)
   {
	   char cc=str.charAt(i);
	   String ros=str.substring(0,i)+str.substring(i+1);
		   getPermu(ros,result+cc);
	 // String  
   }
	}
public static void printBoardPath(int current,int end,String result)
{
	if(current==end)
	{
		System.out.println();
		return;
	}
for(int i=1;i<=6;i++)
{
	printBoardPath(current+i,end,result+i);
}
}
//public static ArrayList<String> getBoardPath(int end,int current)
//{
//
//	return;
//}
}
