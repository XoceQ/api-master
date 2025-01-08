package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuarios.DatosAutenticacionUsuario;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        // Crear el token de autenticación
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave()
        );

        // Autenticar el token
        authenticationManager.authenticate(token);

        // Retornar una respuesta exitosa
        return ResponseEntity.ok().build();
    }
}
