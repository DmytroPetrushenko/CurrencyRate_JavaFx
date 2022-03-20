package my.project.model.api;

import java.sql.Timestamp;
import java.util.Map;

public class CurrencyRateModel {
    private String base;
    private Map<String, Double> rates;
    private String timestamp;

    public CurrencyRateModel() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CurrencyRate{"
                + "timestamp='" + timestamp + '\''
                + "base='" + base + '\''
                + ", rates=" + rates.toString()
                + '}';
    }
}
