/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Contact;
import entity.Galery;
import entity.Image;
import entity.Share;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GalleryDAO {

    public GalleryDAO() {
    }
    
    //get top 3 gallery
    public List<Galery> getTop3Gallery() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Galery> list = new ArrayList<>();
        try {
            String query = "SELECT top 3 * from Gallery";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Galery ga = new Galery();
                ga.setID(rs.getInt("ID"));
                ga.setTitle(rs.getString("tittle"));
                ga.setDescription(rs.getString("description"));
                ga.setName(rs.getString("name"));
                list.add(ga);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return list;
    }
    
    //get gallery by id
    public Galery getGalleryByID(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * from Gallery where ID = ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            while (rs.next()) {
                Galery ga = new Galery();
                ga.setID(rs.getInt("ID"));
                ga.setTitle(rs.getString("tittle"));
                ga.setDescription(rs.getString("description"));
                ga.setName(rs.getString("name"));
                return ga;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }
    
    //get contact
    public Contact getContact() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT top 1 * from Contact";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Contact contact = new Contact();
                contact.setTelephone(rs.getString("telephone"));
                contact.setEmail(rs.getString("email"));
                contact.setAbout(rs.getString("about"));
                contact.setAddress(rs.getString("address"));
                contact.setCity(rs.getString("city"));
                contact.setCountry(rs.getString("country"));
                contact.setImage_main(db.getImagePath()+rs.getString("image_main"));
                contact.setDescription(rs.getString("description"));
                return contact;
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }
    public List<Share> getShare() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        ArrayList<Share> list = new ArrayList<>();
        try {
            String query = "select * from Share";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Share share = new Share(db.getImagePath()+rs.getString("icon"),
                        rs.getString("socialNetwork"),
                        rs.getString("URL"));
                list.add(share);
            }
            return list;
        } catch (Exception e) {
           throw e;
        } finally {
            db.closeConnection(rs, ps, conn);
        }
    }
    
    // count number of galery

    public int count() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            String query = "SELECT count(*) from Gallery";
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
    
    // list gallery with paging
    public List<Galery> getListGalleryWithPaging(int pageIndex, int pageSize) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        int stopIndex = pageIndex*pageSize;
        int startIndex = stopIndex - (pageSize-1);
        List<Galery> list = new ArrayList<>();
        try {
            String query = "select * from ( select ROW_NUMBER() over (order by id ASC) as rn , * from  Gallery )"
                    + "as b where rn between ? and ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, startIndex);
            pr.setInt(2, stopIndex);
            rs = pr.executeQuery();
            while (rs.next()) {
                Galery galery = new Galery();
                galery.setID(rs.getInt("ID"));
                galery.setTitle(rs.getString("tittle"));
                galery.setDescription(rs.getString("description"));
                galery.setName(rs.getString("name"));
                list.add(galery);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return list;
    }
    
    //get first image of gallery by ID
    public String getImageByGalleryID(int id) throws Exception {
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
    
    public List<Image> getListImageWithPaging(int galeryID, int pageIndex, int pageSize) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Image> list = new ArrayList<>();
        int size = countImage(galeryID);
        int stopIndex = pageIndex*pageSize;
        int startIndex = stopIndex - (pageSize-1);
        try {
            String query = "select * from ( select ROW_NUMBER() over (order by id ASC) as rn , * from  image where gallery_id = ?) "
                    + "as b where rn between ? and ?";
            conn = db.getConnection();
            pr = conn.prepareStatement(query);
            pr.setInt(1, galeryID);
            pr.setInt(2, startIndex);
            pr.setInt(3, stopIndex);
            rs = pr.executeQuery();
            while (rs.next()) {
                Image image = new Image();
                image.setId(rs.getInt("ID"));
                image.setGalery_id(rs.getInt("gallery_id"));
                image.setImage_url(db.getImagePath()+rs.getString("image_url"));
                list.add(image);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return list;
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
                image.setGalery_id(rs.getInt("gallery_id"));
                image.setImage_url(db.getImagePath()+rs.getString("image_url"));
                return image;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pr, conn);
        }
        return null;
    }
}
