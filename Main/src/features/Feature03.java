package features;
// interditado, NAO FUI EU Q FIZ O CODIGO, PRECISO ESTUDAR, NAO ENTENDO NADA Q TA ESCRITO AQUI
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Feature03 {

    public static void run(Scanner sc) {
        System.out.println("\n=== Currency Converter (USD -> BRL) ===");

        try {
            // 1. Busca a cotação na API
            double usdToBrlRate = getUsdToBrlRate();
            System.out.printf("Current exchange rate: 1 USD = %.2f BRL\n", usdToBrlRate);

            // 2. Pede o valor ao usuário usando a sua classe de validação
            double dollars = Validation.readDouble("\nEnter value in USD ($): ", sc);

            // 3. Calcula e exibe o resultado
            double reais = dollars * usdToBrlRate;
            System.out.printf("$%.2f USD is equal to R$%.2f BRL\n\n", dollars, reais);

        } catch (Exception e) {
            System.out.println("Error fetching exchange rate. Check your internet connection.\n");
        }
    }

    // Método para buscar o valor na internet
    private static double getUsdToBrlRate() throws Exception {
        String url = "https://economia.awesomeapi.com.br/last/USD-BRL";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Extrai o valor do campo "bid" da resposta JSON via Expressão Regular (Regex)
        Pattern pattern = Pattern.compile("\"bid\":\"([0-9.]+)\"");
        Matcher matcher = pattern.matcher(response.body());

        if (matcher.find()) {
            return Double.parseDouble(matcher.group(1));
        } else {
            throw new RuntimeException("Could not parse exchange rate from API response.");
        }
    }
}