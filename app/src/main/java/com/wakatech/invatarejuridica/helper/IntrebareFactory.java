package com.wakatech.invatarejuridica.helper;

public class IntrebareFactory {

    public Intrebare[] question = new Intrebare[100];
    public int numberOfQuestions;

    public static String levelNames[] = {
            "General ",
            "General II ",
            "General III ",
            "General IV ",
            "General V ",
            "Civil si familie I ",
            "Civil si familie II ",
            "Civil si familie III ",
            "Civil si familie IV ",
            "Civil si familie V ",
            "Civil si familie VI ",
            "Drept notarial ",
            "Administrativ I ",
            "Administrativ II ",
            "Financiar ",
            "Drept penal ",
    };

    public IntrebareFactory(int level) {
        switch (level) {
            case 1:
                loadLevel1();
                initNumberOfQuestions();
                break;
            case 2:
                loadLevel2();
                initNumberOfQuestions();
                break;
            case 3:
                loadLevel3();
                initNumberOfQuestions();
                break;
            case 4:
                loadLevel4();
                initNumberOfQuestions();
                break;
            case 5:
                loadLevel5();
                initNumberOfQuestions();
                break;
            case 6:
                loadLevel6();
                initNumberOfQuestions();
                break;
            case 7:
                loadLevel7();
                initNumberOfQuestions();
                break;
            case 8:
                loadLevel8();
                initNumberOfQuestions();
                break;
            case 9:
                loadLevel9();
                initNumberOfQuestions();
                break;
            case 10:
                loadLevel10();
                initNumberOfQuestions();
                break;
            case 11:
                loadLevel11();
                initNumberOfQuestions();
                break;
            case 12:
                loadLevel12();
                initNumberOfQuestions();
                break;
            case 13:
                loadLevel13();
                initNumberOfQuestions();
                break;
            case 14:
                loadLevel14();
                initNumberOfQuestions();
                break;
            case 15:
                loadLevel15();
                initNumberOfQuestions();
                break;
            case 16:
                loadLevel16();
                initNumberOfQuestions();
                break;
            default:
                break;
        }
    }

    private void initNumberOfQuestions() {
        boolean notSet = true;
        for (int i = 0; i < question.length && notSet; i++) {
            if (question[i] == null) {
                notSet = false;
                numberOfQuestions = i;
            }

        }
    }

    public static String getLevelNameByNumber(int levelNumber)
    {
        return levelNames[levelNumber];
    }

    public static int getLevelNumberByName(String levelName) {
        for (int i = 0; i<levelNames.length; i++) {
            if (levelNames[i].equals(levelName))
                return i;
        }
        return -1;
    }


    //general1

    private void loadLevel1()
    {
        question[0] = new Intrebare("România este:  ","O monarhie ","Un stat drept, democratic şi social, în care demnitatea omului, drepturile şi libertăţile cetăţenilor, libera dezvoltare a personalităţii umane, dreptatea şi pluralismul politic reprezintă valori supreme, în spiritul tradiţiilor democratice ale poporului român şi idealurilor Revoluţiei din decembrie 1989, şi sunt garantate. ","O republică comunistă ",0,1,0);
        question[1] = new Intrebare("În România:  ","Respectarea legilor nu este obligatorie niciodată ","Respectarea legilor este opțională ","Respectarea Constituției, a supremației sale și a legilor este obligatorie.  ",0,0,1);
        question[2] = new Intrebare("Teritoriul României:  ","Este alienabil ","Nu este bine stabilit, deoarece România nu are frontiere  ","Teritoriul este organizat, sub aspect administrativ, în comune, oraşe şi judeţe. În condiţiile legii, unele oraşe sunt declarate municipii. ",0,0,1);
        question[3] = new Intrebare("Statul român:  ","Are ca fundament dezbinarea poporului român ","România este patria comună şi indivizibilă a tuturor cetăţenilor săi, fără deosebire de rasă, de naţionalitate, de origine etnică, de limbă, de religie, de sex, de opinie, de apartenenţă politică, de avere sau de origine socială. ","Nu există statul român ",0,1,0);
        question[4] = new Intrebare("Partidele politice din România:  ","Nu reprezintă interesele nimănui ","Nu sunt legal recunoscute ","Se constituie şi îşi desfăşoară activitatea în condiţiile legii. Ele contribuie la definirea şi la exprimarea voinţei politice a cetăţenilor, respectând suveranitatea naţională, integritatea teritorială, ordinea de drept şi principiile democraţiei. ",0,0,1);
        question[5] = new Intrebare("Drapelul României: ","Este multicolor ","Are o frunză galbenă în prim plan ","Este tricolor; culorile sunt aşezate vertical, în ordinea următoare începând de la lance: albastru, galben, roşu. ",0,0,1);
        question[6] = new Intrebare("Limba oficială a României este  ","Limba Maghiară ","Limba Română ","Limba Engleză ",0,1,0);
        question[7] = new Intrebare("Capitala României este:  ","București ","Cluj Napoca ","Sibiu ",1,0,0);
        question[8] = new Intrebare("Cetățenii au următoarele drepturi:  ","Cetățenii sunt mai presus de orice lege ","Cetăţenii sunt egali în faţa legii şi a autorităţilor publice, fără privilegii şi fără discriminări. ","Cetățenii nu sunt egali în drepturi ",0,1,0);
        question[9] = new Intrebare("Ce înseamnă că cetățenii au acces liber la justiție: ","Orice persoană se poate adresa justiţiei pentru apărarea drepturilor, a libertăţilor şi a intereselor sale legitime ","Legile pot îngrădi accesul cetățenilor la justiție ","Justiția nu urmărește interesele cetățenilor ",1,0,0);
        question[10] = new Intrebare("Dreptul la viață și la integritate fizică și psihică înseamnă că: ","Pedeapsa cu moartea este permisă în România ","Oamenii pot fi supuși torturii în România ","Dreptul la viaţă, precum şi dreptul la integritate fizică şi psihică ale persoanei sunt garantate. ",0,0,1);
        question[11] = new Intrebare("Libertatea individuală și siguranța persoanei: ","Libertatea individuală şi siguranţa persoanei sunt inviolabile. ","Arestarea preventivă a unei persoane se dispune de judecător atunci când dorește acesta ","Percheziţionarea, reţinerea sau arestarea unei persoane sunt permise oricând și în orice condiții ",1,0,0);
        question[12] = new Intrebare("Cetățenii:   ","Sunt obligați să rămână în țară, nu au voie să părăsească țara ","Au dreptul de a-şi stabili domiciliul sau reşedinţa în orice localitate din ţară, de a emigra, precum şi de a reveni în ţară. ","Nu au voie să părăsească țara mai mult de 30 de zile.  ",0,1,0);
        question[13] = new Intrebare("Fiecare cetățean deține:  ","Libertatea gândirii şi a opiniilor, precum şi libertatea credinţelor religioase nu pot fi îngrădite sub nici o formă. Nimeni nu poate fi constrâns să adopte o opinie ori să adere la o credinţă religioasă, contrare convingerilor sale. ","Obligația de a critica o altă persoană pentru alegerile pe care le face ","Obligația de a spune altei persane ce să facă. ",1,0,0);
        question[14] = new Intrebare(" Sunt interzise de lege: ","Exprimarea opiniilor personale ","Defăimarea ţării şi a naţiunii, îndemnul la război de agresiune, la ură naţională, rasială, de clasă sau religioasă, incitarea la discriminare, la separatism teritorial sau la violenţă publică, precum şi manifestările obscene, contrare bunelor moravuri. ","Exprimarea gândurilor sau a credințelor personale ",0,1,0);
    }

