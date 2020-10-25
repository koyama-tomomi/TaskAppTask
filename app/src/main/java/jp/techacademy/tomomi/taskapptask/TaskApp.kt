package jp.techacademy.tomomi.taskapptask

import io.realm.Realm
import android.app.Application


class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}