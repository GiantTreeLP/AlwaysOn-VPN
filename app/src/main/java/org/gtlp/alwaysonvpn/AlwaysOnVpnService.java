package org.gtlp.alwaysonvpn;

import android.content.Intent;
import android.net.VpnService;
import android.os.IBinder;

public class AlwaysOnVpnService extends VpnService {
    public AlwaysOnVpnService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
