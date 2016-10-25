package controllers;

import com.google.inject.Inject;
import domain.models.Categoria;
import domain.repository.CategoriaRepository;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import validations.GoalsException;

import java.util.List;

import static play.libs.Json.toJson;

public class UsuarioController extends Controller {

    @Inject
    CategoriaRepository categoriaRepository;

    @Transactional
    public Result getCategorias(){
        try{

            List<Categoria> categorias = categoriaRepository.listByUsuario(1);

            return ok(toJson(categorias));
        } catch (GoalsException ex){
            return status(ex.code, ex.message);
        } catch (Exception ex){
            return internalServerError();
        }
    }
}
