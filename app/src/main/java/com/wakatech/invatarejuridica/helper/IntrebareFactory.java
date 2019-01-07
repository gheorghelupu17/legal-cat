package com.wakatech.invatarejuridica.helper;

public class IntrebareFactory {

    public Intrebare[] question = new Intrebare[100];
    public int numberOfQuestions;

    public static String levelNames[] = {
            "General",
            "General II",
            "General III",
            "General IV",
            "General V",
            "Civil și familie I",
            "Civil și familie II",
            "Civil și familie III",
            "Civil și familie IV",
            "Civil și familie V",
            "Civil și familie VI",
            "Drept notarial",
            "Administrativ I",
            "Administrativ II",
            "Financiar",
            "Drept penal I ",
            "Drept penal II ",
            "Drept penal III"
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
            case 17:
                loadLevel17();
                initNumberOfQuestions();
                break;
            case 18:
                loadLevel18();
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
        question[0] = new Intrebare("România este:  ","O monarhie ","Un stat drept, democratic şi social, în care demnitatea omului, drepturile şi libertăţile cetăţenilor, libera dezvoltare a personalităţii umane, dreptatea şi pluralismul politic reprezintă valori supreme, în spiritul tradiţiilor democratice ale poporului român şi idealurilor Revoluţiei din decembrie 1989, şi sunt garantate ","O republică comunistă ",0,1,0);
        question[1] = new Intrebare("În România:  ","Respectarea legilor nu este obligatorie niciodată ","Respectarea legilor este opțională ","Respectarea Constituției, a supremației sale și a legilor este obligatorie ",0,0,1);
        question[2] = new Intrebare("Teritoriul României:  ","Este alienabil ","Nu este bine stabilit, deoarece România nu are frontiere  ","Teritoriul este organizat, sub aspect administrativ, în comune, oraşe şi judeţe. În condiţiile legii, unele oraşe sunt declarate municipii ",0,0,1);
        question[3] = new Intrebare("Statul român:  ","Are ca fundament dezbinarea poporului român ","România este patria comună şi indivizibilă a tuturor cetăţenilor săi, fără deosebire de rasă, de naţionalitate, de origine etnică, de limbă, de religie, de sex, de opinie, de apartenenţă politică, de avere sau de origine socială ","Nu există statul român ",0,1,0);
        question[4] = new Intrebare("Partidele politice din România:  ","Nu reprezintă interesele nimănui ","Nu sunt legal recunoscute ","Se constituie şi îşi desfăşoară activitatea în condiţiile legii. Ele contribuie la definirea şi la exprimarea voinţei politice a cetăţenilor, respectând suveranitatea naţională, integritatea teritorială, ordinea de drept şi principiile democraţiei ",0,0,1);
        question[5] = new Intrebare("Drapelul României: ","Este multicolor ","Are o frunză galbenă în prim plan ","Este tricolor; culorile sunt aşezate vertical, în ordinea următoare începând de la lance: albastru, galben, roşu ",0,0,1);
        question[6] = new Intrebare("Limba oficială a României este  ","Limba Maghiară ","Limba Română ","Limba Engleză ",0,1,0);
        question[7] = new Intrebare("Capitala României este:  ","București ","Cluj Napoca ","Sibiu ",1,0,0);
        question[8] = new Intrebare("Cetățenii: ","Cetățenii sunt mai presus de orice lege ","Cetăţenii sunt egali în faţa legii şi a autorităţilor publice, fără privilegii şi fără discriminări ","Cetățenii nu sunt egali în drepturi ",0,1,0);
        question[9] = new Intrebare("Ce înseamnă că „cetățenii au acces liber la justiție”: ","Orice persoană se poate adresa justiţiei pentru apărarea drepturilor, a libertăţilor şi a intereselor sale legitime ","Legile abuzive pot îngrădi dreptul cetățenilor la justiție  ","Interesele cetățenilor sunt mai presus de orice justiție ",1,0,0);
        question[10] = new Intrebare("Dreptul la viață și la integritate fizică și psihică al unei persoane presupune că: ","Pedeapsa cu moartea este permisă în România ","Oamenii pot fi supuși torturii în România ","Nimeni nu poate fi supus torturii şi nici unui fel de pedeapsă sau de tratament inuman ori degradant ",0,0,1);
        question[11] = new Intrebare("Dreptul la libertatea individuală și siguranța persoanei presupune că: ","Libertatea individuală şi siguranţa persoanei sunt drepturi care pot fi încălcate oricând ","O persoană poate fi percheziționată, reținută sau arestată numai în cazurile şi cu procedura prevăzute de lege ","O persoană poate fi percheziționată, reținută sau arestată oricând vor cei care fac parte din justiție ",0,1,0);
        question[12] = new Intrebare("Cetățenii români: ","Sunt obligați să aibă domiciliul în țară, nu au voie să părăsească definitiv țara ","Au dreptul de a-şi stabili domiciliul sau reşedinţa în orice localitate din ţară, de a emigra, precum şi de a reveni în ţară ","Nu au voie să părăsească țara mai mult de 30 de zile ",0,1,0);
        question[13] = new Intrebare("Fiecare cetățean român deține: ","Libertatea gândirii şi a opiniilor, precum şi libertatea credinţelor religioase. Aceste libertăți nu pot fi îngrădite sub nici o formă. Nimeni nu poate fi constrâns să adopte o opinie, ori să adere la o credinţă religioasă, contrare convingerilor sale ","Obligația de a critica o altă persoană pentru alegerile pe care le face ","Dreptul de a spune unei alte persoane ce să facă sau ce să simtă ",1,0,0);
        question[14] = new Intrebare("Se interzice prin lege: ","Exprimarea opiniilor personale ","Defăimarea ţării şi a naţiunii, îndemnul la război, îndemnul la agresiune, la ură naţională, rasială, de clasă sau religioasă, incitarea la discriminare, la separatism teritorial sau la violenţă publică, precum şi manifestările obscene, contrare bunelor moravuri ","Exprimarea gândurilor sau a credințelor personale ",0,1,0);
        question[15] = new Intrebare("România ","Este stat național care are ca fundament dezbinarea poporului român ","Este patria comună şi indivizibilă a tuturor cetăţenilor săi, fără deosebire de rasă, de naţionalitate, de origine etnică, de limbă, de religie, de sex, de opinie, de apartenenţă politică, de avere sau de origine socială ","Este stat suveran, dependent de Uniunea Europeană  ",0,1,0);

    }

