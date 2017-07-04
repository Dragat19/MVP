package com.example.albertsanchez.mvp.presenter;

/**
 * Created by albertsanchez on 7/3/17.
 */

public interface MainActivityPresenter {

    void sumar(String numero1, String numero2);
    void showResult(String result);
    void showError(String error);
}
