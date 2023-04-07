package com.example.mediaplayer

sealed class NavigationItem(var route:String, var icon:Int, var title:String){
    object Video:NavigationItem("video",R.drawable.video_icon, "Video")
    object Audio:NavigationItem("audio",R.drawable.audio_icon, "Audio")
    object Playlists:NavigationItem("playlists",R.drawable.playlist_icon, "Playlists")
    object Settings:NavigationItem("settings",R.drawable.settings_icon,"Settings")
}
