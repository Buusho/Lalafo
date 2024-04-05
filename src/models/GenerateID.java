package models;

public class GenerateID {

    public  static Long user=0L;
    public  static Long favorite=0L;
    public  static Long announcement=0L;


    public  static  long genUserId(){return ++user;}
    public  static  long genFavoriteId(){return ++favorite;}
    public  static  long genAnnouncementId(){return ++announcement;}


}
