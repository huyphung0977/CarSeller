package Backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Version {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "versionId"
    )
    private Long id;
    private String nameVersion;

    @OneToOne(
            cascade = CascadeType.ALL
    )
        private Car car;

    @Column(
            name = "model_id",
            nullable = false
    )
    private Long modelId;
}