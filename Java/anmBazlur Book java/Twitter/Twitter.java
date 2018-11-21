package Twitter;
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdullah
 */
public class Twitter {
     private String text;
     private String Name;
     private LocalDateTime localtime;

    public Twitter(String text, String Name) {
        this.text = text;
        this.Name = Name;
        this.localtime =LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return Name;
    }

    public LocalDateTime getLocaltime() {
        return localtime;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLocaltime(LocalDateTime localtime) {
        this.localtime = localtime;
    }
    
    @Override
    public String toString() {
    return text+" by "+Name+" on "+localtime.toString()+" ";
}
      
}
