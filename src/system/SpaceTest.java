package system;

import org.junit.Before;
import org.junit.Test;
import system.FileSystem;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class SpaceTest {
    Space S ;
    Leaf L;
    Tree T;
    FileSystem FS;
    @Before
    public void SetS(){
        S=new Space(2);
        FS=new FileSystem(2);
    }

    @Test
    public void TestSpace(){
        assertEquals(S.countFreeSpace(),2);
    }
    @Test
    public void TestAlloc(){
        try {
            L=new Leaf("leaf",2);
            S.Alloc(2,L);
        } catch (OutOfSpaceException e) {
            e.printStackTrace();
        }
        assertEquals(L.allocations.length,2);
    }

        @Test
        public void TestDealloc(){
            try {
                T=new Tree("Tree1");
                L=new Leaf("leaf",2);
                L.parent=T;
                S.Alloc(2,L);
                S.Dealloc(L);
            } catch (OutOfSpaceException e) {
                e.printStackTrace();
            }
            assertTrue(!L.parent.children.containsKey("leaf"));
        }
}
