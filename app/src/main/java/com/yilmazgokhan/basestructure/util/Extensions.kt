package com.yilmazgokhan.basestructure.util

import android.content.Context
import com.afollestad.materialdialogs.MaterialDialog
import com.blankj.utilcode.util.StringUtils
import com.yilmazgokhan.basestructure.R

/**
 * Show alert dialog
 */
fun Context.showMessage(
    stringId: Int,
    onPositive: ((MaterialDialog) -> Unit)? = null
) {
    MaterialDialog(this).show {
        cancelable(false)
        cancelOnTouchOutside(false)
        message(text = StringUtils.getString(stringId))
        positiveButton(R.string.ok) {
            onPositive?.invoke(it)
        }
    }
}