import java.util.Scanner;

public class MagicSquareApp 
{
    public static void main(String[] args) {
    	
        char[][] magicSquare = {
        						{'P', 'R', 'E', 'Y'},
        						{'L', 'A', 'V', 'A'},
        						{'O', 'V', 'E', 'R'},
        						{'T', 'E', 'N', 'D'}
        					};
        
        displaySquare(magicSquare);
        displayRow(magicSquare, 2);
        displayColumn(magicSquare, 4);
    }
    
    static void displaySquare ( char[][] arrayIn )
    {
        for (int row = 0; row < arrayIn.length; row++)
        {
            for (int col = 0; col < arrayIn[0].length; col++)
            { 
                System.out.print(arrayIn[row][col]);
            }
            System.out.println();
        }
    } 
    
    static void displayRow (char[][] arrayIn, int rowIn)
    {
        for (int col = 0; col < arrayIn[0].length; col++)
        	{
                System.out.print(arrayIn[rowIn - 1][col]);
        	}   
        	System.out.println();
         }
    
    
    static void displayColumn (char[][] arrayIn, int colIn)
    {
        for (int row = 0; row < arrayIn[0].length; row++)
            {
                System.out.println(arrayIn[row][colIn - 1]);
            }
        }
    } 