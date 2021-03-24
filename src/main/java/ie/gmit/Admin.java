//  Jack Sheridan
//  G00326495
//  AdminAccount
//  18-03-21


package ie.gmit;

public class Admin {
    private String title;
    private String name;
    private String id;
    private String phone;
//tes
    public Admin(/*String title*/ String name, String id, String phone) {
       // setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);

    }
    public void toSting() {
    }

//    public void setTitle(String title) {
//        if( (title == "Mr") || (title == "Mrs") || (title == "Ms") )
//        {
//            this.title = title;
//        }
//        else
//        {
//            throw new IllegalArgumentException("Invalid title");
//        }
//    }
//
//    public String getTitle() {
//        return title;
//    }


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



}