    //general2
    private void loadLevel2()
    {
        question[0] = new Intrebare("Dreptul la muncă al cetățenilor:  ","Este îngrădit ","Este obligatoriu de la 16 ani ","Nu poate fi îngrădit. Alegerea profesiei, a meseriei sau a ocupaţiei, precum şi a locului de muncă este liberă ",0,0,1);
        question[1] = new Intrebare("Familia:  ","Este obligatoriu a fi încheiată la împlinirea vârstei de 18 ani ","Nu este recunoscută prin lege ","Se întemeiază pe căsătoria liber consimţită între soţi, pe egalitatea acestora şi pe dreptul şi îndatorirea părinţilor de a asigura creşterea, educaţia şi instruirea copiilor ",0,0,1);
        question[2] = new Intrebare("Dreptul la învățătură: ","Este asigurat prin învăţământul general obligatoriu, prin învăţământul liceal şi prin cel profesional, prin învăţământul superior, precum şi prin alte forme de instrucţie şi de perfecţionare ","Nu este obligatoriu în nicio etapă ","Învățământul este obligatoriu a se face în școlile de stat ",1,0,0);
        question[3] = new Intrebare("Au dreptul la grevă: ","Nimeni nu are dreptul la grevă ","Doar cei cu studii superioare au dreptul la grevă ","Salariaţii au dreptul la grevă pentru apărarea intereselor profesionale, economice şi sociale ",0,0,1);
        question[4] = new Intrebare("Ziua națională a României este:  ","1 mai ","1 iunie ","1 decembrie ",0,0,1);
        question[5] = new Intrebare("Culorile drapelului României sunt:  ","Alb, roșu ","Albastru, galben, roșu ","Verde, alb, roșu ",0,1,0);
        question[6] = new Intrebare("Imnul național al României este:  ","„Deșteptă-te române!” ","„Trei culori” ","„Hora României” ",1,0,0);
        question[7] = new Intrebare("Statul român este organizat pe principiul separației următoarelor puteri:  ","Legislativă, executivă și mass-media ","Executivă și judecătorească ","Legislativă, executivă și judecătorească ",0,0,1);
        question[8] = new Intrebare("Legile:  ","Sunt reguli obligatorii ","Sunt reguli facultative ","Uneori sunt obligatorii, alteori sunt facultative ",1,0,0);
        question[9] = new Intrebare("Legea fundamentală a României este:  ","Constituția ","Codul penal ","Codul civil ",1,0,0);
        question[10] = new Intrebare("Legile sunt adoptate de:  ","Parlament ","Guvern ","Consiliile județene sau locale ",1,0,0);
        question[11] = new Intrebare("Legile sunt aplicate de către:  ","Judecători ","Președintele României ","Parlamentul României ",1,0,0);
        question[12] = new Intrebare("Statul român este reprezentat de către:  ","Președintele României. Conform Constituției, în relațiile internaționale președintele este garantul independenței naționale, veghează la respectarea Constituției și la buna funcționare a autorităților publice, exercită funcția de mediere între puterile statului, precum și între stat și societate ","Ministrul Justiției ","Prim-Ministrul României ",1,0,0);
        question[13] = new Intrebare("Președintele României este ales de către:  ","Parlament ","Comisia Europeană ","Cetățenii cu drept de vot ",0,0,1);
        question[14] = new Intrebare("Cetățenii au drept de vot de la împlinirea vârstei de:  ","14 ani ","18 ani ","20 ani ",0,1,0);

    }


    ///general3
    private void loadLevel3() {
        question[0] = new Intrebare("Căsătoria între rude:  ", "Este permisă întotdeauna ", "Nu este permisă niciodată ", "Nu este permisă între rude până la gradul 4 inclusiv (adică verișorii), ca regulă ", 0, 0, 1);
        question[1] = new Intrebare("De regulă, obligația de a asigura creșterea, educația și instruirea copiilor o are/au:  ", "Doar mama ", "Doar tata ", "Ambii părinți ", 0, 0, 1);
        question[2] = new Intrebare("Minorii:  ", "Pot fi angajați ca salariați indiferent de vârstă ", "Pot fi angajați ca salariați cel mai devreme la împlinirea vârstei de 15 ani ", "Nu pot niciodată fi angajați ca salariați ", 0, 1, 0);
        question[3] = new Intrebare("O persoană poate răspunde penal:  ", "De la împlinirea vârstei de 14 ani ", "Indiferent de vârstă ", "Numai dacă este adultă ", 1, 0, 0);
        question[4] = new Intrebare("În România, pedeapsa cu moartea:  ", "Este permisă ", "Este interzisă ", "Este permisă în situații excepționale ", 0, 1, 0);
        question[5] = new Intrebare("Poți deține legal un cont de Facebook:  ", "De la vârsta de 13 ani ", "De la vârsta de 15 ani ", "De la vârsta de 18 ani ", 1, 0, 0);
        question[6] = new Intrebare("Nu avem voie să:  ", "Dezvăluim conținutul unei comunicări (scrisă sau orală: mesaje, scrisori sau convorbiri telefonice sau față în față), care nu ne aparține ", "Publicăm poze pe Internet cu noi înșine ", "Avem o opinie vis-a-vis de o știre publicată pe internet ", 1, 0, 0);
        question[7] = new Intrebare("Peretele contului de Facebook este considerat: ", "Spațiu public ", "Spațiu privat ", "Spațiu general ", 1, 0, 0);
        question[8] = new Intrebare("Interceptarea și înregistrarea comunicărilor, discuțiilor, mesajelor, poate avea loc: ", "Mereu, prin programe speciale ", "Doar cu autorizație ", "Oricând ne dorim ", 0, 1, 0);
        question[9] = new Intrebare("Părintele care retrage copilul de la școală, sau îl împiedică pe acesta să urmeze cursurile învățământului general obligatoriu, este: ", "Sancționat ", "Lăudat de către autorități ", "Avertizat de către autorități ", 1, 0, 0);
        question[10] = new Intrebare("Traficul de minori, în scopul exploatării lor, este: ", "Infracțiune ", "Contravenție ", "Nu există trafic de minori ", 1, 0, 0);
        question[11] = new Intrebare("Tinerii care au vârsta de minim 16 ani, care sunt apți pentru prestarea unei munci și care, după absolvirea școlii sau a liceului nu au reușit să se încadreze în muncă potrivit pregătirii profesionale, au dreptul: ", "De a reface studiile gimnaziale  ", "De a primi indemnizație de șomaj ", "De a reface studiile liceale ", 0, 1, 0);
        question[12] = new Intrebare("Partea străzii pe care pietonii circulă în absența trotuarului, este: ", "Partea stângă ", "Partea dreaptă ", "Pe mijlocul străzii ", 1, 0, 0);
        question[13] = new Intrebare("Centura se pune în autovehicul (în timp ce acesta este în mers), pentru că: ", "Așa spun părinții ", "Așa este impus de lege, în vederea asigurării siguranței în autovehicul ", "Așa spune președintele țării ", 0, 1, 0);
        question[14] = new Intrebare("Locul pe care se stă în autovehicul, în funcție de vârstă este:  ", "Pe bancheta din spate, pentru persoanele cu vârsta până în 12 ani ", "În față, pentru persoanele sub 12 ani ", "Obligatoriu în spatele șoferului, dacă persoana are până în 10 ani ", 1, 0, 0);
        question[15] = new Intrebare("În cazul unui accident auto soldat cu victime: ", "Șoferul care a provocat accidentul poate părăsi locul ", "Victimele, în orice stare ar fi, nu trebuie bruscate, smucite, trase agresiv ", "Fiind un caz de urgență, nu există reguli în astfel de situații ", 0, 1, 0);
    }

