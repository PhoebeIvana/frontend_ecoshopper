package GUI;

public interface Displayable {
    void display();

    static  void displayPage(Displayable obj) {
        obj.display();
    }
}