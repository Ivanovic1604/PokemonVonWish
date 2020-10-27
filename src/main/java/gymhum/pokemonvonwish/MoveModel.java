/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

/**
 *
 * @author ivan
 */
public class MoveModel {
    private String name;
    private int damage;
    private int heal;
    private int AP;

    public MoveModel(String name, int damage, int heal, int AP) {
        setName(name);
        setDamage(damage);
        setHeal(heal);
        setAP(AP);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }
   
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
