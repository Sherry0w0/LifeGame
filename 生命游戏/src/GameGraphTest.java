import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameGraphTest
{
    private static GameGraph graph = new GameGraph();
    private static int[][] map_test = new int[graph.length][graph.length];
    private static int[][] newmap_test = new int[graph.length][graph.length];

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        graph.clear();
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    //@Test
    //public void testGameGraph() {

    //fail("Not yet implemented");
    //}

    //@Test
    //public void testPrintMap() {
    //fail("Not yet implemented");
    //}

    @Test
    public void testNextStatus()
    {
        int[][] newMap = new int[graph.length][graph.length];
        int[] step = new int[3];
        int i, j, newX, newY;
        for (i = 0; i < graph.length; i++)
            for (j = 0; j < graph.length; j++)
            {
                map_test[i][j] = 0;
                graph.map[i][j] = 0;
            }
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                graph.map[i][j] = 1;
        map_test[0][0] = 1;
        map_test[0][2] = 1;
        map_test[2][0] = 1;
        map_test[2][2] = 1;
        map_test[3][1] = 1;
        map_test[1][3] = 1;
        graph.nextStatus();
        for (i = 0; i < graph.length; i++)
        {
            for (j = 0; j < graph.length; j++)
            {
                if (graph.map[i][j] == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (i = 0; i < graph.length; i++)
        {
            for (j = 0; j < graph.length; j++)
            {
                if (map_test[i][j] == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        assertArrayEquals(map_test, graph.map);
    }


}
