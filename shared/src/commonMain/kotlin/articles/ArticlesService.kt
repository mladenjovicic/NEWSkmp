package articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {

    private val country: String = "us"
    private val category: String = "business"
    private val apiKey: String = "294e7ca70fa4405a8823d4d778b37a2a"

    suspend fun fetchArticles(): List<ArticlesRaw> {

        val response: ArticlesResponse = httpClient
            .get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey").body()

            return response.articles
    }
}