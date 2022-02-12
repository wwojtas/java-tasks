package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.ObiektyIPakiety;

import ZMyOwnClass.CzlowiekChashCode.Czlowiek;

import java.util.Objects;

public class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMale(Human human) {
        if (equals(human)) {
            if( human.getGender() == "M" ) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Human) {
            Human human = (Human) o;
            return gender.equals(human.getGender());
        }
        return false;
    }



}
