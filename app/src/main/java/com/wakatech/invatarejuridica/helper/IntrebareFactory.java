package com.wakatech.invatarejuridica.helper;

public class IntrebareFactory {

    public Intrebare[] question = new Intrebare[30];
    public int numberOfQuestions = 10;
    public Intrebare2[] question2 = new Intrebare2[30];

    public static String levelNames[] = {
            "General",
            "Civil si Familie",
            "Drepturile tanarului",
            "Drepturile copilului",
            "Coruptia",
            "Administratia",
            "Rutier",
            "Finanaciar",
            "Drept penal",
            "Final"
    };

    public IntrebareFactory(int level) {
        switch (level) {
            case 1:
                loadLevel1();
                break;
            case 2:
                loadLevel2();
                break;
            case 3:
                loadLevel3();
                break;
            case 4:
                loadLevel4();
                break;
            case 5:
                loadLevel5();
                break;
            case 6:
                loadLevel6();
                break;
            case 7:
                loadLevel7();
                break;
            case 8:
                loadLevel8();
                break;
            case 9:
                loadLevel9();
                break;
            case 10:
                loadLevel10();
                break;
            default: break;
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

    public static int getlevelType(int l)
    {
        if (l==1 || l==5 || l==8 || l==9)
            return 0;
        return 1;
    }

    //general
    private void loadLevel1()
    {
        numberOfQuestions = 19;
        question[0] = new Intrebare(" Ziua națională a României este: ","1 mai; ","1 iunie; ","1 decembrie. ",0,0,1);
        question[1] = new Intrebare("Culorile drapelului României sunt: ","alb, roșu; ","albastru, galben, roșu; ","verde, alb, roșu; ",0,1,0);
        question[2] = new Intrebare("Imnul național al României este: ","„Deșteptă-te române”; ","„Trei culori”; ","„Hora României”. ",1,0,0);
        question[3] = new Intrebare("În România, limba oficială este: ","limba română; ","limba maghiară; ","limba engleză. ",1,0,0);
        question[4] = new Intrebare("Capitala României este: ","Constanța; ","Timișoara; ","București. ",0,0,1);
        question[5] = new Intrebare("Statul român este organizat pe principiul separației următoarelor puteri: ","legislativă, executivă și mass-media; ","executivă și judecătorească; ","legislativă, executivă și judecătorească. ",0,0,1);
        question[6] = new Intrebare("Legile: ","sunt reguli obligatorii;","sunt reguli facultative; ","uneori sunt obligatorii, alteori sunt facultative. ",1,0,0);
        question[7] = new Intrebare("Legea fundamentală a României este: ","Constituția; ","Codul penal; ","Codul civil. ",1,0,0);
        question[8] = new Intrebare("Legile sunt adoptate de: ","Parlament; ","Guvern; ","Consiliile județene sau locale. ",1,0,0);
        question[9] = new Intrebare(" Legile sunt aplicate de către: ","judecători; ","Președintele României; ","Parlamentul României. ",1,0,0);
        question[10] = new Intrebare(" Statul român este reprezentat de către: ","Președintele României; ","ministrul justiției; ","primul-ministru. ",1,0,0);
        question[11] = new Intrebare(" Președintele României este ales de către: ","Parlament; ","Comisia Europeană; ","cetățenii cu drept de vot. ",0,0,1);
        question[12] = new Intrebare(" Cetățenii au drept de vot de la împlinirea vârstei de: ","14 ani; ","18 ani; ","20 ani. ",0,1,0);
        question[13] = new Intrebare(" De regulă, o persoană se poate căsători la împlinirea vârstei de: ","16 ani; ","18 ani; ","20 ani; ",0,1,0);
        question[14] = new Intrebare(" Căsătoria între rude: ","este permisă întotdeauna; ","nu este permisă niciodată; ","nu este permisă între rude până la gradul 4 inclusiv (adică verișorii), ca regulă. ",0,0,1);
        question[15] = new Intrebare(" De regulă, obligația de a asigura creșterea, educația și instruirea copiilor o are/au: ","doar mama; ","doar tata; ","ambii părinți. ",0,0,1);
        question[16] = new Intrebare(" Minorii: ","pot fi angajați ca salariați indiferent de vârstă; ","pot fi angajați ca salariați cel mai devreme la împlinirea vârstei de 15 ani; ","nu pot niciodată fi angajați ca salariați. ",0,1,0);
        question[17] = new Intrebare(" O persoană poate răspunde penal: ","de la împlinirea vârstei de 14 ani; ","indiferent de vârstă; ","numai dacă este adultă. ",1,0,0);
        question[18] = new Intrebare(" În România, pedeapsa cu moartea: ","este permisă; ","este interzisă; ","este permisă în situații excepționale.",0,1,0);
    }

    //Civil si familie
    private void loadLevel2()
    {
        question2[0] = new Intrebare2("Minorul reprezintă:","Persoana fizică care nu a împlinit vârsta de 18 ani și nu a dobândit capacitate deplină de exercițiu. ","Persoana fizică de la naștere și până la vârsta de 22 ani. ",1,0);
        question2[1] = new Intrebare2("Minorul:","Poate încheia singur  acte juridice.","Nu poate încheia singur acte juridice. ",0,1);
        question2[2] = new Intrebare2("Motivul pentru care minorul nu poate încheia acte juridice este că: ","Nu este suficient dezvoltat fizic și psihic, deci nu are discernământul necesar pentru a participa singur la circuitul civil.","Nu îl lasă părinții săi. ",1,0);
        question2[3] = new Intrebare2("Minorul este ocrotit de părinții săi: ","În mod egal, indiferent dacă minorul este din căsătorie, din afara căsătoriei sau din adopție. ","În mod preferențial, după cum preferă părinții. ",1,0);
        question2[4] = new Intrebare2("Capacitatea deplină de exercițiu începe din momentul în care:","Persoana devine majoră;","Persoana împlinește vârsta de 16 ani.",1,0);
        question2[5] = new Intrebare2("Minorul dobândește, prin căsătorie:","Capacitate deplină de exercițiu;","Capacitate lărgită de exercițiu.",1,0);
        question2[6] = new Intrebare2("Se poate recunoaște capacitatea de exercițiu deplină a minorului care a împlinit vârsta de 16 ani, de către:","Instanța de tutelă;","Primăria din localitatea de reședință.",1,0);
        question2[7] = new Intrebare2("Minorul de 14 ani poate încheia singur:","Acte de vânzare-cumpărare a imobilelor;","Acte de administrare care nu îl păgubesc/prejudiciază.",0,1);
        question2[8] = new Intrebare2("Persoana pusă sub interdicție judecătorească poate să încheie: ","Acte de conservare;","Acte de înstrăinare a bunurilor.",1,0);
        question2[9] = new Intrebare2("Cartea de identitate:","este eliberată pentru prima dată la vârsta de 14 ani;","nu este obligatoriu  sa o aveti asupra voastră mereu. ",1,0);


        numberOfQuestions = 10;

    }


    ///Drepturile tanarului
    private void loadLevel3()
    {
        question2[0] = new Intrebare2("Poți deține legal un cont de Facebook: ","De la vârsta de 13 ani","De la vârsta de 15 ani",0,1);
        question2[1] = new Intrebare2("Nu avem voie să:", "Dezvăluim conținutul unei comunicări (scrisă sau orală: mesaje, scrisori sau convorbiri telefonice sau față în față), care nu ne aparține", "Publicăm poze pe Internet cu noi înșine.", 1, 0);
        question2[2] = new Intrebare2("Peretele contului de Facebook este considerat:","Spațiu public","Spațiu privat.",1,0);
        question2[3] = new Intrebare2("Interceptarea și înregistrarea comunicărilor, discuțiilor, mesajelor, poate avea loc:","Mereu, prin programe speciale","Doar cu autorizație.",1,0);
        question2[4] = new Intrebare2("Părintele care retrage copilul de la școală sau îl împiedică să urmeze cursurile învățământului general obligatoriu este:","Sancționat","Nu se întâmplă nimic, această decizie îi aparține strict părintelui.",0,1);
        question2[5] = new Intrebare2("Se poate cere schimbarea pregătirii profesionale, de către tânărul care a implinit vârsta de 14 ani?","Nu, nu are acest drept;","Da, dar doar cu încuviințarea instanței judecătorești.",1,0);
        question2[6] = new Intrebare2("Ce presupune ,,bullying’’-ul?","Un hobby;","Fapte în urma cărora o persoană este intimidată, hărțuită, terorizată, fiind supusă unor agresiuni verbale, psihice, fizice (uneori), devenind o țintă a răutăților spuse de agresori.",0,1);
        question2[7] = new Intrebare2("Ce trebuie să facem când suntem victima bullyingului?","Nimic, ne lăsăm intimidați, agresorul poate încetează.","Anunțăm profesorul, părinții sau chiar depunem plângere la poliție.",0,1);
        question2[8] = new Intrebare2(" Elevii au următoarele drepturi:","Dreptul la respectarea imaginii, demnității, personalității și la protecția datelor personale; dreptul la burse și la 50% reducere la transportul local în comun","Dreptul de a folosi telefonul mobil oricând.",1,0);
        question2[9] = new Intrebare2("Elevii nu au dreptul să:","Urmeze ora de religie; dreptul de a evalua profesorii, în mod anonim, semestrial","Înregistreze activitatea didactică.",1,0);
        numberOfQuestions = 10;
    }


    ///Drepturile Copilului
    private void loadLevel4()
    {
        numberOfQuestions = 10;
        question2[0] = new Intrebare2("Ce este contractul?","O activitate","O înțelegere între cel puțin două părți.",0,1);
        question2[1] = new Intrebare2("Care persoane pot munci, în baza unui contract individual de muncă?","Tinerii peste 15 ani, numai cu acordul părinților și tinerii peste 16 ani, fără a fi necesar acordul părinților","Doar tinerii peste 20 de ani.",1,0);
        question2[2] = new Intrebare2("Voluntariatul este: ","O activitate plătită","O activitate de implicare activă în comunitate, fără așteptări materiale sau bănești.",0,1);
        question2[3] = new Intrebare2("Perioada cuprinsă în contractul de voluntariat, încheiat între voluntar și organizația-gazdă, este considerată:","Timp neutilizat eficient;\n","Experiență profesională și/sau de specialitate.",0,1);
        question2[4] = new Intrebare2("Traficul de minori în scopul exploatării lor este:","Infracțiune","Contravenție.\n",1,0);
        question2[5] = new Intrebare2("Tinerii care au vârsta de minim 16 ani, care sunt apți pentru prestarea unei munci și care, după absolvirea școlii sau liceului, nu au reușit să se încadreze în muncă potrivit pregătirii profesionale, au dreptul:","De a reface studiile gimnaziale sau liceale, după caz","De a primi indemnizație de șomaj. ",0,1);
        question2[6] = new Intrebare2("Părăsirea incintei școlii de către elevii majori:","Este permisă, se face pe propia răspundere","Este absolut interzisă",1,0);
        question2[7] = new Intrebare2("Elevii nu sunt obligați:","Să poarte uniformă;\n","Să meargă/se prezinte la orele de studiu.",1,0);
        question2[8] = new Intrebare2("Ce se întâmplă dacă zgârii o mașină, spargi un geam sau incendiezi o mașină?","Comiți infracțiunea de distrugere","Săvârșești o contravenție",1,0);
        question2[9] = new Intrebare2("Ce se întâmplă  când intri în casa cuiva fără să ai voie?","Comiți infracțiunea de violare de domiciliu;","Nimic care să atragă o răspundere a ta.",1,0);
    }


    //coruptia
    private void loadLevel5()
    {
        numberOfQuestions = 10;
        question[0] = new Intrebare("Termenul de corupţie provine din:","latină – coruptio, -onis şi franceză - coruption","spaniolă - coruptere","portugheză - coruptiones",1,0,0);
        question[1] = new Intrebare("Ce este corupţia?","comportamentul unei persoane care luptă pentru putere, pentru a domina o altă persoană","încălcarea dispozițiilor interne ale unei instituții de către un funcționar","comportamentul unui funcţionar care, în schimbul banilor sau al unor/altor foloase necuvenite foloseşte funcţia publică pentru a obține un avantaj în nume personal.",0,0,1);
        question[2] = new Intrebare("Care sunt cauzele corupției?","lipsa de stabilitate legislativă; organizarea necorespunzătoare a instituţiilor şi autorităţilor publice; factorii economici; lipsa unei educaţii corespunzătoare etc.","indulgența factorilor de conducere/șefilor","doar factorii economici.",1,0,0);
        question[3] = new Intrebare("Cine este autorul următorului enunț: „Ori de câte ori suntem în îndoială, trebuie să alegem calea prin care greșim mai puțin?”","Homer","Aristotel","Hannibal",0,1,0);
        question[4] = new Intrebare("În Țara Românească, primul iniţiator al legii împotriva corupţiei a fost:","Constantin Brâncoveanu, care a emis o pravilă antiagonisire","Vlad Ţepeş, domnitor al Ţării Româneşti","Matei Basarab, care, în anul 1632, emite o pravilă în care specifică foarte clar că luarea de mită sau orice altă formă de corupţie era aspru pedepsită.",0,0,1);
        question[5] = new Intrebare("Cine este autorul următorului enunț: ,,Adevărul nu este ceea ce vrei tu să fie; este ceea ce este și trebuie să te descurci cu puterea lui sau să trăiești o minciună?”","Sun Tzu","Lao Tzu","Miyamoto Musashi",0,0,1);
        question[6] = new Intrebare("Cel mai corupt domnitor din istoria Țărilor Române a fost:","Constantin Hangerli;","Grigore Ghica;","Grigore Caragea.",1,0,0);
        question[7] = new Intrebare("Cine este autorul următorului enunț: ,,Morala e izvorul libertății, morala e condiția libertății, morala e pavăza libertății?”","Vasile Ghica","Nicolae Steinhardt","Blaise Pascal.",0,1,0);
        question[8] = new Intrebare("In Țările Române, corupţia a fost la cel mai înalt nivel, în:","perioada fanariota","perioada interbelica","perioada domniei lui Nicolae Alexandru.",1,0,0);
        question[9] = new Intrebare("Cine este autorul următorului enunț: ,,Numai atunci când ne conformăm normelor morale câștigăm dreptul de a judeca?”","Lev Tolstoi;","George Sand","Marguerite Yourcenar.",0,0,1);
    }


    //administratia
    private void loadLevel6()
    {
        question2[0] = new Intrebare2("Administrația publică este organizată în:","Administrația publică este organizată în:","Administrația centrală, administrația de stat în teritoriu, administrația locală. ",0,1);
        question2[1] = new Intrebare2("Din cine este alcătuit Guvernul?","Președinte","Prim-ministru, ministru și alți membri stabiliți prin lege organică",0,1);
        question2[2] = new Intrebare2("Cât timp își exercită Guvernul mandatul?","Guvernul își exercită mandatul până la data validării alegerilor locale ","Guvernul își exercită mandatul până la data validării alegerilor parlamentare generale, dar și în anumite situații prevăzute de Constituție.",0,1);
        question2[3] = new Intrebare2("Atribuțiile Guvernului sunt:","De natură financiară","De natură politico-administrativă și economico-financiară.",0,1);
        question2[4] = new Intrebare2("Actele adoptate de Guvern se numesc:","Legi","Ordonanțe (simple sau de urgență) și hotărâri.",0,1);
        question2[5] = new Intrebare2("Actele adoptate de Guvern","Se publică în Monitorul Oficial","Nu se publică în Monitorul Oficial",1,0);
        question2[6] = new Intrebare2("Rolul central în funcționarea Guvernului aparține:","Președintelui","Prim-ministrului ",0,1);
        question2[7] = new Intrebare2("Toate actele juridice adoptate de Guvern:","Sunt semnate de prim-ministru iar în cazul în care nu se poate realiza consensul pentru adoptarea unui act, el are dreptul de a decide","Sunt semnate de Președinte.",1,0);
        question2[8] = new Intrebare2("Ministerele: ","Au personalitate juridică și sediul în municipiul București.","Nu au personalitate juridică",1,0);
        question2[9] = new Intrebare2("Ministerele sunt conduse de:","Miniștri ","Primari",1,0);
    }


    //rutier
    private void loadLevel7()
    {
        question2[0] = new Intrebare2("Traversarea străzii se realizează:","Prin locuri special amenajate;","Oricând, oricum, oriunde.",1,0);
        question2[1] = new Intrebare2("Partea străzii pe care se circulă, în absența trotuarului este:","Partea stângă;","Partea dreaptă.",1,0);
        question2[2] = new Intrebare2("Centura se pune în autovehicul, în timp ce se deplasează, pentru că:","Așa spun părinții;","Așa este impus de lege, în vederea asigurării siguranței în autovehicul.\n",0,1);
        question2[3] = new Intrebare2("Locul pe care se stă în autovehicul, în funcție de vârstă este:","Pe bancheta din spate, pentru persoanele cu vârsta până în 12 ani;","În față, pentru persoanele peste 12 ani.",1,0);
        question2[4] = new Intrebare2("In cazul unui accident auto:","Soferul care a provocat accidentul poate părăsi locul accidentului;","Victimele, în orice stare ar fi, nu trebuie bruscate, smuncite, trase agresiv. ",0,1);
        question2[5] = new Intrebare2("Circulația cu bicicleta pe drumul public este permisă atunci când:","Biciclistul are peste 14 ani și circulă pe drumul public, doar pe banda sau pista special amenajată;","Biciclistul  ține cel puțin o mână pe ghidon.",1,0);
        question2[6] = new Intrebare2("Este preferabil să circulăm cu bicicleta în zonele: ","Cu trafic intens;","Cu trafic redus.",0,1);
        question2[7] = new Intrebare2("Permisul de conducere, în România, poate fi obținut de la vârsta de:","16 ani (categoria A, B1); 18 ani (categoria A2, B, BE); 21 ani (categoria C, CE); 24 ani (categoria D, DE);\n","14 ani",1,0);
        question2[8] = new Intrebare2("Atunci când călătoriți cu metroul:","Este interzis fotografiatul;","Nu este interzis fotografiatul.",1,0);
        question2[9] = new Intrebare2("În tren, fumatul este:","Permis, în zonele dintre vagoane","Absolut interzis",0,1);
    }


    //financiar
    private void loadLevel8()
    {
        question[0] = new Intrebare("Un impozit este:\n","o taxa","o suma de bani","o contributie",0,2,0);
        question[1] = new Intrebare("O taxă este datorată:\n","când cumpărăm un bun\n","când beneficiem de un serviciu public\n","când mergem în vacanţă.\n",0,1,0);
        question[2] = new Intrebare("O contribuţie socială este o sumă de bani datorată:\n","pentru a fi asigurat în viitor\n","doar de cetăţenii români\n","uneori şi de animale.\n",1,0,0);
        question[3] = new Intrebare("O persoană fizică datorează impozit\n","când nu are niciun venit\n","când are venituri din muncă, ca şi salariat\n","când primeşte un cadou.\n",0,1,0);
        question[4] = new Intrebare("O persoană fizică datorează impozit","când merge la medic pentru o consultaţie\n","când cumpără combustibil pentru maşină\n","când plăteşte parcarea.",0,1,0);
        question[5] = new Intrebare("O societate, care operează un magazine de haine:\n","datorează numai un impozit\n","datorează mai multe impozite, unele pentru ea, altele pentru salariaţi\n","nu datorează niciun impozit dacă nu vinde nimic\n",0,1,0);
        question[6] = new Intrebare("Un mic comerciant, care are o tonetă cu verdeţuri, are obligaţia:","de a se înregistra fiscal\n","de a avea salariaţi\n","de a face reclamă\n",1,0,0);
        question[7] = new Intrebare("Pentru o tranzacţie economică, este necesar să se emită:\n","întotdeauna factură\n","întotdeauna bon fiscal\n","uneori factură, uneori bon fiscal, chiar şi amândouă.\n",0,0,1);
        question[8] = new Intrebare("Unele impozite:\n","sunt incluse în preţul unor produse\n","nu sunt datorate niciodată\n","sunt mai mari pentru unele personae decât pentru altele\n",1,0,0);
        question[9] = new Intrebare("Un copil în vârstă de 10 ani :\n","nu datorează niciodată impozite\n","nu datorează niciodată impozite şi nici taxe\n","datorează impozite ori taxe, în funcţie de acţiunile sale.\n",0,0,1);
    }


    ///drept penal
    private void loadLevel9()
    {
        question[0] = new Intrebare("Legea penală:\n","se aplică infracțiunilor săvârșite în timpul cât ea se află în vigoare.\n","legea penală nouă se aplică şi faptelor săvârșite sub legea veche.\n","legea penală temporară se aplică infracțiunii săvârșite în timpul când era în vigoare, numai dacă fapta a fost urmărită sau judecată în acel interval de timp.\n",1,0,0);
        question[1] = new Intrebare("Infracțiunea este fapta prevăzută de legea penală, săvârșită cu vinovăție, …… şi imputabilă persoanei care a săvârșit-o. Cuvântul care lipseşte este:\n"," intenţionată;\n","intenţionată sau din culpă;\n"," nejustificată.\n",0,0,1);
        question[2] = new Intrebare("Fapta este săvârșită cu intenție când făptuitorul:\n","prevede rezultatul faptei sale, urmărind sau acceptând producerea lui prin săvârșirea acelei fapte.\n","prevede rezultatul faptei sale, dar nu-l acceptă, socotind fără temei că el nu se va produce;\n","nu prevede rezultatul faptei sale, deși trebuia și putea să îl prevadă.\n",1,0,0);
        question[3] = new Intrebare("Este justificată fapta prevăzută de legea penală săvârșită:\n","fără a cunoaşte caracterul penal al faptei; ","în legitimă apărare;\n","cu consimțământul persoanei vătămate chiar şi în cazul infracțiunii de omor.\n",0,1,0);
        question[4] = new Intrebare("Tentativa constă în punerea în executare a intenției de a săvârși infracțiunea, executare care a fost însă:\n","suspendată din voinţa fătuitorului;\n","dusă la bun sfârşit, dar nu şi-a produs efectul;\n","amânată pentru un moment ulterior.\n",0,1,0);
        question[5] = new Intrebare("Nu se pedepsește autorul care, înainte de descoperirea faptei:\n","a încunoștințat autoritățile de comiterea acesteia, chiar dacă infracţiunea s-a consumat; \n"," reuşeşte să părăsească teritoriul ţării;\n","împiedică el însuşi consumarea infracţiunii;\n",0,0,1);
        question[6] = new Intrebare("La stabilirea stării de recidivă nu se ține seama de hotărârile de condamnare privitoare la:\n"," faptele care nu mai sunt prevăzute de legea penală;"," infracțiunile graţiate;","infracțiunile săvârșite cu intenţie indirectă.\n",1,0,0);
        question[7] = new Intrebare("Complice este persoana care:\n"," cunoaşte despre săvârşirea unei infracţiuni, dar nu o denunţă;\n","ajută infractorul să scape de tragerea la răspundere penală;\n"," înlesnește sau ajutăcu intenție şi în orice mod la săvârșirea unei fapte prevăzute de legea penală.\n",0,0,1);
        question[8] = new Intrebare("Următoarele împrejurări constituie circumstanțe atenuante legale:\n","eforturile depuse de infractor pentru înlăturarea sau diminuarea consecințelor infracțiunii;\n","lipsa antecedentelor penale pentru infractor;\n","săvârșirea infracțiunii sub stăpânirea unei puternice tulburări sau emoții, determinată de o provocare din partea persoanei vătămate, produsă prin violență, printr-o atingere gravă a demnității persoanei sau printr-o altă acțiune ilicită gravă;\n",0,0,1);
        question[9] = new Intrebare("Reprezintă forma agravată a infracțiunii de lovire și alte violențe, fapta prin care se produc leziuni traumatice sau este afectată sănătatea unei persoane, a cărei gravitate este evaluată prin zile de îngrijiri medicale de cel mult: ","60 zile","30 zile","90 zile",0,0,1);
    }


    private void loadLevel10()
    {
        question2[0] = new Intrebare2("Are dreptul la integritate fizică și psihică:","Orice persoană;","Persoanele cu capacitate deplină de exercițiu/ persoanele majore.",1,0);
        question2[1] = new Intrebare2("Are dreptul la liberă exprimare:","Orice persoană;","Persoanele care sunt membre ale unor asociații constituite legal.",1,0);
        question2[2] = new Intrebare2("Reprezintă o atingere a vieții private:","Interceptarea fără drept a unei convorbiri private;","Interceptarea autorizată a unei convorbiri private.",1,0);
        question2[3] = new Intrebare2(" Este atingere adusă vieții private:","Captarea sau utilizarea imaginii sau vocii unei persoane, aflate în spațiu privat, fără acordul acesteia;","Captarea sau utilizarea imaginii sau vocii unei persoane, aflate în spațiu public, fără acordul acesteia.",1,0);
        question2[4] = new Intrebare2("Numele unei persoane este format din:","Numele de familie și prenumele;","Prenumele, porecla și numele de familie.",1,0);
        question2[5] = new Intrebare2(" Schimbarea numelui unui cetățean român este posibilă: ","La cererea oricărei persoane;","La cererea persoanei interesate în condițiile legii. ",0,1);
        question2[6] = new Intrebare2("O persoană care deține mai multe locuințe, are automat: ","Mai multe domicilii în același timp;","Mai multe reședințe în același timp.",0,1);
        question2[7] = new Intrebare2("Reședința unei persoane fizice este:","Acolo unde își are locuința principală;","Acolo unde își are locuința secundară.",0,1);
        question2[8] = new Intrebare2("Minorul care a împlinit vârsta de 14 ani încheie acte juridice: ","Cu încuviințarea scrisă a tutorelui sau a curatorului;","Fără încuviințarea scrisă a tutorelui sau a curatorului.",1,0);
        question2[9] = new Intrebare2("Minorul în vârstă de 16 ani se poate căsători:","Cu încuviințarea părinților;","Cu încuviințarea părinților și autorizația instanței.",1,0);
    }



}
