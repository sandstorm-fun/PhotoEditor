package `fun`.sandstorm.photoeditor

import android.content.Context
import android.graphics.Typeface
import android.view.View

class PhotoEditor(builder: Builder) : ja.burhanrashid52.photoeditor.PhotoEditor(builder) {

    class Builder @JvmOverloads constructor (
        val context: Context,
        parentView: PhotoEditorView,
        deleteView: View? = null,
        textTypeface: Typeface? = null,
        emojiTypeface: Typeface? = null,
        isTextPinchZoomable: Boolean = true) : ja.burhanrashid52.photoeditor.PhotoEditor.Builder(context, parentView) {
        init {
            this.setDeleteView(deleteView)
            this.setDefaultTextTypeface(textTypeface)
            this.setDefaultEmojiTypeface(emojiTypeface)
            this.setPinchTextScalable(isTextPinchZoomable)
        }

        override fun setDeleteView(deleteView: View?): Builder {
            return super.setDeleteView(deleteView) as Builder
        }

        override fun setDefaultTextTypeface(textTypeface: Typeface?): Builder {
            return super.setDefaultTextTypeface(textTypeface) as Builder
        }

        override fun setDefaultEmojiTypeface(emojiTypeface: Typeface?): Builder {
            return super.setDefaultEmojiTypeface(emojiTypeface) as Builder
        }

        override fun setPinchTextScalable(isTextPinchZoomable: Boolean): Builder {
            return super.setPinchTextScalable(isTextPinchZoomable) as Builder
        }

        override fun build(): PhotoEditor {
            return PhotoEditor(this)
        }
    }
}