package my.project.model.thread;

import javafx.concurrent.Task;
import my.project.model.api.RequestApi;

public class ThreadApi extends Task<Object> {
    private final RequestApi requestApi;

    public ThreadApi(RequestApi requestApi) {
        this.requestApi = requestApi;
    }

    @Override
    protected Object call() throws Exception {
            requestApi.sendRequest();

            return null;
    }
}
