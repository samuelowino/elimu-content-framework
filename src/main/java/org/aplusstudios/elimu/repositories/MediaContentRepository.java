package org.aplusstudios.elimu.repositories;

import org.aplusstudios.elimu.dao.MediaContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaContentRepository extends JpaRepository<MediaContent, Long> {
}
