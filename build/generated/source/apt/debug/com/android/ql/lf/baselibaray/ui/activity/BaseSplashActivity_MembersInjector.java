// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.android.ql.lf.baselibaray.ui.activity;

import com.android.ql.lf.baselibaray.present.GetDataFromNetPresent;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseSplashActivity_MembersInjector
    implements MembersInjector<BaseSplashActivity> {
  private final Provider<GetDataFromNetPresent> getDataFromNetPresentProvider;

  public BaseSplashActivity_MembersInjector(
      Provider<GetDataFromNetPresent> getDataFromNetPresentProvider) {
    this.getDataFromNetPresentProvider = getDataFromNetPresentProvider;
  }

  public static MembersInjector<BaseSplashActivity> create(
      Provider<GetDataFromNetPresent> getDataFromNetPresentProvider) {
    return new BaseSplashActivity_MembersInjector(getDataFromNetPresentProvider);
  }

  @Override
  public void injectMembers(BaseSplashActivity instance) {
    injectGetDataFromNetPresent(instance, getDataFromNetPresentProvider.get());
  }

  public static void injectGetDataFromNetPresent(
      BaseSplashActivity instance, GetDataFromNetPresent getDataFromNetPresent) {
    instance.getDataFromNetPresent = getDataFromNetPresent;
  }
}
