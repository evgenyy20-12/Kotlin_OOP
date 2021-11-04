import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val date: Date,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAsd: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
)

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }
}















