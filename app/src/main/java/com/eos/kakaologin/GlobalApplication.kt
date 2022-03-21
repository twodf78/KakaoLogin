package com.eos.kakaologin

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import com.kakao.sdk.common.util.Utility

class GlobalApplication() : Application(){

  override fun onCreate() {
    super.onCreate()
    // 다른 초기화 코드들

    // Kakao SDK 초기화
    KakaoSdk.init(this, "7c04f461ae7c3611610ddf43d9cb79c4")

    var keyHash = Utility.getKeyHash(this)
    log(keyHash)
  }
}

fun log(str:Any?)=Log.d("Taehoon","$str")