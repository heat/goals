package controllers;

import domain.models.Categoria;
import play.mvc.Controller;
import play.mvc.Result;
import services.CategoriaService;
import services.UsuarioService;
import validations.GoalsException;

import java.util.List;

import static play.libs.Json.toJson;

public class UsuarioController extends Controller {

    public Result getCategorias(){
        try{

            List<Categoria> categorias = UsuarioService.getCategorias(1);

            return ok(toJson(categorias));
        } catch (Exception ex){
            return internalServerError();

        }
    }
}
