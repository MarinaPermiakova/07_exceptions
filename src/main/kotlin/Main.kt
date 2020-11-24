
fun main() {
    val original = Post(
        id = 22,
        ownerId = 111,
        fromId = 21,
        createdBy = 22,
        date = 22,
        text = "Hello, world!",
        replyOwnerId = 33,
        replyPostId = 33,
        friendsOnly = 1,
        comments = Comments(
            count = 9845,
            canPost = false,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        copyright = "Piotr",
        likes = Likes(
            count = 2,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        reposts = Reposts(
            count = 3,
            userReposted = false
        ),
        views = Views(
            count = 3458
        ),
        postType = "message",
        postSource = null,
        geo = null,
        signerId = 65,
        copyHistory = arrayOf(2, 4),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 44
    )

    val originalUpdated = Post(
        id = 1,
        ownerId = 200,
        fromId = 21,
        createdBy = 22,
        date = 555,
        text = "Hello, cosmos!",
        replyOwnerId = 33,
        replyPostId = 33,
        friendsOnly = 1,
        comments = Comments(
            count = 9845,
            canPost = false,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        copyright = "Vladimir",
        likes = Likes(
            count = 2,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        reposts = Reposts(
            count = 3,
            userReposted = false
        ),
        views = Views(
            count = 3458
        ),
        postType = "message",
        postSource = null,
        geo = null,
        signerId = 65,
        copyHistory = arrayOf(2, 4),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 44
    )

    val comment = Comment(
        id = 111,
        fromId = 45,
        date = 777,
        text = "hello",
        replyToUser = 4,
        replyToComment = 8,
        attachments = null,
        parentsStack = arrayOf(5, 6),
        thread = Threads (
            count = 5,
            items = arrayOf(45, 88),
            canPost = false,
            showReplyButton = true,
            groupsCanPost = true
            )
    )

    val service = WallService
    service.add(original)
    println(original.id.toString() + ", " + original.date.toString() + ", " + original.text)

    service.update(originalUpdated)
    println(originalUpdated.id.toString() + ", " + originalUpdated.date.toString() + ", " + originalUpdated.text)

    service.createComment(comment)
}