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
            "\n\n\nÎn Africa, părinţii sunt autoritari iar copiii trebuie să se supună întotdeauna. Până la vârsta de 25 de ani, aceştia nu ies din cuvântul părinţilor. În unele triburi africane, de exemplu, dacă un băiat vrea să devină independent şi să plece din casa părintească, trebuie să se lupte cu un leu. Numai aşa îşi obţine independenţa şi demonstrează că nu mai are nevoie de protecţia familiei. În familiile tradiţionale din Africa nu veţi întâlni un copil care să îi spună părintelui „nu vreau”. Dacă se împotriveşte, consecinţele vor fi greu de suportat.",
            "Regiunea cu cea mai scăzută criminalitate este Quebec, Canada. Rata criminalității în această zonă este similară cu cea înregistrată într-un parc Disney World, aproape 0.",
            "În Santa Fe, New Mexico, legea impune ca animalele de casă să poarte centură de siguranță în mașină.",
            "În anul 2004, un studiu arăta că una din șase fetițe intră în perioada de pubertate la vârsta de 8 ani. În urmă cu un secol, doar o fetiță din 100 atingea pubertatea la aceeași vârstă.",
            "În Bangladesh există o lege care permite autorităților să aresteze elevii cu vârste mai mari de 15 ani care copiază la examene.",
            "Doar o singură persoană din 2 miliarde va atinge vârsta de 116 ani.",
            "În absolut toate țările lumii, indiferent de cultură, religie sau zona geografică, soldații execută salutul numai cu mâna dreaptă.",
            "În Elveția este ilegal să trântești portiera oricărei mașini.",
            "În anul 1979, regimul politic din Irak a interzis filmele cu arte marțiale.",
            "În Danemarca legea permite deținuților să evadeze din închisori.",
            "În Myanmar este ilegal să accesezi Internetul. Oricine o face ajunge să stea ani buni după gratii.",
            "Pe timpul desfășurării Primului Război Mondial, bărbații care se dovedeau a fi homosexuali erau executați pe loc, fără niciun proces.",
            "În Singapore este contrar legilor țării să mesteci banala gumă de mestecat.",
            "Datorită faptului că celebrul personaj de desene animate Donald Duck nu purta pantaloni lungi, filmele de desene animate care-l aveau drept erou principal au fost interzise de lege în Finlanda.",
            "În anul 1935, guvernul României din acele timpuri a introdus o lege prin care personajul de desene animate, Mickey Mouse, a fost interzis pe motiv că era atât de urat desenat încât speria copiii mici.",
            "În urmă cu peste 2000 de ani, Cezar a interzis accesul carelor în Roma, pe motiv că încurcau și aglomerau circulația cetățenilor romani.",
            "În Marea Britanie, legea permite oricărei femei gravide să urineze oriunde dorește, inclusiv în cascheta unui polițist, fără să poată fi trasă la răspundere.",
            "În Anglia, oricine lipește greșit o marcă poștală care o reprezintă pe regină, poate fi acuzat de trădare de țară.",
            "În statul american Florida este interzis orice act sexual cu un porc spinos.",
            "În orașul Alexandria, din statul american Minneapolis, există o hotărâre legală care-i interzice oricărui bărbat căruia-i miroase gura a pește, să aibă vreun contact sexual cu o femeie.",
            "În statul Carolina de Nord este interzis de lege să înjuri în prezența morților.",
            "Legile statului Ohio pedepsesc cu închisoarea pe oricine încearcă să îmbete un pește.",
            "În statul Florida, dacă o femeie nemăritată sare cu parașuta în zilele de sâmbătă, aceasta ajunge invariabil la închisoare.",
            "În orașul Alexandria, din statul Minneapolis, dacă răsuflarea unui bărbat miroase a usturoi sau ceapa, acestuia-i este interzis de lege să aibă orice fel de contact sexual cu soția sa.",
            "În capitala statului El Salvador, orașul San Salvador, există o lege care condamnă la moarte prin împușcare, în fața unui pluton de execuție, orice șofer prins băut în interiorul capitalei. ",
            "În orașul englez York există încă în vigoare o lege datând din Evul Mediu, care-i permite oricărui cetățean al orașului să ucidă orice scoțian întâlnit în York. Evident, doar dacă scoțianul vizat poartă asupra sa un arc și o tolbă cu săgeți.",
            "În Anglia anului 1837, dacă un bărbat săruta o femeie fără voia ei, există o lege care-i permitea femeii sărutate forțat, să-l muște de nas cât se poate de tare pe bărbatul vinovat.",
            "În statul american Vermont, pentru orice femeie care vrea să poarte o proteză dentară, este nevoie de acordul scris și semnat al soțului acesteia.",
            "Dacă ajungi cumva în orașul Logan County, să nu săruți niciodată o femeie care doarme, indiferent daca îți este soție sau prietenă. Legile acestui oraș pedepsesc acest gest cu închisoarea.",
            "În Paraguay, duelul este permis de lege, atâta timp cât cei doi participanți la duel fac dovada că donează sânge spitalelor.",
            "Hipnoza este o practică interzisă în școlile publice din orașul american San Diego.",
            "În statul american Iowa, dacă un bărbat sărută o femeie mai mult de 5 minute neîntrerupte, fapta se consideră infracțiune, iar bărbatul pătimaș riscă închisoarea.",
            "Acum circa 300 de ani, orice cetățean japonez care încerca să părăsească Imperiul Soarelui Răsare era condamnat pe loc la decapitare pentru trădare de țară.",
            "În orașul Eureka, din statul american Nevada, legea interzice ca un bărbat cu mustață să sărute o femeie.",
            "În Bangladesh, chiulitul de la școală este interzis de lege. Orice elev prins în afara orelor de curs ajunge la închisoare.",
            "Orașul St. Louis din Missouri are în vigoare o lege conform căreia este interzis ca un bărbat să salveze o femeie aflată în pericol, dacă aceasta este îmbrăcată în pijamale.",
            "Pe teritoriul Franței este ilegal să dai numele de Napoleon unui porc.",
            "În orașul Baltimore, din Maryland, este ilegal să intri cu un leu într-o sală de cinema.",
            "Este contrar legii pentru orice cetățean britanic să moară în interiorul Palatului Parlamentului din Londra.",
            "Dacă ajungi în orașul Miami, din Florida, reține că este interzis de lege să imiți orice fel de sunete emise de animale.",
            "În Bahrein este interzis de lege ca un bărbat ginecolog să examineze direct organele genitale ale unei femei. Puținii bărbați medici ginecologi din această țară musulmană se folosesc în acest scop de o oglindă poziționată astfel încât să le ofere imaginile de care au nevoie atunci când stabilesc un diagnostic pe cale vizuală.",
            "În statul american Oklahoma, orice persoană care se strâmbă în mod voit la un câine, ajunge la închisoare sub învinuirea de agresiune asupra celui mai bun prieten al omului.",
            "În orașul italian Milano există o lege locală care-i obligă pe cetățeni să zâmbească tot timpul, cu excepția situațiilor când merg la spital sau la înmormântări.",
            "În statul american Washington, dacă un cetățean se laudă în public că are părinți bogați și influenți, persoana în cauză ajunge la închisoare.",
            "Există o lege în orașul Oxford, din statul Ohio, care interzice oricărei femei să se dezbrace în fața unei fotografii care reprezintă un bărbat.",
            "Dacă ajungeți cumva în statul american Kentucky, să nu transportați niciodată cornete de înghețată în propriile buzunare. Există o lege în vigoare conform căreia puteți ajunge la închisoare pentru această faptă.",
            "Dacă transportați o bombă nucleară în orașul Chico din California, sunteți pasibili de amendă pentru transport de material radioactiv pe teritoriul orașului.",
            "În Danemarca există o lege care-i obligă pe toți posesorii de automobile ca, înainte de a se urca la volan și a demara, să se uite sub propriile mașini în căutarea unor eventuali copii ascunși acolo.",
            "În New Jersey este ilegal să porți o vestă antiglonț în timp ce comiți o crimă.",
            "În Idaho, un bărbat ar comite o ilegalitate dacă i-ar oferi iubitei sale o cutie cu bomboane de peste 22,6 kilograme.",
            "Nu ai voie să fotografiezi un iepure în luna mai, conform legilor din Wyoming.",
            "Este ilegal să ai casa decorată în spiritul Crăciunului după data de 14 ianuarie, în Maine.",
            "În Connecticut este ilegal să traversezi o stradă 'mergând' în mâini.",
            "În Suedia este ilegal să tragi apa la toaletă după 10 seara, în casa unei persoane.",
            "În Vermont, femeile trebuie să obțină o permisiune scrisă de la soțul lor, dacă doresc să poarte o proteză dentară.",
            "În Carolina de Sud, trebuie să ai cel puțin 18 ani pentru a te putea juca legal Pinball.",
            "În Alabama, actul de a pune sare pe șinele de tren poate fi pedepsit cu moartea!",
            "Măgarii nu au voie să doarmă într-o cadă de baie, în Arizona.",
            "În California, un vehicul fără șofer nu are voie să se deplaseze cu o viteză mai mare de 96,5 kilometri la oră.",
            "Conform legii, este strict interzis să trezești un urs pentru a-i face o poză, în Alaska.",
            "În Connecticut, poți fi oprit de Poliție dacă circuli cu bicicleta cu o viteză de peste 104 km/oră.",
            "În închisorile de stat din Wisconsin este ilegală servirea substituților de unt.",
            "În Illinois este ilegal să pescuiești în timp ce ești așezat pe gâtul unei girafe.",
            "În Louisiana e împotriva legii să jefuiești o bancă și apoi să „împuști” funcționarul de la ghișeu cu un pistol cu apă.",
            "Este ilegal să îi împrumuți vecinului tău aspiratorul, dacă locuiești în Colorado.",
            "Un locuitor din Minnesota nu are voie să treacă granițele statului în timp ce are o rață pe cap.",
            "În Las Vegas, unui bărbat îi este interzis să cumpere, în același timp, băuturi pentru mai mult de trei persoane.",
            "În Nebraska nu poți vinde... găurile de la gogoși!",
            "În Pennsylvania este ilegal să dormi pe un frigider în aer liber.",
            "Este ilegal să fluieri sub apă în Vermont.",
            "În Anglia este interzis ca un taximetrist din Londra să transporte câini turbați sau cadavre.",
            "În Florida, femeile necăsătorite care se dau cu parașuta duminica pot fi trimise la închisoare.",
            "În Chester, galezilor le este interzis să intre în oraș înainte de răsărit sau să stea după ce apune soarele.",
            "În Providence, Rhode Island, este interzis ca deținătorii de magazine să vândă duminica aceluiași client și pastă de dinți și periuță de dinți.",
            "În Zion, Illinois, este ilegal să le dai animalelor domestice să fumeze. ",
            "În Maryland este ilegal ca stațiile radio să difuzeze melodia lui Randy Newman intitulată „Oameni scunzi”.",
            "În Oklahoma este ilegal să te strâmbi la câini și cel ce o face poate sfârși în închisoare. ",
            "\n\nÎn Hasting, Nebraska, legea spune că proprietarii de hoteluri trebuie să le asigure clienților săi tricouri albe din bumbac, cuplurile neavând voie să aibă relații intime dacă nu poartă aceste tricouri.",
            "În Burma, accesul la internet este total interzis. Oricine este găsit că are modem în casă riscă închisoarea. ",
            "Belgia este singura țară care nu a cenzurat filmele pentru adulți. ",
            "Filmele cu și despre karate au fost interzise în Irak în 1979.",
            "În South Bend, Indiana, o maimuță a fost găsită vinovată pentru fumat.",
            "În Bermuda, până în anul 1948, toate mașinile personale au fost interzise. ",
            "În Minessota este interzis să pui pe același uscător lenjerie de femei și de bărbați. ",
            "În Arizona este ilegal să vânezi cămile. ",
            "În Canada, 35% din muzica difuzată la radio trebuie să aparțină unui artist canadian. ",
            "Este interzis prin lege să hrănești porumbeii din Piața San Marco din Veneția. ",
            "În Spania este interzis să conduci încălțat cu papuci de plajă. ",
            "Pe plaja Venice, din California, este interzis să înjuri.",
            "Grecia a interzis accesul femeilor care poartă pantofi cu toc în zona Acropole sau a altor monumente istorice.",
            "În Scandinavia, șoferii trebuie să aibă farurile pornite pe tot parcursul zilei.",
            "În Singapore este interzis să mesteci gumă, dacă aceasta nu a fost eliberată cu o prescripție medicală. ",
            "\n\n Nu ai voie să calci pe bani în Thailanda. Pe moneda oficială a țării asiatice este înfățișat regele Thailandei, astfel că gestul este considerat act criminal. De asemenea, sunt interzise injuriile la adresa monarhului.",
            "Orice femeie aflată pe teritoriul orașului Tremorton, din statul Utah, va ajunge la închisoare dacă face dragoste cu un bărbat în interiorul unei ambulanțe.",
            "\n\nÎn Japonia nu ai voie să fii obez. Potrivit unei legi, bărbații de peste 40 de ani trebuie să aibă o talie de maxim 80 de centimetri.",
            "Dacă locuiești în Danemarca și te gândești să-i dai copilului tău un nume ieșit din comun, ar fi bine să consulți regulile oficiale. Dacă numele pe care-l dorești nu se află printre cele 7.000 de nume aprobate de autorități, ai nevoie de avizul special al guvernului danez.",
            "În Mexic, bicicliștii nu au voie să-și ridice picioarele de pe pedale deoarece există riscul de a pierde controlul bicicletei. Această lege a fost instituită în Mexic în 1892 pentru a-i proteja pe bicicliști.",
            "Dacă ești fan al nudismului, ai face bine să eviți drumețiile în Elveția. Mai precis, autoritățile din cantonul Appenzell au fost primele care au instituit o pedeapsă pentru cei care fac drumeții în „costumul lui Adam”. Totul s-a întâmplat în 2009, după ce un turist german a trecut în pielea goală pe lângă o familie care era la picnic în Alpi.",
            "Autoritățile din orașul Petrolia, din provincia canadiană Ontario, au adoptat un regulament care interzice zgomotul excesiv. Potrivit acestei legi este interzis să țipi, să fluieri sau să cânți în public, indiferent de oră sau circumstanțe.",
            "Când circuli pe autostrăzile din Germania nu trebuie să fii cu ochii doar la vitezometru, ci și la indicatorul de benzină. Dacă rămâi fără combustibil pe autostradă, riști să fii amendat.",
            "Autoritățile portugheze au interzis urinatul în apele oceanului. Desigur, aceasta este o lege de bun simț, însă nu știm cum îi pot descoperi autoritățile pe cei care o încalcă.",
            "În Australia, proprietarii de baruri trebuie să monitorizeze consumul de alcool al clienților. Cei care îi îmbată prea tare pe clienți riscă amenzi usturătoare.",
            "În 2001, guvernul de la Phnom Penh a interzis vânzarea și importul de puști cu apă. Măsura o fost luată de teamă că jucăriile vor provoca tensiuni sociale în timpul manifestărilor de Revelion ale khmerilor.",
            "Cei care trăiesc în orașul Quitman, din statul american Georgia, trebuie să-și supravegheze găinile constant. În micul oraș, proprietarilor de găini le este interzis să lase păsările să treacă strada.",
            "În Hong Kong, crima pasională este reglementată prin lege. Dacă o femeie își găsește bărbatul în brațele alteia, are dreptul legal să-și omoare partenerul, doar dacă o face cu propriile mâini.",

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
