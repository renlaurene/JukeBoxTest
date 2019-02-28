package unitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Database;
import jukeBox.Jukebox;
import jukeBox.Song;

import static org.junit.Assert.*;

public class JukeBoxTest {
    private Jukebox testJB;
    private Database db;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=123;
    
    public JukeBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      song1 = new Song("Storyteller", "XiaoHun Alex", 
              "Storyteller", "Shuoshuren.mp3", "Mp3", 180);
      song2 = new Song("Uncommon words", "Alex", 
              "Uncommon words", "Shenpizi.mp3", "Mp3", 216);
      
      songListJB = new java.util.ArrayList();
      
      songListJB.add(song1);
      songListJB.add(song2);
      
      db = new Database(songListJB);
        
      testJB = new Jukebox(db,ccn);
    }
    
    @After
    public void tearDown() {
        testJB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIsValidCreditCard() {
       assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
}