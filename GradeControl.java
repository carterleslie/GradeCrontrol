/******************************************************************************
*  Author : cal17b Carter Leslie
*  Class  : Spring 2020 CS374.01 Dr. Reeves
*  Date   : 5/6/2020
*  Task   : Version Control Branching
*
******************************************************************************/

public class GradeControl 
{
    public static void main( String[] args )
    {
        System.out.println( "This file is a file to show changes in the Version Control Branching assignment" );

        int grade = 60;

        if(grade > 90)
        	System.out.println("Success!");
        else if(grade < 60)
        {
        	System.out.println("You are failing!");
        	grade += 5;
        }
        else if (grade < 80)
        {
        	System.out.println("Your grade is a C");
        	grade += 7;
        }
        else if (grade < 90)
        {
        	System.out.println("you grade is a B");
        }
    }
}
