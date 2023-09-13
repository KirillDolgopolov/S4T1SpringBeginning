package cat.itacademy.barcelonactiva.dolgopolov.kirill.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(String nom) {
        if (nom==null){
            nom="UNKNOWN";
        }
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }



    @GetMapping(value={"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        if (nom==null){
            nom="UNKNOWN";
        }
        return "Hola de nuevo!, " + nom + ". Estàs executant un projecte Gradle";
    }
}
