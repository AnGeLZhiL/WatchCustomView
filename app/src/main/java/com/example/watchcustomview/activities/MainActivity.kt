package com.example.watchcustomview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watchcustomview.R
import com.example.watchcustomview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        <com.example.customview.view.Watch
//        android:id="@+id/watch"
//        android:layout_width="230dp"
//        android:layout_height="270dp"
//        android:textColor="#000000"
//        app:textColor="@color/textColor1"
//        app:backgroundColor="@color/bgc1"
//        app:lineColor="@color/line1"
//        app:arrowsColor="@color/arrows1"
//        app:centerColor="@color/line1"
//        app:layout_constraintBottom_toBottomOf="parent"
//        app:layout_constraintEnd_toEndOf="parent"
//        app:layout_constraintStart_toStartOf="parent"
//        app:layout_constraintTop_toTopOf="parent" />
    }
}