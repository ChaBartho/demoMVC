public class Main {
    public static void main(String[] args) {

        ModelAnimal model = new ModelAnimal("Sushi", "Noir", 4);
        ViewAnimal view = new ViewAnimal();
        ControllerAnimal controller = new ControllerAnimal(model, view);


        //Pas besoin de faire un sout, imbécile, ta méthode updateView() appelle la méthode animalDetail() qui fait déjà un sout
        controller.updateView();




    }
}