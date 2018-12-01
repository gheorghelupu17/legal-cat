package com.wakatech.invatarejuridica.helper;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    private RandomGenerator() {}

    static private int[] colors = {
            0xffab1323,0xffc5e7cf,
            0xff7fbfff,0xfff69d3a,
            0xff172d51,0xfff75a56,
            0xff945aca,0xff008080,
            0xff550911,0xfff49c98
    };

    static private String[] facts = {
            "În Africa, părinţii sunt autoritari iar copiii trebuie să se supună. Până la vârsta de 25 de ani aceştia nu ies din cuvântul părinţilor. În unele triburi africane, de exemplu, dacă un băiat vrea să devină independent şi să plece din casa părintească, trebuie să se lupte cu un leu. Numai aşa îşi obţine independenţa şi demonstrează că nu mai are nevoie de protecţia familiei. În familiile tradiţionale din Africa nu veţi întâlni un copil care să îi spună părintelui „nu vreau”. Dacă se împotriveşte, consecinţele vor fi greu de suportat.",
            "Regiunea cu cea mai scazuta criminalitate este Quebec, Canada. Rata criminalitatii in aceasta zona este similara cu cea inregistrata intr-un parc Disney World, aproape 0.",
            "In Santa Fe, New Mexico, legea impune ca animalele de casa sa poarte centura de siguranta in masina.",
            "In anul 2004, un studiu arata ca una din sase fetite intra in perioada de pubertate la varsta de 8 ani. In urma cu un secol, doar o fetita din 100 atingea pubertatea la aceeasi varsta.",
            "In Bangladesh exista o lege care permite autoritatilor sa aresteze elevii cu varste mai mari de 15 ani care copiaza la examene.",
            "Doar o singura persoana din 2 miliarde va atinge varsta de 116 ani.",
            "In absolut toate tarile lumii, indiferent de cultura, religie sau zona geografica, soldatii executa salutul numai cu mana dreapta.",
            "In Elvetia este ilegal sa trantesti portiera oricarei masini.",
            "In anul 1979, regimul politic din Irak a interzis filmele cu arte martiale.",
            "In Danemarca legea permite detinutilor sa evadeze din inchisori.",
            "In Myanmar este ilegal sa accesezi Internetul. Oricine o face ajunge sa stea ani buni dupa gratii.",
            "Pe timpul desfășurării Primului Razboi Mondial, barbatii care se dovedeau a fi homosexuali erau executati pe loc, fara niciun proces.",
            "In Singapore este contrar legilor tarii sa mesteci banala guma de mestecat. ",
            "Datorita faptului ca celebrul personaj de desene animate Donald Duck nu purta pantaloni lungi, filmele de desene animate care-l aveau drept erou principal au fost interzise de lege in Finlanda.",
            "In anul 1935, guvernul Romaniei din acele timpuri a introdus o lege prin care personajul de desene animate, Mickey Mouse a fost interzis pe motiv ca era atat de urat desenat incat speria copiii mici.",
            "In urma cu peste 2000 de ani, Cezar a interzis accesul carelor in Roma, pe motiv ca incurcau si aglomerau circulatia cetatenilor romani.",
            "In Marea Britanie, legea permite oricarei femei gravide sa urineze oriunde doreste, inclusiv in cascheta unui politist, fara sa poate fi trasa la raspundere.",
            "In Anglia oricine lipeste gresit o marca postala care o reprezinta pe regina, poate fi acuzat de tradare de tara.",
            "In statul american Florida este interzis orice act sexual cu un porc spinos.",
            "In orasul Alexandria, din statul american Minneapolis, exista o hotarare legala care-i interzice oricarui barbat caruia-i miroase gura a peste, sa aiba vreun contact sexual cu o femeie.",
            "In statul Carolina de Nord este interzis de lege sa injuri in prezenta mortilor.",
            "Legile statului Ohio pedepsesc cu inchisoarea pe oricine incearca sa imbete un peste.",
            "In statul Florida, daca o femeie nemaritata sare cu parasuta in zilele de sambata, aceasta ajunge invariabil la inchisoare.",
            "In orasul Alexandria, din statul Minneapolis, daca rasuflarea unui barbat miroase a usturoi sau ceapa, acestuia-i este interzis de lege sa aiba orice fel de contact sexual cu sotia sa.",
            "In capitala statului El Salvador, orasul San Salvador, exista o lege care condamna la moarte prin impuscare, in fata unui pluton de executie, orice sofer prins baut in interiorul capitalei. ",
            "In orasul englez York exista inca in vigoare o lege datand din Evul Mediu, care-i permite oricarui cetatean al orasului sa ucida orice scotian intalnit in York. Evident, doar daca scotianul vizat poarta asupra sa un arc si o tolba cu sageti.",
            "In Anglia anului 1837, daca un barbat saruta o femeie fara voia ei, exista o lege care-i permitea femeii sarutate fortat, sa-l muste de nas cat se poate de tare pe barbatul vinovat.",
            "In statul american Vermont, pentru orice femeie care vrea sa poarte o proteza dentara, este nevoie de acordul scris si semnat al sotului acesteia.",
            "Daca ajungi cumva in orasul Logan County, sa nu saruti niciodata o femeie care doarme, indiferent daca iti este sotie sau prietena. Legile acestui oras pedepsesc acest gest cu inchisoarea.",
            "In Paraguay duelul este permis de lege, atata timp cat cei doi participanti la duel fac dovada ca doneaza sange spitalelor.",
            "Hipnoza este o practica interzisa in scolile publice din orasul american San Diego.",
            "In statul american Iowa, daca un barbat saruta o femeie mai mult de 5 minute neintrerupte, fapta se considera infractiune, iar barbatul patimas risca inchisoarea.",
            "Acum circa 300 de ani, orice cetatean japonez care incerca sa paraseasca Imperiul Soarelui Rasare era condamnat pe loc la decapitare pentru tradare de tara.",
            "In orasul Eureka, din statul american Nevada, legea interzice ca un barbat cu mustata sa sarute o femeie.",
            "In Bangladesh, chiulitul de la scoala este interzis de lege. Orice elev prins in afara orelor de curs, ajunge la inchisoare.",
            "Orasul St. Louis din Missouri are in vigoare o lege conform careia este interzis ca un barbat sa salveze o femeie aflata in pericol, daca aceasta este imbracata in pijamale.",
            "Pe teritoriul Frantei este ilegal sa dai numele de Napoleon unui porc.",
            "In orasul Baltimore, din Maryland, este ilegal sa intri cu un leu intr-o sala de cinema.",
            "Este contrar legii pentru orice cetatean britanic sa moara in interiorul Palatului Parlamentului din Londra.",
            "Daca ajungi in orasul Miami, din Florida, retine ca este interzis de lege sa imiti orice fel de sunete emise de animale.",
            "In Bahrein este interzis de lege ca un barbat ginecolog sa examineze direct organele genitale ale unei femei. Putinii barbati medici ginecologi din acesta tara musulmana se folosesc in acest scop de o oglinda pozitionata astfel incat sa le ofere imaginile de care au nevoie atunci cand stabilesc un diagnostic pe cale vizuala.",
            "In statul american Oklahoma, orice persoana care se stramba in mod voit la un caine, ajunge la inchisoare sub invinuirea de agresiune asupra celui mai bun prieten al omului.",
            "In Liban, barbatilor le este permis sa intretina acte sexuale cu animalele de sex feminin. Daca in schimb, un barbat este surprins in timpul unui act sexual cu un animal de sex masculin, este pedepsit cu moartea fara niciun fel de proces.",
            "In orasul italian Milano exista o lege locala care-i obliga pe cetateni sa zambeasca tot timpul, cu exceptia situatiilor cand merg la spital sau la inmormantari.",
            "In statul american Washington, daca un cetatean se lauda in public ca are parinti bogati si influenti, persoana in cauza ajunge la inchisoare.",
            "Exista o lege in orasul Oxford, din statul Ohio, care interzice oricarei femei sa se dezbrace in fata unei fotografii care reprezinta un barbat.",
            "Daca ajungeti cumva in statul american Kentucky, sa nu transportati niciodata cornete de inghetata in propriile buzunare. Exista o lege in vigoare conform careia puteti ajunge la inchisoare pentru aceasta fapta.",
            "Daca transportati o bomba nucleara in orasul Chico din California, sunteti pasibili de amenda pentru transport de material radioactiv pe teritoriul orasului.",
            "In Danemarca exista o lege care-i obliga pe toti posesorii de automobile ca, inainte de a se urca la volan si a demara, sa se uite sub propriile masini in cautarea unor eventuali copii ascunsi acolo.",
            "In New Jersey este ilegal sa porti o vesta antiglont in timp ce comiti o crima.",
            "In Idaho, un barbat ar comite o ilegalitate daca i-ar oferi iubitei sale o cutie cu bombone de peste 22,6 kilograme.",
            "Nu ai voie sa fotografiezi un iepure in luna mai, conform legilor din Wyoming.",
            "Este ilegal sa ai casa decorata in spiritul Craciunului dupa data de 14 ianuarie, in Maine.",
            "In Connecticut este ilegal sa traversezi o strada 'mergand' in maini.",
            "In Suedia, este ilegal sa tragi apa la toaleta dupa 10 seara, in casa unei persoane.",
            "In Vermont, femeile trebuie sa obtina o permisiune scrisa de la sotul lor, daca doresc sa poarte o proteza dentara.",
            "In Carolina de Sud, trebuie sa ai cel putin 18 ani pentru a te putea juca legal Pinball.",
            "In Alabama, actul de a pune sare pe sinele de tren poate fi pedepsit cu moartea!",
            "Magarii nu au voie sa doarma intr-o cada de baie, in Arizona.",
            "In California, un vehicul fara sofer nu are voie sa se deplaseze cu o viteza mai mare de 96,5 kilometri la ora.",
            "Conform legii, este strict interzis sa trezesti un urs pentru a-i face o poza, in Alaska.",
            "In Connecticut, poti fi oprit de Politie daca circuli cu bicicleta cu o viteza de peste 104 km/ora.",
            "In inchisorile de stat din Wisconsin este ilegala servirea substitutilor de unt.",
            "In Illinois este ilegal sa pescuiesti in timp ce esti asezat pe gatul unei girafe.",
            "In Louisiana e impotriva legii sa jefuiesti o banca si apoi sa 'impusti' functionarul de la ghiseu cu un pictol cu apa.",
            "Este ilegal sa ii imprumuti vecinului tau aspiratorul, daca locuiesti in Colorado.",
            "Un locuitor din Minnesota nu are voie sa treaca granitele statului in timp ce are o rata pe cap.",
            "In Las Vegas, unui barbat ii este interzis sa cumpere, in acelasi timp, bauturi pentru mai mult de trei persoane.",
            "In Nebraska, nu poti vinde... gaurile de la gogosi!",
            "In Pennsylvania, este ilegal sa dormi pe un frigider in aer liber.",
            "Este ilegal sa fluieri sub apa in Vermont.",
            "In Anglia este interzis ca un taximetrist din Londra sa transporte caini turbati sau cadavre.",
            "In Indonezia, pedeapsa pentru cei prinsi ca se masturbeaza este decapitarea.",
            "In Florida, femeile necasatorite care se dau cu parasuta duminica pot fi trimis ela inchisoare.",
            "In Chester, galezilor le este interzis sa intre in oras inainte de rasarit sau sa stea dupa ce apune soarele.",
            "In Providence, Rhode Island, este interzis ca detinatorii de magazine sa vanda duminica aceluiasi client si pasta de dinti si periuta de dinti.",
            "In Zion, Illinois, este ilegal sa le dai animalelor domestice sa fumeze. ",
            "In Maryland este ilegal ca statiile radio sa difuzeze melodia lui Randy Newman intitulata „Oameni scunzi”.",
            "In Oklahoma este ilegal sa te strambi la caini si cel ce o face poate sfarsi in inchisoare. ",
            "In Hasting, Nebraska, legea spune ca proprietarii de hoteluri trebuie sa le asigure clientilor sai tricouri albe din bumbac, cuplurile neavand voie sa aiba relatii intime daca nu poarta aceste tricouri.",
            "In Burma, accesul la internet este total interzis. Oricine este gasit ca are modem in casa risca inchisoarea. ",
            "Belgia este singura tara care nu a cenzurat filmele pentru adulti. ",
            "Filmele cu si despre karate au fost interzise in Irak in 1979.",
            "In South Bend, Indiana, o maimuta a fost găsit vinovata pentru fumat.",
            "In Bermuda, pana in anul 1948, toate masinile personale au fost interzise. ",
            "In Minessota este interzis sa pui pe acelasi uscator lenjerie de femei si de barbati. ",
            "In Arizona este ilegal sa vanezi camile. ",
            "In Canada, 35% din muzica difuzata la radio trebuie sa apartina unui artist canadian. ",
            "Este interzis prin lege sa hranesti porumbeii din Piata San Marco din Venetia. ",
            "In Spania este interzis sa conduci incaltat cu papuci de plaja. ",
            "Pe plaja Venice din California, este interzis să înjuri.",
            "Grecia a interzis accesul femeilor care poartă pantofi cu toc în zona Acropole sau a altor monumente istorice.",
            "În Scandinavia, șoferii trebuie să aibă farurile pornite pe tot parcursul zilei.",
            "În Singapore este interzis să mesteci gumă, dacă aceasta nu a fost eliberată cu o prescripție medicala. ",
            "Nu ai voie să calci pe bani în Thailanda. Pe moneda oficială a țării asiatice este înfățișat regele Thailandei, astfel că gestul este considerat act criminal. De asemenea, sunt interzise injuriile la adresa monarhului.",
            "Orice femeie aflată pe teritoriul orașului Tremorton, din statul Utah, va ajunge la închisoare dacă face dragoste cu un bărbat în interiorul unei ambulanțe.",
            "În Japonia nu ai voie să fii obez. Potrivit unei legi, bărbații de peste 40 de ani trebuie să aibă o talie de maxim 80 de centimetri.",
            "Dacă locuiești în Danemarca și te gândești să-i dai copilului tău un nume ieșit din comun, ar fi bine să consulți regulile oficiale. Dacă numele pe care-l dorești nu se află printre cele 7.000 de nume aprobate de autorități, ai nevoie de avizul special al guvernului danez.",
            "In Mexic, bicicliștii nu au voie să-și ridice picioarele de pe pedale deoarece există riscul de a pierde controlul bicicletei. Această lege a fost instituită în Mexic în 1892 pentru a-i proteja pe bicicliști.",
            "Dacă ești fan al nudismului, ai face bine să eviți drumețiile în Elveția. Mai precis, autoritățile din cantonul Appenzell au fost primele care au instituit o pedeapsa pentru cei care fac drumeții în „costumul lui Adam”. Totul s-a întâmplat în 2009, după ce un turist german a trecut în pielea goală pe lângă o familie care era la picnic în Alpi.",
            "Autoritățile din orașul Petrolia, din provincia canadiană Ontario, au adoptat un regulament care interzice zgomotul excesiv. Potrivit acestei legi este interzis să țipi, să fluieri sau să cânți în public, indiferent de oră sau circumstanțe.",
            " Când circuli pe autostrăzile din Germania, nu trebuie să fii cu ochii doar la vitezometru, ci și la indicatorul de benzină. Dacă rămâi fără combustibil pe autostradă, risti sa fii amendat.",
            "Autoritățile portugheze au interzis urinatul in apele oceanului. Desigur, aceasta este o lege de bun simț, însă nu știm cum îi pot descoperi autoritățile pe cei care o încalcă.",
            "În Australia, proprietarii de baruri trebuie sa monitorizeze consumul de alcool al clientilor . Cei care îi îmbată prea tare pe clienți riscă amenzi usturătoare.",
            " În 2001, guvernul de la Phnom Penh a interzisvanzarea si importul de pusti cu apa . Măsura o fost luată de teamă că jucăriile vor provoca tensiuni sociale în timpul manifestărilor de Revelion ale khmerilor.",
            "Cei care trăiesc în orașul Quitman, din statul american Georgia, trebuie sa-si supravegheze gainile constant. În micul oraș, proprietarilor de găini le este interzis să lase păsările să treacă strada.",
            "În Hong Kong, crima pasională este reglementată prin lege. Dacă o femeie își găsește bărbatul în brațele alteia, are dreptul legal să-și omoare partenerul, doar dacă o face cu propriile mâini."
    };

    static public int generateInt(int bound) {
        Random random = new Random();
        int random_nr =  random.nextInt(bound);
        return random_nr;
    }

    static public int generateColor() {
        int randomNumber = generateInt(colors.length);
        return colors[randomNumber];
    }

    static public String generateFact() {
        int randomNumber = generateInt(facts.length);
        return facts[randomNumber];
    }

}
