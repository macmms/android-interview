package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Info(
    @SerializedName("seed")
    @Expose
    var seed: String? = null,

    @SerializedName("results")
    @Expose
    var results: Int? = null,

    @SerializedName("page")
    @Expose
    var page: Int? = null,

    @SerializedName("version")
    @Expose
    var version: String? = null
)