package fr.wcs.hackathon.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class MarcelleService {
	
	public static final String API_URL = "http://marcelle-mobi-api.herokuapp.com?grant_token=code4marseillefrioul";
	
	private WebClient webClient;
	
	public MarcelleService(WebClient.Builder builder) {
		this.webClient = builder.baseUrl(MarcelleService.API_URL).build();
	}

	public List<Article> getArticles() {
		return this.webClient.get().uri("/articles").retrieve().bodyToMono(ArticleIndex.class).block().getArticles();
	}
	
}
