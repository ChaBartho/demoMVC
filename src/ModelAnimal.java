public class ModelAnimal {
    //Propriétés:
    private String name;
    private String couleur;
    private int nbLeg;

    //Constructeur:
    public ModelAnimal(String myName, String myCouleur, int monNbJambe){
        this.name = myName;
        this.couleur = myCouleur;
        this.nbLeg = monNbJambe;
    }

    //Méthodes:
    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setCouleur(String nvlCouleur){
        this.couleur = nvlCouleur;
    }

    public String getCouleur(){
        return couleur;
    }

    public void setNbLeg(int nombreJambes){
        this.nbLeg = nombreJambes;
    }

    public int getNbLeg(){
        return nbLeg;
    }




}
