package my.project.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import my.project.model.api.CurrencyRateModel;
import my.project.model.api.RequestApi;

public class Model {
    private final RequestApi requestApi = new RequestApi();
    private CurrencyRateModel currencyRateModel;

    public Model() {
        currencyRateModel = requestApi.sendRequest();

    }

    public Set<String> getRatesNameSet() {
        return currencyRateModel.getRates().keySet();
    }

    public String getTextData(String value) {
        return String.valueOf(currencyRateModel.getRates().get(value));
    }

    public String getTextTimeStampData() {
        long timeStamp = Long.parseLong(currencyRateModel.getTimestamp());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStamp), ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        return formatter.format(localDateTime);
    }

    public void refreshCurrencyRates() {
        currencyRateModel = requestApi.sendRequest();
    }
}
