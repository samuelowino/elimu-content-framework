package org.aplusstudios.elimu.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.aplusstudios.elimu.data.Metadata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Passage extends Metadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long topicId;
    private String content;
}
