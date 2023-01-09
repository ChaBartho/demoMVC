public class ControllerAnimal {
    //Propriétés:

    private ModelAnimal model;
    private ViewAnimal view;

    //Constructeur:
    public ControllerAnimal (ModelAnimal monModel, ViewAnimal maView){
        this.model = monModel;
        this.view = maView;
    }

    //Méthodes:
    public void setAnimalName(String name){
        model.setName(name);
    }

    public String getAnimalName(){
        return model.getName();
    }

    public void setAnimalCouleur(String couleur){
        model.setCouleur(couleur);
    }

    public String getAnimalCouleur(){
        return model.getCouleur();
    }

    public void setNbLeg(int nblegs){
        model.setNbLeg(nblegs);
    }

    public int getAnimalNbLeg(){
        return model.getNbLeg();
    }


    //Appel de la méthode dans la vue par rapport au model
    public void updateView(){
        view.animalDetail(model.getName(), model.getCouleur(), model.getNbLeg());
    }




}
