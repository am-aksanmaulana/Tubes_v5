package Adapter;

/**
 * Created by aksanmaulana on 4/4/2018.
 */

public class HomeMenu {
    public String nameMenu, descriptionMenu;
    public int iconMenu;

    public HomeMenu(String nameMenu, String descriptionMenu, int iconMenu) {
        this.nameMenu = nameMenu;
        this.descriptionMenu = descriptionMenu;
        this.iconMenu = iconMenu;
    }

    public String getNameMenu() {
        return nameMenu;
    }
    public String getDescriptionMenu() { return descriptionMenu; }
    public int getIconMenu() { return iconMenu; }
}
