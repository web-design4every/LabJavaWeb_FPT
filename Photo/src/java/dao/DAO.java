/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Gallery;
import entity.Contact;
import entity.Homepage;
import entity.Image;
import entity.Share;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungn
 */
public class DAO {

    public Contact getContact() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            String query = "SELECT  * from contact";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Contact contact = new Contact();
                contact.setTelephone(rs.getString("telephone"));
                contact.setEmail(rs.getString("email"));
                contact.setAddress(rs.getString("address"));
                contact.setCity(rs.getString("city"));
                contact.setCountry(rs.getString("country"));
                return contact;
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }

    public Homepage getHomepage() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * from homepage";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Homepage homepage = new Homepage();
                homepage.setImage_url(rs.getString("image_url"));
                homepage.setDescription(rs.getString("description"));
                homepage.setAbout(rs.getString("about"));
                homepage.setAboutDetail(rs.getString("aboutDetail"));
                return homepage;
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }

    public Gallery getGalleryByID(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * from gallery where ID = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            while (rs.next()) {
                Gallery gallery = new Gallery();
                gallery.setID(rs.getInt("ID"));
                gallery.setTitle(rs.getString("title"));
                gallery.setDescription(rs.getString("description"));
                gallery.setName(rs.getString("name"));
                return gallery;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }

    public List<Share> getShare() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Share> listShare = new ArrayList<>();
        try {
            String query = "SELECT  * from share";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Share share = new Share();
                share.setUrl_image(rs.getString("url_image"));
                share.setContent(rs.getString("content"));
                listShare.add(share);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return listShare;
    }

    
     public List<Gallery> getGalleryByPage(int pagesize, int index) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Gallery> listGalery = new ArrayList<>();
        try {
            String query =  "SELECT * from gallery "
                    + "order by id OFFSET ? rows "
                    + "fetch first ? rows only";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, (index - 1) * pagesize);
            pr.setInt(2, pagesize);
            rs = pr.executeQuery();
            while (rs.next()) {
                Gallery galery = new Gallery();
                galery.setID(rs.getInt("ID"));
                galery.setTitle(rs.getString("title"));
                galery.setDescription(rs.getString("description"));
                galery.setName(rs.getString("name"));
                listGalery.add(galery);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return listGalery;
    }
     
    public List<Gallery> getGallery() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Gallery> listGalery = new ArrayList<>();
        try {
            String query = "SELECT top 3 * from gallery";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            
            rs = pr.executeQuery();
            while (rs.next()) {
                Gallery galery = new Gallery();
                galery.setID(rs.getInt("ID"));
                galery.setTitle(rs.getString("title"));
                galery.setDescription(rs.getString("description"));
                galery.setName(rs.getString("name"));
                listGalery.add(galery);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return listGalery;
    }

  
    
    public List<Image> getImageByGalleryID(int id, int pagesize, int index) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Image> image = new ArrayList<>();
        try {
            String query = "SELECT * from image where gallery_id = ? "
                    + "order by gallery_id OFFSET ? rows "
                    + "fetch first ? rows only";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.setInt(2, (index - 1) * pagesize);
            pr.setInt(3, pagesize);
            rs = pr.executeQuery();
            while (rs.next()) {
                Image img = new Image();
                img.setId(rs.getInt("id"));
                img.setImage_url(rs.getString("image_url"));
                img.setGallery_id(rs.getInt("gallery_id"));
                image.add(img);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return image;
    }

    public Image getImageID(int id, int galleryId) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * from image where id = ? and gallery_id = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.setInt(2, galleryId);
            rs = pr.executeQuery();
            while (rs.next()) {
                Image image = new Image();
                image.setId(rs.getInt("id"));
                image.setGallery_id(rs.getInt("gallery_id"));
                image.setImage_url(rs.getString("image_url"));
                return image;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }
    
    public boolean checkImageExist(int id, int galleryId) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * from image where id = ? and gallery_id = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.setInt(2, galleryId);
            rs = pr.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return false;
    }

    public String getFirstImageByGalleryID(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "select top 1 image_url from image\n"
                    + "where gallery_id = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            while (rs.next()) {
                return db.getImagePath() + rs.getString(1);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }

    public int getFirstImageID(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        int imgID = 0;
        try {
            String query = "SELECT top 1 id from image where gallery_id = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            while (rs.next()) {
                imgID = rs.getInt(1);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return imgID;
    }

    public int countGallery() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT count(*) from gallery";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            int count = 0;
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
    }

    public int countImage(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "select count(image_url) from image where gallery_id = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            int count = 0;
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
    }
}
