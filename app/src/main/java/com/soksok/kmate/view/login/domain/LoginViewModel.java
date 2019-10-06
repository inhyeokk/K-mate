package com.soksok.kmate.view.login.domain;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.soksok.kmate.api.naver.NaverAPI;
import com.soksok.kmate.api.naver.model.NaverProfile;
import com.soksok.kmate.base.BaseViewModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends BaseViewModel {

    public MutableLiveData<String> naverEmail = new MutableLiveData<>();

    public void getNaverEmail(String accessToken) {

        compositeDisposable.add(
                NaverAPI.getProfile(accessToken)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(result -> {
                            Gson gson = new Gson();
                            NaverProfile profile = gson.fromJson(result, NaverProfile.class);
                            naverEmail.postValue(profile.getResponse().getEmail());
                        })
        );
    }
}
