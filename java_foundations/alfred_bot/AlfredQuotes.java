import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + " lovely to see you.";
    }
   
    // ninja bonus
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return dayPeriod + name + " lovely to see you.";
    }
    
    // sensei bonus
    public String guestGreeting() {
        // YOUR CODE HERE
        String pattern = "k";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        int hour = Integer.parseInt(simpleDateFormat.format(new Date()));
        if(hour < 12){
            return ("Top of the mornin' to ya ");
        }else if(12 <= hour && hour <=17){
            return "Good Afternoon mate!";
        }
        else if(17 < hour && hour <= 24){
            return "Good Evening";
        }
        else{
            return "What time is it and what planet are we on?";
        }
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis")> -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } 
        else if(conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire." ;
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

