package com.zsk.zsk_downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

/**
 * Author : ZSK
 * Date : 2021/4/6
 * Description :
 */
class DownloadService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
