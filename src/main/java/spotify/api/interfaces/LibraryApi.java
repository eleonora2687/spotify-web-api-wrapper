package spotify.api.interfaces;

import spotify.models.albums.SavedAlbumFull;
import spotify.models.episodes.SavedEpisodeFull;
import spotify.models.paging.Paging;
import spotify.models.shows.SavedShowSimplified;
import spotify.models.tracks.SavedTrackFull;

import java.util.List;
import java.util.Map;

public interface LibraryApi {
    List<Boolean> hasSavedAlbums(List<String> listOfAlbumIds);

    List<Boolean> hasSavedShows(List<String> listOfShowIds);

    List<Boolean> hasSavedTracks(List<String> listOfTrackIds);

    Paging<SavedAlbumFull> getSavedAlbums(Map<String, String> options);

    Paging<SavedShowSimplified> getSavedShows(Map<String, String> options);

    Paging<SavedTrackFull> getSavedTracks(Map<String, String> options);

    void saveAlbums(List<String> listOfAlbumIds);

    void saveShows(List<String> listOfShowIds);

    void saveTracks(List<String> listOfTrackIds);

    void deleteAlbums(List<String> listOfAlbumIds);

    void deleteShows(List<String> listOfShowIds, Map<String, String> options);

    void deleteTracks(List<String> listOfTrackIds);

    Paging<SavedEpisodeFull> getSavedEpisodes(Map<String, String> options);
}