    //general2
    private void loadLevel2()
    {
        question[0] = new Intrebare("Dreptul la muncă al cetățenilor:  ","Este îngrădit ","Este obligatoriu de la 16 ani ","Nu poate fi îngrădit. Alegerea profesiei, a meseriei sau a ocupaţiei, precum şi a locului de muncă este liberă. ",0,0,1);
        question[1] = new Intrebare("Familia:  ","a. Este obligatoriu a fi încheiată la 18 ani ","b. Nu este recunoscută prin lege ","c. Se întemeiază pe căsătoria liber consimţită între soţi, pe egalitatea acestora şi pe dreptul şi îndatorirea părinţilor de a asigura creşterea, educaţia şi instruirea copiilor ",0,0,1);
        question[2] = new Intrebare("Dreptul la învățătură: ","Este asigurat prin învăţământul general obligatoriu, prin învăţământul liceal şi prin cel profesional, prin învăţământul superior, precum şi prin alte forme de instrucţie şi de perfecţionare. ","Nu este obligatoriu în nicio etapă ","Învățământul este obligatoriu a se face în școlile de stat. ",1,0,0);
        question[3] = new Intrebare("Dreptul la grevă:  ","Nimeni nu are dreptul la grevă ","Au dreptul la grevă doar cei cu studii superioare ","Salariaţii au dreptul la grevă pentru apărarea intereselor profesionale, economice şi sociale. ",0,0,1);
        question[4] = new Intrebare(". Ziua națională a României este:  "," 1 mai;  "," 1 iunie;  "," 1 decembrie.  ",0,0,1);
        question[5] = new Intrebare(". Culorile drapelului României sunt:  "," alb, roșu;  "," albastru, galben, roșu;  "," verde, alb, roșu;  ",0,1,0);
        question[6] = new Intrebare(". Imnul național al României este:  "," „Deșteptă-te române”;  "," „Trei culori”;  "," „Hora României”.  ",1,0,0);
        question[7] = new Intrebare(". Statul român este organizat pe principiul separației următoarelor puteri:  "," legislativă, executivă și mass-media;  "," executivă și judecătorească;  "," legislativă, executivă și judecătorească.  ",0,0,1);
        question[8] = new Intrebare(". Legile:  "," sunt reguli obligatorii; "," sunt reguli facultative;  "," uneori sunt obligatorii, alteori sunt facultative.  ",1,0,0);
        question[9] = new Intrebare(". Legea fundamentală a României este:  "," Constituția;  "," Codul penal;  "," Codul civil.  ",1,0,0);
        question[10] = new Intrebare(". Legile sunt adoptate de:  "," Parlament;  "," Guvern;  "," Consiliile județene sau locale.  ",1,0,0);
        question[11] = new Intrebare(". Legile sunt aplicate de către:  "," judecători;  "," Președintele României;  "," Parlamentul României.  ",1,0,0);
        question[12] = new Intrebare(". Statul român este reprezentat de către:  "," Președintele României;  "," ministrul justiției;  "," primul-ministru.  ",1,0,0);
        question[13] = new Intrebare(". Președintele României este ales de către:  "," Parlament;  "," Comisia Europeană;  "," cetățenii cu drept de vot.  ",0,0,1);
        question[14] = new Intrebare(". Cetățenii au drept de vot de la împlinirea vârstei de:  "," 14 ani;  "," 18 ani;  "," 20 ani.  ",0,1,0);

    }


    ///general3
    private void loadLevel3()
    {
        question[0] = new Intrebare(". Căsătoria între rude:  "," este permisă întotdeauna;  "," nu este permisă niciodată;  "," nu este permisă între rude până la gradul 4 inclusiv (adică verișorii), ca regulă.  ",0,0,1);
        question[1] = new Intrebare(". De regulă, obligația de a asigura creșterea, educația și instruirea copiilor o are/au:  "," doar mama;  "," doar tata;  "," ambii părinți.  ",0,0,1);
        question[2] = new Intrebare(". Minorii:  "," pot fi angajați ca salariați indiferent de vârstă;  "," pot fi angajați ca salariați cel mai devreme la împlinirea vârstei de 15 ani;  "," nu pot niciodată fi angajați ca salariați.  ",0,1,0);
        question[3] = new Intrebare(". O persoană poate răspunde penal:  "," de la împlinirea vârstei de 14 ani;  "," indiferent de vârstă;  "," numai dacă este adultă.  ",1,0,0);
        question[4] = new Intrebare(". În România, pedeapsa cu moartea:  "," este permisă;  "," este interzisă;  "," este permisă în situații excepționale. ",0,1,0);
        question[5] = new Intrebare("Poți deține legal un cont de Facebook:  ","De la vârsta de 13 ani ","De la vârsta de 15 ani ","De la vârsta de 18 ani ",1,0,0);
        question[6] = new Intrebare(" Nu avem voie să:  ","Dezvăluim conținutul unei comunicări (scrisă sau orală: mesaje, scrisori sau convorbiri telefonice sau față în față), care nu ne aparține ","Publicăm poze pe Internet cu noi înșine ","Avem o opinie vis-a-vis de o știre publicată pe internet ",1,0,0);
        question[7] = new Intrebare(" Peretele contului de Facebook este considerat: ","Spațiu public ","Spațiu privat ","Spațiu general ",1,0,0);
        question[8] = new Intrebare("Interceptarea și înregistrarea comunicărilor, discuțiilor, mesajelor, poate avea loc: ","Mereu, prin programe speciale ","Doar cu autorizație ","Oricând ne dorim ",0,1,0);
        question[9] = new Intrebare("Părintele care retrage copilul de la școală sau îl împiedică să urmeze cursurile învățământului general obligatoriu este: ","Sancționat ","Nu se întâmplă nimic, această decizie îi aparține strict părintelui ","Avertizat de către autorități ",1,0,0);

    }


