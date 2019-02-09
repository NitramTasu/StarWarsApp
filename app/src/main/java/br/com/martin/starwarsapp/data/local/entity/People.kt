package br.com.martin.starwarsapp.data.local.entity

import android.arch.persistence.room.Entity
import com.google.gson.annotations.SerializedName


@Entity
data class People(
        var id: Int = 0,
        var name: String = "",
        @SerializedName("hair_color")var hairColor: String = "",
        @SerializedName("skin_color")var skinColor: String = "",
        @SerializedName("eye_color")var eyeColor: String = ""
)