    ///general4
    private void loadLevel4()
    {
        question[0] = new Intrebare("Elevii au îndatorirea de a: ","Întocmi lucrări originale și de a respecta drepturile de autor ale altor persoane, în redactarea propriilor lucrări ","Provoca, instiga și participa la acte de violență în unitatea școlară și în afara ei ","Pune porecle colegilor ",1,0,0);
        question[1] = new Intrebare("Elevii care obțin rezultate deosebite în activitatea școlară și extrașcolară pot primi următoarele recompense:  ","Recomandări pentru a beneficia, cu prioritate, de excursii sau tabere de profil din țară și din străinătate  ","Facilități pentru părinții sau reprezentanții lor legali în relațiile cu instituțiile Statului ","Nu primesc niciun fel de recompense ",1,0,0);
        question[2] = new Intrebare("Părăsirea incintei școlii de către elevii majori: ","Este permisă, se face pe propria răspundere ","Este absolut interzisă ","Este obligatorie ",1,0,0);
        question[3] = new Intrebare("Elevii nu sunt obligați: ","Să poarte uniformă ","Să meargă/să se prezinte la ore și să se pregătească pentru fiecare materie ","Să participe la teste și evaluări de orice fel ",1,0,0);
        question[4] = new Intrebare("În ce condiții avem dreptul la liberă exprimare? ","Atât timp cât prin ceea ce spunem nu aducem atingere drepturilor altora ","În orice condiții, chiar dacă aducem atingere celorlalți ","Niciodată nu avem dreptul la liberă exprimare ",1,0,0);
        question[5] = new Intrebare("Elevii  au accesul interzis: ","În sala de curs ","În sălile cu jocuri mecanice și/sau cazinouri ","În bibliotecile școlare ",0,1,0);
        question[6] = new Intrebare("Dacă dai volumul la muzică prea tare, în intervalele orare 22:00-08:00, 13:00-14:00 și tulburi liniștea locuitorilor din imobil (sau a vecinilor), este posibil: ","Să fii recompensat de organele de poliție ","Să fii sancționat cu amendă în cuantum de la 500 de lei până la 1500 de lei ","Să faci închisoare ",0,1,0);
        question[7] = new Intrebare("România este un stat: ","Laic ","Religios ","România nu este stat ",1,0,0);
        question[8] = new Intrebare("Polițiștii au dreptul să legitimeze și să rețină persoane, iar ca urmare a acestui fapt este obligată să aibă asupra sa cartea de identitate persoana care a împlinit vârsta de: ","18 ani ","14 ani ","20 ani ",0,1,0);
        question[9] = new Intrebare("Care organ al legii stabilește cine are dreptate, atunci când două sau mai multe persoane nu se înțeleg  pentru că s-au încălcat niște drepturi? ","Procurorul ","Judecătorul ","Președintele țării ",0,1,0);
        question[10] = new Intrebare("Minorul nu poate fi condamnat la pedeapsa amenzii penale sau a închisorii,  lui i se pot aplica doar: ","Măsuri educative ","Minorului nu i se poate aplica nimic, dat fiind faptul că este minor ","Măsuri drastice, agresive luate de părinți ",1,0,0);
        question[11] = new Intrebare("Se aplică aceleași proceduri adulților și minorilor victime, infractori sau martori, în procese? ","Da ","Nu, există proceduri speciale pentru minori ","Depinde de cum e minorul, din familie săracă sau bogată ",0,1,0);
        question[12] = new Intrebare("Este preferabil să circulăm cu bicicleta în zonele: ","Cu trafic intens ","Cu trafic redus ","Nu avem voie cu bicicleta pe drum ",0,1,0);
        question[13] = new Intrebare("Atunci când călătoriți cu metroul: ","Este interzis fotografiatul ","Este indicat fotografiatul ","Nu aveți voie să urcați cu aparatul foto în metrou ",1,0,0);




    }
    //general5
    private void loadLevel5()
    {
        question[0] = new Intrebare("Care sunt instanțele (instituții) judecătorești din România? ","Înalta Curte de Casație și Justiție, Curțile de Apel, Tribunalele, Judecătoriile ","Parchetele ","Parlamentul ",1,0,0);
        question[1] = new Intrebare("Judecătorii iau hotărâri conducându-se după: ","Propriile lor păreri, voința proprie ","Lege și pe baza probelor de la dosar ","Judecătorii nu iau hotărâri, ei execută niște ordine ",0,1,0);
        question[2] = new Intrebare("Care organ al legii lucrează cu poliția la identificarea infractorului, conduce cercetarea penală și stabilește dacă infractorul trebuie tras la răspundere? ","Procurorul ","Judecătorul ","Avocatul ",1,0,0);
        question[3] = new Intrebare("Unde lucrează procurorii, în ce instituții? ","În instanțele judecătorești ","În Parchetele de pe lângă fiecare instanță judecătorească ","În birourile de avocați ",0,1,0);
        question[4] = new Intrebare("Ce alcătuiesc judecătorii și procurorii? ","Corpul magistraților ","Corpul justiției ","Corpul de pază al președintelui ",1,0,0);
        question[5] = new Intrebare("Se poate schimba pregătirea profesională a tânărului care a împlinit vârsta de 14 ani? ","Nu, nu are acest drept ","Da, doar cu încuviințarea instanței judecătorești ","Depinde de situație ",0,1,0);
        question[6] = new Intrebare("Ce este bullying-ul? ","Un hobby ","Un comportament ostil/de excludere și de luare în derâdere a cuiva, de umilire; o acțiune care produce injurii celorlalți, efectuată în mod repetat, care se poate manifesta fizic, prin agresivitate fizică sau psihologic, prin producerea unor daune emoționale ","Un comportament normal, acceptat de toată lumea ",0,1,0);
        question[7] = new Intrebare("Ce trebuie să facă victima unei situații de bullying? ","Nimic, se lasă intimidată, poate agresorul încetează ","Anunță profesorul, părinții, pe cei apropiați, sau chiar depune plângere la poliție ","Răspunde cu un comportament la fel de violent, ostil și umilitor ",0,1,0);
        question[8] = new Intrebare("Elevii au următoarele drepturi:  ","Dreptul la respectarea imaginii, demnității, personalității și la protecția datelor personale; dreptul la burse și la 50% reducere la transportul local în comun ","Dreptul de a folosi telefonul mobil în timpul orelor, chiar dacă profesorul nu îi permite ","Dreptul de a lipsi nemotivat de la ore ",1,0,0);
        question[9] = new Intrebare("Elevii au dreptul să: ","Spună ce gândesc, dar fără a încălca drepturile celorlalți ","Înregistreze activitatea didactică ","Să promoveze materiale electorale sau cu caracter pornografic în școală ",1,0,0);
        question[10] = new Intrebare("Cum sunt organizați avocații? ","În clinici ","În Barouri ","Nu sunt organizați în niciun fel ",0,1,0);
        question[11] = new Intrebare("Ce face un minor dacă este victima unor infracțiuni? ","Așteaptă să devină major, pentru a putea vorbi cu cei autorizați despre ce a pățit ","Sesizează organele legii prin părinții săi, sau cu asistența părinților săi/reprezentanților săi legali ","Tace și ascunde totul ",0,1,0);
        question[12] = new Intrebare("Ce se întâmplă dacă zgârii o mașină, spargi un geam sau incendiezi o mașină? ","Comiți infracțiunea de distrugere ","Săvârșești o contravenție ","Nu se întâmplă nimic, e un act normal și obișnuit ",1,0,0);
        question[13] = new Intrebare("Ce se întâmplă  când intri în casa cuiva fără să ai acest drept/fără să ai voie? ","Comiți infracțiunea de violare de domiciliu ","Nimic care să atragă o răspundere a ta ","Comiți infracțiunea de furt ",1,0,0);


    }

