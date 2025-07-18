package TiposDeDados.Desafios.Desafio_1;

public class Main {
    public static void main(String[] args) {
        Ninja[] ninjas = {new Ninja(
                "Naruto Uzumaki",
                14,
                new Mission("Matar o Pain", LevelOfDifficulty.S, "Indefinido")
        ), new Ninja(
                "Sasuke Uchiha",
                18,
                new Mission("Matar Itachi", LevelOfDifficulty.A, "Indefinido")
        ), new Ninja(
                "Sakura Haruno",
                17,
                new Mission("Fazer nada", LevelOfDifficulty.D, "Indefinido")
        )};

        for (Ninja ninja : ninjas) {
            boolean isHardMission = ninja.mission.levelOfDifficulty.isMoreDifficultThan(LevelOfDifficulty.B);

            if (ninja.age < 15 && isHardMission) {
                ninja.mission.status = "Não concluída";
            } else {
                ninja.mission.status = "Concluída";
            }

            ninja.ShowNinja();
            System.out.println();
        }
    }
}
