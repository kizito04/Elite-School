package com.example.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class AcademicsFragment : Fragment() {
    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_academics, container,false)

        webView = rootView.findViewById(R.id.webacademics)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://elitehighschentebbe.com/academics.php")
        webView.webViewClient = WebViewClient()
        return rootView
    }
}