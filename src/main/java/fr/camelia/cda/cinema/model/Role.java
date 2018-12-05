package fr.camelia.cda.cinema.model;

public class Role {
    Film film;
    Personne personne;
    String alias;
    int ordre;

    public Role(Film film, Personne perssone, String alias, int ordre) {
        this.film = film;
        this.personne = perssone;
        this.alias = alias;
        this.ordre = ordre;
    }

    public Film getFilm() {
        return film;

    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Personne getPerssone() {
        return personne;
    }

    public void setPerssone(Personne perssone) {
        this.personne = perssone;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNumero() {
        return ordre;
    }

    public void setNumero(int numero) {
        this.ordre = numero;
    }

    public String toString() {
        return "Role{" +
                "Film='" + film.getTitre()+ '\'' +
                ", Personne=" + personne.getPrenom() +
                ", String='" + alias + '\'' +
                '}';
    }
}
