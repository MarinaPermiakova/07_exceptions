class Comment(
    var id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Attachments?,
    val parentsStack: Array<Int>,
    val thread: Threads
)

class Attachments(

)

class Threads(
    val count: Int,
    val items: Array<Int>,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean
)
