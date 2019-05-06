package devpro.vn.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    MediaPlayer mediaPlayer;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyService.this, "Service Ä‘Ã£ Ä‘Æ°á»£c táº¡o", Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(this,R.raw.bakeconnghe);

        mediaPlayer.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(MyService.this, "Báº¯t Ä‘áº§u má»Ÿ nháº¡c", Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Service Ä‘Ã£ táº¯t", Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
    }
}
