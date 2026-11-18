import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.*;


public class App extends Application {

private static final Logger log = LoggerFactory.getLogger(App.class);

private final LegalOrderCalculating legalOrderCalculating;
private final RegionCalculating regionCalculating;
private final RegionInput regionInput;
private final RegionProcessing regionProcessing;
private final LegalOrderInput legalOrderInput;

public App() {
    this.legalOrderCalculating = new LegalOrderCalculating();
    this.regionCalculating = new RegionCalculating();   // не null
    this.regionInput = new RegionInput();
    this.regionProcessing = new RegionProcessing();
    this.legalOrderInput = new LegalOrderInput();
}

@Override
public void start(Stage primaryStage) throws Exception {
    log.info("Приложение запущено");
//     primaryStage.setScene();
     primaryStage.show();
}
}