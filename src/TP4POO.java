class Souris{
    int poids;
    String couleur;
    int age;
    int esperanceVie;
    boolean clonee;
    public int ESPERANCE_VIE_DEFAUT = 36;

    public Souris(int poids, String couleur, int age, int esperanceVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
        clonee = false;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0;
        this.esperanceVie = ESPERANCE_VIE_DEFAUT;
        clonee = false;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris sour){
        poids = sour.poids;
        couleur = sour.couleur;
        age = sour.age;
        esperanceVie = (4*ESPERANCE_VIE_DEFAUT)/5;
        clonee = true;
        System.out.println("Clonage d'une souris !");
    }

    public String toString(){
        return clonee? "Une souris "+this.couleur+",clonée, de "+this.age+" mois et pesant "+this.poids+" grammes":"Une souris "+this.couleur+" de "+this.age+" mois et pesant "+this.poids+" grammes";
    }

    public void vieillir(){
        this.age = age +1;
        if (clonee == true && age > (2*ESPERANCE_VIE_DEFAUT)/5) {
            this.couleur = "verte";
        }
    }

    public void evolue(){
        while (this.age < this.esperanceVie){
            vieillir();
        }
        /*if (clonee == true) {
            this.age = (4*ESPERANCE_VIE_DEFAUT)/5;
        }
        else if (clonee == false){
            this.age = ESPERANCE_VIE_DEFAUT;
        }*/
    }
}

public class TP4POO {
    public static void main (String[] args){
        Souris s1 = new Souris(50,"blanche");
        Souris s2 = new Souris(45, "grise");
        Souris sour2 = new Souris(s2);
        s1.vieillir();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sour2);
        s1.evolue();
        s2.evolue();
        sour2.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sour2);
    }
}