module net.imparando.delme_4ai {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.delme_4ai to javafx.fxml;
    exports net.imparando.delme_4ai;
}