    ///general4
    private void loadLevel4()
    {
        question[0] = new Intrebare("Elevii au îndatorirea de a: ","Întocmi lucrări originale și de a respecta drepturile de autor ale altor persoane, în redactarea propriilor lucrări ","Provoca, instiga și participa la acte de violență în unitatea școlară și în afara ei ","Pune porecle colegilor ",1,0,0);
        question[1] = new Intrebare(" Elevii care obțin rezultate deosebite în activitatea școlară și extrașcolară pot primi următoarele recompense:  ","Recomandări pentru a beneficia, cu prioritate, de excursii sau tabere de profil din țară și din străinătate  ","Facilități pentru părinții sau reprezentanții lor legali în relațiile cu instituțiile Statului ","Nu primesc niciun fel de recompense ",1,0,0);
        question[2] = new Intrebare(" Părăsirea incintei școlii de către elevii majori: ","Este permisă, se face pe propria răspundere ","Este absolut interzisă ","Este obligatorie ",1,0,0);
        question[3] = new Intrebare(" Elevii nu sunt obligați: ","Să poarte uniformă ","Să meargă/să se prezinte la orele de studiu ","Să ia prânzul la cantina școlii ",1,0,0);
        question[4] = new Intrebare("În ce condiții avem dreptul la liberă exprimare? ","Avem dreptul la liberă exprimare atât timp cât prin ce spunem nu aducem atingere drepturilor altora ","Avem dreptul la liberă exprimare în orice condiții ","Niciodată nu avem dreptul la liberă exprimare ",1,0,0);
        question[5] = new Intrebare(" Minorii  au accesul interzis: ","În sala de curs ","În sălile cu jocuri mecanice și/sau cazinouri ","În bibliotecile școlare ",0,1,0);
        question[6] = new Intrebare(" Dacă dai volumul la muzică prea tare, în intervalele orare 22:00-08:00, 13:00-14:00 și tulburi liniștea locuitorilor din imobil sau vecinilor este posibil: ","Să fii recompensat de organele de politie  "," Să fii sancționat cu amendă în cuantum de la 500 de lei până la 1500 de lei ","Să faci închisoare ",0,1,0);
        question[7] = new Intrebare(" România este un stat: ","Laic ","Religios ","România nu este stat ",1,0,0);
        question[8] = new Intrebare("Polițiștii au dreptul să legitimeze și să rețină persoane, iar ca urmare a acestui fapt este obligată să aibă asupra sa cartea de identitate persoana care a împlinit vârsta de: ","18 ani ","14 ani ","20 ani ",0,1,0);
        question[9] = new Intrebare(" Care organ al legii stabilește cine are dreptate, atunci când două sau mai multe persoane nu se înțeleg  pentru că s-au încălcat niște drepturi? ","Procurorul ","Judecătorul ","Președintele țării ",0,1,0);

    }
    //general5
    private void loadLevel5()
    {
        question[0] = new Intrebare(" Care sunt instanțele (instituții) judecătorești din România? ","Înalta Curte de Casație și Justiție, Curțile de Apel, Tribunalele, Judecătoriile ","Parchetele ","Parlamentul ",1,0,0);
        question[1] = new Intrebare("Judecătorii iau hotărâri conducându-se după: ","Propriile lor păreri, voința lor proprie ","Lege și pe baza probelor de la dosar ","Judecătorii nu iau hotărâri ",0,1,0);
        question[2] = new Intrebare("Care organ al legii lucrează cu poliția la identificarea infractorului, conduce cercetarea penală și stabilește dacă infractorul trebuie tras la răspundere? ","Procurorul ","Judecătorul ","Avocatul ",1,0,0);
        question[3] = new Intrebare(" Unde lucrează procurorii, în ce instituții? ","În instanțele judecătorești ","În Parchetele de pe lângă fiecare instanță judecătorească ","În birourile de avocați ",0,1,0);
        question[4] = new Intrebare("Ce alcătuiesc judecătorii și procurorii? ","Corpul magistraților ","Corpul justiției ","Corpul de pază al președintelui ",1,0,0);
        question[5] = new Intrebare("Se poate cere schimbarea pregătirii profesionale, de către tânărul care a împlinit vârsta de 14 ani? ","Nu, nu are acest drept ","Da, dar doar cu încuviințarea instanței judecătorești ","Depinde de cum sunt părinții ",0,1,0);
        question[6] = new Intrebare(" Ce presupune ,,bullying’’-ul? ","Un hobby ","Fapte în urma cărora o persoană este intimidată, hărțuită, terorizată, fiind supusă unor agresiuni verbale, psihice, fizice (uneori), devenind o țintă a răutăților spuse de agresori ","O poveste spusă de jurnaliști pentru a-i speria pe copii ",0,1,0);
        question[7] = new Intrebare(" Ce trebuie să facem când suntem victima bullyingului? ","Nimic, ne lăsăm intimidați, agresorul poate încetează ","Anunțăm profesorul, părinții sau chiar depunem plângere la poliție ","Agresăm și noi persoana violentă ",0,1,0);
        question[8] = new Intrebare(" Elevii au următoarele drepturi:  ","Dreptul la respectarea imaginii, demnității, personalității și la protecția datelor personale; dreptul la burse și la 50% reducere la transportul local în comun ","Dreptul de a folosi telefonul mobil oricând ","Dreptul de a decide de unii singuri ",1,0,0);
        question[9] = new Intrebare("Elevii nu au dreptul să: ","Urmeze ora de religie; dreptul de a evalua profesorii, în mod anonim, semestrial ","Înregistreze activitatea didactică ","Dețină permis la bibliotecă ",0,1,0);
    }

