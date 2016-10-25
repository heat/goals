package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import domain.models.objetivo.Meta;
import domain.repository.MetaRepository;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

public class MetaController extends Controller{

    @Inject
    MetaRepository metaRepository;

    @Transactional
    @BodyParser.Of(BodyParser.Json.class)
    public Result post(){
        try{
            JsonNode json = request().body().asJson();
            Meta meta = Json.fromJson(json.get("Meta"), Meta.class);
            metaRepository.insert(meta);

            return created("Meta criada com sucesso");
        } catch (Exception e){
            return status(400, e.getMessage());
        }

    }
}
