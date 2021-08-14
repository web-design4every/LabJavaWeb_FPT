package dal;

import context.DBContext;
import entity.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
    
/**
 *
 * @author HP
 */
public class NewsDAO {

    public News getNews(int id) throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            String query = "select * from digital where id = ?";
            conn = db.getConnection();
            st = conn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                String img = db.getImagePath() + rs.getString("image");
                News news = new News(rs.getInt("id"),
                        rs.getString("title"), rs.getString("description"), img,
                        rs.getString("author"), rs.getTimestamp("timepost"), rs.getString("shortDes"));
                return news;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                db.closeConnection(rs, st, conn);
            } catch (Exception e) {
                throw e;
            }
        }
        return null;
    }

    // get latest news
    public News getNews() throws Exception {
        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        String sql = "select top(1) * from digital where "
                + "timePost = (select max(timePost) from digital)";
        try {
            conn = new DBContext().getConnection();
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                String img = db.getImagePath() + rs.getString("image");
                News news = new News(rs.getInt("id"),
                        rs.getString("title"), rs.getString("description"), img,
                        rs.getString("author"), rs.getTimestamp("timepost"), rs.getString("shortDes"));
                return news;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                db.closeConnection(rs, st, conn);
            } catch (Exception e) {
                throw e;
            }
        }
        return null;
    }

    public ArrayList<News> getTopFiveLinkNews() throws Exception {

        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        ArrayList<News> list = new ArrayList<>();
        String sql = "select top 5 * from digital \n"
                + "where id not in (select top(1) id from digital where "
                + "timePost = (select max(timePost) from digital))\n"
                + "order by timePost desc";
        try {
            conn = new DBContext().getConnection();
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                String img = db.getImagePath() + rs.getString("image");
                News news = new News(rs.getInt("id"),
                        rs.getString("title"), rs.getString("description"), img,
                        rs.getString("author"), rs.getTimestamp("timepost"), rs.getString("shortDes"));
                list.add(news);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                db.closeConnection(rs, st, conn);
            } catch (Exception e) {
                throw e;
            }
        }
        return list;
    }

    // count total news when search
    public int count(String txt) throws Exception {

        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        String sql = "select count(*) from digital where title like ?";
        try {
            conn = new DBContext().getConnection();
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + txt + "%");
            rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                db.closeConnection(rs, st, conn);
            } catch (Exception e) {
                throw e;
            }
        }
        return 0;
    }

    //get list news in a page by search
    public ArrayList<News> search(String txt, int index, int numberNewsEachPage) throws Exception {

        DBContext db = new DBContext();
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        // range of news will get
        int stopIndexNews = index * numberNewsEachPage;
        int startIndexNews = stopIndexNews - (numberNewsEachPage - 1);

        ArrayList<News> list = new ArrayList<>();
        String sql = "select * from\n"
                + " (select ROW_NUMBER() over (order by id asc) as r, * \n"
                + " from digital where title like ?) as x \n"
                + " where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + txt + "%");
            st.setInt(2, startIndexNews);
            st.setInt(3, stopIndexNews);
            
            rs = st.executeQuery();
            while (rs.next()) {
                String img = db.getImagePath() + rs.getString("image");
                News news = new News(rs.getInt("id"),
                        rs.getString("title"), rs.getString("description"), img,
                        rs.getString("author"), rs.getTimestamp("timepost"),
                        rs.getString("shortDes"));
                list.add(news);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                db.closeConnection(rs, st, conn);
            } catch (Exception e) {
                throw e;
            }
        }
        return list;
    }
}
