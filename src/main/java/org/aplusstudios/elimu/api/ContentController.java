package org.aplusstudios.elimu.api;

import org.aplusstudios.elimu.dao.Chapter;
import org.aplusstudios.elimu.resources.ChapterResource;
import org.aplusstudios.elimu.resources.PassageResource;
import org.aplusstudios.elimu.resources.TopicResource;
import org.aplusstudios.elimu.services.ContentGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ApiConstants.BASE_URL + "/content")
public class ContentController {

    @Autowired
    private ContentGenerationService service;

    @PostMapping(value = "/chapter")
    ApiResponse<Boolean> addChapter(@RequestBody ChapterResource resource){
        return new ApiResponse<>(false,true,"Success.");
    }

    @PostMapping(value = "/topic")
    ApiResponse<Boolean> addTopic(@RequestBody TopicResource resource){
        return new ApiResponse<>(false,true,"Success.");
    }

    @PostMapping(value = "/chapter")
    ApiResponse<Boolean> addTopicPassage(@RequestBody PassageResource resource){
        return new ApiResponse<>(false,true,"Success.");
    }
}
