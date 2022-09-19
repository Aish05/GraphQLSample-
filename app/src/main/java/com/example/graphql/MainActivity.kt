package com.example.graphql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.exception.ApolloException
import com.apollographql.apollo3.network.okHttpClient
import com.example.graphql.apollo.ApolloInstance
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var client: ApolloClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        client = ApolloInstance().get()
        getRockets()
    }

    fun getRockets() {
        lifecycleScope.launchWhenResumed {
            val response = try {
                client.query(RocketsQuery()).execute().data
            } catch (e: ApolloException) {
                return@launchWhenResumed
            }
            Log.d("TAG", "getRockets:  ${response?.rockets?.get(0)}")
        }
    }
}