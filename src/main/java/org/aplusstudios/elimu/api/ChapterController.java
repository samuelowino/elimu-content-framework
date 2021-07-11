package org.aplusstudios.elimu.api;

import org.aplusstudios.elimu.resources.ChapterWrapperResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiConstants.BASE_URL + "/chapter")
public class ChapterController {

    @GetMapping(value = "/{chapterUuid}")
    public ApiResponse<ChapterWrapperResource> getChapter(@PathVariable("chapterUuid") String chapterUuid) {
        return new ApiResponse<ChapterWrapperResource>(true, null, "add-message");
    }
}
