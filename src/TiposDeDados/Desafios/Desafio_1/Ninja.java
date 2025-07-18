package TiposDeDados.Desafios.Desafio_1;

public class Ninja {
    public String name;
    public int age;
    public Mission mission;

    public Ninja(String name, int age, Mission mission) {
        this.name = name;
        this.age = age;
        this.mission = mission;
    }

    public void ShowNinja() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        mission.showMission();
        System.out.println("-----------------------------------");
    }
}
