package com.pure.desafio.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * estava com problema no cors, tentei configurar no frontend para receber a requisição, setei na
 * função fetch do havascript o mode: no-cors, porem estava bloqueando para a request. Busquei no
 * google se havia como configurar o cors no servidor backend e encontrei esse link:
 * https://cursos.alura.com.br/forum/topico-cors-113963
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowedHeaders("*").allowCredentials(false).maxAge(3600);
  }
}
