package csa0981;
import java.util.*;
public class grade{
    public static void main(String[] args){
        Scanner aa = new Scanner(System.in);
        System.out.println("enter the no of subjects");
        int nos = aa.nextInt();
        int marks[]=new int[nos];
        int Totalmarks=0;
        for(int i=0;i<nos;i++)
        {
            System.out.println("enter marks of a subject"+(i+1)+":");
            marks[i]=aa.nextInt();
            if(marks[i]<0||marks[i]>100)
            {
                System.out.println("marks should be between 0 and 100.please enter again");
            }
            Totalmarks=Totalmarks+marks[i];
        }
        System.out.println("TotalMarks"+Totalmarks);
    int AveragePercentage=Totalmarks/nos;
    System.out.println("averagepercentage"+AveragePercentage);
    if(AveragePercentage>90)
		{
			System.out.println("A grade");
		}
		else if(AveragePercentage>80 & AveragePercentage<=90)
		{
			System.out.println("B grade");
		}
		else if(AveragePercentage>70 & AveragePercentage<=80)
		{
			System.out.println("C grade");
		}
		else if(AveragePercentage>60 & AveragePercentage<=70)
		{
			System.out.println("D grade");
		}
		else if(AveragePercentage>50 & AveragePercentage<=60)
		{
			System.out.println("E grade");
		}
		else
		{
			System.out.println("fail");
		}
    }
		
		
}