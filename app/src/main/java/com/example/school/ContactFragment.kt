package com.example.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class ContactFragment : Fragment() {
private lateinit var webView: WebView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_contact, container, false)

        webView = rootView.findViewById(R.id.webcontact)
        webView.loadUrl("https://elitehighschentebbe.com/contact.php")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        return rootView
        }
    }