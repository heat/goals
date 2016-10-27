package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import domain.models.objetivo.Meta;
import domain.models.objetivo.SubMeta;
import domain.repository.MetaRepository;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

public class MetaController extends Controller {

    @Inject
    MetaRepository metaRepository;

    @Transactional
    @BodyParser.Of(BodyParser.Json.class)
    public Result post() {
        try {
            JsonNode json = request().body().asJson();
            Meta meta = Json.fromJson(json.get("Meta"), Meta.class);

            meta.setId_usuario(1);
            metaRepository.insert(meta);

            return created("Meta criada com sucesso.");
        } catch (Exception e) {
            return status(400, e.getMessage());
        }
    }

    @Transactional
    @BodyParser.Of(BodyParser.Json.class)
    public Result postSubmetas(Integer idMeta) {
        try {
            JsonNode json = request().body().asJson();
            String descricao = json.get("submeta").get("descricao").asText();

            SubMeta subMeta = new SubMeta(idMeta, descricao);
            metaRepository.insertSubMeta(subMeta);

            return created("SubMeta criada com sucesso.");
        } catch (Exception e) {
            return status(400, e.getMessage());
        }
    }

    @Transactional
    public Result getMetas() {
        try {
            List<Meta> metas = metaRepository.listByUsuario(1);

            return ok(toJson(metas));
        } catch (Exception e) {
            return status(400, e.getMessage());
        }
    }
}
