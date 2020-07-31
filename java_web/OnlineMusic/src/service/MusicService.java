package service;

import dao.MusicDao;
import entity.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-service-MusicService
 * date: 2020/7/31 10:32
 */
public class MusicService {

    public int deleteMusicById(int id) {
        MusicDao musicDao = new MusicDao();
        int ret = musicDao.deleteMusicById(id);
        if (ret == 1) {
            if (musicDao.findLoveMusicOnDel(id)) {
                int ret2 = musicDao.removeLoveMusicOnDel(id);
                if (ret2 == 1) {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        return 0;
    }


    public List<Music> findMusic() {
        MusicDao musicDao = new MusicDao();
        List<Music> musicList = musicDao.findMusic();
        return musicList;
    }

    public Music findMusicById(int id) {
        MusicDao musicDao = new MusicDao();
        Music music = musicDao.findMusicById(id);
        return  music;
    }

    public List<Music> ifMusic(String str) {
        MusicDao musicDao = new MusicDao();
        List<Music> musicList = musicDao.ifMusic(str);
        return musicList;
    }

    public int insert(String title, String singer, String time, String url, int userid) {
        MusicDao musicDao = new MusicDao();
        int ret = musicDao.insert(title,singer, time, url, userid);
        return  ret;
    }

    public boolean insertLoveMusic(int userId, int musicId) {
        MusicDao musicDao = new MusicDao();
        boolean ret = musicDao.insertLoveMusic(userId, musicId);
        return  ret;
    }

    public int removeLoveMusic(int userId, int musicId) {
        MusicDao musicDao = new MusicDao();
        return musicDao.removeLoveMusic(userId, musicId);
    }
    public boolean findMusicByMusicId(int user_id, int music_id) {
        MusicDao musicDao = new MusicDao();
        return  musicDao.findMusicByMusicId(user_id,music_id);
    }
    public List<Music> findLoveMusic(int user_id){
        MusicDao musicDao = new MusicDao();
        List<Music> musics = new ArrayList<>();
        musics = musicDao.findLoveMusic(user_id);
        return musics;
    }


    public List<Music> ifMusicLove(String str,int user_id){
        MusicDao musicDao = new MusicDao();
        return musicDao.ifMusicLove(str, user_id);
    }
    }
