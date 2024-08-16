package com.example.buttomnavigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
/*
badna nshof keef fena na3mel buttom navigation using navigation commponents:

bado ykoun 3ana navigation buttom home chat setting
w 3 fragemnt kel w7ade la fragemnt l home ela fragemnt ,chat ela fragemnt teneye w setting ela fragemnt telte

kel ma nekbes 3ala wa7de badna nente2l 3ala fragemnt tenye mn 5elel l navigation buttom bt5alena na3mel switch between fragments

w 7a nshof keef fena na3mel toggle lal icons color bel navigation ya3ne bas nkoun 3ala fragemnt m3yane masln ta3et setting l icon ta3et setting bel navigation ykoun lawna pink


1-2awl she badna na3mel menue feha 3 item le houne l setting,chat home l button ta3wlet navigation buttom
2-mna3mel 3 fragemnt wa7de lal home wa7de lal chats wa7de lal setting
3-hala2 mna3mel l nav graph bas badna nentebh l fragments le 3mlta bel nav graph bado ykoun 3anda nafs l ids ta3wlet l menu le 3mlto so android can know how to setup our bottom navigation using our navigation commponents
4-badna  nrou7 3ala l mainactivity xml na3ml l nav host l fragmnet conatiner
5-badna na3mel ta7t l conatiner nav hot she esmo bottom navigation view lezm l width ykoun matchparent w l height wrapcontent l postion ta3ela lezm ykoun bel parent background white w aham attribute howe app:menue ba3te l menue le 3mlto le esmo bottom_nav_menue bas na3mel hay l attribute l items le 3mlta bel menue ma3 l icon w esm taba3a btbyen b2lab l bottom navigation menue
6-finally lezm na3mel setup lal mainactivity:
-2awl she mnjeeb navhost fragemnt
-tene she mnjeb l navcontrol mn navhost
-mnjeeb hala2 l navigationbuttomview
-ba3den fe method b2alb l bottomnavigation esma setupwithnavcontroller() w bta3teha navcontroller bhay tar2a 3am ta3mel connect lal bottomnavigationview ma3 l nav controller mn5elel hay l method 3am ta3mel syncronization been navigation item b2lab l navigation ma3 l currently active destination b2lab l nav graoh ya3ne bas tekbous 3ala wa7de mn l buttom le ta7t yet8ayar l fragmnet 7asab l buttom w bas yet8ayar l fragemnt tet8ayr l buttom bel navigation(it automatically keeps the selected item in your navigation element in sync with the currently active destination in your navigation graph.) w mnafs l wa2t hay l function (It sets up click listeners on the items in your navigation element, so when a user taps an item, it triggers the corresponding navigation action defined in your navigation graph)

ya3ne men wara hay l method bas nekbous 3ala wa7de mn navigation la7 testd3e l fragemnt le feha nafs l id l item l2no ne7na 7atyna l fragemnt nafs l id ta3et l item le bel menue w b5ale fe syncronization been navigation botom w l fragemnt ya3ne iza kabst 3ala wa7de mn l item fa 7a tkoun dawye ama be2e l icons 7a ykoun lawnoun tafe iza ma 7atyta la hay l method bas tente2l mn home la setting maln l home 7a dala dawye ma 7a tetefe




hla2 la n8ayer loun selected item ya3ne iza mnla7ez bas n8ayer na3mel navigate mn home to setting fa loun setting bseer mouve w l be2e beriu7 lawnoun tyeb feek fene 8ayer heda loun:
ba3mel new resource file w root element selector metl ma mnetzakar selector howe sta3mlne eno bas nekbous 3ala button m3yan byet8ayar lawno byerja3 lawno metl ma howe badna nest3mel nafs l mabda2

bas 2awl she mna3mel directory esmo color l vale color b2labo mna3mel selector
le 3mlne eno 2 item color 2awal wa7de eno ykoun l color red bas tkoun l state checked w ykoun l color black lal item le not checked ykoun black
bel xml bet7ot l icontint w text heda l file le sar bas tekbous 3ala wa7de mn l item fa heye checked fa 7a ykoun text w licon lawnoun a7mar ama lbe2e l icon manon cheked fa 7a ykoun text w l icon lawnoun black

w fene kamen 8ayer l drawble ya3ne iza keen l chat selected l icon ta3el l home 7a ykoun 8eer logo w bas ykoun cheked 3lee 7a ykoun l icon 8eeer:
mnrou7 3aala l drawble mna3mel new resource name it ic_home_dynamic
ba3den mnnrou7 3ala l icon mn8ayer esma la ic_home_selected eno bade hay l icon tkoun bas tkoun heda l item selected
w mna3mel another image home bas 8eer shakl bye5telef shway 3al 2ola w mnsameha ic_home_unselected
ba3den bel menu mn8ayer l icon la heda l file









 */





public class MainActivity extends AppCompatActivity {

    NavHostFragment navHostFragment;
    NavController navController;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navHostFragment=(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        if(navHostFragment!=null){
            navController=navHostFragment.getNavController();
        }
        bottomNavigationView=findViewById(R.id.navigation_bottom);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);




    }
}