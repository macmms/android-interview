package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Picture(
    @SerializedName("large")
    @Expose
    var large: String? = null,

    @SerializedName("medium")
    @Expose
    var medium: String? = null,

    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null
)