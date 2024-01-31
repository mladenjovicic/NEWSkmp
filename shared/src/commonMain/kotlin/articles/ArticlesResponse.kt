package articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ArticlesResponse(
    @SerialName("status") var status: String? = null,
    @SerialName("totalResults") var totalResults: Int? = null,
    @SerialName("articles") var articles: ArrayList<ArticlesRaw> = arrayListOf()

)
@Serializable
data class ArticlesRaw(
    @SerialName("source") var source: Source? = Source(),
    @SerialName("author") var author: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("url") var url: String? = null,
    @SerialName("urlToImage") var urlToImage: String? = null,
    @SerialName("publishedAt") var publishedAt: String? = null,
    @SerialName("content") var content: String? = null

)

@Serializable
data class Source(
    @SerialName("id") var id: String? = null,
    @SerialName("name") var name: String? = null
)