    //civil+familie1
    private void loadLevel6()
    {
        question[0] = new Intrebare("Minorul este: ","Persoana fizică care nu a împlinit vârsta de 18 ani și nu a dobândit capacitate deplină de exercițiu ","Persoana fizică de la naștere și până la vârsta de 22 ani ","Persoana juridică ",1,0,0);
        question[1] = new Intrebare("Minorul: ","Poate încheia singur  acte juridice ","Nu poate încheia singur acte juridice ","Poate încheia acte juridice doar cu acordul primarului din localitate ",0,1,0);
        question[2] = new Intrebare("Motivul pentru care minorul nu poate încheia acte juridice este că:  ","Nu este suficient dezvoltat fizic și psihic, deci nu are discernământul necesar pentru a participa singur la circuitul civil ","Nu îl lasă părinții săi ","Nu are destulă inteligență emoțională ",1,0,0);question[3] = new Intrebare("Minorii sunt ocrotiți de părinții săi:  ","În mod egal, indiferent dacă minorul este din căsătorie, din afara căsătoriei sau din adopție ","În mod preferențial, după cum vor părinții ","Minorul nu are nevoie de protecție ",1,0,0);
        question[3] = new Intrebare("Capacitatea deplină de exercițiu începe din momentul în care: ","Persoana devine majoră ","Persoana împlinește vârsta de 16 ani ","Când decide persoana în cauză ",1,0,0);
        question[10] = new Intrebare("Minorul dobândește, prin căsătorie: ","Capacitate deplină de exercițiu ","Capacitate lărgită de exercițiu ","Incapacitate de exercițiu ",1,0,0);
        question[4] = new Intrebare("Se poate recunoaște capacitatea de exercițiu deplină a minorului care a împlinit vârsta de 16 ani, de către: ","Instanța de tutelă ","Primăria din localitatea de reședință ","Președintele țării ",1,0,0);
        question[5] = new Intrebare("Minorul de 14 ani poate încheia singur: ","Acte de vânzare-cumpărare a imobilelor ","Acte de administrare care nu îl păgubesc/prejudiciază ","Orice acte ",0,1,0);
        question[6] = new Intrebare("Persoana pusă sub interdicție judecătorească poate să încheie:  ","Acte de conservare ","Acte de înstrăinare a bunurilor ","Acte de justiție ",1,0,0);
        question[7] = new Intrebare("Cartea de identitate: ","Este eliberată pentru prima dată la vârsta de 14 ani ","Nu este obligatorie, este opțională ","Nu este un act de identitate semnificativ ",1,0,0);
        question[8] = new Intrebare("Are dreptul la integritate fizică și psihică: ","Orice persoană ","Persoanele cu capacitate deplină de exercițiu/ persoanele majore ","Nicio persoană ",1,0,0);
        question[9] = new Intrebare("Reprezintă o atingere a vieții private: ","Interceptarea fără drept a unei convorbiri private ","Interceptarea autorizată a unei convorbiri private ","Interceptarea nu este legală ",1,0,0);

    }

    //civil+familie2
    private void loadLevel7()
    {
        question[0] = new Intrebare("Are dreptul la liberă exprimare: ","Orice persoană ","Persoanele care sunt membre ale unor asociații constituite legal ","Nicio persoană nu are dreptul la liberă exprimare ",1,0,0);
        question[1] = new Intrebare("Reprezintă o atingere a vieții private: ","Interceptarea fără drept a unei convorbiri private ","Interceptarea autorizată a unei convorbiri private ","Interceptarea convorbirilor nu este permisă în nicio situație ",1,0,0);
        question[2] = new Intrebare("Este atingere adusă vieții private: ","Captarea, utilizarea imaginii sau vocii unei persoane aflate în spațiu privat, fără acordul acesteia ","Captarea sau utilizarea imaginii sau vocii unei persoane aflate în spațiul public, fără acordul acesteia ","Orice captare, utilizare a imaginii sau vocii unei alte persoane ",1,0,0);
        question[3] = new Intrebare("Numele unei persoane este format din: ","Numele de familie și prenumele ","Prenumele, porecla și numele de familie ","Porecla ",1,0,0);
        question[4] = new Intrebare("Schimbarea numelui unui cetățean român este posibilă:  ","La cererea oricărei persoane, interesate sau ","La cererea persoanei interesate, în condițiile legii ","La cererea judecătorului ",0,1,0);
        question[5] = new Intrebare("O persoană care deține mai multe locuințe are, automat:  ","Mai multe domicilii în același timp ","Mai multe reședințe în același timp ","Mai multe case în proprietate personală ",0,1,0);
        question[6] = new Intrebare("Reședința unei persoane fizice este: ","Acolo unde își are locuința principală ","Acolo unde își are locuința secundară ","Casa personală  ",0,1,0);
        question[7] = new Intrebare("Minorul care a împlinit vârsta de 14 ani încheie acte juridice:  ","Cu încuviințarea scrisă a tutorelui sau a curatorului ","Fără încuviințarea scrisă a tutorelui sau a curatorului ","Cu încuviințarea bunicilor ",1,0,0);
        question[8] = new Intrebare("Minorul în vârstă de 16 ani se poate căsători: ","Cu încuviințarea părinților ","Cu încuviințarea părinților și autorizația instanței ","Nu are nevoie de nicio încuviințare ",1,0,0);
        question[9] = new Intrebare("Bunicii și nepoții sunt: ","Rude ","Afini ","Prieteni de familie ",1,0,0);

    }



