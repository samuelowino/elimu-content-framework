package org.aplusstudios.elimu.dao;

import lombok.Generated;
import org.aplusstudios.elimu.data.Metadata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class FormattingRules extends Metadata {
    @Id
    @Generated
    private long id;
    private long paragraphId;
    @OneToMany
    private Set<String> rules;
}
