package com.nexters.yetda.android.model

import com.google.firebase.Timestamp
import com.google.gson.annotations.SerializedName

data class UpdateModel(
    // todo SerializedName을 사용할 수 없나??
//    @SerializedName("updated_at")
    var updated_at: Timestamp = Timestamp.now()
)