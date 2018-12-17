package com.wakatech.invatarejuridica.helper;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class WordDictionary {

    public HashMap<String,String> descrieri;
    public TreeSet<String> wordList;

    public WordDictionary() {
        descrieri = createMap();
        wordList = createWordList();
    }

    private HashMap<String,String> createMap() {
        HashMap<String, String > map = new HashMap<>();
        map.put("Minor"," copil care nu a împlinit încă vârsta majoratului (18 ani).");
        map.put("Monarhie"," formă de guvernământ în care puterea supremă în stat aparține monarhului (rege, împărat, țar, șah, emir etc).");
        map.put("Democrație"," formă de organizare  și de conducere politică a societății, bazată pe principiul exercitării puterii de către popor.");
        map.put("Pluralism politic"," principiu democratic potrivit căruia funcționarea democrației, garantarea drepturilor și libertăților ar fi condiționată de existența mai multor forțe politico-sociale (partide, sindicate etc.) care să se interpună între individ și stat.");
        map.put("Alienabil"," care se poate înstrăina (prin vânzare, cesiune etc.)");
        map.put("Inviolabil"," care nu poate fi încălcat.");
        map.put("Separația puterilor în stat"," principiu fundamental al democrației, potrivit căruia în stat există trei puteri (legiuitoare, executivă și judecătorească), exercitate de organe diferite, având o anumită interdependență și dreptul de control reciproc.");
        map.put("Legiuitor, - oare"," (instituții ale statului, putere legislativă) care are împuternicirea de a elabora și de a adopta legi.");
        map.put("Executiv, -ă "," (putere executivă) care are sarcina de a pune în aplicare legile și dispozițiile organelor superioare.");
        map.put("Judecătoresc, -ească "," (putere judecătorească) care supraveghează aplicarea legilor.");
        map.put("Regulă "," normă, lege pe baza căreia are loc un proces, se desfășoară o activitate sau se produce un fenomen; precept.");
        map.put("Constituție"," lege fundamentală a unui stat, învestită cu o forță juridică superioară celorlalte legi, prin care sunt fixate modalitățile de încredințare și de exercitare a puterii, drepturile și îndatoririle cetățenilor, constituirea și funcționarea organelor centrale și locale de stat, raporturile dintre ele sau raporturile acestora cu cetățenii etc");
        map.put("Public"," care aparține unei colectivități umane sau provine de la o asemenea colectivitate; care privește pe toți, la care participă toți.");
        map.put("Privat"," care aparține unei persoane ca individ izolat; care este al unei singure persoane; particular; personal; individual.");
        map.put("Autorizație"," permisiune, împuternicire (oficială) de a face ceva.");
        map.put("Încuviințare"," acordare cuiva a unui avantaj cerut. Aprobare.  Permisiune.");
        map.put("Bullying"," comportament ostil/de excludere și de luare în derâdere a cuiva, de umilire.");
        map.put("Agresiune"," atac împotriva unei persoane sau a unui stat.");
        map.put("Instiga"," a îndemna, a incita, a provoca (la acțiuni dușmănoase, violente).");
        map.put("Demnitate"," calitatea de a fi demn, atitudine demnă; autoritate morală, prestigiu.");
        map.put("Răspundere"," faptul de a răspunde; obligația de a răspunde de îndeplinirea unei acțiuni, sarcini etc.; responsabilitate.");
        map.put("Libertate de exprimare"," principiu care susține libertatea unui individ sau a unei comunități de a-și exprima opiniile și ideile fără frica unor represalii, cenzuri sau sancțiuni.");
        map.put("Sancțiune","  pedeapsă prevăzută de lege pentru cei care încalcă dispozițiile ei.");
        map.put("Laic"," care este din afara religiei și a tagmei bisericești, specific acestui domeniu; mirenesc, lumesc.");
        map.put("Testamentar"," privitor la un testament, care este prevăzut într-un testament sau rezultă dintr-un testament.");
        map.put("Bun, bunuri"," (jur.) tot ce posedă cineva (o colectivitate sau un individ); avut, posesiune, proprietate, avere. Bunuri mobile și bunuri imobile.");
        map.put("Matrimonial"," de căsătorie, privitor la căsătorie.");
        map.put("Descendent"," cel care se trage din..., coborîtor din...; urmaș.");
        map.put("Defunct"," (persoană) care a decedat, mort, răposat.");
        map.put("Ascendent"," care urcă; suitor.");
        map.put("O linie ascendentă "," linie genealogică ce suie de la fiu la părinți, de la nepoți la bunici etc");
        map.put("Olograf"," scris în întregime de mâna persoanei care lasă o moștenire - testament olograf");
        map.put("Testator"," Persoană care a făcut un testament, care a testat");
        map.put("Autentic"," sigur, adevărat, garantat, de netăgăduit, a cărui realitate nu poate fi pusă la îndoială, a cărui autoritate este recunoscută.");
        map.put("Abrogat"," care a fost declarat ca fiind lipsit de valabilitate si anulat, desființat.");
        map.put("În vigoare"," (despre legi, dispoziții etc.) valabil într-o anumită perioadă de timp.");
        map.put("Remite"," a preda, a înmâna, a da");
        map.put("Concesiona"," a da în concesiune; a pune la dispoziție printr-un act oficial");
        map.put("Sesizare"," acțiunea de a (se) sesiza și rezultatul ei; pricepere, înțelegere; încunoștințare, aviz.");
        map.put("Folos"," (adesea în legătură cu verbele „a avea”, „a trage”, „a aduce”)  câștig moral sau material");
        map.put("Trafic de influență "," infracțiune penală comisă de o persoană care trage foloase din influența pe care o are asupra altor persoane");
        map.put("Cumpărare de influență "," a intra în posesia unui lucru plătind, a mitui, a corupe.");
        map.put("Vătăma"," a dăuna sănătății, integrității corporale (producând boli, răniri)");
        map.put("Ordin de protecţie"," hotărâre judecătorească civilă, emisă în regim de urgenţă, prin care sunt luate măsuri de siguranţă imediate pentru protejarea integrităţii fizice şi psihice a victimei unui act de violenţă în familie.");
        map.put("Hotărâre/sentință judecătorească"," hotărâre, decizie a unui tribunal, pronunțată în primă instanță.");
        map.put("Trafic de persoane"," (conf. legii) “Recrutarea, transportul, transferul, adăpostirea sau primirea de persoane, inclusiv schimbul sau transferul de control asupra persoanelor în cauză, efectuate sub amenințare sau prin uz de forță sau prin alte forme de constrângere, prin răpire, prin fraudă, prin înșelăciune, prin abuz de putere sau profitând de starea de vulnerabilitate sau prin oferirea sau primirea de bani sau de alte foloase pentru a obține consimțământul unei persoane care deține controlul asupra alteia, în vederea exploatării.” (Directiva 2011/36/EU)");
        map.put("Tulburare de posesie"," (conf. NCP) ocuparea, în întregime sau în parte, fără drept, prin violenţă sau ameninţare ori prin desfiinţarea sau strămutarea semnelor de hotar, a unui imobil aflat în posesia altuia se pedepseşte cu închisoare de la unu la 5 ani sau cu amendă.");
        map.put("Infracţiune"," faptă care prezintă pericol social, săvârşită cu vinovăţie şi prevăzută de legea penală.");
        map.put("Intenție"," dorință, gând de a face, de a întreprinde ceva; proiect, plan.");
        map.put("Cu intenție"," intenționat, înadins.");
        map.put("Fără intenție"," involuntar.");
        map.put("Cu intenția să... "," cu gândul, în dorința de a...");
        map.put("Legitimă apărare"," situație a unei persoane care, pentru a înlătura un atac direct, injust și deosebit de grav, îndreptat împotriva sa, săvârșește o faptă prevăzută de legea penală, dar neconsiderată, în acest caz, infracțiune.");
        map.put("Reabilitare"," acțiunea de a (se) reabilita și rezultatul ei; încetare, în temeiul unei hotărâri judecătorești, a decăderilor, interdicțiilor și incapacităților care rezultau pentru o persoană dintr-o condamnare penală.");
        map.put("Recidivă "," (Jur.) a comite o infracțiune după ce mai fusese condamnat o dată, pentru săvârșirea altei infracțiuni");
        map.put("Complice"," persoană care participă, în mod secundar, la săvârșirea unei acțiuni.");
        map.put("Ilicit"," interzis de lege, contrar unei legi sau unei norme; necinstit.");
        map.put("Abuz"," încălcare a legalității; faptă ilegală.");
        map.put("Vinovăție"," faptul de a fi vinovat; faptă comisă de cel vinovat; starea celui vinovat; culpabilitate, vină.");
        map.put("Culpă"," (Jur) încălcare intenționată (sau nu) a unei obligațiuni contractuale sau a unei prescripții legale; greșeală; vinovăție.");
        map.put("Infractor, ~oare"," persoană care a comis o infracțiune.");
        map.put("Inculpat, ~ă "," (Jur) (persoană) acuzată de o culpă; (persoană) trimisă înaintea unei instanțe judecătorești pentru săvârșirea unui delict; acuzat, învinuit.");
        map.put("Suspect, -ă "," care este bănuit, care dă de bănuit; care inspiră neîncredere, de care trebuie să te ferești; dubios, îndoielnic.");
        map.put("Cauze justificative"," imprejurari care inlatura trasaturile esentiale ale infractiunii – caracterul nejustificat. Cauzele justificative sunt: legitima apărare, starea de necesitate, exercitarea unui drept sau indeplinirea unei obligatii, consimtamantul persoanei vatamate");
        map.put("Neimputabilitate"," situație în care se găsește o persoană căreia i se atribuie săvârșirea cu intenție a unei fapte pedepsite de legea penală.");
        map.put("Cauze de neimputabilitate"," care inlatura imputabilitatea. Cauzele de neimputablitate sunt cauze personale, care nu se rasfrang asupra participantilor, de ele urmand a beneficia doar persoana care a actionat sub imperiul lor: constrangerea fizica, constrangerea morala,  excesul neimputabil, minoritatea faptuitorului, iresponsabilitatea, intoxicatia , eroarea.");
        map.put("Contravenție"," (Jur) încălcare a legii penale, care, având un grad redus de pericol social, este pedepsită cu o amendă sau închisoare pe termen scurt.");
        map.put("Pedeapsă privativă de libertate"," sancțiune care se prezintă sub două forme de pedepse: detenţiunea pe viaţă  și închisoarea de la 15 zile la 30 de ani.");
        map.put("Măsură educativă neprivativă de libertate","sancţiune de drept penal care se aplică minorilor care au comis o infracţiune a cărei gravitate nu necesită privarea de libertate. Acestea sunt: stagiul de formare civică, supravegherea, consemnarea la sfârşit de săptămână şi asistarea zilnică.");
        map.put("Vinovăţie"," trăsătură esenţială a infracţiunii care constă în poziţia subiectivă, exprimată prin intenţie sau culpă, a subiectului infracţiunii, faţă de rezultatele faptei sale; atitudinea psihică a celui care comite o faptă ilicită faţă de fapta sa şi de consecinţele acesteia.");
        map.put("Instigator, -oare"," (persoană) care instigă; ațâțător, provocator, incitator");
        map.put("Răspunderea civilă delictuală "," specia de răspundere juridică prin intermediul căreia o persoană care a cauzat alteia un prejudiciu este obligată să-l repare; răspundere care se naște de regulă ca urmare a nesocotirii unei obligații legale.");
        map.put("Răspunderea civilă contractuală "," încălcarea unei obligații contractuale.");
        map.put("Impozit"," prelevare obligatorie și gratuită, efectuată de către stat asupra resurselor sau bunurilor individuale sau ale colectivităților și plătită în bani.");
        map.put("Taxă"," acele obligații bănești pe care trebuie să le achite persoanele fizice și juridice pentru diferite prestații efectuate de autoritățile publice și constă în sumele de bani prevăzute de hotărâri sau ordonanțe guvernamentale.");
        map.put("Serviciu public"," noțiune de drept administrativ care se referă la acele activități de interes general, coordonate de guvern și disponibile tuturor cetățenilor statului respectiv.");
        map.put("Contribuție"," parte cu care cineva participă la o acțiune sau la o cheltuială comună.");
        map.put("Persoană fizică"," orice om care ia fiinta inca de la nastere si care participa la relatiile sociale prin faptele sale, avand drepturi si obligatii in societate.");
        map.put("Persoană juridică"," ia nastere prin vointa omului, constituindu-se prin contract intr-o societate ce capata personalitate juridica in urma inregistrarii.");
        map.put("Bună credință"," convingere intimă a unei persoane că ceea ce face este bine, conform legii.");
        map.put("Rea credință "," atitudinea sau comportamentul lipsit de corectitudine față de o altă persoană, de obicei, în cadrul unui raport contractual.");
        map.put("Tutelă"," în cazul in care ambii parinti sunt morti, necunoscuti, decazuti din drepturile parintesti, pusi sub interdictie, disparuti ori declarati morti și copilul este lipsit de ingrijirea ambilor parinti, copilul este pus sub tutela.");
        map.put("Instanța de tutelă"," instanta care stabileste  si are in grija tutela.");
        map.put("Prejudicia"," a afecta, a leza. (Această împrejurare a prejudiciat bunul mers al...) a dăuna, a strica, a vătăma.");
        map.put("Reprezentant legal"," persoană care, prin lege, are dreptul şi îndatorirea de a reprezenta, atunci când încheie acte civile şi în procesul penal, pe minorii sub 14 ani sau pe celelalte persoane lipsite de capacitate de exerciţiu aflate sub ocrotirea lor.");
        map.put("Medierea"," formă alternativă de rezolvare a disputelor între două sau mai multe părți ce doresc să ajungă la o înțelegere, cu ajutorul unei terțe persoane, specializate în calitate de mediator.");
        map.put("Administrație"," totalitatea organelor administrative ale unui stat.");
        map.put("Votul universal sau sufragiul universal"," unul din principiile de bază ale democrației, care constă în aceea că dă posibilitatea fiecărui cetățean adult și cu discernământ de a-și exercita activ și pasiv dreptul de vot, adică de a-și alege reprezentanții în legislativ, respectiv de a fi ales ca atare.");
        map.put("Ordonanța de urgență "," un act normativ emis de Guvern în situații extraordinare și a căror reglementare nu poate fi amânată.");
        map.put("Legi","  reguli scrise de conduită ce descriu sau reglează relații specifice între persoane și organizații, ca și măsurile punitive asupra celor ce încalcă aceste reguli de conduită. Constituția României prevede că cetățenii au dreptul să inițieze proiecte de lege, susținute cu o listă cu cel puțin 100.000 semnături");
        map.put("Dispozitie de lege"," prevedere obligatorie cuprinsă într-un act normativ; măsură sau hotărâre luată de un organ ierarhic superior și obligatorie pentru organul în subordine.");
        map.put("Reclamație"," faptul de a reclama; petiție, plângere, prin care se cere ceva sau se aduc anumite învinuiri cuiva. ♦ (Jur.) Sesizare adresată unui organ al administrației de stat în legătură cu încălcarea unui drept al petiționarului, sau unui organ de urmărire penală în legătură cu săvârșirea unei infracțiuni.");
        map.put("Petiție"," cerere scrisă, adresată de către un cetățean sau un grup de persoane unei autorități privind drepturi, interese personale sau publice.");
        return map;
    }

    private TreeSet<String> createWordList() {
        TreeSet<String> words = new TreeSet<>();
        for (String key : this.descrieri.keySet())
            words.add(key);
        return words;
    }


}
