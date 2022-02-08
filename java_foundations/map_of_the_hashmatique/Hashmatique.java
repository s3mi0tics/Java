import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    
    String  getTrackbytitle(HashMap<String, String> songMap){
        String track = songMap.get("Asa Branca");
        return track;
    }

    void printNamesAndLyrics(HashMap<String, String> songMap){
        Set<String> songs = songMap.keySet();
        for(String key : songs){
            System.out.println(key + ": " + songMap.get(key));

        }
    }

}