    //civil+familie1
    private void loadLevel6()
    {
        question[0] = new Intrebare("Minorul este: ","Persoana fizică care nu aîmplinit vârsta de 18 ani și nu a dobândit capacitate deplină de exercițiu ","Persoana fizică de la naștere și până la vârsta de 22 ani ","Persoana juridică ",1,0,0);
        question[1] = new Intrebare("Minorul: ","Poate încheia singur  acte juridice ","Nu poate încheia singur acte juridice ","Poate încheia acte juridice doar cu acordul primarului din localitate ",0,1,0);question[2] = new Intrebare("Motivul pentru care minorul nu poate încheia acte juridice este că:  ","Nu este suficient dezvoltat fizic și psihic, deci nu are discernământul necesar pentru a participa singur la circuitul civil ","Nu îl lasă părinții săi ","Nu are destulă inteligență emoțională ",1,0,0);question[3] = new Intrebare("Minorii sunt ocrotiți de părinții săi:  ","În mod egal, indiferent dacă minorul este din căsătorie, din afara căsătoriei sau din adopție ","În mod preferențial, după cum vor părinții ","Minorul nu are nevoie de protecție ",1,0,0);
        question[2] = new Intrebare("Capacitatea deplină de exercițiu începe din momentul în care: ","Persoana devine majoră ","Persoana împlinește vârsta de 16 ani ","Când decide persoana în cauză ",1,0,0);question[5] = new Intrebare("Minorul dobândeste, prin căsătorie: ","Capacitate deplină de exercițiu ","Capacitate lărgită de exercițiu ","Capacitatea de a se angaja ",1,0,0);
        question[3] = new Intrebare("Se poate recunoaște capacitatea de exercițiu deplină a minorului care a împlinit vârsta de 16 ani, de către: ","Instanța de tutelă ","Primăria din localitatea de reședință ","Președintele țării ",1,0,0);
        question[4] = new Intrebare("Minorul de 14 ani poate încheia singur: ","Acte de vânzare-cumpărare a imobilelor ","Acte de administrare care nu îl păgubesc/prejudiciază ","Orice acte ",0,1,0);
        question[5] = new Intrebare("Persoana pusă sub interdicție judecătorească poate să încheie:  ","Acte de conservare ","Acte de înstrăinare a bunurilor ","Acte de justiție ",1,0,0);
        question[6] = new Intrebare("Cartea de identitate: ","este eliberată pentru prima dată la vârsta de 14 ani ","nu este obligatoriu  să o aveți asupra voastră mereu ","este nesemnificativă ",1,0,0);
        question[7] = new Intrebare("Are dreptul la integritate fizică și psihică: ","Orice persoană ","Persoanele cu capacitate deplină de exercițiu/ persoanele majore ","Nicio persoană ",1,0,0);
        question[8] = new Intrebare("Are dreptul la liberă exprimare: ","Orice persoană ","Persoanele care sunt membre ale unor asociații constituite legal ","Nicio persoană nu are dreptul la liberă exprimare ",1,0,0);
        question[9] = new Intrebare("Reprezintă o atingere a vieții private: ","Interceptarea fără drept a unei convorbiri private ","Interceptarea autorizată a unei convorbiri private ","Interceptarea nu este legală ",1,0,0);

    }

    //civil+familie2
    private void loadLevel7()
    {
        question[0] = new Intrebare("Are dreptul la liberă exprimare: ","Orice persoană ","Persoanele care sunt membre ale unor asociații constituite legal ","Nicio persoană nu are dreptul la liberă exprimare ",1,0,0);
        question[1] = new Intrebare("Reprezintă o atingere a vieții private: ","Interceptarea fără drept a unei convorbiri private ","Interceptarea autorizată a unei convorbiri private ","Interceptarea nu este legală ",1,0,0);
        question[2] = new Intrebare(" Este atingere adusă vieții private: ","Captarea sau utilizarea imaginii sau vocii unei persoane, aflate în spațiu privat, fără acordul acesteia ","Captarea sau utilizarea imaginii sau vocii unei persoane, aflate în spațiu public, fără acordul acesteia ","Orice captare sau utilizare a imaginii sau vocii unei persoane ",1,0,0);
        question[3] = new Intrebare("Numele unei persoane este format din: ","Numele de familie și prenumele ","Prenumele, porecla și numele de familie ","Porecla ",1,0,0);
        question[4] = new Intrebare(" Schimbarea numelui unui cetățean român este posibilă:  ","La cererea oricărei persoane; ","La cererea persoanei interesate în condițiile legii ","La cererea judecătorului ",0,1,0);
        question[5] = new Intrebare("O persoană care deține mai multe locuințe are, automat:  ","Mai multe domicilii în același timp ","Mai multe reședințe în același timp ","Mai multe case în proprietate personală ",0,1,0);
        question[6] = new Intrebare("Reședința unei persoane fizice este: ","Acolo unde își are locuința principală ","Acolo unde își are locuința secundară. ","Casa personală  ",0,1,0);
        question[7] = new Intrebare("Minorul care a împlinit vârsta de 14 ani încheie acte juridice:  ","Cu încuviințarea scrisă a tutorelui sau a curatorului ","Fără încuviințarea scrisă a tutorelui sau a curatorului ","Cu încuviințarea bunicilor ",1,0,0);
        question[8] = new Intrebare("Minorul în vârstă de 16 ani se poate căsători: ","Cu încuviințarea părinților ","Cu încuviințarea părinților și autorizația instanței ","Nu are nevoie de nicio încuviințare ",1,0,0);
        question[9] = new Intrebare("Bunicii și nepoții sunt: ","Rude ","Afini ","Prieteni de familie ",1,0,0);

    }



