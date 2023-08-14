package com.app.twittercompose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.app.twittercompose.R
import com.app.twittercompose.state.*

val tweets = listOf(
    Tweets(
        tweetId = 1,
        userName = "Yash Londhe",
        userAccountHandle = "@yashltwts",
        userProfilePic = R.drawable.yashltwts,
        content = "Xml is 🤪 Jetpack compose is 🥰 #Android #AndroidDev #Compose #Jetpack #JetpackCompose",
        image = null,
        timeStamp = "10min",
        likeCount = 20,
        retweetCount = 5,
        commentCount = 5
    ),
    Tweets(
        tweetId = 2,
        userName = "Manuel Vivo",
        userAccountHandle = "@manuelvicnt",
        userProfilePic = R.drawable.manuelvicnt,
        content = "Android en Español! Nos vemos luego :)",
        image = R.drawable.tweet_image_1,
        timeStamp = "15min",
        likeCount = 50,
        retweetCount = 25,
        commentCount = 40
    ),
    Tweets(
        tweetId = 3,
        userName = "Leland Richardson",
        userAccountHandle = "@intelligibabble",
        userProfilePic = R.drawable.intelligibabble,
        content = "It's really great to see the community starting to innovate around Compose so quickly!" +
                " Showkase from Airbnb looks great for companies starting to adopt Compose.",
        image = null,
        timeStamp = "1h",
        likeCount = 55,
        retweetCount = 22,
        commentCount = 28
    ),
    Tweets(
        tweetId = 4,
        userName = "Nick Butcher",
        userAccountHandle = "@crafty",
        userProfilePic = R.drawable.crafty,
        content = "I'm so so convinced that #JetpackCompose is the evolution Android UI needed. It makes the easy things easy and the hard things possible." +
                "See how in this video diving into our new samples (http://goo.gle/compose-samples) Down pointing backhand index" +
                "Please try it out and give us feedback.",
        image = null,
        timeStamp = "1h",
        likeCount = 100,
        retweetCount = 20,
        commentCount = 22
    ),
    Tweets(
        tweetId = 5,
        userName = "Sean McQuillan",
        userAccountHandle = "@objcode",
        userProfilePic = R.drawable.objcode,
        content = "Compose works with your apps architecture – and it also creates new opportunities to architect your UI code to improve reusability, testing, and avoid complexity. " +
                "To learn more check the codelab Using State in Jetpack Compose." +
                " Right pointing backhand index.",
        image = null,
        timeStamp = "2h",
        likeCount = 70,
        retweetCount = 40,
        commentCount = 25
    ),
    Tweets(
        tweetId = 6,
        userName = "Chris Banes",
        userAccountHandle = "@chrisbanes",
        userProfilePic = R.drawable.chrisbanes,
        content = "Accompanist v0.1.9 is out Ferry" +
                "Built with #JetpackCompose v0.1.0-dev17 (out today)." +
                "Contains a few small fixes, and updates to Kotlin (thanks @HandstandSam) and Coil.",
        image = null,
        timeStamp = "2h",
        likeCount = 80,
        retweetCount = 55,
        commentCount = 25
    ),
    Tweets(
        tweetId = 7,
        userName = "Yash Londhe",
        userAccountHandle = "@yashltwts",
        userProfilePic = R.drawable.yashltwts,
        content = "WTF 😶" +
                "Really?" +
                "#Android" +
                "#AndroidDev" +
                "#100DaysOfCode",
        image = null,
        timeStamp = "2h",
        likeCount = 25,
        retweetCount = 15,
        commentCount = 20
    ),
    Tweets(
        tweetId = 8,
        userName = "Yash Londhe",
        userAccountHandle = "@yashltwts",
        userProfilePic = R.drawable.yashltwts,
        content = "I launched my first app in my childhood" +
                "It gained around 5 billon downloads" +

                "#Android #AndroidDev #100DaysOfCode #CodeNewbie",
        image = R.drawable.tweet_2,
        timeStamp = "3h",
        likeCount = 22,
        retweetCount = 22,
        commentCount = 22
    ),
//    Tweets(
//        tweetId = 9,
//        userName = "Yash Londhe",
//        userAccountHandle = "@yashltwts",
//        userProfilePic = R.drawable.yashltwts,
//        content = "Starting with Jetpack compose now. Will share some interesting demos in coming days." +
//                "Also Youtube tutorials are coming soon. Stay Tuned " +
//                "#Android #AndroidDev #Compose #Jetpack #JetpackCompose",
//        image = null,
//        timeStamp = "4h",
//        likeCount = 15,
//        retweetCount = 20,
//        commentCount = 18
//    ),
)

val myTweets = tweets.filter {
    it.userAccountHandle.equals("@yashltwts", ignoreCase = true)
}

val allProfiles = listOf(
    Profile(
        userId = 1,
        userName = "Yash Londhe",
        userAccountHandle = "@yashltwts",
        userProfilePic = R.drawable.yashltwts,
        userProfileDescription = "20 • GsSOC'23 • Open Source ❤️• Android \n" +
                "@Google\n" +
                " DSC • Flutter Dev • Rustacean • Cloud Practitioner ☁️•CS Student • DSA • Java • #100DaysOfCode #AndroidDev #DEVCommunity #100DaysOfCode",
        userFollowersCount = 1000,
        userFollowingCount = 200,
        userLocation = "India",
        userJoinedTimeStamp = "Joined December 2018",
        userWebsite = "yashlondhe.tech"
    )
)

val drawerOptions = listOf(
    DrawerItemsData(
        drawerItemIcon = Icons.Outlined.Person,
        drawerItemLabel = "Profile"
    ),
    DrawerItemsData(
        drawerItemIcon = Icons.Outlined.List,
        drawerItemLabel = "Lists"
    ),
    DrawerItemsData(
        drawerItemIcon = Icons.Outlined.ChatBubbleOutline,
        drawerItemLabel = "Topics"
    ),
    DrawerItemsData(
        drawerItemIcon = Icons.Outlined.Bookmarks,
        drawerItemLabel = "Bookmarks"
    ),
    DrawerItemsData(
        drawerItemIcon = Icons.Outlined.FlashOn,
        drawerItemLabel = "Moments"
    ),
)

val drawerAppOptions = listOf(
    DrawerItemsData(
        drawerItemIcon = null,
        drawerItemLabel = "Settings and privacy"
    ),
    DrawerItemsData(
        drawerItemIcon = null,
        drawerItemLabel = "Help Centre"
    ),
)

val myProfile = allProfiles.find {
    it.userAccountHandle.equals("@yashltwts", ignoreCase = true)
}

val profileUiState = ProfileUiState(
    myProfile = myProfile!!
)

val drawerUiState = DrawerUiState(
    myProfile = myProfile!!,
    drawerOptions = drawerOptions,
    drawerAppOptions = drawerAppOptions
)

val homeUiState = HomeUiState(
    allTweets = tweets
)