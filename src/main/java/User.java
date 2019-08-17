import java.io.Serializable;

public class User implements Serializable {

    private int lifelevel;
    private int manaLevel;
    private int level;
    private String name;
    private String gender;

    public User(int lifelevel, int manaLevel, int level, String name, String gender) {
        this.lifelevel = lifelevel;
        this.manaLevel = manaLevel;
        this.level = level;
        this.name = name;
        this.gender = gender;
    }

    public int getLifelevel() {
        return lifelevel;
    }

    public int getManaLevel() {
        return manaLevel;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "lifelevel=" + lifelevel +
                ", manaLevel=" + manaLevel +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
