module TechStore.Stock.Management.System {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    //requires org.hibernate.commons.annotations;


    opens com.banton.GUI;
}