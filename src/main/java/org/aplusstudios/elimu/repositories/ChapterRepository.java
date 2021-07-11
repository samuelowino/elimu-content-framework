package org.aplusstudios.elimu.repositories;

import org.aplusstudios.elimu.dao.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
