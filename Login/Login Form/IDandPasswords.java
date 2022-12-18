import java.util.HashMap;

public class IDandPasswords {
    //Use HashMap to store credentials
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    //Create a constructor to hold data with the HashMap
    IDandPasswords(){
        loginInfo.put("Lunodzo", "password");
        loginInfo.put("Lydia", "password");
        loginInfo.put("Steve", "password");
        loginInfo.put("Martin", "password");
    }

    /*Now create a method to get the login data
    A method of type HAshMap is used to allow it to return login credentials when it is called.

    We use protected access specifier since we do not want just anyone to be able to access credential. 
    Usually login credentials are confidential
    */
    protected HashMap<String, String> getLoginInfo(){
        return loginInfo;
    }

}
