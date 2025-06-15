package com.example.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment


class EventsFragment : Fragment() {
private lateinit var webView: WebView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_events, container, false)

        webView = rootView.findViewById(R.id.webevents)
        webView.loadUrl("https://elitehighschentebbe.com/event.php")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        return rootView
    }
}