package TiposDeDados.Desafios.Desafio_1;

public class Mission {
    public String name;
    public LevelOfDifficulty levelOfDifficulty;
    public String status;

    public Mission(String name, LevelOfDifficulty levelOfDifficulty, String status) {
        this.name = name;
        this.levelOfDifficulty = levelOfDifficulty;
        this.status = status;
    }
    
    public void showMission() {
        System.out.println("Missão:");
        System.out.println("name = " + name);
        System.out.println("levelOfDifficulty = " + levelOfDifficulty);
        System.out.println("status = " + status);
    }
}
