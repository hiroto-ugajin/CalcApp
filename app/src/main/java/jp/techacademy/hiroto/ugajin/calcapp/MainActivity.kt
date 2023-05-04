package jp.techacademy.hiroto.ugajin.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import jp.techacademy.hiroto.ugajin.calcapp.databinding.ActivityMainBinding // 追加

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding // 追加

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 追加
        val view = binding.root // 追加
        setContentView(view)

        binding.button1.text = "ボタン1"
        binding.button1.setOnClickListener(this)
        binding.textView1.text = "数値1"

        binding.button2.text = "ボタン2"
        binding.button2.setOnClickListener(this)
        binding.textView1.text = "数値2"

    }
    // 以下の関数を追加
    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタン1をタップしました")
        binding.button1.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            binding.textView1.text = binding.editText1.text.toString()
        }

        binding.button2.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            binding.textView2.text = binding.editText2.text.toString()
        }
    }
}