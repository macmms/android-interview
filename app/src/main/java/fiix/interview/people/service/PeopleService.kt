package fiix.interview.people.service

import fiix.interview.people.models.People
import retrofit2.Response
import retrofit2.http.GET

interface PeopleService {

    @GET("?results=75&inc=name")
    suspend fun getRandomUsers(): Response<People>
}