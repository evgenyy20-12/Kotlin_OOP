import java.util.*

data class Post(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val date: Date,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_asd: Boolean,
    val is_favorite: Boolean,
    val postponed_id: Int
) {
    object Comments {
        var count: Int = 0
        const val can_post: Boolean = true
        const val groups_can_post: Boolean = false
        const val can_close: Boolean = true
        const val can_open: Boolean = false
    }

    object Copyright {
        const val id: Int = 112
        var link: String = "sdfsdf"
        const val name: String = "aaaa"
        const val type: String = "sssss"
    }

    object Likes {
        var count: Int = 0
        const val user_likes: Boolean = true
        const val can_like: Boolean = false
        const val can_publish: Boolean = true
    }

    object Reposts {
        var count: Int = 0
        const val user_reposted: Boolean = false
    }

    object Views {
        var count: Int = 0
    }

    object Donut {
        const val is_donut: Boolean = false
        var paid_duration: Int = 1
        object Placeholder {
        }
        const val can_publish_free_copy: Boolean = true
        var edit_mode: String = "all"
    }

}
