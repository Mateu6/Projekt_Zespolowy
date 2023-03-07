module com.projekt.kalendarz.start {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                    requires org.kordamp.bootstrapfx.core;
            requires eu.hansolo.tilesfx;
        
    opens com.projekt.kalendarz.start to javafx.fxml;
    exports com.projekt.kalendarz.start;
}