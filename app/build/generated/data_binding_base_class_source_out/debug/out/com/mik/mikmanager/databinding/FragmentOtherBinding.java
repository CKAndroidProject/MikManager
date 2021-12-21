// Generated by view binder compiler. Do not edit!
package com.mik.mikmanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.mik.mikmanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOtherBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnListen;

  @NonNull
  public final Button btnListenWait;

  @NonNull
  public final Button btnSelectFridaJs;

  @NonNull
  public final EditText txtJsPath;

  @NonNull
  public final EditText txtPort;

  @NonNull
  public final EditText txtSleepNativeMethod;

  @NonNull
  public final EditText txtSmaliTrace;

  private FragmentOtherBinding(@NonNull FrameLayout rootView, @NonNull Button btnListen,
      @NonNull Button btnListenWait, @NonNull Button btnSelectFridaJs, @NonNull EditText txtJsPath,
      @NonNull EditText txtPort, @NonNull EditText txtSleepNativeMethod,
      @NonNull EditText txtSmaliTrace) {
    this.rootView = rootView;
    this.btnListen = btnListen;
    this.btnListenWait = btnListenWait;
    this.btnSelectFridaJs = btnSelectFridaJs;
    this.txtJsPath = txtJsPath;
    this.txtPort = txtPort;
    this.txtSleepNativeMethod = txtSleepNativeMethod;
    this.txtSmaliTrace = txtSmaliTrace;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_other, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnListen;
      Button btnListen = rootView.findViewById(id);
      if (btnListen == null) {
        break missingId;
      }

      id = R.id.btnListenWait;
      Button btnListenWait = rootView.findViewById(id);
      if (btnListenWait == null) {
        break missingId;
      }

      id = R.id.btnSelectFridaJs;
      Button btnSelectFridaJs = rootView.findViewById(id);
      if (btnSelectFridaJs == null) {
        break missingId;
      }

      id = R.id.txtJsPath;
      EditText txtJsPath = rootView.findViewById(id);
      if (txtJsPath == null) {
        break missingId;
      }

      id = R.id.txtPort;
      EditText txtPort = rootView.findViewById(id);
      if (txtPort == null) {
        break missingId;
      }

      id = R.id.txtSleepNativeMethod;
      EditText txtSleepNativeMethod = rootView.findViewById(id);
      if (txtSleepNativeMethod == null) {
        break missingId;
      }

      id = R.id.txtSmaliTrace;
      EditText txtSmaliTrace = rootView.findViewById(id);
      if (txtSmaliTrace == null) {
        break missingId;
      }

      return new FragmentOtherBinding((FrameLayout) rootView, btnListen, btnListenWait,
          btnSelectFridaJs, txtJsPath, txtPort, txtSleepNativeMethod, txtSmaliTrace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}