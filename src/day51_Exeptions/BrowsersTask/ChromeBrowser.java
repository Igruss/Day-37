package day51_Exeptions.BrowsersTask;
/*
create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser

 */
public class ChromeBrowser extends WebDriver{


    public void get(String url){
        System.out.println("Opening the "+url+"in chrome browser");

    }

    public void close(){
        System.out.println("closing the chrome browser");
    }





}
