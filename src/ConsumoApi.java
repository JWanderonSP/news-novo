import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsumoApi{
public String news(String assunto){
String endereço ="http://servicodados.ibge.gov.br/api/v3/noticias/?busca="+assunto;
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create(endereço))
    .build();
HttpResponse <String> response;
try{
    response= client.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();  
}catch
( IOException | InterruptedException e){
e.printStackTrace();
}
return"";
}
}
