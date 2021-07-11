package org.aplusstudios.elimu.resources;

import org.aplusstudios.elimu.dao.Passage;

import java.util.List;

public record ChapterWrapperResource(ChapterResource chapterResource, List<TopicResource> topics, List<Passage> passages){ }
