package unitTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Song;

import static org.junit.Assert.*;

public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testSong1 = new Song("FengchuiMaiLang", "Jian Li", 
                "FengchuiMaiLang", "Geshou.mp3", "Mp3", 180);
        testSong2 = new Song("Beijiaerhu", "Jian Li"",
                "Beijiaerhu", "Geshou2.mp3", "Mp3", 216);
    }
    
    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

     @Test
     public void testIsLong1() {
       assertEquals("Song is long if length is more than 150",true,testSong1.isLong());
     }
     @Test
     public void testIsLong2() {
       assertEquals("Song is long if length is more than 150",true,testSong2.isLong());
     }
}
