package classproject;


import classproject.model.Album;
import classproject.model.Band;
import classproject.model.SoloArtist;
import classproject.model.Track;
import classproject.repository.AlbumRepository;
import classproject.repository.BandRepository;
import classproject.repository.SoloArtistRepository;
import classproject.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainClass implements Runnable {
    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private TrackRepository trackRepository;
    @Autowired
    private BandRepository bandRepository;
    @Autowired
    private SoloArtistRepository soloArtistRepository;

    @Override
    public void run() {
        SoloArtist soloArtist = new SoloArtist();
        soloArtist.setName("Ed Sheeran");
        soloArtist.setGenre("Pop");
        soloArtist.setInstrument("Guitar");
        soloArtistRepository.save(soloArtist);

        Band band = new Band();
        band.setName("Coldplay");
        band.setGenre("Rock");
        band.setNumberOfMembers(4);
        bandRepository.save(band);

        Album album = new Album();
        album.setTitle("÷");
        album.setReleaseYear(2017);

        album.setArtist(soloArtist);
        albumRepository.save(album);

        album.setArtist(band);
        albumRepository.save(album);

        Track track = new Track();
        track.setTitle("Shape of You");
        track.setDuration(234);

        track.setAlbum(album);
        trackRepository.save(track);
    }
}

