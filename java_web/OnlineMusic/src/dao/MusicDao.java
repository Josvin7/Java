package dao;

import entity.Music;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-dao-MusicDao
 * date: 2020/7/23 23:24
 */
public class MusicDao {
    // 查询全部歌单
    public List<Music> findMusic() {
        List<Music> musics = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            connection = DBUtils.getConnection();
            String sql = "select * from music";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Music music = new Music();
                music.setId(resultSet.getInt("id"));
                music.setTitle(resultSet.getString("title"));
                music.setSinger(resultSet.getString("singer"));
                music.setTime(resultSet.getDate("time"));
                music.setUrl(resultSet.getString("url"));
                music.setUserid(resultSet.getInt("userid"));
                musics.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return musics;
    }


    // 通过 ID 查询音乐
    public Music findMusicById(int id) {
        Music music = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            String sql = "select * from music where id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                music = new Music();
                music.setId(resultSet.getInt("id"));
                music.setTitle(resultSet.getString("title"));
                music.setSinger(resultSet.getString("singer"));
                music.setTime(resultSet.getDate("time"));
                music.setUrl(resultSet.getString("url"));
                music.setUserid(resultSet.getInt("userid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return music;
    }

    public List<Music> ifMusic(String str) {
        List<Music> musics = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            // 模糊查询
            String sql = "select  * from music where title like '%" + str + "%'";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Music music = new Music();
                music.setId(resultSet.getInt("id"));
                music.setTitle(resultSet.getString("title"));
                music.setSinger(resultSet.getString("singer"));
                music.setTime(resultSet.getDate("time"));
                music.setUrl(resultSet.getString("url"));
                music.setUserid(resultSet.getInt("userid"));
                musics.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return musics;
    }

    // 上传音乐
    public int Insert(String title, String singer, String time, String url, int userid) {
        Connection connection = null;
        PreparedStatement statement = null;
        int ret = 0;


        try {
            String sql = "insert into music(title, singer, time, url, userid) values (?, ?, ?, ?, ?)";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "title");
            statement.setString(2, singer);
            statement.setString(3, time);
            statement.setString(4, url);
            statement.setInt(5, userid);
            ret = statement.executeUpdate();
            if (ret == 1) {
                return ret;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return 0;
    }

    //删除音乐
    public int deleteMusicById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;


        try {
            String sql = "delete from music where id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            int ret = statement.executeUpdate();
            if (ret == 1) {
                // 注意删除中间表的数据
                if (findLoveMusicOnDel(id)) {
                    int ret2 = removeLoveMusicOnDel(id);
                    if (ret2 == 1) {
                        return 1;
                    }
                } else {

                }
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return 0;
    }

    private int removeLoveMusicOnDel(int musicId) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String sql = "delete from lovemusic where music_id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, musicId);
            int ret = statement.executeUpdate();
            if (ret == 1) {
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return 0;
    }

    private boolean findLoveMusicOnDel(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from lovemusic where music_id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return false;
    }

    /*
     * 添加音乐到喜欢的列表
     * */
    public boolean insertLoveMusic(int userId, int musicId) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String sql = "insert into lovemusic(user_id, music_id) VALUES (?,?)";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.setInt(2, musicId);
            int ret = statement.executeUpdate();
            if (ret == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return false;
    }


    // 移除当前用户喜欢的音乐
    public int removeLoveMusic(int userId, int musicId) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String sql = "delete from lovemusic where user_id=? and music_id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.setInt(2, musicId);
            int ret = statement.executeUpdate();
            if (ret == 1) {
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, null);
        }
        return 0;
    }

    // 判断喜欢音乐是否存在
    public boolean findMusicByMusicId(int user_id, int music_id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            String sql = "select * from lovemusic where user_id=? and music_id=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, user_id);
            statement.setInt(2, music_id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return false;
    }

    // 查询用户所有喜欢的歌单
    public List<Music> findLoveMusic(int user_id){
        List<Music> musics = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement("select m.id as music_id,title,singer,time,url,userid from lovemusic lm,music m where lm.music_id=m.id and user_id=?");
            statement.setInt(1,user_id);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Music music = new Music();
                music.setId(resultSet.getInt("music_id"));
                music.setTitle(resultSet.getString("title"));
                music.setSinger(resultSet.getString("singer"));
                music.setTime(resultSet.getDate("time"));
                music.setUrl(resultSet.getString("url"));
                music.setUserid(resultSet.getInt("userid"));
                musics.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musics;
    }

    public List<Music> ifMusicLove(String str,int user_id){
        List<Music> musics = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            // 模糊查询
            String sql = "select m.id as music_id,title,singer,time,url,userid from lovemusic lm,music m where lm.music_id=m.id and user_id=? and title like '%"+str+"%'";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Music music = new Music();
                music.setId(resultSet.getInt("music_id"));
                music.setTitle(resultSet.getString("title"));
                music.setSinger(resultSet.getString("singer"));
                music.setTime(resultSet.getDate("time"));
                music.setUrl(resultSet.getString("url"));
                music.setUserid(resultSet.getInt("userid"));
                musics.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return musics;
    }



    public static void main(String[] args) {

        /*List<Music> ans = new ArrayList<>();
        ans = findMusic();
        System.out.println(ans);*/
    }
}
