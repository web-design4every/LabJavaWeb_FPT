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
public class Share {

    private String url_image;
    private String content;

    public Share() {
    }

    public Share(String url_image, String content) {
        this.url_image = url_image;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl_image() throws Exception {
        DBContext db = new DBContext();
        return db.getImagePath() + url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

}
