class User {
    long id;
    String name;
    String email;
    String code;
    int age;
    String contactNum;

    public User(UserBuilder ub) {
        this.id = ub.id;
        this.name = ub.name;
        this.email = ub.email;
        this.code = ub.code;
        this.age = ub.age;
        this.contactNum = ub.contactNum;
    }


    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCode() {
        return code;
    }
    public int getAge() {
        return age;
    }
    public String getContactNum() {
        return contactNum;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    static class UserBuilder {
        long id;
        String name;
        String email;
        String code;
        int age;
        String contactNum;

        UserBuilder id(long id) {
            this.id = id;
            return this;
        }

        UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        UserBuilder code(String code) {
            this.code = code;
            return this;
        }

        UserBuilder contactNum(String contactNum) {
            this.contactNum = contactNum;
            return this;
        }
        UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }

    public String toString() {
        return "id -> " + this.id 
        + " name -> " + this.name 
        + " age -> " + this.age 
        + " email -> " + this.email 
        + " code -> " + this.code + "" 
        + " contact -> " + this.contactNum;
    }

}