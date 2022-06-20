package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class People(
    @SerializedName("results")
    @Expose
    var results: List<Result> = emptyList(),

    @SerializedName("info")
    @Expose
    var info: Info? = null
)