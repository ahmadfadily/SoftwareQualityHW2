package system;

import org.junit.Before;
import org.junit.Test;
import system.FileSystem;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class NodeTest {
//    public FileSystem FS=new FileSystem(4);

//    @Before
    public Node N;
    public Space s= new Space(2);

    {
        try {
            N = new Leaf("leaf1",2);
        } catch (OutOfSpaceException e) {
            System.out.println("we are here");
//            e.printStackTrace();
        }
    }

    @Test
    public void TestNodeName(){
        assertEquals(N.name,"leaf1");
    }
}
