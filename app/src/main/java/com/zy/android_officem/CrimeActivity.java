package com.zy.android_officem;

import android.support.v4.app.Fragment;

/**
 * Created by zouyang on 2017/7/11.
 */

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
