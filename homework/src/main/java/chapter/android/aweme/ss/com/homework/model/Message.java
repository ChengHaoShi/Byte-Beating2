package chapter.android.aweme.ss.com.homework.model;


import android.graphics.Bitmap;

/**
 * 消息  data class
 */
public class Message {

    public String title;
    public String time;
    public String description;
//    public Bitmap aIcon;

    public Message (String title, String description, String time) {
        this.title = title;
        this.description = description;
        this.time = time;
//        this.aIcon = aIcon;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Bitmap getaIcon() {
//        return aIcon;
//    }
//    public void setaIcon(Bitmap aIcon) {
//        this.aIcon = aIcon;
//    }

}
