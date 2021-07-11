package org.aplusstudios.elimu.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public class Metadata {
    private String uuid = UUID.randomUUID().toString();
    private Date created = new Date();
    private int version;
    private boolean archived;
}
