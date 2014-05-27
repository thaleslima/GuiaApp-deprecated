package br.net.guiaapp.model;

import java.util.Date;

/**
 * Created by thaleslima on 09/03/14.
 */
public class Local {
    public int Id;
    public String Name;
    public String Telephone;
    public String Site;
    public String Email;
    public String Description;
    public String Address;
    public String Latitude;
    public String Longitude;
    public String PathImage;
    public Date Date;
    public int IdMenu;
    public int IdCity;
    public float Rating;

    public Local(int Id, String Name, float Rating) {
        this.Id = Id;
        this.Name = Name;
        this.Rating = Rating;
    }
}

