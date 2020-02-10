package `fun`.sandstorm.photoeditor

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.annotation.Keep
import androidx.annotation.RequiresApi


@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
open class PhotoEditorView :
    ja.burhanrashid52.photoeditor.PhotoEditorView {

    constructor(context: Context) : super(context)

    constructor(
        context: Context,
        attributes: AttributeSet
    ) : super(context, attributes)

    constructor(
        context: Context,
        attributes: AttributeSet,
        defStyleAttr: Int
    ) : super(context, attributes, defStyleAttr)

    @Keep
    constructor(
        context: Context,
        attributes: AttributeSet,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attributes, defStyleAttr, defStyleRes)
}