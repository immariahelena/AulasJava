package Controllers;

import entidades.Restaurante;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class TelaInicialController {

    @FXML
    private ListView<String> listRestaurantes;

    private List<Restaurante> restaurantes;

    public void initialize() {
        // Inicializa dados fictícios
        restaurantes = carregarRestaurantesMock();
        for (Restaurante restaurante : restaurantes) {
            listRestaurantes.getItems().add(restaurante.getNome());
        }
    }

    @FXML
    public void abrirRestaurante() {
        String selecionado = listRestaurantes.getSelectionModel().getSelectedItem();
        if (selecionado == null) {
            System.out.println("Selecione um restaurante.");
            return;
        }

        // Lógica para abrir a próxima tela (restaurante específico)
        System.out.println("Restaurante selecionado: " + selecionado);
    }

    private List<Restaurante> carregarRestaurantesMock() {
        List<Restaurante> lista = new ArrayList<>();
        lista.add(new Restaurante(1, 1, "Pizza Place", "1234-5678", 20.0, true, null, null, null, null));
        lista.add(new Restaurante(2, 1, "Burger House", "8765-4321", 15.0, false, null, null, null, null));
        return lista;
    }
}
