/******************************************************************************
*  Author : cal17b Carter Leslie
*  Class  : Spring 2020 CS374.01 Dr. Reeves
*  Date   : 5/6/2020
*  Task   : Version Control Branching
******************************************************************************/

public class GradeControl 
{
    public static void main( String[] args )
    {
    	//New major feature released!
        System.out.println( "This file is a file to show changes in the Version Control Branching assignment" );

        int grade = 59;

        if(grade > 90)
        	System.out.println("Success!");
        else
        {
        	System.out.println("Fail! Do some extra credit.")
        	grade += 5;
        }

        System.out.println("Your grade now is "+grade);
         System.out.println("More extra credit available!");
        grade += 3;
      
        if(grade > 90)
        	System.out.println("Success!");
        else
        	grade += 5;
    }
}
