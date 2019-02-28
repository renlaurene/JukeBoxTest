package jukeBox;

import java.util.ArrayList;
import java.util.List;

public class Jukebox {
   Database db;
   int creditCard;
   public Jukebox(){
      
   }
   public Jukebox(Database db, int creditCard) {
      super();
      this.db = db;
      this.creditCard = creditCard;
   }   
   public Database getDb() {
      return db;
   }
   public void setDb(Database db) {
      this.db = db;
   }
   public int getCreditCard() {
      return creditCard;
   }
   public void setCreditCard(int creditCard) {
      this.creditCard = creditCard;
   }
   public boolean isValidCreditCard(){
      if(creditCard>0)
         return true;
      else
         return false;
   }
   void play(int i) {
         Song song=db.getSongList(i);
         song.play();
   }
   void play() {
      for (int index=0;index<db.getSongList().size();index++)
      {
         Song song=db.getSongList(index);
         trace("Currently Playing :"+song.getName());
         song.play();
      }
   }
   private void trace(String s){
      System.out.println(s);
   }
   
   
   //Driver
   public static void main(String[] args){
      Song song1=new Song("FengchuiMaiLang", "Jian Li", 
              "FengchuiMaiLang", "Geshou.mp3", "Mp3", 180);
      Song song2=new Song("Beijiaerhu", "Jian Li"",
              "Beijiaerhu", "Geshou2.mp3", "Mp3", 216);
      Song song3=new Song("Aiyoutainyi", "Jian Li", 
              "Aiyoutianyi", "D:/eclipse workspace/jukeBox/Beijiaerhu.mp3", "Mp3", 180);
      List<Song> tempSongList= new ArrayList<Song>();
      tempSongList.add(song1);
      tempSongList.add(song2);
      tempSongList.add(song3);
      
      Database tempDB= new Database(tempSongList);
      Jukebox j= new Jukebox(tempDB, -123);
      
      //Validation of Credit Card
      System.out.println("Validity of CC : "+j.isValidCreditCard());
      j.getDb().toString();

      System.out.println("\nDeleting Song @ index 2");
      //Deleting Song @ index 2
      j.getDb().removeSong(2);
      j.getDb().toString();
      
      System.out.println("Playing the SongList");
      j.play();
      
      System.out.println("Playing Song @ index 2");
      j.play(2);
   }   
}