package com.bancolombia.rest.product.controller.v2.doc;

import com.bancolombia.rest.product.model.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v2/product")
@Tag(name = "Product", description = "Servicio V2 para adminstrar productos")
public interface ProductDoc {

    @Operation(
            summary = "POST CREATE",
            description = "Servicio para crear nuevos productos"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "prodcuto creado",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)

                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "error en logica creado",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)

                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "error en el servidor",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)

                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "no encontrado",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)

                    )
            }
    )
    @PostMapping
    ResponseEntity<?> create(@RequestBody ProductEntity productEntity);

}
