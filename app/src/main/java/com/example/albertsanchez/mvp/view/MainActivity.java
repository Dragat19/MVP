package com.example.albertsanchez.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.albertsanchez.mvp.R;
import com.example.albertsanchez.mvp.interactor.MainActivityInteractorImpl;
import com.example.albertsanchez.mvp.presenter.MainActivityPresenter;
import com.example.albertsanchez.mvp.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private EditText etNum1,etNum2;
    private TextView tvResult;
    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.num1);
        etNum2 = (EditText) findViewById(R.id.num2);
        tvResult = (TextView) findViewById(R.id.result);
        presenter = new MainActivityPresenterImpl(this);

    }

    public void Sumar( View view){

        String num1  = etNum1.getText().toString();
        String num2  = etNum2.getText().toString();
        presenter.sumar(num1,num2);

    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        presenter.showError(error);
    }
}
