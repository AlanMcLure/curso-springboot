package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalidromoRestController {

    @GetMapping("/validar-palindromo/{palabra}")
    public String palidromo(@PathVariable String palabra) {
        if (validarPalindromo(palabra)) {
            return palabra + " es un palíndromo!";
        } else {
            return palabra + " NO es un palíndromo!";
        }
    }

    public boolean validarPalindromo(String palabra) {

        int length = palabra.length();
        for (int i = 0; i < length / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
