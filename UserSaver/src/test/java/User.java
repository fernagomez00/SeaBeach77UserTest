/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jose
 */
public enum User {

    USER1("Fernando", "Gomez", "Fgomez00", "1191108"),
    USER2("John", "Doe", "johndoe", "password123"),
    USER3("Alice", "Smith", "alicesmith", "qwerty"),
    USER4("Bob", "Johnson", "bobjohnson", "letmein"),
    USER5("Eva", "Jones", "evajones", "123456"),
    USER6("David", "Brown", "davidbrown", "secret"),
    USER7("Emily", "White", "emilywhite", "admin123"),
    USER8("Frank", "Miller", "frankmiller", "ilovecoding"),
    USER9("Grace", "Moore", "gracemoore", "java123"),
    USER10("Henry", "Clark", "henryclark", "mypassword"),
    USER11("Isabel", "Baker", "isabelbaker", "secure123"),
    USER12("Jack", "Taylor", "jacktaylor", "webdev"),
    USER13("Karen", "Cooper", "karenc", "p@ssw0rd"),
    USER14("Leo", "Adams", "leoadams", "apple123"),
    USER15("Mia", "Carter", "miacarter", "codingisfun"),
    USER16("Nathan", "Evans", "nathanevans", "hello123"),
    USER17("Olivia", "Fisher", "oliviafisher", "webdesign"),
    USER18("Paul", "Gray", "paulgray", "myp@ss"),
    USER19("Quinn", "Harris", "quinnharris", "letsgo"),
    USER20("Ryan", "Ingram", "ryaningram", "guitar123"),
    USER21("Samantha", "Jordan", "samanthaj", "myp@ssword"),
    USER22("Tom", "Keller", "tomkeller", "python123"),
    USER23("Ursula", "Lopez", "ursulalopez", "codingrocks"),
    USER24("Vincent", "Mills", "vincentmills", "java456"),
    USER25("Wendy", "Nelson", "wendynelson", "letmein456");
    
    String firstname;
    String lastname; 
    String username;
    String password;
    
    User(String firstname, String lastname, String username, String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }
    
    @Override
    public String toString(){
        return this.firstname + " " + this.lastname + " " + this.username + " " + this.password;
    }
}