    //civil+familie3
    private void loadLevel8()
    {
        question[0] = new Intrebare("Minorul necăsătorit, care are discernământ, poate recunoaște copilul său: ","Singur ","Numai cu recunoașterea părinților sau instanței ","Nu are voie să aibă copii ",1,0,0);
        question[1] = new Intrebare("Părinții au îndatorirea/obligația de a crește copilul în condiții care să îi asigure: ","In principal dezvoltarea fizică a copilului ","Dezvoltarea fizică, mentală, spirituală, morală și socială a copilului ","Confort material  ",0,1,0);
        question[2] = new Intrebare("Măsurile disciplinare care pot fi luate de părinți față de copii trebuie: ","Să respecte demnitatea copilului ","Să urmărească stabilirea fricii ","Să oblige copilul să asculte, indiferent de felul măsurii ",1,0,0);
        question[3] = new Intrebare("Ziua mondială a drepturilor copilului este pe data de: ","1 ianuarie ","20 noiembrie ","1 iulie ",0,1,0);
        question[4] = new Intrebare("Cetățenia indică: ","Apartenența la un stat ","Apartenența la un popor ","Apartenența la o familie ",1,0,0);
        question[5] = new Intrebare("Naționalitatea indică: ","Apartenența la un stat ","Apartenența la un neam ","Apartenența la o familie ",0,1,0);
        question[6] = new Intrebare("O persoană se identifică prin: ","Nume, domiciliu, cetățenie ","Notele de la școală, numărul de prieteni, familie ","Cât de bogată financiar este ",1,0,0);
        question[7] = new Intrebare("Două persoane care se căsătoresc devin: ","Rude ","Soți ","Prieteni ",0,1,0);
        question[8] = new Intrebare("Logodna este:  ","Atunci când două persoane se căsătoresc ","Atunci când două persoane își fac promisiunea reciprocă de a încheia căsătoria în viitor ","Atunci când două persoane se iubesc ",0,1,0);
        question[9] = new Intrebare("Pentru ca logodna să fie considerată un act juridic valabil, logodnicii trebuie să aibă vârsta minimă de: ","18 ani, ca regulă generală și 16 ani, ca excepție ","22 de ani, ca regulă generală ","25 ani, ca regula generală ",1,0,0);

    }


    //civil+familie4
    private void loadLevel9()
    {
        question[0] = new Intrebare("Căsătoria se poate încheia, ca regulă,  la împlinirea vârstei de: ","15 ani ","18 ani ","21 ani ",0,1,0);
        question[1] = new Intrebare("Legea se aplică, ca regulă, doar: ","Pe viitor ","Pentru trecut ","Doar pentru o perioadă de 30 de zile ",1,0,0);
        question[2] = new Intrebare("O lege intră în vigoare: ","După ce a fost votată de Parlamentul României ","La 3 zile de la publicarea în Monitorul Oficial ","După publicarea în cursuri de specialitate ",0,1,0);
        question[3] = new Intrebare("Actul juridic reprezintă: ","O manifestare de voință a părților care-l încheie ","Un articol de lege ","O inițiativă legislativă ",1,0,0);
        question[4] = new Intrebare("Capacitatea deplină de exercițiu a unei persoane se dobândește la vârsta de: ","14 ani ","21 ani ","18 ani ",0,0,1);
        question[5] = new Intrebare("Ca excepție, căsătoria se poate încheia la împlinirea vârstei de: ","14 ani ","16 ani, cu dispensa din partea autorității tutelare ","Oricând ",0,1,0);
        question[6] = new Intrebare("Drepturile și obligațiile civile trebuie executate: ","Cu rea-credință ","Conform regulilor anturajului ","Cu bună-credință ",0,0,1);
        question[7] = new Intrebare("Subiectele dreptului civil sunt: ","Persoanele fizice și persoanele juridice ","Terenuri și construcții ","Ipoteca și gajul ",1,0,0);
        question[8] = new Intrebare("Persoana fizică este: ","Societatea comercială plătitoare de TVA ","Omul, privit individual, ca titular de drepturi și obligații ","Funcția pe care o poate deține o persoană ",0,1,0);
        question[9] = new Intrebare("Cetățenii apatrizi sunt: ","Persoane care nu au un domiciliu în România ","Persoane fără cetățenie ","Persoane ce au cetățenia și domiciliul în state ce nu fac parte din Uniunea Europeană ",0,1,0);
    }


    ///civil+familie5
    private void loadLevel10()
    {
        question[0] = new Intrebare("Toate persoanele: ","Sunt egale în fața legii ","Sunt obligate ca după vârsta de 80 de ani să întocmească un testament ","Sunt obligate să facă parte din organizarea unei persoane juridice ",1,0,0);
        question[1] = new Intrebare("Drepturile copilului sunt recunoscute: ","De la vârsta de 14 ani ","De la momentul concepției, cu condiția ca acesta să se nască viu ","Din momentul în care intră la școală ",0,1,0);
        question[2] = new Intrebare("Minorul se poate căsători: ","La vârsta de 14 ani ","La vârsta de 16 ani, cu acordul instanței de tutelă ","Căsătoria minorului este strict interzisă prin lege ",0,1,0);
        question[3] = new Intrebare("Minorul sub 14 ani poate încheia singur următoarele acte juridice: ","Testament ","Contract de vânzare a unui apartament ","Acte de mică însemnătate precum achiziționarea de rechizite școlare ",0,0,1);
        question[4] = new Intrebare("Pentru actele cu o valoare mare, minorul este asistat la încheierea acestora de către: "," Părinți sau reprezentatul legal ","Cadrele didactice din școala unde învață ","Primarul din localitatea unde acesta are domiciliul ",1,0,0);
        question[5] = new Intrebare("Persoana fizică nu mai poate încheia (nici singura și nici prin reprezentare) acte juridice: ","După ce împlinește vârsta de 90 de ani ","În cazul în care pierde cetățenia română ","Când este declarată decedată în baza unei hotărâri judecătorești ",0,0,1);
        question[6] = new Intrebare("Orice persoană are dreptul la: ","Viață privată ","A deține permis de conducere ","A deține o funcție publică ",1,0,0);
        question[7] = new Intrebare("Numele de familie se poate schimba astfel: "," Printr-o declarație dată în fața notarului public ","Prin căsătorie ","În urma partajului dintre foștii soți ",0,1,0);
        question[8] = new Intrebare("Domiciliul minorului este: ","La domiciliul părinților săi ","La școala unde acesta învață ","La căminul unde este cazat pe durata studiilor ",1,0,0);
        question[9] = new Intrebare("Este interzisă căsătoria: ","Între persoane de etnii diferite ","Între cetățeni străini ","Între rude până la gradul 4 inclusiv ",0,0,1);

    }


