package fiix.interview.people.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import fiix.interview.people.models.Coordinates
import fiix.interview.people.models.Timezone

data class Location(
    @SerializedName("street")
    @Expose
    var street: String? = null,

    @SerializedName("city")
    @Expose
    var city: String? = null,

    @SerializedName("state")
    @Expose
    var state: String? = null,

    @SerializedName("postcode")
    @Expose
    var postcode: Int? = null,

    @SerializedName("coordinates")
    @Expose
    var coordinates: Coordinates? = null,

    @SerializedName("timezone")
    @Expose
    var timezone: Timezone? = null
)