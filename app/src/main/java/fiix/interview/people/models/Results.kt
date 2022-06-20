package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Results(
    @SerializedName("results")
    @Expose
    var results: List<Result> = emptyList()
)