package com.example.i5_3450_user.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;
    private Button mRavenCounterButton;
    private int mCount = 0, mCount2 = 0;
    private TextView mHelloTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRavenCounterButton = (Button)findViewById(R.id.buttonRavenCounter);
        mHelloTextView = (TextView)findViewById(R.id.textView);
        mHelloTextView2 = (TextView)findViewById(R.id.textView2);
        mNameEditText = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Привет, анон");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }
    }

    public void onClickRavenCounter(View v) {
        mHelloTextView.setText("Сэр, воронов все больше! Их уже " + ++mCount);
    }

    public void onClickCatCounter(View vv) {
        mHelloTextView2.setText("Коты наступают, это армия, их уже " + ++mCount2);
    }
}
