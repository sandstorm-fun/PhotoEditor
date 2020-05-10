package `fun`.sandstorm.photoeditor

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import ja.burhanrashid52.photoeditor.R


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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context,
        attributes: AttributeSet,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attributes, defStyleAttr, defStyleRes)

    override fun init(attrs: AttributeSet?) {
        super.init(attrs)
        val a = context.obtainStyledAttributes(attrs, R.styleable.PhotoEditorView)
        val imgSrcDrawable = a.getDrawable(R.styleable.PhotoEditorView_photo_src)
        if (imgSrcDrawable != null) {
            wrapContent()
        } else {
            matchParent()
        }
    }

    fun wrapContent() {
        super.getSource().layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        brushDrawingView.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        imageFilterView.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
    }

    fun matchParent() {
        super.getSource().layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        brushDrawingView.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        imageFilterView.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
    }

    override fun setBackgroundResource(resource: Int) {
        super.getSource().setBackgroundResource(resource)
        wrapContent()
    }

    fun removeBackgroundImage() {
        super.getSource().setBackgroundDrawable(null)
        matchParent()
    }

    fun setImageURI(imageUri: Uri) {
        super.getSource().setImageURI(imageUri)
        wrapContent()
    }

    fun setImageBitmap(photo: Bitmap?) {
        super.getSource().setImageBitmap(photo)
        wrapContent()
    }
}