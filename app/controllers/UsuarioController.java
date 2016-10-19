package controllers;

import com.google.inject.Inject;
import domain.models.Categoria;
import domain.repository.CategoriaRepository;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import services.CategoriaService;
import services.UsuarioService;
import validations.GoalsException;

import java.util.List;

import static play.libs.Json.toJson;

public class UsuarioController extends Controller {

    @Inject
    CategoriaRepository categoriaRepository;

    @Transactional
    public Result getCategorias(){
        try{

            //List<Categoria> categorias = categoriaRepository.listByUsuario(1);

            return ok();
        } catch (Exception ex){
            return internalServerError();

        }
    }
}
