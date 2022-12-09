package task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class WebAddressParser {
    //конструкторы
    private String url;
    public WebAddressParser(String url){
        this.url = url;
    }

    //методы
    public String getLogin() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = url.indexOf("//");
        startIndex += 2;

        int endIndex = url.indexOf(":", startIndex);
        return url.substring(startIndex, endIndex);
    }

    public String getPassword() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = url.indexOf("//");
        startIndex = url.indexOf(":", startIndex);
        startIndex ++;

        int endIndex = url.indexOf("@", startIndex);
        return url.substring(startIndex, endIndex);
    }

    public String getScheme() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = 0;
        int endIndex = url.indexOf(":");

        return url.substring(startIndex, endIndex);
    }

    public String getHost() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = url.indexOf("@");
        startIndex++;

        int endIndex = url.indexOf(":", startIndex);
        return url.substring(startIndex, endIndex);
    }

    public String getPort() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = url.indexOf("@");
        startIndex = url.indexOf(":", startIndex);
        startIndex++;

        int endIndex = url.indexOf("/", startIndex);
        return url.substring(startIndex, endIndex);
    }

    public String getFragment() {
        if (!this.isValid()) {
            return null;
        }
        int startIndex = url.indexOf("#");
        startIndex++;

        int endIndex = url.length();
        return url.substring(startIndex, endIndex);
    }

    public boolean isValid() {
        String[] symbols = {"://", ":", "@", ":", "/", "?", "#"};

        if (url.contains(" ")) {
            return false;
        }

        int currentIndex = 0;
        for (String symbol : symbols) {
            currentIndex = url.indexOf(symbol, currentIndex);
            if (currentIndex == -1) {
                return false;
            }
            currentIndex++;
        }

        return true;
    }

    public HashMap<String, String> getParameters() {
        if (!this.isValid()) {
            return null;
        }

        HashMap paramUrl = new HashMap<String, String>();


        String param = this.getParam();

        int startIndex = 0;
        while(param.contains("=")) {
            int endIndex = param.indexOf("=", startIndex);
            String key = param.substring(startIndex, endIndex);

            startIndex = endIndex;

            if (!param.contains("&")) {
                endIndex = param.length();
            }
            else {
                endIndex = param.indexOf("&", startIndex);
            }
            String value = param.substring(startIndex, endIndex);

            paramUrl.put(key, value);
        }
        return paramUrl;
    }

    private String getParam () {
        int startIndex = url.indexOf("?");
        startIndex++;
        int endIndex = url.indexOf("#", startIndex);
        String param = url.substring(startIndex, endIndex);

        return param;
    }

    private String getPath () {
        int startIndex = url.indexOf("//");
        startIndex += 2;

        startIndex = url.indexOf("/", startIndex);
        startIndex++;

        int endIndex = url.indexOf("?", startIndex);
        String path = url.substring(startIndex, endIndex);

        return path;
    }

    public String getUrl() {

        String param = this.getParam();
        String path = this.getPath();

        return  this.getScheme() + "://" + this.getHost() + "/" + path + "?" + param;
    }
}

