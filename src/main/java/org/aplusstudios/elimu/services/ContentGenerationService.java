package org.aplusstudios.elimu.services;

import org.aplusstudios.elimu.dao.FormattingRules;
import org.aplusstudios.elimu.dao.Passage;
import org.aplusstudios.elimu.dao.Topic;

/**
 * Generate and store a unit of education content composed of
 * - A chapters
 * - Set of topics [T]
 * - Set of topic distinct passages {paragraphs}
 * - Topic based media content [Audio,Video and Images]
 *
 * @author Samuel Owino
 * @created 11-07-2021
 */
public interface ContentGenerationService {

    /**
     * Defines the template for a Chapter @see{org.aplusstudios.elimu.dao.Chapter}
     *
     * @param locale      - String - Locale of the content e.g en_US, ar,
     * @param title       - String - Title of this chapter
     * @param description - String - Highlight to this chapter
     * @param topicsCount - Long - Total number of topics covered by this chapter
     */
    void composeChapterStructure(String locale, String title, String description, long topicsCount);

    /**
     * Defines the topic structure @see{org.aplusstudios.elimu.dao.Topic}
     *
     * @param parentChapterId   - Long - The root chapter id
     * @param title             - String - Topic title
     * @param highlight         - String - Topic highlights
     * @param passagesCount     - Long - Passage count
     * @param mediaContentCount - Long media content count
     * @return - Topic - Fully composed topic instance
     */
    Topic composeTopicStructure(long parentChapterId, String title, String highlight, int passagesCount, int mediaContentCount);

    /**
     * Defines a passage of content complete with formatting rules.
     *
     * @param parentTopicId - Long - Root topic id
     * @param content - String - Passage content, plain usually text
     * @return Paragraph
     */
    Passage composeUnitPassage(long parentTopicId, String content, FormattingRules formattingRules);

}
