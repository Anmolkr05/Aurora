package com.aurora.tv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.aurora.tv.core.designsystem.components.AuroraSurface
import com.aurora.tv.core.designsystem.components.GlassCard
import com.aurora.tv.core.designsystem.theme.AuroraTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            AuroraTheme {

                AuroraSurface {

                    GlassCard {

                    }

                }

            }

        }
    }
}