    //civil+familie6
    private void loadLevel11()
    {
        question[0] = new Intrebare("Nu poate încheia acte juridice: ","Persoana pusă sub interdicție judecătorească ","Cetățeanul străin ","Apatridul ",1,0,0);
        question[1] = new Intrebare("Căsătoria poate înceta prin: ","Separarea în fapt a soților ","Divorț ","Nașterea unui copil din afara căsătoriei ",0,1,0);
        question[2] = new Intrebare("Afinitatea reprezintă: ","Legătura dintre un soț și rudele celuilalt soț ","Legătura de afecțiune dintre cei doi soți ","Bunurile dobândite de către soți în timpul căsătoriei ",1,0,0);
        question[3] = new Intrebare("Părinții au obligația de a întreține copii până: ","La vârsta de 16 ani ","Până la momentul căsătoriei copilului ","Până la finalizarea studiilor dar fără a depăși vârsta de 26 ani ",0,0,1);
        question[4] = new Intrebare("Care sunt cele mai des întâlnite cauze care deschid un conflict?  ","Cauzele pot fi legate de incompatibilitatea temperamentului, a personalităţii sau pot fi expresia intereselor personale ","Nu există conflicte ","Cauzele conflictelor sunt doar de natură religioasă ",1,0,0);
        question[5] = new Intrebare("Conflictele pot fi rezolvate prin mediere. Ce este medierea?  ","O modalitate de soluționare a conflictelor pe cale amiabilă, care se bazează pe încredere, sprijin și comunicare între părțile conflictului ","O meditație la română ","O meditație la matematică ",1,0,0);
        question[6] = new Intrebare("În școală se pot rezolva conflictele prin mediere? ","Da, conflictele se pot rezolva prin mediere de către mediatori, care pot fi profesorii, părinții sau chiar elevii ","Nu, conflictele se pot rezolva doar la judecătorie ","Nu, conflictele se pot rezolva doar la primăria din localitate ",1,0,0);
        question[7] = new Intrebare("Cine este mediatorul?  ","Persoana care facilitează comunicarea dintre părțile conflictului și le sprijină să găsească soluții la problemele pe care le au ","Profesorul care dă meditații la română ","Profesorul care dă meditații la matematică ",1,0,0);
        question[8] = new Intrebare("Ca excepție, minorul de 16 ani se poate logodi: ","Numai dacă are încuviințarea părinților săi, sau, după caz, a celui în grija căruia se află ","Dacă așa dorește el ","Dacă are încuviințarea prietenilor ",1,0,0);
        question[9] = new Intrebare("De ce este important ca un conflict care are loc în școală să se rezolve prin mediere?  ","Prin intermediul medierii se salvează relaţia, se economisește timp şi stres, se evită supărările, se construiesc punți spre relații solide ","Nu este important, conflictele din școală se rezolvă doar la judecătorie ","Pentru că este obligatoriu, așa spune legea ",1,0,0);

    }

    //drept notarial
    private void loadLevel12()
    {
        question[0] = new Intrebare("Moștenirea este: ","O formă de recunoștință față de cel decedat ","O formă de transmitere a bunurilor de la persoana decedată către moștenitorii acestuia ","Drepturile și obligațiile dobândite de către o persoană la momentul nașterii ",0,1,0);
        question[1] = new Intrebare("Soțul supraviețuitor este: ","Persoana cu care a trăit în ultima parte a bolii cel care a decedat ","Persoana cu care era căsătorită la data decesului ","Persoana cu care a încheiat o convenție matrimonială în vederea încheierii căsătoriei ",0,1,0);
        question[2] = new Intrebare("Descendenții defunctului (cel despre a cărui moștenire este vorba) sunt: ","Părinți ","Frați ","Copii adoptați  ",0,0,1);
        question[3] = new Intrebare("În cazul în care nu există moștenitori legali sau testamentari, moștenirea va fi culeasă de către: ","Unitatea administrativ teritorială unde defunctul a avut ultimul domiciliu ","Persoanele care l-au îngrijit pe defunct pe perioada bolii ce a cauzat decesul ","Ultima unitate sau angajatorul unde și-a desfășurat defunctul activitatea profesională  ",1,0,0);
        question[4] = new Intrebare("Ascendenții defunctului sunt: ","Părinții sau bunicii acestuia ","Frații sau nepoții de frate ai acestuia ","Unchi/mătuși sau verișorii acestuia ",1,0,0);
        question[5] = new Intrebare("Testamentul este olograf dacă: ","Este semnat de către notarul public ","Este scris și semnat de către primarul din localitatea unde domiciliază testatorul ","Este scris în întregime, semnat și datat de mâna testatorului (persoana care a făcut testamentul) ",0,0,1);
        question[6] = new Intrebare("Testamentul autentic este: ","Actul întocmit de către notarul public ","Actul întocmit de către avocat ","Actul întocmit de către judecător ",1,0,0);
        question[7] = new Intrebare("Testamentul poate fi revocat: ","De către copiii testatorului (persoana care a făcut testamentul) ","De către testator oricând ","De către beneficiarul testamentului ",0,1,0);
        question[8] = new Intrebare("Ca și regulă generală, o lege: ","Își produce efecte după ce intră în vigoare ","Produce efecte și după ce este abrogată ","Își produce efecte pentru toate situațiile anterioare născute înainte de intrarea ei în vigoare ",1,0,0);
        question[9] = new Intrebare("Prin contract de donație se înțelege: ","Transmiterea unui bun în schimbul unei sume de bani ","Transmiterea unui bun în schimbul unui alt bun ","Transmiterea unui bun fără a fi nevoie de a da ceva în schimb ",0,0,1);
        question[10] = new Intrebare("Testamentul își produce efecte juridice: ","În timpul vieții testatorului ","După decesul testatorului (persoana care a făcut testamentul) ","După ce a fost autentificat de către notarul public ",0,1,0);
        question[11] = new Intrebare("Pentru a fi valabil, un contract de împrumut trebuie: ","Să conțină o sumă de bani ","Să fie încheiat de către notarul public ","Să se remită efectiv bunul împrumutat ",0,0,1);
        question[12] = new Intrebare("Proprietatea publică a statului nu poate fi: ","Vândută ","Concesionată ","Exploatată ",1,0,0);
        question[13] = new Intrebare("În cadrul moștenirii legale, pot avea calitatea de moștenitori: ","Verișorii persoanei decedate ","Societatea comercială unde persoana decedată a avut acțiuni ","Fostul soț de care persoana decedată a divorțat ",1,0,0);

    }

