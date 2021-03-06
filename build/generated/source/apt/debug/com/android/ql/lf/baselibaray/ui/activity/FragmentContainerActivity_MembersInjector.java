// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.android.ql.lf.baselibaray.ui.activity;

import com.android.ql.lf.baselibaray.present.GetDataFromNetPresent;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class FragmentContainerActivity_MembersInjector
    implements MembersInjector<FragmentContainerActivity> {
  private final Provider<GetDataFromNetPresent> presentProvider;

  public FragmentContainerActivity_MembersInjector(
      Provider<GetDataFromNetPresent> presentProvider) {
    this.presentProvider = presentProvider;
  }

  public static MembersInjector<FragmentContainerActivity> create(
      Provider<GetDataFromNetPresent> presentProvider) {
    return new FragmentContainerActivity_MembersInjector(presentProvider);
  }

  @Override
  public void injectMembers(FragmentContainerActivity instance) {
    injectPresent(instance, presentProvider.get());
  }

  public static void injectPresent(
      FragmentContainerActivity instance, GetDataFromNetPresent present) {
    instance.present = present;
  }
}
