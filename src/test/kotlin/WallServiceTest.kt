import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{

    @Test
    fun createComment(){
        val post = Post(
            id = 4,
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


        val comment = Comment(
            id = 1,
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
        service.add(post)
        service.createComment(comment)
        val result = comment.id
        assertEquals(1, result)
    }

    @Test(expected = WallService.PostNotFoundException::class)
    fun shouldThrow() {
        val post = Post(
            id = 4,
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

        val comment = Comment(
            id = 4555,
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
        service.add(post)
        service.createComment(comment)
    }

    @Test
    fun add() {
        val post = Post(
            id = 2,
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
        val result = post.id
        assertEquals(2, result)
    }

    @Test
    fun updateTrue() {
        val post = Post(
            id = 4,
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

        val post2 = Post(
            id = 4,
            ownerId = 112,
            fromId = 25,
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
        val service = WallService
        service.add(post)
        val result = service.update(post2)

        assertEquals(true, result)
    }

    @Test
    fun updateFalse() {
        val post = Post(
            id = 4,
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

        val post2 = Post(
            id = 10,
            ownerId = 112,
            fromId = 25,
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
        val service = WallService
        service.add(post)
        val result = service.update(post2)

        assertEquals(false, result)
    }


}