package com.example.glossarywitcher;

public class Hero {

    private String heroName;
    private String heroDescription;
    private int heroResource;

    public Hero(String heroName, String heroDescription, int heroResource) {
        this.heroName = heroName;
        this.heroDescription = heroDescription;
        this.heroResource = heroResource;
    }



    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDescription() {
        return heroDescription;
    }

    public void setHeroDescription(String heroDescription) {
        this.heroDescription = heroDescription;
    }

    public int getHeroResource() {
        return heroResource;
    }

    public void setHeroResource(int heroResource) {
        this.heroResource = heroResource;
    }
}
