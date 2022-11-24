package com.example.aidlmultiply;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MultiplyService extends Service {
    public MultiplyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    IMultiplyService.Stub mBinder =new IMultiplyService.Stub() {
        @Override
        public int multiply(int x, int y) throws RemoteException {
            return x*y;
        }
    };
}