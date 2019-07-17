package com.company.lab7.App;

public class Login {

    private String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Login(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public int hashCode(){
        final int temp = 22;
        int result = 1;
        result = temp * result + password;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Login other = (Login) obj;
        if (password != other.password)
            return false;
        return true;
    }


}
