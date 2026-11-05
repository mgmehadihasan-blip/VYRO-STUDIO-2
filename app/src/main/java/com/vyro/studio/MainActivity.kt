package com.vyro.studio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { VyroHome() }
    }
}

@Composable
fun VyroHome() {
    val bg = Color(0xFF080D16)
    val ice = Color(0xFF8EDCFF)

    MaterialTheme(colorScheme = darkColorScheme(primary = ice)) {
        Column(
            Modifier.fillMaxSize()
                .background(bg)
                .padding(22.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                "VYRO STUDIO",
                color = ice,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Create beyond limits.",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Surface(
                color = Color(0xFF182433),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier.fillMaxWidth().height(190.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("＋", color = ice, fontSize = 48.sp)
                    Text("Start a new project", color = Color.White)
                    Text("Import videos and photos", color = Color.LightGray)
                }
            }

            Text("TOOLS", color = ice, fontWeight = FontWeight.Bold)

            listOf("Video Editor", "Effects & Filters", "Audio Studio", "Export Video")
                .forEach {
                    Surface(
                        color = Color(0xFF182433),
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            it,
                            color = Color.White,
                            modifier = Modifier.padding(20.dp)
                        )
                    }
                }
        }
    }
}
