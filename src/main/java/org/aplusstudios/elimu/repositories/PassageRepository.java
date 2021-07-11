package org.aplusstudios.elimu.repositories;

import org.aplusstudios.elimu.dao.Passage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassageRepository extends JpaRepository<Passage, Long> {
}
