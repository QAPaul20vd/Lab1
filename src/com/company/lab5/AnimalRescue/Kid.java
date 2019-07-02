package com.company.lab5.AnimalRescue;

public class Kid extends Person {
    private String favGame;
    private String favActivity;
    private boolean activeKid;

    public String getFavGame() {
        return favGame;
    }

    public void setFavGame(String favGame) {
        this.favGame = favGame;
    }

    public String getFavActivity() {
        return favActivity;
    }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }

    public boolean isActiveKid() {
        return activeKid;
    }

    public void setActiveKid(boolean activeKid) {
        this.activeKid = activeKid;
    }

    public void playGames(){
        System.out.println("Kids love to play all day long.");
    }


}
