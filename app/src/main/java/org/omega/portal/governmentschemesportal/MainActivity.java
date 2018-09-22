package org.omega.portal.governmentschemesportal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    ArrayList<SchemeData> schemeDataArrayList = new ArrayList<>();
//    String[] mScList = {"Beti Bachao Yojana","Bima Suraksha Yojana","DDU Grameen Kaushal Yojana","Fasal Bima Yojana","Jana Dhana Yojana",
//            "Krishi Vikas Yojana","Maitri Vandana Yojana","Midday Meal Scheme","Scholarship Scheme"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        schemeDataArrayList = populateList();

        recyclerView=(RecyclerView)findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);

        if(schemeDataArrayList != null){
            Log.d(TAG, "onCreate: non null list");
            RecyclerViewAdapter adaptor=new RecyclerViewAdapter(MainActivity.this,schemeDataArrayList);
            recyclerView.setAdapter(adaptor);
        }
    }

    ArrayList<SchemeData> populateList(){
        ArrayList<SchemeData> schemeDataList = new ArrayList<>();
        SchemeData sd = new SchemeData();
        sd.title = "Beti Bachao Yojana";
        sd.description = "Beti Bachao, Beti Padhao (translation: Save girl child, educate a girl child) is a personal campaign of the Government of India that aims to generate awareness and improve the efficiency of welfare services intended for girls. The scheme was launched with an initial funding of ₹100 crore (US$15 million). It mainly targets the clusters in Uttar Pradesh, Haryana, Uttarakhand, Punjab, Bihar and Delhi. According to census data, the child gender ratio (0–6 years) in India was 927 girls per 1,000 boys in 2001, which dropped to 918 girls for every 1,000 boys in 2011. A 2012 UNICEF report ranked India 41st among 195 countries. ";
        sd.incomelimit="N/A";
        sd.applicable="Girls";
        sd.nationality="Indian";
        sd.agegrp="1 to 18";
        sd.status="Active";
        sd.documents="Data Not Available";
        sd.url="http://wcd.nic.in/bbbp-schemes";
        sd.img = R.drawable.beti_bachao;
        schemeDataList.add(sd);

        SchemeData sd2 = new SchemeData();
        sd2.title = "Bima Suraksha Yojana";
        sd2.description = "Pradhan Mantri Suraksha Bima Yojana is a government-backed accident insurance scheme in India. It was originally mentioned in the 2015 Budget speech by Finance Minister Arun Jaitley in February 2015. It was formally launched by Prime Minister Narendra Modi on 9 May in Kolkata. As of May 2015, only 20% of Indias population has any kind of insurance, this scheme aims to increase the number. It has an annual premium of ₹12 (17¢ US) exclusive of taxes. The GST is exempted on Pradhan Mantri Suraksha Bima Yojana. The amount will be automatically debited from the account.";
        sd2.incomelimit="12";
        sd2.applicable="All";
        sd2.nationality="Indian";
        sd2.agegrp="18 to 70";
        sd2.status="Active";
        sd2.documents="•Aadhar would be the primary KYC for the bank account.\n Recently taken passport size photograph\n";
        sd2.url="https://retail.onlinesbi.com/retail/login.htm";
        sd2.img = R.drawable.bima_suraksha;
        schemeDataList.add(sd2);


        SchemeData sd3 = new SchemeData();
        sd3.title = "DDUG Kaushalya Yojna";
        sd3.description = "Deen Dayal Upadhyaya Grameen Kaushalya Yojana or DDU-GKY is a Government of India youth employment scheme. It was launched on 25 September 2014 by Union Ministers Nitin Gadkari and Venkaiah Naidu on the occasion of 98th birth anniversary of Pandit Deendayal Upadhyaya. The Vision of DDU-GKY is to \"Transform rural poor youth into an economically independent and globally relevant workforce\". It aims to target youth, in the age group of 15–35 years. DDU-GKY is a part of the National Rural Livelihood Mission (NRLM), tasked with the dual objectives of adding diversity to the incomes of rural poor families and cater to the career ";
        sd3.incomelimit="N/A";
        sd3.applicable="Poor Youths";
        sd3.nationality="Indian";
        sd3.agegrp="18 to 70";
        sd3.status="Active";
        sd3.documents="Data Not Available";
        sd3.url="http://ddugky.gov.in/apply-now";
        sd3.img = R.drawable.ddu;
        schemeDataList.add(sd3);

        SchemeData sd4 = new SchemeData();
        sd4.title = "Fasal Bima yojna";
        sd4.description = "The Pradhan Mantri Fasal Bima Yojana (Prime Ministers Crop Insurance Scheme) was launched by Prime Minister of India Narendra Modi on 18 February 2016. It envisages a uniform premium of only 2 per cent to be paid by farmers for Kharif crops, and 1.5 per cent for Rabi crops. The premium for annual commercial and horticultural crops will be 5 per cent. The scheme provided income protection to the farmers by insuring production and market risks. The insured farmers were ensured minimum guaranteed income (that is, average yield multiplied by the minimum support price). If the actual income was less than the guaranteed income ";
        sd4.incomelimit="N/A";
        sd4.applicable="Farmers";
        sd4.nationality="Indian";
        sd4.agegrp="N/A";
        sd4.status="Active";
        sd4.documents="•\tDuly completed claim form;\n" +
                "•\tLand records as per Government norms;\n" +
                "•\tCertificate from certifying agency nominated by Government or authorized by the Company.\n" +
                "•\tCopy of Certificate of Insurance.\n" +
                "•\tOther than Government subsidized scheme, two photographs of damaged or loss incurred area of Crop which shows the loss under the Policy.\n" +
                "•\tSowing Certificate or other relevant document to this effect.\n";
        sd4.url="http://www.agri-insurance.gov.in/";
        sd4.img = R.drawable.fasal_bima_yojna;
        schemeDataList.add(sd4);

        SchemeData sd5 = new SchemeData();
        sd5.title = "Jandhan Yojna";
        sd5.description = "Pradhan Mantri Jan Dhan Yojana (PMJDY), Prime Ministers Peoples Wealth Scheme, is a government scheme that aims to expand and make affordable access to financial services such as bank accounts, remittances, credit, insurance and pensions. Under this scheme 1.5 Crore (15 million) bank accounts were opened on inauguration day. Slogan of the Scheme is \"Mera Khatha, Bhagya Vidhatha\" account brings me good fortune\"). In the run up to the formal launch of this scheme, the Prime Minister personally wrote to Chairpersons of all PSU banks to gear up for the gigantic task of enrolling over 7.5 crore (75 million) households.";
        sd5.incomelimit="12 ";
        sd5.applicable="All";
        sd5.nationality="Indian";
        sd5.agegrp="18 to 70";
        sd5.status="Active";
        sd5.documents="•\tAn eligible individual needs to have a valid permanent or current proof of address such as aadhar card, passport and so forth. Aadhaar card is an essential identity proof. Individuals who are yet to receive their Aadhaar cards should track the status of their card online\n" +
                "•\tAn eligible individual should produce his or her two passport-size photographs\n" +
                "•\tIn case an individual shifts or changes his or her residence, he or she should produce the relevant documents which prove the change of address\n" +
                "•\tIn case an individual does not have any residential proof, he or she should submit a valid identity proof issued by the government\n" +
                "•\tEligible individuals can acquire a authority letter from any gazetted officer in the country as proof that he or she is an Indian national or resident of India\n";
        sd5.url="https://www.sbi.co.in/portal/web/agriculture-banking/pmjdy-gallery";
        sd5.img = R.drawable.jan;
        schemeDataList.add(sd5);

        SchemeData sd6 = new SchemeData();
        sd6.title = "Krishi Vikas Yojna";
        sd6.description = "Green Revolution –Paramparagat Krishivikas Yojana\" is an the Umbrella Scheme in agriculture sector that has been implemented since 2016-17 by clubbing several schemes / missions under one umbrella scheme. The scheme has now been continued for the period from 2017-18 to 2019-20 with the Central Share of Rs. 33,269.976 crore. The Umbrella scheme comprises of 11 Schemes/Missions. These schemes look to develop the agriculture and allied sector in a holistic and scientific manner to increase the income of farmers by enhancing production, productivity and better returns on produce.";
        sd6.incomelimit="N/A";
        sd6.applicable="Small Scale Farmers";
        sd6.nationality="Indian";
        sd6.agegrp="All";
        sd6.status="Active";
        sd6.documents="Data Not Available";
        sd6.url="http://www.nrega.nic.in/netnrega/mgnrega_new/Nrega_home.aspx";
        sd6.img = R.drawable.krishi_vikas;
        schemeDataList.add(sd6);

        SchemeData sd7 = new SchemeData();
        sd7.title = "Matru Vandana Yojna";
        sd7.description = "Pradhan Mantri Matru Vandana Yojana (PMMVY), previously Indira Gandhi Matritva Sahyog Yojana (IGMSY), is a maternity benefit program run by the government of India. It was introduced in 2010 and is implemented by the Ministry of Women and Child Development. It is a conditional cash transfer scheme for pregnant and lactating women of 19 years of age or above for the first live birth. It provides a partial wage compensation to women for wage-loss during childbirth and childcare and to provide conditions for safe delivery and good nutrition and feeding practices. In 2013, the scheme was brought under the National Food Security Act, 2013 .";
        sd7.incomelimit="N/A";
        sd7.applicable="Non Working Women";
        sd7.nationality="Indian";
        sd7.agegrp="19 to 40";
        sd7.status="Active";
        sd7.documents="1. Duly Filled Application Form 1-A. \n" +
                "2. Copy of MCP Card (Date of LMP and Registration Health ID ) duly certified by rank of ANM and above. \n" +
                "3. Copy of Aadhaar Card (Both Husband and Wife) or Identity Proof. \n" +
                "4. Copy of Bank / Post Office Account Passbook(Name, Bank, Branch, Account Number, IFSC, MICR) of Beneficiary only. Joint Accounts not acceptable.\n";
        sd7.url="http://wcd.nic.in/schemes-listing/2405";
        sd7.img = R.drawable.matru_vandana;
        schemeDataList.add(sd7);


        SchemeData sd8 = new SchemeData();
        sd8.title = "MGNREGA";
        sd8.description = "National Rural Employment Guarantee Act 2005 (or, NREGA No 42, later renamed as the \"Mahatma Gandhi National Rural Employment Guarantee Act\", MGNREGA), is an Indian labour law and social security measure that aims to guarantee the right to work.cIt aims to enhance livelihood security in rural areas by providing at least 100 days of wage employment in a financial year to every household whose adult members volunteer to do unskilled manual work.cThe act was first proposed in 1991 by P.V. Narasimha Rao. The statute is hailed by the government as \"the largest and most ambitious social security and public works programme in the world\"";
        sd8.incomelimit="N/A";
        sd8.applicable="ALL";
        sd8.nationality="Indian";
        sd8.agegrp="18 to 70";
        sd8.status="Active";
        sd8.documents="Data Not Available";
        sd8.url="http://www.nrega.nic.in/netnrega/mgnrega_new/Nrega_home.aspx";
        sd8.img = R.drawable.mnrega;
        schemeDataList.add(sd8);



        SchemeData sd9 = new SchemeData();
        sd9.title = "Scholarship Scheme ";
        sd9.description = "The Ministry of Minority Affairs, is a ministry of the Government of India established in 2006. It is the apex body for the central governments regulatory and developmental programmes for the minority religious communities in India, which include Muslims, Sikhs, Christians, Buddhists, Zoroastrians (Parsis) and Jains notified as minority communities as notified by GOI in Gazette [2]under Section 2 (c) of the National Commission for Minorities Act, 1992.As of 13 October 2015, head of the ministry, Minister of Minority Affairs is the cabinet minister Mukhtar Abbas Naqvi. The ministry is also involved with the linguistic minorities and of the office of the Commissioner for Linguistic Minorities.";
        sd9.incomelimit="N/A";
        sd9.applicable="Minority Institutes";
        sd9.nationality="Indian";
        sd9.agegrp="N/A";
        sd9.status="Active";
        sd9.documents="Data Not Available";
        sd9.url="https://scholarships.gov.in/";
        sd9.img = R.drawable.scholarship;
        schemeDataList.add(sd9);
        return schemeDataList;
    }


}
