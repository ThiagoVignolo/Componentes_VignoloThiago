module es.ieslosmontecillos.componentes_vignolothiago {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_vignolothiago;


    opens es.ieslosmontecillos.componentes_vignolothiago to javafx.fxml;
    exports es.ieslosmontecillos.componentes_vignolothiago;
}