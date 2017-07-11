package com.zy.android_officem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by zouyang on 2017/7/11.
 */

public class CrimeFragment extends Fragment{

    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);


        EditText mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged( CharSequence s, int start, int count, int after ) {
            }
            @Override
            public void onTextChanged( CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString());  //在onTextChanged(...)方法中，调用CharSequence（代表用户输入）的toString()方法。该方法最后返回用来设置Crime标题的字符串。
            }
            @Override
            public void afterTextChanged(Editable s) {
                // This one too
            }
        });

        return v;
    }

}
