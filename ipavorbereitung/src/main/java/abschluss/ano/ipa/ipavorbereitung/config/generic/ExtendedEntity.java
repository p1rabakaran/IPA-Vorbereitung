package abschluss.ano.ipa.ipavorbereitung.config.generic;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class ExtendedEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    public ExtendedEntity() {
    }

    public ExtendedEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public ExtendedEntity setId(String id) {
        this.id = id;
        return this;
    }
}
