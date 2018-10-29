import java.util.Arrays;

/**
 * Created by puranisu on 3/14/2016.
 */
public class TopToBottom
{
    /*

    A robot is located in the upper-left corner of a 4×4 grid.
    The robot can move either up, down, left, or right, but cannot go to the same location twice.
    The robot is trying to reach the lower-right corner of the grid.
    Your task is to find out the number of unique ways to reach the destination.
     */
    static  int count = 0;
    //static  int valueMAtrix[][];

    public static void main(String[] args)
    {
        int[][] matrix  ;
        /*int[] stack;
        stack = new int[200];
        int stack_length = 0;
*/
        matrix = new int[4][4];
  //      valueMAtrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            Arrays.fill(matrix[i],0);
        }
    /*    for (int i = 0; i < 16; i++) {
            valueMAtrix[i/4][i%4] = i;
        }
    */    fill(0,0,matrix );
        System.out.println("result = "+count);

    }
    public static  void  fill(int currentRow , int currentColumn , int fillMatrix[][] )
    {
        fillMatrix[currentRow][currentColumn] = 1;
        if(currentColumn == 3 && currentRow ==3)
        {
            count ++;
            return;
        }
        else
        {
            if(currentColumn !=3 && currentColumn !=0)
            {
                if(currentRow !=3 && currentRow !=0)
                {
                    if(fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix );
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow-1,currentColumn , fillMatrix);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                }
                if(currentRow ==3)
                {
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                    if(fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow-1,currentColumn , fillMatrix);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                }
                if(currentRow ==0)
                {
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                    if(fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                }
            }
            else
            {
                if (currentColumn == 3)
                {
                    if( (currentRow <3) && fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if((currentRow >0) &&fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow -1 ,currentColumn , fillMatrix);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                }

                if (currentColumn == 0)
                {
                    if( (currentRow <3) && fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if((currentRow >0) &&fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow -1 ,currentColumn , fillMatrix);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn +1, fillMatrix);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                }
            }
            return;
        }
    }

    /*public static  void  fill(int currentRow , int currentColumn , int fillMatrix[][] , int stack[] , int length )
    {
        *//*System.out.print(currentRow + " , " + currentColumn + " = ");
        System.out.print(valueMAtrix[currentRow][currentColumn] + "\n");
        *//*
        stack[length+1] = valueMAtrix[currentRow][currentColumn];
        length++;
        fillMatrix[currentRow][currentColumn] = 1;
        if(currentColumn == 3 && currentRow ==3)
        {
            System.out.println("ROUTES ");
            for (int i = 0; i <= length; i++)
            {
                System.out.print(stack[i]+" - ");
            }
            System.out.println();
            count ++;
            return;
        }
        else
        {
            if(currentColumn !=3 && currentColumn !=0)
            {
                if(currentRow !=3 && currentRow !=0)
                {
                    if(fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix ,stack, length);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow-1,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                }
                if(currentRow ==3)
                {
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                    if(fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow-1,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                }
                if(currentRow ==0)
                {
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn+1 , fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                    if(fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                }
            }
            else
            {
                if (currentColumn == 3)
                {
                    if( (currentRow <3) && fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if((currentRow >0) &&fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow -1 ,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn-1] != 1)
                    {
                        fill(currentRow,currentColumn -1, fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn-1] = 0;
                    }
                }

                if (currentColumn == 0)
                {
                    if( (currentRow <3) && fillMatrix[currentRow+1][currentColumn] != 1)
                    {
                        fill(currentRow+1,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow+1][currentColumn] = 0;
                    }
                    if((currentRow >0) &&fillMatrix[currentRow-1][currentColumn] != 1)
                    {
                        fill(currentRow -1 ,currentColumn , fillMatrix,stack, length);
                        fillMatrix[currentRow-1][currentColumn] = 0;
                    }
                    if(fillMatrix[currentRow][currentColumn+1] != 1)
                    {
                        fill(currentRow,currentColumn +1, fillMatrix,stack, length);
                        fillMatrix[currentRow][currentColumn+1] = 0;
                    }
                }
            }
            return;
        }
    }
*/
}
