package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Id(
    @SerializedName("name")
    @Expose
    var name: String? = null,

    @SerializedName("value")
    @Expose
    var value: Any? = null
)