package com.example.out_of_business_cards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        //SharePreferencesオブジェクトを取得
        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        //キーとデフォルト値を引数に指定して値を取り出す
        val company = pref.getString("company", "")
        val tel = pref.getString("tel", "")
        val address = pref.getString("address", "")
        val fax = pref.getString("fax", "")
        val email = pref.getString("email", "")
        val url = pref.getString("url", "")
        val position = pref.getString("position", "")
        val name = pref.getString("name", "")

        companyText.text = company
        telText.text = tel
        addressText.text = address
        faxText.text = fax
        emailText.text = email
        urlText.text = url
        positionText.text = position
        nameText.text = name
    }


    //メニューを表示する
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //menuInflaterのinflateクラスでメニューを表示する
        //引数にメニューxmlファイルのリソースIDと追加先のmenuを指定する
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    //メニュー選択時の処理
    //選択したmenuItemがインスタンスとして渡ってくる
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item?.itemId){
            R.id.edit -> {
                
                val intent = Intent(this, EditActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}