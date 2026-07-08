import java.util.*;

 class music{
     String songname;
     String artist;
     String duration;

     music(String songname,String artist,String duration){

         this.songname = songname;
         this.artist = artist;
         this.duration = duration;

     }

     public String toString(){

         return "SONG NAME: " + songname + "|SONG ARTIST: " + artist + "|SONG DURATION: " + duration;

     }
 }

    class musicplaylist{

           LinkedList<music> store = new LinkedList<>();

           void addmusic (music songname ){
               store.add(songname);
           }

           void displayPlaylist() {

               if (store.isEmpty()) {
                   System.out.println("\nPlaylist not Found!");
               } else {

                   System.out.println("\nPlaylist Founded:");

                   for (music i : store) {

                       System.out.println(i);
                   }
               }
           }

           void searchsong(String songname){

               for(music i : store){
                   if(i.songname.equals(songname)){
                       System.out.println("\nSong Founded! " + i);
                       return;
                   }
               }
               System.out.println("\n Song Not Founded");
           }

           void removesong(String songname){

             Iterator<music> loop = store.iterator();

             while(loop.hasNext()){

                 music i = loop.next();

                 if(i.songname.equals(songname)){
                     loop.remove();
                     System.out.println("\nSuccessfully Removed: " + i);
                     return;
                 }
             }
             System.out.println("\nNot Removed: ");
    }

    void playFirstSong(){

               if(store.isEmpty()){
                   System.out.println("\nNo Playlist Found");
               }else{
                    System.out.println("\nPlaylist Found: " + store.getFirst());
           }
    }

    void playLastSong(){

             if(store.isEmpty()){
                 System.out.println("\nNo Playlist Found");
             }else{
                 System.out.println("\nPlaylist Found: " + store.getLast());
             }
           }

           void totalsong(){

               System.out.println("\nNumber of the Song in the Playlist: " + store.size() );

           }

           void checkPlaylistEmpty(){

               if(store.isEmpty()){
                   System.out.println("\nPlaylist is Empty");
               }else{
                   System.out.println("\nPlaylist is not Empty");
               }
           }

           void sortsong(){

              Collections.sort(store,new Comparator<music>(){

                  public int compare(music s1 , music s2){

                      return s1.songname.compareTo(s2.songname);
                  }
              });

              System.out.println("\nPlaylist Sorted by Name");

              for(music i : store){

                  System.out.println(i);

              }
           }
    }


public class Test111 {
    public static void main(String[] args){

        musicplaylist s = new musicplaylist();

        s.addmusic(new music("Believer","by Imagein Dragon","3.5 min"));
        s.addmusic(new music("Shape of You","by LoverBoy","2.8 min"));
        s.addmusic(new music("Faided","by HeartBrokeBoy","4.0 min"));
        s.addmusic(new music("Perfect","by your","4.5 min"));

        s.sortsong();

        s.checkPlaylistEmpty();

        s.displayPlaylist();

        s.playFirstSong();

        s.playLastSong();

        s.removesong("Perfect");

        s.searchsong("Perfect");

        s.searchsong("Believer");

        s.totalsong();


    }
}
