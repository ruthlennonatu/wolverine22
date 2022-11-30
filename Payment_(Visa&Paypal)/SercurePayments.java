import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.Base64;

public class SercurePayments {

    public static void main(String[] args) throws Exception {

        System.out.println("START Sample Code for Two-Way (Mutual) SSL");
        URL url = new URL("https://sandbox.api.visa.com/vdp/helloworld");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // THIS IS EXAMPLE ONLY how will cert and key look like
        // keystorePath = "visa.jks"
        // keystorePassword = "password"

        String keystorePath = "<YOUR JAVA KEYSTORE PATH>";
        String keystorePassword = "<YOUR KEYSTORE PASSWORD>";
        // Make a KeyStore from the PKCS-12 file
        KeyStore ks = KeyStore.getInstance("PKCS12");
        try (FileInputStream fis = new FileInputStream(keystorePath)) {
            ks.load(fis, keystorePassword.toCharArray());
        }

        // Make a KeyManagerFactory from the KeyStore
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, keystorePassword.toCharArray());

        // Now make an SSL Context with our Key Manager and the default Trust Manager
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(kmf.getKeyManagers(), null, null);
        if (con instanceof HttpsURLConnection) {
            ((HttpsURLConnection) con).setSSLSocketFactory(sslContext.getSocketFactory());
        }

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");

        // THIS IS EXAMPLE ONLY how will user_id and password look like
        // userId = "1WM2TT4IHPXC8DQ5I3CH21n1rEBGK-Eyv_oLdzE2VZpDqRn_U";
        // password = "19JRVdej9";
        String userId = "<YOUR USER ID>";
        String password = "<YOUR PASSWORD>";

        String auth = userId + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
        String authHeaderValue = "Basic " + new String(encodedAuth);
        con.setRequestProperty("Authorization", authHeaderValue);

        int status = con.getResponseCode();
        System.out.println("Http Status: " + status);

        BufferedReader in;
        if (status == 200) {
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        } else {
            in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            System.out.println("Two-Way (Mutual) SSL test failed");
        }
        String response;
        StringBuffer content = new StringBuffer();
        while ((response = in.readLine()) != null) {
            content.append(response);
        }
        in.close();
        con.disconnect();

        System.out.println(content.toString());
        System.out.println("END Sample Code for Two-Way (Mutual) SSL");
    }
}