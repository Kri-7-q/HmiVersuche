package Domain;


import Annotations.ColumnNameList;

import java.util.Random;

/**
 * Takes data to a person.
 */
@ColumnNameList(captionList = {"Name:name", "Vorname:forename", "Alter:age", "Mail:mail"})
public class Person {

    static public final String[] properties = {"Name:name", "Vorname:forename", "Alter:age", "Mail:mail"};
    static private final String[] nameList = {"Meier", "Kunz", "Humbold", "Geier", "Horstkam", "Frankener"};
    static private final String[] forenameList = {"Thomas", "Horst", "Maja", "Martin", "Betty", "Fred", "Sandra", "Laura"};
    static private final String[] domainList = {"gmx.de", "hotmail.de", "yahoo.de", "arcor.com", "t-online.de"};

    private String name;
    private String forename;
    private int age;
    private String mail;

    // Constructor
    public Person(String name, String forename, int age, String mail) {
        this.name = name;
        this.forename = forename;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // Static
    // Generates a random Person object.
    static public Person randomObject(Random rnd) {
        String name = nameList[rnd.nextInt(nameList.length)];
        String forename = forenameList[rnd.nextInt(forenameList.length)];
        int age = rnd.nextInt(110) + 1;
        String mail = forename.toLowerCase() + '.' + name.toLowerCase() + "@" + domainList[rnd.nextInt(domainList.length)];

        return new Person(name, forename, age, mail);
    }

}
