package pe.edu.i202210585.CL1_Jpa_Data_Salazar_Lopez_Franco.model;

import java.util.Objects;

public class CountryLanguageId {

    private String Language;
    private String country;

    public CountryLanguageId() {}

    public CountryLanguageId(String Language, String country) {
        this.Language = Language;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(Language, that.Language) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Language, country);
    }
}
