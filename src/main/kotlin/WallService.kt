object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment) {

        var foundId = false

        for (e in posts) {
            if (e.id == comment.id) {
                comments += comment
                foundId = true
                break
            }
        }

        if (!foundId) throw PostNotFoundException("no post with id $comment.id")

    }

    class PostNotFoundException(s: String) : RuntimeException(s)

    fun add(post: Post): Post {
        post.id = if (posts.isNotEmpty())
            posts.last().id + 1
        else 1
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var index = 0
        var res = true

        for (e in posts) {
            index = if (e.id == post.id) posts.indexOf(e)
            else -1
        }
        if (index == -1) res = false
        else {
            post.ownerId = posts[index].ownerId
            post.date = posts[index].date
            posts[index] = post
        }
        return res
    }
}



