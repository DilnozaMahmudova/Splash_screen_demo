package uz.dilnoza.mobiuz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog.*
import kotlinx.android.synthetic.main.example_page.*
import uz.dilnoza.mobiuz.R
import uz.dilnoza.mobiuz.adapters.AdapterPager
import uz.dilnoza.mobiuz.adapters.AdapterRecycler
import uz.dilnoza.mobiuz.data.Info
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    val list1 = listOf<String>("GB", "XIT", "STATUS")

    var pos by Delegates.notNull<Int>()
    private lateinit var adapter: AdapterPager
    val ls1 = ArrayList<Info>()
    val ls2 = ArrayList<Info>()
    val ls3 = ArrayList<Info>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = AdapterPager(this, ls1, ls2, ls3)
        pager.adapter = adapter
        TabLayoutMediator(tabLay, pager) { tab, position ->
            pos = position
            tab.text = list1[position]
        }.attach()
        ls1.add(
            Info(
                "1 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "10 000",
                "0",
                "0",
                "1000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "3 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "25 000",
                "0",
                "0",
                "3000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "5 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "35 000",
                "0",
                "0",
                "5000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "10 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "55 000",
                "0",
                "0",
                "10000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "12 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "59 000",
                "0",
                "0",
                "12000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "15 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "60 000",
                "0",
                "0",
                "15000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "18 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "65 000",
                "0",
                "0",
                "18000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "30 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "80 000",
                "0",
                "0",
                "30000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "1 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "10 000",
                "0",
                "0",
                "1000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "3 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "25 000",
                "0",
                "0",
                "3000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "5 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "35 000",
                "0",
                "0",
                "5000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "10 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "55 000",
                "0",
                "0",
                "10000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "12 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "59 000",
                "0",
                "0",
                "12000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "15 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "60 000",
                "0",
                "0",
                "15000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "18 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "65 000",
                "0",
                "0",
                "18000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls1.add(
            Info(
                "30 GB",
                "Tarifga kiritilgan trafik hech qachon kuymaydi! \nTarif abonent to'lovi qarzga yechilmaydi. \n Keraksiz xizmatlar yo'q. \nFaqat internet!",
                "80 000",
                "0",
                "0",
                "30000",
                "0",
                "100",
                "100",
                "200",
                "25"
            )
        )
        ls2.add(
            Info(
                "YANGI TOP XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "55 000",
                "5000",
                "5000",
                "12000",
                "5000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI MEGA XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "40 000",
                "1000",
                "1000",
                "6000",
                "1000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI SUPER XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "30 000",
                "1000",
                "1000",
                "4000",
                "400",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "16 000",
                "300",
                "300",
                "1000",
                "30",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI TOP XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "55 000",
                "5000",
                "5000",
                "12000",
                "5000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI MEGA XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "40 000",
                "1000",
                "1000",
                "6000",
                "1000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI SUPER XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "30 000",
                "1000",
                "1000",
                "4000",
                "400",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "16 000",
                "300",
                "300",
                "1000",
                "30",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI TOP XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "55 000",
                "5000",
                "5000",
                "12000",
                "5000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI MEGA XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "40 000",
                "1000",
                "1000",
                "6000",
                "1000",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI SUPER XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "30 000",
                "1000",
                "1000",
                "4000",
                "400",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls2.add(
            Info(
                "YANGI XIT",
                "BEELINE ENG ZO'R XITlari!\nKo'p internet!\nKo'p daqiqalar",
                "16 000",
                "300",
                "300",
                "1000",
                "30",
                "100",
                "120",
                "2000",
                "100"
            )
        )
        ls3.add(
            Info(
                "Status Platinium",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "179 000",
                "VIP",
                "VIP",
                "85 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Gold",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "120 000",
                "VIP",
                "VIP",
                "25 000",
                "8 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Silver",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "77 000",
                "15000",
                "15000",
                "15 000",
                "7 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Platinium New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "189 000",
                "VIP",
                "VIP",
                "100 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Gold New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "130 000",
                "VIP",
                "VIP",
                "30 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Silver New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "88 000",
                "18000",
                "18000",
                "18 000",
                "18 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Platinium",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "179 000",
                "VIP",
                "VIP",
                "85 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Gold",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "120 000",
                "VIP",
                "VIP",
                "25 000",
                "8 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Silver",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "77 000",
                "15000",
                "15000",
                "15 000",
                "7 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Platinium New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "189 000",
                "VIP",
                "VIP",
                "100 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Gold New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "130 000",
                "VIP",
                "VIP",
                "30 000",
                "10 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )
        ls3.add(
            Info(
                "Status Silver New",
                "Faqatgina keraklisi!\nKo'p internet va imtiyozlar!",
                "88 000",
                "18000",
                "18000",
                "18 000",
                "18 000",
                "0",
                "80",
                "1500",
                "150"
            )
        )

    }
}
