package system;

import org.junit.Before;
import org.junit.Test;
import system.FileSystem;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class LeafTest {
//    public FileSystem FS=new FileSystem(4);

    //    @Before
    public Node N;
    public Leaf L;



    public Space s= new Space(2);

    @Test
    public void TestAllocate()
    {
        {
            try {
                L = new Leaf("L1",2);
            } catch (OutOfSpaceException e) {
                e.printStackTrace();
            }
        }
    }
}
