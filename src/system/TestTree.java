package system;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTree {
    public static String s;
    public Tree T ;

    public boolean StubTestTreeName(){
        T=new Tree(s);
        return T.name.equals(s);
    }
    @Before
    public void SetS(){
        s="s";
    }

    @Test
    public void TestTreeName(){
        assertTrue(StubTestTreeName());
    }

    @Test
    public void TestGetPath(){
        T=new Tree(s);
        String str="dir1";
        HashMap<String,Node> HM =new HashMap<String,Node>();
        try {
            Node N= new Leaf(str,10);
            HM.put(str,N);
            T.children= HM;
        } catch (OutOfSpaceException e) {
            //do nothing
        }
    }

}
