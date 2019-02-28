package unitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Database;
import jukeBox.Song;

import static org.junit.Assert.*;

/**
 *
 * @author Lauren
 */
public class DatabaseTest {
   private java.util.List songList;
   private Song testSong1,testSong2;
   private Database testDB;
   
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        songList =  new java.util.ArrayList();
        
        testSong1 = new Song("FengchuiMaiLang", "Jian Li", 
                "FengchuiMaiLang", "Geshou.mp3", "Mp3", 180);
        testSong1 = new Song("Beijiaerhu", "Jian Li"",
                "Beijiaerhu", "Geshou2.mp3", "Mp3", 216);
        
        songList.add(testSong1);
        songList.add(testSong2);
        
        testDB = new Database(songList);
    }
    
    @After
    public void tearDown() {
        songList = null;
        testDB = null;
    }

     @Test
     public void testSongList() {
     
       assertEquals("SongList if empty should have 0 elements",false,songList.isEmpty());
     }
}
