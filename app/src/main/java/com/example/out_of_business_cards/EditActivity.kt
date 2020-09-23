package com.example.out_of_business_cards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

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

        //idに文字列をセットしている
        companyEdit.setText(company)
        telEdit.setText(tel)
        addressEdit.setText(address)
        faxEdit.setText(fax)
        emailEdit.setText(email)
        urlEdit.setText(url)
        positionEdit.setText(position)
        nameEdit.setText(name)

        saveBtn.setOnClickListener(){
            savedata()
            finish()
        }
        cancelBtn.setOnClickListener(){
            finish()
        }
    }
    private fun savedata(){

        //SharePreferencesオブジェクトを取得
        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        //SharePreferences.Editorオブジェクトを取得
        val editor = pref.edit()

        //キーとともにデータ書き込み

        editor.putString("company", companyEdit.text.toString())
            .putString("tel", telEdit.text.toString())
            .putString("address", addressEdit.text.toString())
            .putString("fax", faxEdit.text.toString())
            .putString("email", emailEdit.text.toString())
            .putString("url", urlEdit.text.toString())
            .putString("position", positionEdit.text.toString())
            .putString("name", nameEdit.text.toString())

            //非同期に共有プリファレンスに保存
            .apply()
    }
}