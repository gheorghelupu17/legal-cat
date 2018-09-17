package com.wakatech.invatarejuridica.helper;

public class IntrebareFactory {

    public Intrebare[] question = new Intrebare[20];
    public int numberOfQuestions = 20;

    public IntrebareFactory(int level) {
        switch (level) {
            case 1: loadLevel1(); break;
        }
    }

    private void loadLevel1() {
        question[0] = new Intrebare("Sunt izvoare ale dreptului civil, conform art. 1 alin. (1) NCC:", "legea, uzanțele, morala, jurisprudența", "legea, uzanțele, principiile generale ale dreptului și doctrina", "legea, uzanțele și principiile generale ale dreptului", 0, 0, 1);
        question[1] = new Intrebare("Dreptul civil:", "constituie dreptul comun pentru alte ramuri ale dreptului privat", "este o ramură a dreptului public, alături de dreptul penal", "reglementează raporturi juridice ce se stabilesc între persoane fizice și persoane juridice aflate pe poziție de egalitate juridică", 1, 0, 1);
        question[2] = new Intrebare("Principiul proprietății", "reprezintă, ca și principiul egalității în fața legii civile, un principiu general al dreptului civil", "este un principiu constituțional", "prevede faptul că proprietatea privată nu este ocrotită în mod egal de lege, indiferent de titularul său", 1, 1, 0);
        question[3] = new Intrebare("Principiul bunei-credințe:", " Ilustratrează faptul că orice persoană fizică sau juridică trebuie să-și exercite drepturile și să își execute obligațiile civile cu bună-credință", "este aplicabil doar persoanelor fizice", "constituie un principiu general al dreptului civil", 1, 0, 1);
        question[4] = new Intrebare("Reglementările ce derivă din pacte sau tratate privitoare la drepturile fundamentale ale omului, la care România este parte vor fi aplicate:", "cu prioritate în situația existenței unei neconcordanțe între acestea și dispozițiile Codului civil, fără nicio excepție", "cu prioritate în situația existenței unei neconcordanțe între acestea și dispozițiile NCC, cu excepția situației în care acestea din urmă ar conține dispoziții mai favorabile", "în cazul în care nu există dispoziții interne pentru o anumita chestiune", 0, 1, 0);
        question[5] = new Intrebare("Uzanțele:", "neconforme cu ordinea publică și bunele moravuri sunt recunoscute ca izvoare de drept", "în sensul NCC sunt reprezentate de obiceiul (cutuma) și uzurile profesionale", "publicate în culegeri elaborate de către entitățile sau organismele autorizate beneficiază de o prezumție absolută de existență", 0, 1, 0);
        question[6] = new Intrebare("Dispozițiile legii noi se aplică:", "actelor și faptelor încheiate sau, după caz, produse ori săvârșite după intrarea sa în vigoare", "efectelor viitoarea ale situațiilor juridice născute anterior, derivate din căsătorie, dacă acestea subzistă după intrarea în vigoare a legii noi", " tuturor actelor și faptelor încheiate sau, după caz, produse ori săvârșite înainte de intrarea sa în vigoare", 1, 1, 0);
        question[7] = new Intrebare("Jurisprudența", "Curții de Justiție a Uniunii Europene și cea a Curții Europene a Drepturilor Omului constituie izvor de drept civil român", "constituie izvor de drept civil", "nu constituie un izvor de drept civil, de regulă, hotarârea judecătorească  având efecte asupra părților din litigiul respectiv", 1, 0, 1);
        question[8] = new Intrebare("Principiul neretroactivității legii civile:", "a. este un principiu constituțional", "b. stabilește faptul că legea civilă dispune pentru viitor, cu excepția legii penale sau contravenționale mai favorabile", "c. cunoaște o excepție, și anume ultraactivitatea legii civile vechi", 1, 1, 0);
        question[9] = new Intrebare("Principiul aplicării imediate a legii civile noi:", "a. este un  principiu constituțional", "b. implică faptul că dispozițiile legii noi se aplică tuturor actelor și faptelor încheiate sau, după caz, produse ori săvârșite după intrarea sa în vigoare", "c. are ca excepție ultraactivitatea legii civile vechi", 0, 1, 1);
        question[10] = new Intrebare("Legea în vigoare la data încheierii:", "actului juridic se va aplica doar în ceea ce privește condițiile de validitate", "unui contract se aplică în ceea ce privește încheierea, interpretarea, efectele, executarea și încetarea sa, în lipsa unor derogări exprese", "actului juridic se aplică cauzelor de ineficacitate, în lipsa unor derogări exprese", 0, 1, 1);
        question[11] = new Intrebare("Clauza de inalienabilitate instituită prin:", "convenție sau testament, în ceea ce privește validitatea sa, este guvernată de legea în vigoare la data încheierii convenției sau testamentului", "instituită prin convenție, în ceea ce privește efectele sale, este guvernată de legea în vigoare la data încheierii convenției", "instituită prin testament, în ceea ce privește efectele sale, este guvernată de legea în vigoare la data deschiderii succesiunii", 1, 1, 1);
        question[12] = new Intrebare("Actul juridic:", "nul la data intrării în vigoare a legii nu poate fi considerat valabil potrivit legii noi", "poate constitui izvor pentru proprietatea devălmășă, numai pentru actele juridice încheiate după intrarea în vigoare NCC", "în ceea ce privește modificarea sa, este reglementat de prevederile legale în vigoare la data încheierii sale", 1, 1, 0);
        question[13] = new Intrebare("Prevederile legale:", "care permit părților să modifice durata termenelor de prescripție, validează convențiile de modificare, chiar încheiate înainte de intrare în vigoare NCC", "ale CC 1864 care permit revocarea donației pentru surveniență de copil nu se mai aplică în situația în care copilul s-a născut după intrarea în vigoare NCC", "art. 1271, referitoare la impreviziune, se vor aplica și convențiilor încheiate înainte de intrarea în vigoare a NCC ", 0, 1, 0);
        question[14] = new Intrebare("Constituie excepții de la regula conform căreia efectele trecute și viitoare ale unui act juridic vor fi guvernate de legea în vigoare la data încheierii acestuia faptul că:", "contractele de mandat încheiate înainte de înainte NCC, pentru care părțile nu au prevăzut un termen, rămân supuse legii în vigoare la data încheierii actului juridic", "dispozițiile legii noi care oferă locatarului o acțiune directă asupra sublocatarului vor fi aplicabile contractelor de sublocațiune încheiate ulterior intrării în vigoare a NCC", "faptul că dispozițiile referitoare la îmbunătățirile locatarului se vor aplica și contractelor în curs de executare la data intrării în vigoare, în condițiile legii", 0, 1, 1);
        question[15] = new Intrebare("Prescripțiile extinctive și decăderile:", "începute și neîmplinite la data intrării în vigoare a legii noi rămân supuse în întregime dispozițiilor legale care le-au instituit", "începute și neîmplinite la data intrării în vigoare a legii noi sunt reglementate de legea în vigoare la momentul împlinirii acestora", "începute și neîmplinite la data intrării în vigoare a legii noi sunt reglementate de legea în vigoare la data introducerii cererii de chemare în judecată sau de arbitrare", 1, 0, 0);
        question[16] = new Intrebare("Uzucapiunea imobiliară va fi supusă dispozițiilor:", "NCC, dacă posesia a început ulterior momentului intrării în vigoare a actualei reglementări și pentru acel imobil era deschisă cartea funciară", "CC1864, dacă posesia a început ulterior momentului intrării în vigoare NCC și pentru acel imobil nu era deschisă cartea funciară", "NCC, dacă posesia a început ulterior momentului intrării în vigoare a actualei reglementări, fără alte condiții", 1, 1, 0);
        question[17] = new Intrebare("Este excepție de la regula conform căreia exercitarea drepturile de uzufruct ulterior intrării în vigoare NCC se face în conformitate cu prevederile NCC, faptul că:", "în cazul uzufructului constituit prin convenție încheiată anteriori intrării în vigoare NCC, acesta este și rămâne incesibil, în lipsă de stipulație contrară", "dispozițiile referitoare la stingerea uzufructului prin neuz, se aplică drepturilor de uzufruct constituite ulterior intrării în vigoare NCC", "uzufructul constituit anterior intrării în vigoare NCC, se va stinge prin neuz, chiar dacă abuzul de folosință intervine anterior acestei date", 1, 1, 0);
        question[18] = new Intrebare("Obligațiile ce au ca izvor fapte juridice extracontractuale", "sunt supuse dispozițiilor în vigoare la data producerii sau săvârșirii lor, ca regulă", "născute anteriori intrării în vigoare NCC sunt supuse legii noi, în ceea ce privește modurile de stingere", "sunt supuse dispozițiile în vigoare la data executării acestora", 1, 1, 0);
        question[19] = new Intrebare("Moștenirea:", "legală este guvernată, de legea în vigoare la data deschiderii succesiunii", "deschisă înainte de 1.octombrie.2011 va putea atrage aplicarea dispozițiilor NCC privind cazurile de nedemnitate, dacă faptele au fost săvârșite ulterior", "deschisă înainte de 1.octombrie.2011 va putea atrage aplicarea dispozițiilor NCC privind cazurile de nedemnitate,  chiar dacă faptele au fost săvârșite anterior", 1, 1, 0);


    }
}
