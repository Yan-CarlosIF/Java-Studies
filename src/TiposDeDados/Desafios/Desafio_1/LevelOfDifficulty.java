package TiposDeDados.Desafios.Desafio_1;

public enum LevelOfDifficulty {
    D,
    C,
    B,
    A,
    S;

    public boolean isMoreDifficultThan(LevelOfDifficulty other) {
        return this.compareTo(other) > 0;
    }
}
