module es.ieslosmontecillos.lambdakeyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.lambdakeyevent to javafx.fxml;
    exports es.ieslosmontecillos.lambdakeyevent;
}