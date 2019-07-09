package com.company.lab6.AnimalRescue.Person;

public class Kid extends Familly {
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


    public void learn() {
        System.out.println("Kids have to go to school many years.");
    }

    public void playGames(){
        System.out.println("Kids love to play all day long.");
    }

}
