package com.example.assignment_week3
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_back_ground.*

class BackGroundActivity : AppCompatActivity() {
    private var currentBackground :String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_ground)
        //currentBackground= intent.getStringExtra(CURRENT_BACKGROUND)
        currentBackground = getString(R.string.ManC)
        when (currentBackground) {
            getString(R.string.ManC) -> Btn.setImageResource(R.drawable.a)
            getString(R.string.Liv) -> Btn.setImageResource(R.drawable.b)
            getString(R.string.Che) -> Btn.setImageResource(R.drawable.c)
            getString(R.string.ManU) -> Btn.setImageResource(R.drawable.d)
            getString(R.string.Asr) -> Btn.setImageResource(R.drawable.e)
            getString(R.string.Tot) -> Btn.setImageResource(R.drawable.f)
        }
        BtnIa.setOnClickListener(imgManCClicked)
        BtnIb.setOnClickListener(imgLivClicked)
        BtnIc.setOnClickListener(imgCheClicked)
        BtnId.setOnClickListener(imgManUClicked)
        BtnIe.setOnClickListener(imgAsrClicked)
        BtnIf.setOnClickListener(imgTotClicked)

        //BtnSave.setOnClickListener(btnSaveBackgroundClicked)
        //BtnBackGround.setOnClickListener(btnCancleBackgroundClicked)
    }
    private val imgManCClicked = View.OnClickListener {
        BtnIa.setImageResource(R.drawable.a)
        currentBackground = getString(R.string.ManC)
    }

    private val imgLivClicked = View.OnClickListener {
        BtnIb.setImageResource(R.drawable.b)
        currentBackground = getString(R.string.Liv)
    }

    private val imgCheClicked = View.OnClickListener {
        BtnIc.setImageResource(R.drawable.c)
        currentBackground = getString(R.string.Che)
    }

    private val imgManUClicked = View.OnClickListener {
        BtnId.setImageResource(R.drawable.d)
        currentBackground = getString(R.string.ManU)
    }

    private val imgAsrClicked = View.OnClickListener {
        BtnIe.setImageResource(R.drawable.e)
        currentBackground = getString(R.string.Asr)
    }

    private val imgTotClicked = View.OnClickListener {
        BtnIf.setImageResource(R.drawable.f)
        currentBackground = getString(R.string.Tot)
    }
    /*private val btnSaveBackgroundClicked = View.OnClickListener {
        val intent = Intent()
        intent.putExtra(CURRENT_BACKGROUND, currentBackground)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
    //private val btnCancleBackgroundClicked = View.OnClickListener {
        finish()
    }*/
}
