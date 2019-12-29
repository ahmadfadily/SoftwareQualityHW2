package system;

import org.junit.Before;
import org.junit.Test;
import system.FileSystem;

import java.io.File;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class FileSystemTest {
    public FileSystem FS = new FileSystem(10);
    public Space s= new Space(2);
    public String[] named1 = {"root", "dir1"};
    public String[] named2 = {"root", "dir2","dir3","dir4","dir5"};
    public String[] rootname = {"root"};
    @Before
    public void BeforeTest(){
    }

    //Tests the names of the FileSystem
    @Test
    public void TestFileSystemName(){
        TestTree T = new TestTree();
        T.s="q";
        assertTrue(T.StubTestTreeName());
    }

    //Tests the size of the FileSystem
    @Test
    public void TestFileSystemSpace(){
        assertEquals(10,FS.fileStorage.countFreeSpace());
    }

    @Test
    public void TestDir(){

    }

    @Test
    public void Testlsdir(){
        try {
            FS.dir(named1);
        } catch (BadFileNameException e) {
            //do nothing baby
        }
            String [] d1=FS.lsdir(rootname);
            assertEquals("dir1",d1[0]);

        FileSystem FS1 = new FileSystem(10);
        try {
            FS1.dir(named2);
        } catch (BadFileNameException e) {
            //do nothing baby
        }
        d1=FS1.lsdir(rootname);
        assertEquals("dir2",d1[0]);
    }

}
