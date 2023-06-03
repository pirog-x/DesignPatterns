package creational.abstractfactory.control;

public abstract class CharacterFactory {
    public Character getDefaultCharacter() {
        Character character = createCharacter();
        character.spawn();
        return character;
    }

    public abstract Character createCharacter();
}
