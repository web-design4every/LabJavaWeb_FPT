/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import context.DBContext;

/**
 *
 * @author hungn
 */
public class Homepage {

    private String image_url;
    private String description;
    private String about;
    private String aboutDetail;

    public Homepage() {
    }

    public Homepage(String image_url, String description, String about, String aboutDetail) {
        this.image_url = image_url;
        this.description = description;
        this.about = about;
        this.aboutDetail = aboutDetail;
    }

    public String getImage_url() throws Exception {
        DBContext db = new DBContext();
        return db.getImagePath() + image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAboutDetail() {
        return aboutDetail;
    }

    public void setAboutDetail(String aboutDetail) {
        this.aboutDetail = aboutDetail;
    }

}
