package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Timezone(
    @SerializedName("offset")
    @Expose
    var offset: String? = null,

    @SerializedName("description")
    @Expose
    var description: String? = null
)