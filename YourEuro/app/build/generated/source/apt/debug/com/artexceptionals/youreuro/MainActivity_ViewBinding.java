// Generated code from Butter Knife. Do not modify!
package com.artexceptionals.youreuro;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mRecentsRecyclerView = Utils.findRequiredViewAsType(source, R.id.recent_history_rv, "field 'mRecentsRecyclerView'", RecyclerView.class);
    target.noRecordsTextView = Utils.findRequiredViewAsType(source, R.id.noRecords_tv, "field 'noRecordsTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecentsRecyclerView = null;
    target.noRecordsTextView = null;
  }
}
