import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{

    @Test
    fun createComment(){
        val post = Post(
            id = 4,
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
        )


        val comment = Comment(
            id = 1,
            from_id = 45,
            date = 777,
            text = "hello",
            reply_to_user = 4,
            reply_to_comment = 8,
            attachments = null,
            parents_stack = arrayOf(5, 6),
            thread = Threads (
                count = 5,
                items = arrayOf(45, 88),
                can_post = false,
                show_reply_button = true,
                groups_can_post = true
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
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
        )

        val comment = Comment(
            id = 4555,
            from_id = 45,
            date = 777,
            text = "hello",
            reply_to_user = 4,
            reply_to_comment = 8,
            attachments = null,
            parents_stack = arrayOf(5, 6),
            thread = Threads (
                count = 5,
                items = arrayOf(45, 88),
                can_post = false,
                show_reply_button = true,
                groups_can_post = true
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
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44,

        )
        val result = post.id
        assertEquals(2, result)
    }

    @Test
    fun updateTrue() {
        val post = Post(
            id = 4,
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44,

        )

        val post2 = Post(
            id = 4,
            owner_id = 112,
            from_id = 25,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Vladimir",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44,

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
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
        )

        val post2 = Post(
            id = 10,
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                count = 9845,
                can_post = false,
                groups_can_post = true,
                can_close = true,
                can_open = true
            ),
            copyright = "Vladimir",
            likes = Likes(
                count = 2,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            reposts = Reposts(
                count = 3,
                user_reposted = false
            ),
            views = Views(
                count = 3458
            ),
            post_type = "message",
            signer_id = 65,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
        )
        val service = WallService
        service.add(post)
        val result = service.update(post2)

        assertEquals(false, result)
    }


}