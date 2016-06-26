package net.tangs.websocket.stomp;

import java.util.Map;

/**
 * Created by paing on 26/6/16.
 */
public interface ListenerSubscription {

    public void onMessage(Map<String, String> headers, String body);
}
