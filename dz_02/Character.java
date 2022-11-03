package dz_02;

public abstract class Character implements IBaseCharacterAction {
    public String Name ="BaseCharacter";
    public int HP=0;
    public int Atack=0;
    public int Defence=0;

    @Override
    public void Attack(Character chr) {
        int totaldmg = this.Atack - chr.Defence;
        chr.HP = chr.HP - totaldmg;
        System.out.println(String.format("Char %s attack(%s) Char %s defence(%s) Total dmg:%s",this.Name, this.Atack, chr.Name, chr.Defence, totaldmg));
    }

    @Override
    public void getHP()
    {
        System.out.println(String.format("Characet %s HP=%s", this.Name,this.HP));
    }
}