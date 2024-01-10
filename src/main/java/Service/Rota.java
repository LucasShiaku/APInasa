package Service;

import model.Solicitacoes;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Rota {

    public Solicitacoes getSolicitacoes(String data) throws ClientProtocolException, IOException {

        Solicitacoes solicitacoes = null;


        String url = "https://apod.nasa.gov/apod/ap" + data + ".html";

        HttpGet request = new HttpGet(url);

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
             CloseableHttpResponse response = httpClient.execute(request)) {

            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String result = EntityUtils.toString(entity);


                Document doc = Jsoup.parse(result);


                solicitacoes = new Solicitacoes();


                solicitacoes.setTitle(doc.select("b").first().text());
                solicitacoes.setDate(data);
                solicitacoes.setExplanation(doc.select("p").first().text());
                solicitacoes.setHdurl("https://apod.nasa.gov/" + doc.select("a[href~=image/]").first().attr("href"));
                solicitacoes.setMediaType("image");
                solicitacoes.setServiceVersion("v1");
                solicitacoes.setUrl("https://apod.nasa.gov/" + doc.select("img[src~=image/]").first().attr("src"));
            }
        }

        return solicitacoes;
    }
}
