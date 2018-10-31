public class GameGraph
{
    GameGraph()
    {
        initMap();
    }

    public final int length = 40;
    public int[][] map = new int[length][length];
    public static int randSize = 800;
    
    protected void clear()
    {
    	for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
                map[i][j] = 0;
        }
    }


    protected void initMap()
    {
    	int i,j;
        for (i = 0; i < length; i++)
        {
            for (j = 0; j < length; j++)
                map[i][j] = 0;
        }
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        		
        		map[i][j]=1;
        }
        //map[0][0]=0;
       // for (int i = 0; i < randSize; i++)
        //{
          //  int x = (int) (Math.random() * length );
            //int y = (int) (Math.random() * length );
            //map[x][y] = 1;
        //}
        
    }

    public void printMap()
    {
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (map[i][j] == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.print("\n");
        }
    }

    public void nextStatus()
    {
        int[] step = new int[3];
        int newX,newY;
        step[0] = 0;
        step[1] = 1;
        step[2] = -1;
        int[][] newMap = new int[length][length];
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                int count = 0;
                for (int m = 0; m < 3; m++)
                {
                    for (int n = 0; n < 3; n++)
                    {
                        if(i==0&&m==2||i==length-1&&m==1)
                        	break;
                        if(j==0&&n==2||j==length-1&&n==1)
                        	break;
                        if(m==0&&n==0)
                        	continue;
                        newX=i+step[m];   
                    	newY = j + step[n];
                        if (map[newX][newY] == 1)
                            count++;
                       
                    }
                }
                if (count == 3)
                {
                    newMap[i][j] = 1;
                }
                else if (count == 2)
                {
                    continue;
                }
                else
                {
                    newMap[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                map[i][j] = newMap[i][j];
            }
        }
    }

  
}
