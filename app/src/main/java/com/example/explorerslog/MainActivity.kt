package com.example.explorerslog

// All the imports you need for every stage are already here.
// Grey ones are not used yet. That is fine.
import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.example.explorerslog.ui.theme.ExplorersLogTheme
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale

// You do not need to change MainActivity. It starts the app and shows ExplorersLogApp().
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExplorersLogTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ExplorersLogApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// =====================================================================
// YOUR CODE STARTS HERE
// Commit and push to GitHub at the end of every stage.
// Permissions go in app/src/main/AndroidManifest.xml
// =====================================================================

// ---- Stage 1: the Find data class and currentTime() -------------------

data class Find(
    val note: String,
    val time: String
)
fun currentTime(): String {
    return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
}


// ---- Stage 2: buzz() ---------------------------------------------------



// ---- Stage 3: batteryLevel() -------------------------------------------



// ---- Stage 4: hasNotificationPermission() and sendNotification() -------



// ---- Stage 5: hasLocationPermission(), describeLocation(), getLocation()



// ---- Stretch: openAppSettings() ----------------------------------------



// ---- The app -----------------------------------------------------------
// Stage 1: replace this whole function with the code on your task sheet.
// After that, each stage adds to it.
@Composable
fun ExplorersLogApp(modifier: Modifier = Modifier) {
    val finds = remember { mutableStateListOf<Find>() }
    var note by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("Ready to explore") }
    fun logFind() {
        if (note.isBlank()) {
            status = "Type what you found first"
            return
        }
        finds.add(0, Find(note, currentTime()))
        status = "Logged: $note"
        note = ""
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {
        Text("Explorer's Log", fontSize = 32.sp)
        Text(status)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = note,
            onValueChange = { note = it },
            label = { Text("What did you find?") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = { logFind() }) {
            Text("Log it")
        }
        Spacer(modifier = Modifier.height(16.dp))
        for (find in finds) {
            FindCard(find)
        }
    }
}


// ---- Stage 1: FindCard goes here ---------------------------------------

@Composable
fun FindCard(find: Find) {
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(find.note, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text("Time: ${find.time}")
        }
    }
}

// ---- Preview -----------------------------------------------------------
@Preview(showBackground = true)
@Composable
fun ExplorersLogAppPreview() {
    ExplorersLogTheme {
        ExplorersLogApp()
    }
}

