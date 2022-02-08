import java.util.HashMap;

public class TestMap {
    public static void main(String[] args){
        Hashmatique hashTest = new Hashmatique();


        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Ain't no Sunshine When She's Gone", "She's always gone too long...");
        songMap.put("Asa Branca", "Cuando olhei a terra arrdendo");
        songMap.put("Happy", "Clap your hands if you feel like happiness is the truth");
        songMap.put("In the end", "I tried so hard and got so far");

        String testGetTracByTitle = hashTest.getTrackbytitle(songMap);
        System.out.println(testGetTracByTitle);

        hashTest.printNamesAndLyrics(songMap);
    }
}
