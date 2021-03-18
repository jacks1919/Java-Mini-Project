//  Jack Sheridan
//  G00326495
//  ClientAccount
//  18-03-21

package ie.gmit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientAccount {

    private String title;
    private String name;
    private String id;
    private String phone;
    private String email;
    private int age;

    public ClientAccount(String title, String name, String id, String phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setEmail(email);
        setAge(age);
    }

    public void toSting() {
    }

    public void setTitle(String title) {
        if( (title == "Mr") || (title == "Mrs") || (title == "Ms") )
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid title");
        }
    }

    public String getTitle() {
        return title;
    }


    public String setName(String name) {
        if( name.length() > 2 )
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Invalid name");
        }

        return name;
    }

    public String getName() {
        return name;
    }


    public void setId(String id) {
        if( id.length() > 9 )
        {
            this.id = id;
        }
        else
        {
            throw new IllegalArgumentException("Invalid id");
        }
    }

    public String getId() {
        return id;
    }


    public void setPhone(String phone) {
        if( phone.length() > 10 )
        {
            this.phone = phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
//        String regex = "^(.+)@(.+)$";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        String entry = email.getEmail();
//
//        Matcher matcher = pattern.matcher(entry);
//        boolean matchFound = matcher.find();
//            if(matchFound)
//            {
//                this.email = email;
//            }
//            else
//            {
//                throw new IllegalArgumentException("Invalid email");
//            }
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        if( age > 16 )
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid age");
        }
    }


    @Override
    public String toString() {
        return super.toString() + " by " + title;
    }
}
