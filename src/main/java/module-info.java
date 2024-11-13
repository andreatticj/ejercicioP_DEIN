module eu.andreatt.ejerciciop_dein {
    requires eu.andreatt.ejercicioo_dein; // Requiere el módulo de ProductoLabel
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens eu.andreatt.ejerciciop_dein to javafx.fxml; // Permitir que FXML acceda a este paquete
    exports eu.andreatt.ejerciciop_dein; // Asegúrate de exportar el paquete correcto
}
