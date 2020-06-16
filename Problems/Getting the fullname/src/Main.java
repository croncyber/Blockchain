class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName==null){
            firstName = "";
        }

        this.firstName = firstName.trim();        // write your code here
    }

    public void setLastName(String lastName) {
        if (lastName==null){
            lastName = "";
        }

        this.lastName = lastName.trim();

        // write your code here
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "Unknown";
        }


        if (firstName.isEmpty()){
            return lastName;

        }

        if (lastName.isEmpty()){
            return firstName;

        }


        return String.format("%s %s", this.firstName, this.lastName);

        // write your code here
    }
}