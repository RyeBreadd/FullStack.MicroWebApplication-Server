package zipcode.group3.showboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.Video;
import zipcode.group3.showboat.repository.VideoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    /**
     * returns a list of videos
     */
    @GetMapping
    public List<Video> list() {
        return videoRepository.findAll();
    }

    /**
     * return a specific video
     * @param id - the primary key of the video as a path
     * @return a video matching that id
     */
//    @RequestMapping(value = "/video/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public Video get(@PathVariable Long id) {
        Optional<Video> opt = videoRepository.findById(id);

        if(opt.isPresent()) return opt.get();
        return null;
    }

    /**
     * Creates a new video from a json object
     * @param video - a video created from a json object in the Body of the request
     */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Video video) {
        videoRepository.save(video);
    }
}