    //administrativ 1
    private void loadLevel13()
    {
        question[0] = new Intrebare("Administrația publică este organizată în: ","Doar administrația centrală  ","Administrația centrală, administrația de stat în teritoriu, administrația locală ","Administrația președințială ",0,1,0);
        question[1] = new Intrebare("Din cine este alcătuit Guvernul?  ","Doar din Prim-ministru  ","Prim-ministru, ministru și alți membri stabiliți prin lege organică ","Președintele țării, primarul și prefectul ",0,1,0);
        question[2] = new Intrebare("Până când își exercită Guvernul mandatul? ","Guvernul își exercită mandatul până la data validării alegerilor parlamentare unice  ","Guvernul își exercită mandatul până la data validării alegerilor parlamentare generale, dar în anumite situații prevăzute de Constituție ","Guvernul își exercită mandatul până la data validării alegerilor teritoriale ",0,1,0);
        question[3] = new Intrebare("Atribuțiile Guvernului sunt:  ","Doar de natură politică ","De natură politico-administrativă și economico-financiară ","Doar de natură medicală ",0,1,0);
        question[4] = new Intrebare("Actele adoptate de Guvern se numesc:  ","Ordine ","Ordonanțe (simple sau de urgență) și hotărâri ","Reguli ",0,1,0);
        question[5] = new Intrebare("Actele adoptate de Guvern:  ","Se publică în Monitorul Oficial ","Nu se publică nicăieri ","Se publică doar pe internet ",1,0,0);
        question[6] = new Intrebare("Rolul central în funcționarea Guvernului aparține: ","Președintelui ","Prim-ministrului  ","Prefectului ",0,1,0);
        question[7] = new Intrebare("Toate actele juridice adoptate de Guvern: ","Sunt semnate de prim-ministru iar în cazul în care nu se poate realiza consensul pentru adoptarea unui act, prim-ministrul are dreptul de a decide ","Sunt semnate de Președinte ","Nu sunt semnate de nimeni ",1,0,0);
        question[8] = new Intrebare("Ministerele aparțin de:  ","Administrația publică de specialitate  ","Administrația publică teritorială ","Administrația publică locală ",1,0,0);
        question[9] = new Intrebare("Ministerele:  ","Au personalitate juridică și sediul în municipiul București ","Nu au personalitate juridică ","Au sediul în fiecare județ ",1,0,0);
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
        question[0] = new Intrebare("Un impozit este","O taxă ","O sumă de bani ","O contribuţie ",0,1,0);
        question[1] = new Intrebare("O taxă este datorată: ","Când cumpărăm un bun ","Când beneficiem de un serviciu public ","Când mergem în vacanţă ",0,1,0);
        question[2] = new Intrebare("O contribuţie socială este o sumă de bani datorată ","Pentru a fi asigurat în viitor ","Doar de cetăţenii români ","Uneori şi de animale ",1,0,0);
        question[3] = new Intrebare("O persoană fizică datorează impozit ","Când nu are niciun venit ","Când are venituri din muncă, ca şi salariat ","Când primeşte un cadou ",0,1,0);
        question[5] = new Intrebare("O societate, care operează un magazin de haine ","Datorează numai un impozit ","Datorează mai multe impozite, unele pentru ea, altele pentru salariaţi ","Nu datorează niciun impozit dacă nu vinde nimic ",0,1,0);
        question[6] = new Intrebare("Un mic comerciant, care are o tonetă cu verdeţuri, are obligaţia: ","De a se înregistra fiscal ","De a avea salariaţi ","De a face reclamă ",1,0,0);
        question[7] = new Intrebare("Pentru o tranzacţie economică, este necesar să se emită: ","Întotdeauna factură ","Întotdeauna bon fiscal ","Uneori factură, uneori bon fiscal, chiar şi amândouă ",0,0,1);
        question[8] = new Intrebare("Unele impozite: ","Sunt incluse în preţul unor produse ","Nu sunt datorate niciodată ","Sunt mai mari pentru unele persoane decât pentru altele ",1,0,0);
        question[9] = new Intrebare("Un copil în vârstă de 10 ani : ","Nu datorează niciodată impozite ","Nu datorează niciodată impozite şi nici taxe ","Datorează impozite ori taxe, în funcţie de acţiunile sale ",0,0,1);
        question[4] = new Intrebare("O persoană fizică datorează impozit","Când merge la medic pentru o consultaţie","Când cumpără combustibil pentru maşină  ","Când plăteşte parcarea ",0,1,0);

    }

    //Drept penal
    private void loadLevel16()
    {
        question[0] = new Intrebare("Termenul de corupţie provine din: ","Latină – coruptio, -onis şi franceză - coruption ","Spaniolă - coruptere ","Portugheză - coruptiones ",1,0,0);
        question[1] = new Intrebare("Ce este corupţia? ","Comportamentul unei persoane care luptă pentru putere, pentru a domina o altă persoană ","încălcarea dispozițiilor interne ale unei instituții de către un funcționar ","Comportamentul unui funcţionar care, în schimbul banilor sau al unor/altor foloase necuvenite foloseşte funcţia publică pentru a obține un avantaj în nume personal ",0,0,1);
        question[2] = new Intrebare("Care sunt cauzele corupției? ","Lipsa de stabilitate legislativă; organizarea necorespunzătoare a instituţiilor şi autorităţilor publice; factorii economici; lipsa unei educaţii corespunzătoare etc. ","Indulgența șefilor ","Doar factorii economici ",1,0,0);
        question[3] = new Intrebare("Principalele instituții competente în prevenirea şi combaterea corupției sunt:” ","Primăria","Firmele de pază şi protecţie","Direcția Națională Anticorupție, Direcția Generală Anticorupție, Agenția Națională pentru Integritate, Poliția Română etc",0,0,1);
        question[4] = new Intrebare("În Țara Românească, primul iniţiator al legii împotriva corupţiei a fost: ","Constantin Brâncoveanu, care a emis o pravilă antiagonisire ","Vlad Ţepeş, domnitor al Ţării Româneşti ","Matei Basarab, care, în anul 1632, emite o pravilă în care specifică foarte clar că luarea de mită sau orice altă formă de corupţie era aspru pedepsită ",0,0,1);
        question[5] = new Intrebare("Cine poate săvârși infracțiunea de luare de mită:","Conducătorul auto","Funcționarul public","Administratorul unei firme private",0,1,0);
        question[6] = new Intrebare("Cel mai corupt domnitor din istoria Țărilor Române a fost: ","Constantin Hangerli ","Grigore Ghica ","Grigore Caragea ",1,0,0);
        question[7] = new Intrebare("Ce se înțelege prin trafic de influență?","Primirea unei sume de bani cu  titlu de împrumut","Darea/oferirea unei sume de bani","Pretinderea, primirea ori acceptarea promisiunii de bani sau alte foloase săvârșită de către o persoană care are influență sau lasă să se creadă că are influență asupra unui funcționar public pentru ca acesta să facă/să nu facă un act privitor în legătură cu îndatoririle sale de serviciu",0,0,1);
        question[8] = new Intrebare("În Țările Române, corupţia a fost la cel mai înalt nivel în: ","Perioada fanariotă ","Perioada interbelică ","Perioada domniei lui Nicolae Alexandru ",1,0,0);
        question[9] = new Intrebare("Principalele consecințe și costuri ale corupției sunt","Modificările legislative ","Abaterile disciplinare ","Corupţia te costă libertatea; corupția te costă locul de muncă; corupţia atrage răspunderea penală; corupţia aduce atingere reputaţiei oamenilor care lucrează pentru instituţie; corupţia afectează relaţiile interumane etc ",0,0,1);
        question[10] = new Intrebare("Cum apreciați, din punct de vedere etic, notarea supraevaluată de către unii profesori a lucrărilor la proba scrisă a examenului de bacalaureat, în vederea favorizării anumitor elevi?","Reprezintă o încălcare a normele de etică și deontologie profesională","Este acceptabil, mai ales că mediile foarte bune contribuie și la menținerea prestigiului unității de învățământ respective","Nu s-au întâmplat astfel de situații ",1,0,0);
        question[11] = new Intrebare("Direcţia Generală Anticorupţie este:","Structura specializată în prevenirea şi combaterea corupţiei în rândul personalului Ministerului Afacerilor Interne şi a Poliţiei Locale","Structura specializată în prevenirea şi combaterea corupţiei în rândul personalului Ministerului Afacerilor Interne şi a funcţionarilor publici din alte instituţii","Structura specializată în prevenirea şi combaterea corupţiei în rândul personalului Ministerului Afacerilor Interne ",0,0,1);

    }



