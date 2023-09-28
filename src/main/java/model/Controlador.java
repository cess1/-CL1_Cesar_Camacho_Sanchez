import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/formularioProducto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formularioProducto";
    }

    @PostMapping("/registrarProducto")
    public String registrarProducto(@ModelAttribute("producto") @Valid Producto producto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formularioProducto"; // Mostrar errores de validación
        }

        productoRepository.save(producto); // Guardar el producto en la base de datos

        model.addAttribute("mensaje", "Registro exitoso");
        return "paginaExito";
    }

    // Otros métodos del controlador
}
