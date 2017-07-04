package com.example.albertsanchez.mvp.interactor;

import com.example.albertsanchez.mvp.presenter.MainActivityPresenter;
import com.example.albertsanchez.mvp.presenter.MainActivityPresenterImpl;

/**
 * Created by albertsanchez on 7/3/17.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor{

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void Sumar(String numero1, String numero2) {
        Double resultado = Double.valueOf(numero1) + Double.valueOf(numero2);

        presenter.showResult(String.valueOf(resultado));
    }
}