    private void loadLevel17()
    {
        question[0] = new Intrebare("Violența în familie este: ","Orice act vătămător, fizic sau emoțional care are loc între membrii unei familii ","Orice situație neplăcută ","Nu există violență în familie ",1,0,0);
        question[1] = new Intrebare("Violența în familie poate avea mai multe forme:  ","Violența fizică, economică, psihologică, sexuală, verbală, spirituală ","Violența nu are nicio formă, nu există ","Violența există doar la știri ",1,0,0);
        question[2] = new Intrebare("Ce posibilități urgente are victima violenței în familie de a scăpa de agresorul său? ","Victima violenței solicită emiterea unui ordin de protecţie cu titlu provizoriu  de la poliţiştii care constată că există un risc iminent ca viaţa, integritatea ori libertatea unei persoane să fie puse în pericol printr-un act de violenţă domestic. Ordinul provizoriu se eliberează în cel mult 24 ore. Victima are posibilitatea de a solicita și judecătorului emiterea ordinului de protecție civilă, care se soluționează în maxim 72 de ore de la depunere ","Victima violenței în familie nu are nicio șansă să scape de agresor ","Victima violenței în acceptă situația ",1,0,0);
        question[3] = new Intrebare("Ce trebuie să facă o persoană dacă se simte abuzată? ","Să contacteze imediat poliția sau protecția copilului (dacă este cazul). Să discute cu persoanele în care are încredere (profesori, părinți, prieteni) și să ia imediat măsuri ","Nu trebuie să ia nicio măsură, lucrurile se rezolvă de la sine ","Să contacteze judecătorul ",1,0,0);
        question[4] = new Intrebare("Ce este hărțuirea sexuală? ","Manifestarea unui comportament cu conotație sexuală, exprimat fizic, verbal sau non-verbal, având ca obiect sau ca efect lezarea demnității unei persoane ","O atitudine normală, deoarece este des întâlnită ","O atitudine normală sau anormală, depinde de situație ",1,0,0);
        question[5] = new Intrebare("Hărțuirea sexuală se pedepsește penal? ","Da  ","Nu ","Doar prin amendă ",1,0,0);
        question[6] = new Intrebare("Unde se întâlnesc agresorii sexuali? ","În mediul public, în mijloacele de transport în comun, în parcuri, în stații, la școală, la muncă sau în oricare alte medii ","Nu îi poți întâlni niciodată, sunt invizibili ","Nu există agresori sexuali ",1,0,0);
        question[7] = new Intrebare("Ce trebuie să facă o persoană dacă se simte hărțuită sexual? ","Să filmeze, să fotografieze, să înregistreze, să se confeseze persoanelor în care are încredere, să reclame imediat agresorul la poliție ","Să aștepte să treacă momentul, poate nu se mai repetă ","Să se izoleze de cei din jur ",1,0,0);
        question[8] = new Intrebare("Ce recomandă Poliția Română într-un caz de hărțuire sexuală?  ","Poliţia Română încurajează persoanele hărţuite să depună plângere, aceasta fiind singura procedură pentru a lua măsuri legale împotriva hărțuitorilor (deoarece ancheta nu poate fi făcută ca urmare a autosesizării) ","Poliția Română nu recomandă nimic ","Nu există hărțuire sexuală  ",1,0,0);
        question[9] = new Intrebare("Care sunt principalele victime ale traficului de persoane?  ","Femeile și copiii ","Bătrânii ","Bărbații ",1,0,0);

    }

    private void loadLevel18()
    {
        question[0] = new Intrebare("Cum sunt atrase cel mai des victimele de către traficanții de persoane? ","Amăgindu-le prin poveştile de succes ale altor persoane care au fost ajutate să plece în străinătate şi care au revenit cu sume mari de bani după o perioadă relativ scurtă de timp (și multe alte metode) ","Spunându-le adevărul că vor fi traficate ","Nu există trafic de persoane ",1,0,0);
        question[1] = new Intrebare("Care sunt metodele pe care le folosesc traficanții de persoane pentru a atrage victimele?  ","Cel mai des, traficanții amăgesc victimele că le iubesc, le oferă un loc de muncă în străinătate, le răpesc, le abordează pe internet sau prin anunțuri la agenții matrimoniale, le promit o viață foarte bună din punct de vedere financiar (și multe alte metode) ","Nu au metode clare, nu sunt așa inteligenți ","Nu există victime ale traficului de persoane ",1,0,0);
        question[2] = new Intrebare("Care este profilul victimei preferate de traficanți? ","De obicei, victima preferată de traficanți are o situaţie materială precară, un grad redus de pregătire şcolară şi profesională, îi lipsește un loc de muncă, are atitudine superficială faţă de viaţă (fiind caracterizată printr-o lipsă de încredere în forţele proprii), are un anturaj negativ, are relaţii deficitare cu familia (provenind din familii dezorganizate în care poate se consumă alcool și există violenţă domestică), are incidente traumatizante din copilărie, a fost abuzată  fizic/emoţional ","Nu există victime ale traficului de persoane ","Nu există traficanți ale traficului de persoane ",1,0,0);
        question[3] = new Intrebare("Ce este șantajul sexual prin webcam?  ","„Sextorsion”, sau șantajul prin webcam, se referă la constrângerea sau forțarea copiilor și adolescenților să plătească diferite sume de bani prin internet (sau să facă favoruri sexuale) sub amenințarea publicării unor înregistrări compromițătoare ","Nu există așa ceva ","Șantajul există doar în filme ",1,0,0);
        question[4] = new Intrebare("Ce trebuie să facă o persoană dacă cineva o amenință prin publicarea de imagini compromițătoare în schimbul banilor? ","Să nu plătească nimic, să păstreze dovezile, să raporteze imediat evenimentul la poliție. ","Nu trebuie să facă nimic, această atitudine este normală ","Să aștepte să treacă evenimentul, poate acea persoană uită ",1,0,0);
        question[5] = new Intrebare("Reprezintă forma agravată a infracțiunii de „lovire și alte violențe”, fapta prin care se produc leziuni traumatice sau este afectată sănătatea unei persoane, a cărei gravitate este evaluată prin zile de îngrijiri medicale de cel mult:  "," 60 de zile "," 30 de zile "," 90 de zile ",0,0,1);
        question[6] = new Intrebare("Lipsirea de libertate a  unei persoane este mai gravă când este săvârșită: "," Sub influența băuturilor alcoolice "," Asupra unui minor "," De către o persoană mascată ",0,1,0);
        question[7] = new Intrebare("Fapta celui care, în mod repetat, urmărește, fără drept sau fără un interes legitim, o persoană ori îi supraveghează locuința, locul de muncă sau alte locuri frecventate de către aceasta, cauzându-i astfel o stare de temere reprezintă infracțiunea de: "," Șantaj "," Hărțuire "," Amenințare ",0,1,0);
        question[8] = new Intrebare("Refuzul de a părăsi locuința, încăperea, dependința sau un loc împrejmuit ținând de acestea, la cererea persoanei care le folosește, reprezintă: "," Lipsă de respect "," Violare de domiciliu "," Violarea vieții private ",0,1,0);
        question[9] = new Intrebare("Luarea unui bun mobil, chiar dacă bunul aparține în întregime sau în parte făptuitorului, dar în momentul săvârșirii acel bun se găsea în posesia altei persoane care nu si-a dat consimțământul, reprezintă: "," Furt din amuzament "," Tulburare de posesie "," Furt ",0,0,1);

    }



}
