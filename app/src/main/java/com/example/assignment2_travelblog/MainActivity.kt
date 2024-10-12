package com.example.assignment2_travelblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter=ArticlesAdapter(getArticles())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

    fun getArticles(): List<Article> {
        return listOf(
            Article(
                "Qaqlasht Meadows Chitral – Magnificent Beauty",
                R.drawable.img1,
                "Qaqlasht Meadows is a wide, stunning plateau in the Chitral district of the Khyber Pakhtunkhwa province in northern Pakistan.",
                "Qaqlasht Meadows is a wide, stunning plateau in the Chitral district of the Khyber Pakhtunkhwa province in northern Pakistan. It offers a beautiful landscape and an altitude of about 8,000 feet (2,438 meters) above sea level...",
                "Saba Ghani at September 24, 2024",
                "Read more"
            ),
            Article(
                "Fairy Meadows: Nature's Dreamland",
                R.drawable.img2,
                "Fairy Meadows is a beautiful, lush green plateau, located near one of the base campsites of Nanga Parbat.",
                "Fairy Meadows is a beautiful, lush green plateau, located near one of the base campsites of Nanga Parbat. It is the best place to experience the stunning views of the killer mountain Nanga Parbat...",
                "Ahmad Khan at August 15, 2024",
                "Read more"
            ),
            Article(
                "Deosai National Park – The Land of Giants",
                R.drawable.img3,
                "Deosai National Park is the second highest plateau in the world, known for its untouched beauty and amazing wildlife.",
                "Deosai National Park is the second highest plateau in the world, located in northern Pakistan. Known for its pristine landscapes and rich wildlife, Deosai offers visitors a rare opportunity to see snow leopards and Himalayan brown bears...",
                "Ali Mustafa at July 30, 2024",
                "Read more"
            ),
            Article(
                "Hunza Valley – A Traveler's Paradise",
                R.drawable.img4,
                "Hunza Valley is famous for its stunning mountainous scenery, vibrant culture, and rich history.",
                "Hunza Valley is a popular tourist destination in Pakistan's Gilgit-Baltistan region, offering breathtaking views of the Rakaposhi and Ultar Sar mountains. Visitors can explore ancient forts, glaciers, and experience the hospitality of the local people...",
                "Maria Qureshi at June 18, 2024",
                "Read more"
            ),
            Article(
                "Skardu: Gateway to Karakoram",
                R.drawable.img5,
                "Skardu serves as a gateway to some of the highest peaks in the world, including K2.",
                "Skardu is known for its picturesque landscapes, alpine lakes, and close proximity to some of the highest mountains in the world, including K2. The region is also home to beautiful lakes like Shangrila Lake and Satpara Lake...",
                "Hassan Iqbal at May 10, 2024",
                "Read more"
            ),
            Article(
                "Swat Valley – Switzerland of the East",
                R.drawable.img6,
                "Swat Valley is known for its snow-capped mountains, lush forests, and scenic beauty.",
                "Swat Valley, located in Pakistan’s Khyber Pakhtunkhwa province, is known for its snow-capped mountains, lush green meadows, and rich history. It's often called the Switzerland of Pakistan due to its natural beauty...",
                "Zara Ahmed at April 20, 2024",
                "Read more"
            ),
            Article(
                "Neelum Valley – Kashmir's Hidden Gem",
                R.drawable.img7,
                "Neelum Valley is a hidden gem in the Kashmir region, known for its scenic landscapes and beautiful rivers.",
                "Neelum Valley is one of the most beautiful valleys in Pakistan’s Azad Kashmir region. It features breathtaking landscapes, rivers, forests, and trekking routes that make it an ideal destination for nature lovers...",
                "Usman Bashir at March 11, 2024",
                "Read more"
            ),
            Article(
                "Ratti Gali Lake – The Jewel of Kashmir",
                R.drawable.img8,
                "Ratti Gali Lake is an alpine glacial lake located in the Neelum Valley, known for its stunning beauty.",
                "Ratti Gali Lake is an alpine glacial lake located in Azad Kashmir's Neelum Valley. Surrounded by snow-capped mountains, the lake’s crystal-clear water and beautiful meadows attract tourists and trekkers alike...",
                "Ayesha Hassan at February 22, 2024",
                "Read more"
            ),
            Article(
                "Shogran: A Serene Getaway",
                R.drawable.img9,
                "Shogran is a quiet and peaceful hill station located in the Kaghan Valley.",
                "Shogran is a serene hill station in the Kaghan Valley, offering breathtaking views of the surrounding mountains. With its alpine meadows and thick forests, it’s the perfect spot for a peaceful retreat...",
                "Muneeb Siddiqui at January 14, 2024",
                "Read more"
            ),
            Article(
                "Naltar Valley – Home of Ski Resorts",
                R.drawable.img10,
                "Naltar Valley is famous for its ski resorts, green forests, and stunning lakes.",
                "Naltar Valley, located in Gilgit-Baltistan, is known for its ski resorts, colorful lakes, and lush forests. It’s a top destination for winter sports enthusiasts and nature lovers alike...",
                "Sana Malik at December 5, 2023",
                "Read more"
            )
        )
    }


}