    //civil+familie3
    private void loadLevel8()
    {
        question[0] = new Intrebare(" Minorul necăsătorit, care are discernământ, poate recunoaște copilul său: ","Singur ","Numai cu recunoașterea părinților sau instanței ","Nu are voie să aibă copii ",1,0,0);
        question[1] = new Intrebare("Părinții au îndatorirea/obligația de a crește copilul în condiții care să îi asigure: "," In principal dezvoltarea fizică a copilului ","Dezvoltarea fizică, mentală, spirituală, morală și socială a copilului ","Confort material  ",0,1,0);
        question[2] = new Intrebare("Măsurile disciplinare care pot fi luate de părinți față de copii trebuie: ","Să respecte demnitatea copilului ","Să urmărească stabilirea fricii față de părinți ","Să sperie copilul ",1,0,0);
        question[3] = new Intrebare("Ziua mondială a drepturilor copilului este: ","1 ianuarie ","20 noiembrie ","1 iulie ",0,1,0);
        question[4] = new Intrebare(" Cetățenia indică: ","Apartenența la un stat ","Apartenența la un popor ","Apartenența la o familie ",1,0,0);
        question[5] = new Intrebare("Naționalitatea indică: ","Apartenența la un stat ","Apartenența la un neam ","Apartenența la o familie ",0,1,0);
        question[6] = new Intrebare("O persoană se identifică prin: ","Nume, domiciliu, cetățenie ","Notele de la școală, numărul de prieteni, familie ","Cât de bogată financiar este ",1,0,0);
        question[7] = new Intrebare("Două persoane care se căsătoresc devin: ","Rude ","Soți ","Prieteni ",0,1,0);
        question[8] = new Intrebare("Logodna este:  ","Atunci când două persoane se căsătoresc ","Atunci când două persoane de sex diferit își fac promisiunea reciprocă de a încheia căsătoria în viitor. ","Atunci când două persoane de sex diferit se iubesc.  ",0,1,0);
        question[9] = new Intrebare("Pentru ca logodna să fie considerată un act juridic valabil, logodnicii trebuie să aibă vârsta minimă de: ","18 ani, ca regulă generală și 16 ani, în mod excepțional ","22 de ani, ca regulă generală ","13 ani, ca regula generală ",1,0,0);

    }


    //civil+familie4
    private void loadLevel9()
    {
        question[0] = new Intrebare("Căsătoria se poate încheia, ca regulă,  la împlinirea vârstei de: ","15 ani ","18 ani ","21 ani ",0,1,0);
        question[1] = new Intrebare("Legea se aplică, ca regulă, doar: ","Pe viitor ","Pentru trecut ","Doar pentru o perioadă de 30 de zile ",1,0,0);
        question[2] = new Intrebare("O lege intră în vigoare: ","După ce a fost votată de Parlamentul României ","La 3 zile de la publicarea în Monitorul Oficial ","După publicarea în cursuri de specialitate ",0,1,0);
        question[3] = new Intrebare("Actul juridic reprezintă: ","O manifestare de voință a părților ","Un articol de lege ","O inițiativă legislative ",1,0,0);
        question[4] = new Intrebare("Capacitatea deplină de exercițiu se dobândește la vârsta de: ","14 ani ","21 ani ","18 ani ",0,0,1);
        question[5] = new Intrebare("Ca excepție, căsătoria se poate încheia la împlinirea vârstei de: ","14 ani ","16 ani cu dispensa din partea autorității tutelare ","Oricând ",0,1,0);
        question[6] = new Intrebare("Drepturile și obligațiile civile trebuie executate: ","Așa cum dorește fiecare ","Conform regulilor anturajului ","Cu bună credință ",0,0,1);
        question[7] = new Intrebare("Subiectele dreptului civil sunt: ","Persoanele fizice și persoanele juridice ","Terenuri și construcții ","Ipoteca și gajul ",1,0,0);
        question[8] = new Intrebare("Persoana fizica este: ","Societatea comercială plătitoare de TVA ","Omul, privit individual, ca titular de drepturi și obligații ","Funcția pe care o poate deține o persoană ",0,1,0);
        question[9] = new Intrebare("Cetățenii apatrizi sunt; ","Persoane ce nu au un domiciliu în România ","Persoane fără cetățenie ","Persoane ce au cetățenia și domiciliul în state ce nu fac parte din Uniunea Europeană ",0,1,0);
    }


    ///civil+familie5
    private void loadLevel10()
    {
        question[0] = new Intrebare(" Toate persoanele: ","Sunt egale în fața legii ","Sunt obligate după vârsta de 80 de ani să întocmească un testament ","Sunt obligate să facă parte din organizarea unei persoane juridice ",1,0,0);
        question[1] = new Intrebare("Drepturile copilului sunt recunoscute: ","De la vârsta de 14 ani ","De la momentul concepției, cu condiția să se nască viu ","Din momentul în care intră la școală ",0,1,0);
        question[2] = new Intrebare("Minorul se poate căsători: ","La vârsta de 14 ani ","La vârsta de 16 ani cu acordul instanței de tutelă ","Căsătoria minorului este strict interzisă prin lege ",0,1,0);
        question[3] = new Intrebare("Minorul sub 14 ani poate încheia singur următoarele acte juridice: ","Testament ","Contract de vânzare a unui apartament ","Acte de mica însemnătate precum achiziționarea de rechizite școlare ",0,0,1);
        question[4] = new Intrebare("Pentru actele de valoare mărită, minorul este asistat la încheierea acestora de către: ","a.  Părinți sau reprezentatul legal ","b. Cadrele didactice din școala unde învață ","c. Primarul din localitatea unde acesta are domiciliul ",1,0,0);
        question[5] = new Intrebare("Persoana fizică nu mai poate încheia (nici singura și nici prin reprezentare) acte juridice: ","a. După ce împlinește vârsta de 90 de ani ","b. În cazul în care pierde cetățenia română ","c. Când este declarată decedată în baza unei hotărâri judecătorești ",0,0,1);
        question[6] = new Intrebare("Orice persoană are dreptul la: ","a. Viață privată ","b. A deține permis de conducere ","c. A deține o funcție publică ",1,0,0);
        question[7] = new Intrebare("Numele de familie se poate schimba astfel: ","a.  Printr-o declarație dată în fața notarului public ","b. Prin căsătorie ","c. În urma partajului dintre foști soți ",0,1,0);
        question[8] = new Intrebare("Domiciliul minorului este: ","a. La domiciliul părinților săi ","b. La școala unde acesta învață ","c. La căminul unde este cazat pe durata studiilor ",1,0,0);
        question[9] = new Intrebare("Este interzisă căsătoria: ","a. Între persoane de etnii diferite ","b. Între cetățeni străini ","c. Între rude până la gradul 4 inclusiv ",0,0,1);

    }


