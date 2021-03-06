package com.vondear.rxtools.view.dialog;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vondear.rxtools.R;


/**
 * Created by vonde on 2016/7/19.
 * Mainly used for confirmation and cancel.
 */
public class RxDialogSure extends RxDialog {

    private ImageView iv_logo;
    private TextView tv_title;
    private TextView tv_content;
    private TextView tv_sure;

    public ImageView getIv_logo() {
        return iv_logo;
    }

    public TextView getTv_title() {
        return tv_title;
    }

    public TextView getTv_sure() {
        return tv_sure;
    }

    public TextView getTv_content() {
        return tv_content;
    }

    private void initView() {
        View dialog_view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_sure, null);
        tv_sure = (TextView) dialog_view.findViewById(R.id.tv_sure);
        tv_title = (TextView) dialog_view.findViewById(R.id.tv_title);
        tv_content = (TextView) dialog_view.findViewById(R.id.tv_content);
        iv_logo = (ImageView) dialog_view.findViewById(R.id.iv_logo);
        setContentView(dialog_view);
    }

    public RxDialogSure(Context context, int themeResId) {
        super(context, themeResId);
        initView();
    }

    public RxDialogSure(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    public RxDialogSure(Context context) {
        super(context);
        initView();
    }

    public RxDialogSure(Activity context) {
        super(context);
        initView();
    }

    public RxDialogSure(Context context, float alpha, int gravity) {
        super(context, alpha, gravity);
        initView();
    }

}
