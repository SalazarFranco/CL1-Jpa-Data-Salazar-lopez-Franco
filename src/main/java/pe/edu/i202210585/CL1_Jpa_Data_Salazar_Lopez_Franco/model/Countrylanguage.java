package pe.edu.i202210585.CL1_Jpa_Data_Salazar_Lopez_Franco.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(CountryLanguageId.class)
@Entity
public class Countrylanguage {
    @Id
    private String Language;
    private String isOfficial;
    private Double Percentage;
    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;

}
