package jp.techacademy.tomomi.taskapptask

import java.util.Date
import java.io.Serializable
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Task : RealmObject(), Serializable {
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var category:String= ""     //カテゴリー
    var date: Date = Date()     // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}