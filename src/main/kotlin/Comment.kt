class Comment(
    var id: Int,
    val from_id: Int,
    val date: Int,
    val text: String,
    val reply_to_user: Int,
    val reply_to_comment: Int,
    val attachments: Attachments?,
    val parents_stack: Array<Int>,
    val thread: Threads
)

class Attachments(

)

class Threads(
    val count: Int,
    val items: Array<Int>,
    val can_post: Boolean,
    val show_reply_button: Boolean,
    val groups_can_post: Boolean
)
