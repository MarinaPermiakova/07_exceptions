class Post(
    var id: Int,
    var ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    var date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int = 1,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val postSource: PostSource?,
    val geo: Geo?,
    val signerId: Int,
    val copyHistory: Array<Int>,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
)

class PostSource (
    val type: String,
    val platform: String,
    val data: String,
    val url: String
)

class Geo(
    val type: String,
    val coordinates: String,
    val place: Place
)

class Place(
    val id: Int,
    val title: String,
    val latitude: Int,
    val longitude: Int,
    val created: Int,
    val icon: String,
    val checkins: Int,
    val updated: Int,
    val type: Int,
    val country: Int,
    val city: Int,
    val address: String
)

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int,
)