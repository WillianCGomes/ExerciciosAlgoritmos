package br.com.foursys.locadora.util;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ThemeService implements Serializable {

    private Map<String, String> themes;
    private String theme;
    private GuestPreferences gp = new GuestPreferences();

    public void setGp(GuestPreferences gp) {
        this.gp = gp;
    }

    public Map<String, String> getThemes() {
        return themes;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    /** Creates a new instance of ThemeSwitcherMB */
    public ThemeService() {

        theme = gp.getTheme();
        gp.setTheme("blitzer");

        themes = new TreeMap<String, String>();
        themes.put("Aristo", "aristo");
        themes.put("Tema: Adamantium Padrão", "adamantium");
        themes.put("Afterdark", "afterdark");
        themes.put("Afternoon", "afternoon");
        themes.put("AfterWork", "afterwork");
        themes.put("Black-tie", "black-tie");
        themes.put("Blitzer", "blitzer");
        themes.put("BlueSky", "bluesky");
        themes.put("Casa Blanca", "casablanca");
        themes.put("Cruze", "cruze");
        themes.put("Cupertino", "cupertino");
        themes.put("Dark Hive", "dark-hive");
        themes.put("Dot-luv", "dot-luv");
        themes.put("Egg Plant", "eggplant");
        themes.put("Excite Bike", "excite-bike");
        themes.put("Glass X", "glass-x");
        themes.put("Home", "home");
        themes.put("Hot Sneaks", "hot-sneaks");
        themes.put("Humanity", "humanity");
        themes.put("Midnight", "midnight");
        themes.put("Mint Choc", "mint-choc");
        themes.put("Pepper Grinder", "pepper-grinder");
        themes.put("Redmond", "redmond");
        themes.put("Rocket", "rocket");
        themes.put("Sam", "sam");
        themes.put("Smoothness", "smoothness");
        themes.put("South Street", "south-street");
        themes.put("Start", "start");
        themes.put("Sunny", "sunny");
        themes.put("Swanky Purse", "swanky-purse");
        themes.put("Trontastic", "trontastic");
        themes.put("Twitter Bootstrap", "twitter bootstrap");
        themes.put("UI Darkness", "ui-darkness");
        themes.put("Trontastic", "trontastic");
        themes.put("UI-Lightness", "ui-lightness");
        themes.put("Vader", "vader");
        
    }

    public void saveTheme() {
        System.out.println("theme: " + theme);
        gp.setTheme(theme);
    }
}