    //civil+familie6
    private void loadLevel11()
    {
        question[0] = new Intrebare("Nu poate încheia acte juridice: ","a. Persoana pusă sub interdicție judecătorească ","b. Cetățeanul străin ","c. Apatridul ",1,0,0);
        question[1] = new Intrebare("Căsătoria poate înceta prin: ","a. Separarea în fapt a soților ","b. Divorț ","c. Nașterea unui copil din afara căsătoriei ",0,1,0);
        question[2] = new Intrebare("Afinitatea reprezintă: ","a. Legătura dintre un soț și rudele celuilalt soț ","b. Legătura de afecțiune dintre cei doi soți ","c. Bunurile dobândite de către soți în timpul căsătoriei ",1,0,0);
        question[3] = new Intrebare("Părinții au obligația de a întreține copii până: ","a. La vârsta de 16 ani ","b. Până la momentul căsătoriei copilului ","c. Până la finalizarea studiilor dar fără a depăși vârsta de 26 ani ",0,0,1);
        question[4] = new Intrebare("Care sunt cele mai des întâlnite cauze care deschid un conflict?  ","Cauzele pot fi legate de incompatibilitatea temperamentului, a personalităţii sau pot fi expresia intereselor personale ","Nu există cauze și nici conflicte ","Cauzele conflictelor sunt doar de natură religioasă ",1,0,0);
        question[5] = new Intrebare("Conflictele pot fi rezolvate prin mediere. Ce este medierea?  ","O modalitate de soluționare a conflictelor pe cale amiabilă, care se bazează pe încredere, sprijin și comunicare întrepărțile conflictului.  ","O meditație la română ","O meditație la matematică ",1,0,0);
        question[6] = new Intrebare("În școală se pot rezolva conflictele prin mediere? ","Da, conflictele se pot rezolva în școală de către profesori, părinți sau chiar elevi. ","Nu, conflictele se pot rezolva doar la judecătorie ","Nu, conflictele se pot rezolva doar la primăria din localitate ",1,0,0);
        question[7] = new Intrebare("Cine este mediatorul?  ","Persoana care facilitează comunicarea dintre părțile conflictului și le sprijină să găsească soluții la problemele pe care le au.  ","Profesorul care dă meditații la română ","Profesorul care dă meditații la matematică ",1,0,0);
        question[8] = new Intrebare("Ca excepție, minorul de 16 ani se poate logodi: ","Numai dacă are încuviințarea părinților săi, sau, după caz, a celui în grija căruia se află ","Dacă așa dorește el ","Dacă are încuviințarea prietenilor ",1,0,0);
        question[9] = new Intrebare("De ce este important ca un conflict care are loc în școală să se rezolve prin mediere?  ","Prin intermediul medierii salvaţi relaţia cu celălalt, economisiţi timp şi stres, nu acumulaţi supărări care vă pot afecta emoţional, vă afirmaţi ca o persoană inteligentă și înțeleaptă  ","Nu este important, conflictele din școală se rezolvă doar la judecătorie ","Pentru că este obligatoriu, așa spune legea ",1,0,0);

    }

    //drept notarial
    private void loadLevel12()
    {
        question[0] = new Intrebare("Moștenirea este: ","a. O formă de recunoștință față de cel decedat ","b. O formă de transmitere a bunurilor de la persoana decedată către moștenitorii acestuia ","c. Drepturile și obligațiile dobândite de către o persoană la momentul nașterii ",0,1,1);
        question[1] = new Intrebare("Soțul supraviețuitor este: ","a. Persoana cu care a trăit în ultima parte a bolii cel care a decedat ","b. Persoana cu care era căsătorită la data decesului ","c. Persoana cu care a încheiat o convenție matrimonială în vederea încheierii căsătoriei ",0,1,0);
        question[2] = new Intrebare("Descendenții defunctului (cel despre a cărui moștenire este vorba) sunt: ","a. Părinți ","b. Frați ","c. Copii adoptați  ",0,0,1);question[3] = new Intrebare("În cazul în care nu există moștenitori legali sau testamentari, moștenirea va fi culeasă de către: ","Unitatea administrativ teritorială unde defunctul a avut ultimul domiciliu ","Persoanele care l-au îngrijit pe defunct pe perioada bolii ce a cauzat decesul ","Ultima unitate sau angajatorul unde și-a desfășurat activitatea profesională  ",1,0,0);
        question[4] = new Intrebare("Ascendenții defunctului sunt: ","a. Părinții sau bunicii acestuia ","b. Frații sau nepoții de frate a acestuia ","c. Unchi/mătuși sau verișorii acestuia ",1,0,0);
        question[5] = new Intrebare("Testamentul este olograf dacă: ","a. Este semnat de către notarul public ","b. Este scris și semnat de către primarul din localitatea unde domiciliază testatorul ","c. Este scris în întregime, semnat și datat de mâna testatorului ",0,0,1);
        question[6] = new Intrebare("Testamentul autentic este: ","a. Actul întocmit de către notarul public ","b. Actul întocmit de către avocat ","c. Actul întocmit de către judecător ",1,0,0);
        question[7] = new Intrebare("Testamentul poate fi revocat: ","a. De către copiii testatorului ","b. De către testator oricând ","c. De către beneficiarul testamentului ",0,1,0);
        question[8] = new Intrebare("Ca și regulă generală, o lege: ","a. Își produce efecte după ce intră în vigoare ","b. Produce efecte și după ce este abrogată ","c. Își produce efecte pentru toate situațiile anterioare născute înainte de intrarea ei în vigoare ",1,0,0);
        question[9] = new Intrebare("Prin contract de donație se înțelege: ","a. Transmiterea unui bun în schimbul unei sume de bani ","b. Transmiterea unui bun în schimbul unui alt bun ","c. Transmiterea unui bun fără a fi nevoie de a da ceva în schimb ",0,0,1);
        question[10] = new Intrebare("Testamentul își produce efecte juridice: ","a. În timpul vieții testatorului ","b. După decesul testatorului ","c. După ce a fost autentificat de către notarul public ",0,1,0);
        question[11] = new Intrebare(" Pentru a fi valabil, un contract de împrumut trebuie: ","a. Să conțină o sumă de bani ","b. Să fie încheiat de către notarul public ","c. Să se remită efectiv bunul împrumutat ",0,0,1);
        question[12] = new Intrebare("  Proprietatea publică a statului nu poate fi: ","a. Vândută ","b. Concesionată ","c. Exploatată ",1,0,0);
        question[13] = new Intrebare("În cadrul moștenirii legale, pot avea calitatea de moștenitori: ","a. Verișorii persoanei decedate ","b. Societatea comercială unde persoana decedată a avut acțiuni ","c. Fostul soț de care persoana decedată a divorțat ",1,0,0);

    }

