package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Name(
    @SerializedName("title")
    @Expose
    var title: String? = null,

    @SerializedName("first")
    @Expose
    var first: String? = null,

    @SerializedName("last")
    @Expose
    var last: String? = null
)