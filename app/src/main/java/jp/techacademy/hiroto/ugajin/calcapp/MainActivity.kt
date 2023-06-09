package jp.techacademy.hiroto.ugajin.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import android.content.Intent
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
        binding.textView1.text = "0.0"

        binding.button2.text = "ボタン2"
        binding.button2.setOnClickListener(this)
        binding.textView2.text = "0.0"

        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
    }
    // 以下の関数を追加
    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタン1をタップしました")
        binding.button1.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            binding.textView1.text = binding.editText1.text.toString()
            var a = binding.editText1.text.toString().toDouble()
        }

        binding.button2.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            binding.textView2.text = binding.editText2.text.toString()
            var b = binding.editText2.text.toString().toDouble()
        }

        binding.button3.setOnClickListener {
            val a = binding.textView1.text.toString().toDouble()
            val b = binding.textView2.text.toString().toDouble()
            if (a != 0.0 && b != 0.0) {
                var sum =
                    binding.textView1.text.toString().toDouble() + binding.textView2.text.toString()
                        .toDouble()
                binding.textView3.text = sum.toString()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", sum)
                startActivity(intent)
            } else {
                binding.textView3.text = "数値を入力して下さい"
            }
        }

        binding.button4.setOnClickListener {
            val a = binding.textView1.text.toString().toDouble()
            val b = binding.textView2.text.toString().toDouble()
            if (a != 0.0 && b != 0.0) {
                var sum =
                    binding.editText1.text.toString().toDouble() - binding.editText2.text.toString()
                        .toDouble()
                binding.textView3.text = sum.toString()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", sum)
                startActivity(intent)
            } else {
                binding.textView3.text = "数値を入力して下さい"
            }
        }

        binding.button5.setOnClickListener {
            val a = binding.textView1.text.toString().toDouble()
            val b = binding.textView2.text.toString().toDouble()
            if (a != 0.0 && b != 0.0) {
            var sum = binding.editText1.text.toString().toDouble() * binding.editText2.text.toString().toDouble()
            binding.textView3.text = sum.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", sum)
            startActivity(intent)
            } else {
                binding.textView3.text = "数値を入力して下さい"
            }
        }

        binding.button6.setOnClickListener {
            val a = binding.textView1.text.toString().toDouble()
            val b = binding.textView2.text.toString().toDouble()
            if (a != 0.0 && b != 0.0) {
            var sum = binding.editText1.text.toString().toDouble() / binding.editText2.text.toString().toDouble()
            binding.textView3.text = sum.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", sum)
            startActivity(intent)
            } else {
                binding.textView3.text = "数値を入力して下さい"
            }
        }
    }
}