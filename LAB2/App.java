package com.LAB2;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {

//   The Music app name is FireAir(class) music app which can perform following functions
//print all the array songs/music names one by one.
//Adds new songs/music.
//Deletes a song/music using the number.
//Searches song/music using a number or by the name.
//Update song/music (index, value)
       String[] music={"ABC","xyz","abc","XYZ"};
        FireAir playlist=new FireAir(music,music.length);
        playlist.printPlaylist();
        playlist.addNewSongs("Baba Black Sheep");
        playlist.printPlaylist();

        playlist.deleteSong(2);
        System.out.println("Song is deleted successfully.");
        playlist.printPlaylist();

        playlist.searchSongByName("ABC");

        playlist.addNewSongs("Twinkle Twinkle Little star");
        playlist.addNewSongs("BAby shark do do do do");
        playlist.addNewSongs("Old Mcdonald has an form EIEIO");
        playlist.printPlaylist();


        playlist.updateAMusic(5,"Let it go Let it");
        playlist.printPlaylist();

    }
}
class FireAir{
    String[] arrayMusic;
    int size;

    FireAir(String[] arrayMusic,int size){
        this.arrayMusic=arrayMusic;
        this.size=size;
    }

    public void printPlaylist(){
        for (int i = 0; i < size ; i++) {
            System.out.println("-> "+arrayMusic[i]);
        }
    }
public void addNewSongs(String musicName){
      String[] newArray=new String[size+1];
   System.arraycopy(arrayMusic,0,newArray,0,size);
   newArray[newArray.length-1]=musicName;
   arrayMusic=newArray;
    System.out.println("Music added...");
    size++;
}

public void deleteSong(int number){
    for (int i = 0; i <size-1; i++) {
        if (i==number || i>number){
            arrayMusic[i]=arrayMusic[i+1];
        }
    }
        size--;
}

public void searchSongByName(String musicName){

    for (int i = 0; i < size; i++) {
        if (musicName.equals(arrayMusic[i])){
            System.out.println("Music found....");
            return;
        }
        else {
            System.out.println("Music not found....");
        }
    }
}

public void updateAMusic(int index,String newMusic){

    for (int i = 0; i < size; i++) {

        if (index==i){
         arrayMusic[i]=newMusic;
            System.out.println("Music updated..");
         return;
        }
    }
}
}