    //administrativ 1
    private void loadLevel13()
    {
        question[0] = new Intrebare("Cum este organizată administrația publică? ","Administrația centrală, administrația de stat în teritoriu ","Administrația centrală, administrația de stat în teritoriu, administrația locală.  ","Administrația președințială ",0,1,0);
        question[1] = new Intrebare(" Din cine este alcătuit Guvernul?  ","Prim-ministru, ministru  ","Prim-ministru, ministru și alți membri stabiliți prin lege organică ","Președintele țării, primarul și prefectul ",0,1,0);
        question[2] = new Intrebare("Până când își exercită Guvernul mandatul? ","Guvernul își exercită mandatul până la data validării alegerilor parlamentare unice  ","Guvernul își exercită mandatul până la data validării alegerilor parlamentare generale, dar în anumite situații prevăzute de Constituție ","Guvernul își exercită mandatul până la data validării alegerilor teritoriale ",0,1,0);
        question[3] = new Intrebare("Atribuțiile Guvernului sunt:  ","Doar de natură politică ","De natură politico-administrativă și economico-financiară ","Doar de natură medicală ",0,1,0);
        question[4] = new Intrebare("Actele adoptate de Guvern se numesc:  ","Ordine ","Ordonanțe (simple sau de urgență) și hotărâri.  ","Reguli ",0,1,0);
        question[5] = new Intrebare("Actele adoptate de Guvern:  ","Se publică în Monitorul Oficial ","Nu se publică nicăieri ","Se publică doar pe internet ",1,0,0);
        question[6] = new Intrebare("Rolul central în funcționarea Guvernului aparține: ","Președintelui ","Prim-ministrului  ","Prefectului ",0,1,0);
        question[7] = new Intrebare("Toate actele juridice adoptate de Guvern: ","Sunt semnate de prim-ministru iar în cazul în care nu se poate realiza consensul pentru adoptarea unui act, prim-ministrul are dreptul de a decide ","Sunt semnate de Președinte ","Nu sunt semnate de nimeni ",1,0,0);
        question[8] = new Intrebare("Ministerele aparțin de:  ","Administrația publică de specialitate  ","Administrația publică teritorială ","Administrația publică locală ",1,0,0);
        question[9] = new Intrebare("Ministerele:  ","Au personalitate juridică și sediul în municipiul București.  ","Nu au personalitate juridică ","Au sediul în fiecare județ ",1,0,0);
        question[10] = new Intrebare("Ministerele sunt conduse de:  ","Miniștri ","Primari ","Președintele țării ",1,0,0);

    }

    //administrativ2
    private void loadLevel14()
    {
        question[0] = new Intrebare("Prefectul este:  ","Reprezentantul Guvernului în teritoriu ","Reprezentantul Guvernului la București ","Reprezentantul Guvernului în străinătate ",1,0,0);
        question[1] = new Intrebare("Administrația publică locală este organizată în: ","Consiliul local, primarul, consiliul județean, președintele consiliului județean ","Ministru ","Prefect ",1,0,0);
        question[2] = new Intrebare("Mandatul Consiliului local este de: ","4 ani ","10 ani ","3 ani ",1,0,0);
        question[3] = new Intrebare("Primarul este șeful administrației publice locale  și îndeplinește o funcție:  ","De autoritate publică ","De director ","De șef de birou ",1,0,0);
        question[4] = new Intrebare("Primarul este ales pentru un mandat de : ","4 ani prin vot universal, egal direct, secret, liber exprimat prin scrutin uninominal de către cetățenii cu drept de vot dintr-o anumită unitate administrativ-teritorială ","10 ani prin vot universal, egal direct, secret, liber exprimat prin scrutin uninominal de către cetățenii cu drept de vot dintr-o anumită unitate administrativ-teritorială ","2 ani ",1,0,0);
        question[5] = new Intrebare("Actele emise de Primar sunt acte administrative și se numesc:  ","Dispoziții ","Lege  ","Ordonanțe de urgență ",1,0,0);
        question[6] = new Intrebare("Consiliul județean este compus din: ","Consilieri aleși prin vot universal, egal, direct, secret și liber exprimat, pe baza scrutinului de listă, de către cetățenii cu drept de vot dintr-un județ ","Consilieri aleși de Președintele țării ","Consilieri aleși de primar ",1,0,0);
        question[7] = new Intrebare("Mandatul Consiliului județean este de:  ","4 ani ","6 ani ","3 ani ",1,0,0);
        question[8] = new Intrebare("Președintele Consiliului Județean este:  ","Un organ al administrației publice locale cu caracter executiv, care reprezintă județul în relațiile cu celelalte autorități publice, persoane fizice sau juridice române și străine, precum și în justiție ","Directorul unei firme ","Șeful de birou ",1,0,0);
        question[9] = new Intrebare("Constituția României garantează cetățenilor două drepturi prin care aceștia se pot informa cu privire la activitatea administrației publice și de a acționa împotriva eventualelor abuzuri:  ","Dreptul la petiție și dreptul persoanei vătămate de autoritate publică ","Dreptul de a tulbura ordinea și liniștea publică atunci când doresc ","Dreptul de a nu respecta legile atunci când se simt abuzați ",1,0,0);
        question[10] = new Intrebare("Prin petiție se înțelege:  ","Orice cerere, reclamație, sesizare ori propunere, formulată în scris sau prin e-mail, pe care un cetățean o poate adresa autorităților și instituțiilor publice centrale și locale ","Orice reclamație care nu are probe ","Orice cerere depusă la judecătorie ",1,0,0);
        question[11] = new Intrebare("Autoritatea publică are obligația: ","Să comunice petiționarului un răspuns în termen de  30 de zile de la data înregistrării petiției ","Nu are nicio obligație ","Să comunice petiționarului un răspuns atunci când are chef și timp ",1,0,0);

    }

