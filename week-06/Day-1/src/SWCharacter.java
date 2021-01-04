public class SWCharacter {
//name;height;mass;hair_color;skin_color;eye_color;birth_year;gender
    protected String name;
    protected String height;
    protected String mass;
    protected String hairColor;
    protected String skinColor;
    protected String eyeColor;
    protected String birthYear;
    protected String gender;

    public SWCharacter(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String  birthYear, String gender) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
    }
}
