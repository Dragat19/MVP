package com.example.albertsanchez.mvp.presenter;

import com.example.albertsanchez.mvp.interactor.MainActivityInteractor;
import com.example.albertsanchez.mvp.interactor.MainActivityInteractorImpl;
import com.example.albertsanchez.mvp.view.MainActivityView;

/**
 * Created by albertsanchez on 7/3/17.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView mainActivityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String numero1, String numero2) {
        interactor.Sumar(numero1,numero2);
    }

    @Override
    public void showResult(String result) {

        mainActivityView.showResult(result);
    }

    @Override
    public void showError(String error) {

        mainActivityView.showError(error);

    }


}
