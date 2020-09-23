import android.preference.PreferenceManager

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