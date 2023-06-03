package creational.abstractfactory.control;

import creational.abstractfactory.control.charactres.FantasyMonster;

public class FantasyMonsterFactory extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new FantasyMonster();
    }
}
