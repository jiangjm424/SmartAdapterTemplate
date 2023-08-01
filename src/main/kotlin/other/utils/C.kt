package other.utils

object C {
    const val MIN_API = 21

    fun getFormatName(clazz: String, type: String) = "$clazz$type"

    fun getLayoutXmlString(host: String): String =
            """
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ui.$host">

    <TextView
        android:id="@+id/text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="jmdroid mvvm template layout"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
    """.trimIndent()

    fun jmdroidViewModelKt(packageName: String, viewModel: String): String = """
package $packageName.vm

import androidx.lifecycle.ViewModel

class $viewModel: ViewModel() {
}
""".trimIndent()
}