    //financiar
    private void loadLevel15()
    {
        question[0] = new Intrebare("Un impozit este: ","o taxă ","o sumă de bani  ","o contribuţie. ",0,1,0);
        question[1] = new Intrebare("O taxă este datorată: ","când cumpărăm un bun ","când beneficiem de un serviciu public ","când mergem în vacanţă. ",0,1,0);
        question[2] = new Intrebare("O contribuţie socială este o sumă de banidatorată: ","pentru a fi asigurat în viitor ","doar de cetăţenii români ","uneori şi de animale. ",1,0,0);
        question[3] = new Intrebare("O persoană fizică datorează impozit ","când nu are niciun venit ","când are venituri din muncă, ca şi salariat ","când primeşte un cadou. ",0,1,0);
        question[4] = new Intrebare("O persoană fizică datorează impozit: ","când merge la medic pentru o consultaţie ","când cumpără combustibil pentru maşină ","când plăteşte parcarea. ",0,1,0);
        question[5] = new Intrebare("O societate, care operează un magazine de haine: ","datorează numai un impozit ","datorează mai multe impozite, unele pentru ea, altele pentru salariaţi ","nu datorează niciun impozit dacă nu vinde nimic ",0,1,0);
        question[6] = new Intrebare("Un mic comerciant, care are o tonetă cu verdeţuri, are obligaţia: ","de a se înregistra fiscal ","de a avea salariaţi ","de a face reclamă ",1,0,0);
        question[7] = new Intrebare("Pentru o tranzacţie economică, este necesar să se emită: ","întotdeauna factură ","întotdeauna bon fiscal ","uneori factură, uneori bon fiscal, chiar şi amândouă. ",0,0,1);
        question[8] = new Intrebare("Unele impozite: ","sunt incluse în preţul unor produse ","nu sunt datorate niciodată ","sunt mai mari pentru unele personae decât pentru altele ",1,0,0);
        question[9] = new Intrebare("Un copil în vârstă de 10 ani : ","nu datorează niciodată impozite ","nu datorează niciodată impozite şi nici taxe ","datorează impozite ori taxe, în funcţie de acţiunile sale. ",0,0,1);
    }

    //Drept penal
    private void loadLevel16()
    {
        question[0] = new Intrebare("Termenul de corupţie provine din: ","latină – coruptio, -onis şi franceză - coruption ","spaniolă - coruptere ","portugheză - coruptiones ",1,0,0);
        question[1] = new Intrebare("Ce este corupţia? ","comportamentul unei persoane care luptă pentru putere, pentru a domina o altă persoană ","încălcarea dispozițiilor interne ale unei instituții de către un funcționar ","comportamentul unui funcţionar care, în schimbul banilor sau al unor/altor foloase necuvenite foloseşte funcţia publică pentru a obține un avantaj în nume personal. ",0,0,1);
        question[2] = new Intrebare("Care sunt cauzele corupției? ","lipsa de stabilitate legislativă; organizarea necorespunzătoare a instituţiilor şi autorităţilor publice; factorii economici; lipsa unei educaţii corespunzătoare etc. ","indulgența factorilor de conducere/șefilor ","doar factorii economici. ",1,0,0);
        question[3] = new Intrebare("Cine este autorul următorului enunț: „Ori de câte ori suntem în îndoială, trebuie să alegem calea prin care greșim mai puțin?” ","Homer ","Aristotel ","Hannibal ",0,1,0);
        question[4] = new Intrebare("În Țara Românească, primul iniţiator al legii împotriva corupţiei a fost: ","Constantin Brâncoveanu, care a emis o pravilă antiagonisire ","Vlad Ţepeş, domnitor al Ţării Româneşti ","Matei Basarab, care, în anul 1632, emite o pravilă în care specifică foarte clar că luarea de mită sau orice altă formă de corupţie era aspru pedepsită. ",0,0,1);
        question[5] = new Intrebare("Cine este autorul următorului enunț: ,,Adevărul nu este ceea ce vrei tu să fie; este ceea ce este și trebuie să te descurci cu puterea lui sau să trăiești o minciună?” ","Sun Tzu ","Lao Tzu ","Miyamoto Musashi ",0,0,1);
        question[6] = new Intrebare("Cel mai corupt domnitor din istoria Țărilor Române a fost: ","Constantin Hangerli; ","Grigore Ghica; ","Grigore Caragea. ",1,0,0);
        question[7] = new Intrebare("Cine este autorul următorului enunț: ,,Morala e izvorul libertății, morala e condiția libertății, morala e pavăza libertății?” ","Vasile Ghica ","Nicolae Steinhardt ","Blaise Pascal. ",0,1,0);
        question[8] = new Intrebare("In Țările Române, corupţia a fost la cel mai înalt nivel, în: ","perioada fanariota ","perioada interbelica ","perioada domniei lui Nicolae Alexandru. ",1,0,0);
        question[9] = new Intrebare("Cine este autorul următorului enunț: ,,Numai atunci când ne conformăm normelor morale câștigăm dreptul de a judeca?” ","Lev Tolstoi; ","George Sand ","Marguerite Yourcenar. ",0,0,1);
    }



}
