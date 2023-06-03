package creational.abstractfactory.control;

import creational.abstractfactory.control.charactres.FantasyHero;

public class FantasyHeroFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new FantasyHero();
    }
}
