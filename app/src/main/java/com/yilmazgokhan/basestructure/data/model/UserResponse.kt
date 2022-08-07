package com.yilmazgokhan.basestructure.data.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("login")
    @Expose
    private val login: String? = null,
    @SerializedName("id")
    @Expose
    private val id: Int? = null,
    @SerializedName("node_id")
    @Expose
    private val nodeId: String? = null,
    @SerializedName("avatar_url")
    @Expose
    private val avatarUrl: String? = null,
    @SerializedName("gravatar_id")
    @Expose
    private val gravatarId: String? = null,
    @SerializedName("url")
    @Expose
    private val url: String? = null,
    @SerializedName("html_url")
    @Expose
    private val htmlUrl: String? = null,
    @SerializedName("followers_url")
    @Expose
    private val followersUrl: String? = null,
    @SerializedName("following_url")
    @Expose
    private val followingUrl: String? = null,
    @SerializedName("gists_url")
    @Expose
    private val gistsUrl: String? = null,
    @SerializedName("starred_url")
    @Expose
    private val starredUrl: String? = null,
    @SerializedName("subscriptions_url")
    @Expose
    private val subscriptionsUrl: String? = null,
    @SerializedName("organizations_url")
    @Expose
    private val organizationsUrl: String? = null,
    @SerializedName("repos_url")
    @Expose
    private val reposUrl: String? = null,
    @SerializedName("events_url")
    @Expose
    private val eventsUrl: String? = null,
    @SerializedName("received_events_url")
    @Expose
    private val receivedEventsUrl: String? = null,
    @SerializedName("type")
    @Expose
    private val type: String? = null,
    @SerializedName("site_admin")
    @Expose
    private val siteAdmin: Boolean? = null,
    @SerializedName("name")
    @Expose
    private val name: String? = null,
    @SerializedName("company")
    @Expose
    private val company: String? = null,
    @SerializedName("blog")
    @Expose
    private val blog: String? = null,
    @SerializedName("location")
    @Expose
    private val location: String? = null,
    @SerializedName("email")
    @Expose
    private val email: Any? = null,
    @SerializedName("hireable")
    @Expose
    private val hireable: Boolean? = null,
    @SerializedName("bio")
    @Expose
    private val bio: String? = null,
    @SerializedName("twitter_username")
    @Expose
    private val twitterUsername: String? = null,
    @SerializedName("public_repos")
    @Expose
    private val publicRepos: Int? = null,
    @SerializedName("public_gists")
    @Expose
    private val publicGists: Int? = null,
    @SerializedName("followers")
    @Expose
    private val followers: Int? = null,
    @SerializedName("following")
    @Expose
    private val following: Int? = null,
    @SerializedName("created_at")
    @Expose
    private val createdAt: String? = null,
    @SerializedName("updated_at")
    @Expose
    private val updatedAt: String? = null
)

/*
data class UserResponse(
    private val login: String? = null,
    private val id: Int? = null,
    private val node_id: String? = null,
    private val avatar_url: String? = null,
    private val gravatar_id: String? = null,
    private val url: String? = null,
    private val html_url: String? = null,
    private val followers_url: String? = null,
    private val following_url: String? = null,
    private val gistsUrl: String? = null,
    private val starredUrl: String? = null,
    private val subscriptionsUrl: String? = null,
    private val organizationsUrl: String? = null,
    private val reposUrl: String? = null,
    private val eventsUrl: String? = null,
    private val receivedEventsUrl: String? = null,
    private val type: String? = null,
    private val siteAdmin: Boolean? = null,
    private val name: String? = null,
    private val company: String? = null,
    private val blog: String? = null,
    private val location: String? = null,
    private val email: Any? = null,
    private val hireable: Boolean? = null,
    private val bio: String? = null,
    private val twitterUsername: String? = null,
    private val publicRepos: Int? = null,
    private val publicGists: Int? = null,
    private val followers: Int? = null,
    private val following: Int? = null,
    private val createdAt: String? = null,
    private val updatedAt: String? = null
)


 */