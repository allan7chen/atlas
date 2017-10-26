package android.taobao.atlas.remote;

import android.os.Bundle;

/**
 * Created by guanjie on 2017/10/25.
 */

public interface IRemoteTransactor {

    Bundle call(String commandName, Bundle args, IResponse callback);

    interface IResponse{
        void OnResponse(Bundle bundle);
    }
}
