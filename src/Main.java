//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.hp);
        System.out.println(h1.name);
        Hero h2 = new Hero();
        System.out.println(h2.hp);
        System.out.println(h2.name);

        /*Hero h = new Hero("ミナト");
        System.out.println(h.hp);
        System.out.println(h.name);

        Hero h1 = new Hero();
        h1.name= "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "アサガ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();//勇者生成
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Hero h1;
        h1 = new Hero();
        h1.hp = 100;
        Hero h2 = h1;
        h2.hp = 200;
        System.out.println(h1.hp);


        Matango m1 = new Matango();
        m1.hp= 50;
        m1.suffix= 'A';

        Matango m2 = new Matango();
        m2.hp= 48;
        m2.suffix= 'B';

       /* h.slip();
        m1.slip();
        m2.run();
        h.run();

        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();*/

    }
}