package controladores;

import tree.BinaryTree;
import entidades.Node;

public class TreeManager {
		
	public BinaryTree generateBinaryTree(){
		String name = "Babah";
		BinaryTree BTree = new BinaryTree();
		BTree.addRoot(new Node(name + " era la maga m�s reconocida y m�s poderosa del reino. Y hac�a ya un tiempo, que los habitantes del valle del \n Agua Clara estaban siendo afectado por unas tormentas bestiales. Por eso, le hab�an encargado derrotar al gran rey de la Tormenta, \n y ah� estaba ella, decidida a acabar con �l. Nuestra protagonista " + name + " estaba en un acantilado, a lo lejos pod�a ver la tormenta. \n Entonces " + name + " decidi� atravesar las nubes hacia la tormenta.", 0, 1));
		
		BTree.addTo(1, new Node("1.Caminar",1 ,2));
		BTree.addTo(1, new Node("2.Pararse",1 ,3));
		
		BTree.addTo(2, new Node(name + " vi� que hab�a dos caminos hacia dos acantilados nuevos. Se dirigi� a la izquierda, hacia la tormenta.", 2, 4));
		BTree.addTo(2, new Node(name + " camin� hacia una neblina y se perdi� en ella durante mucho, mucho tiempo hasta que muri� por su avanzada edad.\n Nunca m�s se supo de ella y el Rey atormentado sigui� atormentado la preciosa ciudad de Aguas Claras.", 2, 5));
		BTree.addTo(3, new Node("Nuestra hero�na a�n sabiendo que tenia que ir hacia la tormenta decidi� pararse a tomar un cucurucho de helado \n en un apacible puesto de comerciantes de las nubes. Despu�s de ello decidi� retomar la aventura y andar hacia la tormenta.", 2, 6));
		BTree.addTo(3, new Node(name + " a�n sabiendo que tenia que ir hacia la tormetna decidi� quedarse quieta, pero la roca en la que se encontraba"
				+ " empez� a temblar y se desplom� la zona en la que se encontraba precipitandose al vacio, acto seguido fue aplastada por las rocas"
				+ " y muri�. Nunca m�s se supo de nuetra hero�na en Aguas Claras.", 2, 7));

		BTree.addTo(4, new Node("1.Izquierda (-5 Man�)", 3, 8));
		BTree.addTo(4, new Node("2.Derecha (-5 Man�)", 3, 9));
//		BTree.addTo(5, new Node("", 3, 10));
//		BTree.addTo(5, new Node("", 3, 11));
		BTree.addTo(6, new Node("1.Tormenta", 3, 12));
		BTree.addTo(6, new Node("2.Pararse", 3, 13));
//		BTree.addTo(7, new Node("", 3, 14));
//		BTree.addTo(7, new Node("", 3, 15));
		
		BTree.addTo(8, new Node("Nuestra hero�na decidida a llegar a la tormenta, alcanz� el acantilado. Desde ah�, divis� una estructura misteriosa"
				+ " a lo lejos. Sin embargo, decidi� seguir hacia la tormenta.", 4, 16));
		BTree.addTo(8, new Node("Nuestra hero�na decidida a llegar a la tormenta, corri� hacia ella, cayendo estrepitosamente, perdiendo la"
				+ " orientaci�n (-50 Vida).", 4, 17));
		BTree.addTo(9, new Node("A�n sabiendo que ten�a que dirigirse a la izquierda, decidi� tomar el camino de la derecha y acercarse a los goblins de"
				+ " las nubes que ten�an muy mala pinta.", 4, 18));
		BTree.addTo(9, new Node("A�n sabiendo que ten�a que dirigirse a la izquierda, decidi� tomar el camino de la derecha hacia un acantilado nuevo. Pero"
				+ " antes de llegar aparece un Coloso Llor�n. " + name +" decidi� enfrentarse a �l.", 4, 19)); 
//		BTree.addTo(10, new Node("", 4, 20));
//		BTree.addTo(10, new Node("", 4, 21));
//		BTree.addTo(11, new Node("", 4, 22));
//		BTree.addTo(11, new Node("", 4, 23));
		BTree.addTo(12, new Node(name + " retom� su marcha hac�a la Tormenta pero al llegar se encontr� que el Rey atormentado hab�a dejado de atormentar"
				+ " a los ciudadanos de Aguas Claras debido a que era un berrinche momentaneo un poco exagerado. As� concluye la aventura de "+ name +".", 4, 24));
		BTree.addTo(12, new Node("Cuando " + name + " estaba tomandose un respiro, un canibal hambriendo le golpe� la cabeza dejandola inconsciente y"
				+ " posteriormente se comi� las partes m�s jugosas de su cuerpo. (Esto no habr�a pasado si hubiese seguido la narrativa)", 4, 25)); 
		BTree.addTo(13, new Node(name + " volvi� a tomar un descanso y admirar las preciosas vistas desde el acantilado, sin adentrarse a�n en la"
				+ " espesura de las nubes, pero record� su misi�n y decidi� emprender la aventura sin m�s dilaci�n.", 4, 26));
		BTree.addTo(13, new Node(name + " record� que ten�a que volver a completar su misi�n y no pod�a perder m�s tiempo admirando las vistas."
				+ " Entonces nuestra protragonista prosigio con la historia narrativa dise�ada para ella y se dirigi� hacia la tormenta.", 4, 27));
//		BTree.addTo(14, new Node("", 4, 28));
//		BTree.addTo(14, new Node("", 4, 29));
//		BTree.addTo(15, new Node("", 4, 30));
//		BTree.addTo(15, new Node("", 4, 31));
		
		BTree.addTo(16, new Node("1.Tormenta", 5, 32));
		BTree.addTo(16, new Node("2.Estructura misteriosa", 5, 33));
		BTree.addTo(17, new Node("1.Volver", 5, 34));
		BTree.addTo(17, new Node("2.Seguir", 5, 35));
		BTree.addTo(18, new Node("1.Acercarse", 5, 36));
		BTree.addTo(18, new Node("2.Huir", 5, 37));
		BTree.addTo(19, new Node("1.Enfretarse", 5, 38));
		BTree.addTo(19, new Node("2.Huir", 5, 39));
//		BTree.addTo(20, new Node("", 5, 40));
//		BTree.addTo(20, new Node("", 5, 41));
//		BTree.addTo(21, new Node("", 5, 42));
//		BTree.addTo(21, new Node("", 5, 43));
//		BTree.addTo(22, new Node("", 5, 44));
//		BTree.addTo(22, new Node("", 5, 45));
//		BTree.addTo(23, new Node("", 5, 46));
//		BTree.addTo(23, new Node("", 5, 47));
//		BTree.addTo(24, new Node("", 5, 48));
//		BTree.addTo(24, new Node("", 5, 49));
//		BTree.addTo(25, new Node("", 5, 50));
//		BTree.addTo(25, new Node("", 5, 51));
		BTree.addTo(26, new Node("1.Moverse", 5, 52));
		BTree.addTo(26, new Node("2.Pararse", 5, 53));
		BTree.addTo(27, new Node("1.Tormenta", 5, 54));
		BTree.addTo(27, new Node("2.Pararse", 5, 55));
//		BTree.addTo(28, new Node("", 5, 56));
//		BTree.addTo(28, new Node("", 5, 57));
//		BTree.addTo(29, new Node("", 5, 58));
//		BTree.addTo(29, new Node("", 5, 59));
//		BTree.addTo(30, new Node("", 5, 60));
//		BTree.addTo(30, new Node("", 5, 61));
//		BTree.addTo(31, new Node("", 5, 62));
//		BTree.addTo(31, new Node("", 5, 63));
		
		BTree.addTo(32, new Node(name + " se encontr� con el gran Rey atormentado de la Tormenta Tormentosa y le atac� por detr�s.", 6, 64));
		BTree.addTo(32, new Node(name + " se perdi� en la neblina. A lo lejos vi� unos acantilados con un pueblo contruido encima y se dirigi�"
				+ " en busca de referencias.", 6, 65));
		BTree.addTo(33, new Node("Aunque se lo pens� un poco mejor, y decidi� ir hacia la estrucutura misteriosa, que result� ser un submarino de papel en"
				+ " ruinas. Entonces " + name + " entr�.", 6, 66));
		BTree.addTo(33, new Node("Mientras se dirig�a, hacia lo que result� ser un submarino de papel, pis� al �ltimo rat�n-nube, extinguiendo as� una"
				+ " de las razas m�s antig�as de Aguas Claras. Fue repudiada por todos. Se exili� viviendo como una p�ria el resto de su vida.", 6, 67)); //FIN
		BTree.addTo(34, new Node(name +" volvi� a Aguas Claras para comprar pociones de curaci�n para sanarse.", 6, 68));
		BTree.addTo(34, new Node(name +" al volver, se perdi� por uno de los muchos caminos. Muriendo herida, sin ninguna ayuda, entre las nubes.", 6, 69)); //FIN
		BTree.addTo(35, new Node("A�n herida, nuestra protagonista retom� su camino dejando un rastro de su propia sangre a su paso. Decidi� que lo mejor"
				+ " era acabar en el menor tiempo posible con esto.", 6, 70));
		BTree.addTo(35, new Node("A�n herida, nuestra protagonista retom� su camino dejando un rastro de su propia sangre a su paso. Esto alert� a unos"
				+ " monstruos nube que la siguieron hasta atacarla por detr�s y acabar con su vida.", 6, 71)); //FIN
		BTree.addTo(36, new Node(" 'Las apariencias enga�an' los Goblins de las Nubes resultaron ser amigablames y le dieron a " + name + " una poci�n"
				+ " sin pedir nada a cambio. Nuestra protagonista se la tom�.", 6, 72));
		BTree.addTo(36, new Node(name + " al acercarse, fue herida, por una flecha envenenada. Los Goblins de las Nubes la saltaron encima y la apalearon"
				+ " hasta su muerte.", 6, 73)); //FIN
		BTree.addTo(37, new Node("Al huir, los Goblins de las Nubes se amontonaron persiguiendo a la protagonista, haciendo que la nube que les soportaba"
				+ " se rompiese. La protagonista y los Goblins cayeron al vac�o.", 6, 74));//FIN
		BTree.addTo(37, new Node("Al huir, un cham�n Goblin le lanz� a " + name + " un hechizo que cre� una gemela malvada de nuestra protagonista, la cual"
				+ " lanz� sobre " + name + " un rayo de sombras. Acabando con la luz que habitaba en su coraz�n, perdi� su magia y cay� de las nubes.", 6, 75));//FIN
		BTree.addTo(38, new Node(name + "atac� al Coloso Llor�n con un rayo de luz desmot�ndolo en piezas que se esparcieron por el suelo. En el medio de los"
				+ " escombros encontr� el Coraz�n de Tormenta del Coloso Llor�n. Lo cogi� y se lo llev� al Rey atormentado de la Tormenta Tormentosa", 6, 76));
		BTree.addTo(38, new Node("Antes de que "+ name +" atacara, el Coloso Llor�n grit� '��Papi!!' entre llantos. Su padre, el Rey atormentado de la"
				+ " Tormenta Tormentosa lleg� para salvar a su hijo de " + name +". Le lanz� un rayo el�ctrico y nuestra protagonista muri�.", 6, 77)); //FIN
		BTree.addTo(39, new Node(name + " intent� huir sin �xito, el Coloso Llor�n la aplast� con su pu�o de roca nubosa. El Coloso fue feliz, hab�a disfrutado"
				+ " de su juguete.", 6, 78));//FIN
		BTree.addTo(39, new Node(name + " intent� huir pero el Coloso Llor�n le lanz� una lluvia torrencial que le di� de lleno. Al estar empapada, "  + name 
				+ " pesaba demasiado para su propia magia, y cay� al vac�o sin remedio.", 6, 79));//FIN
//		BTree.addTo(40, new Node("", 6, 80));
//		BTree.addTo(40, new Node("", 6, 81));
//		BTree.addTo(41, new Node("", 6, 82));
//		BTree.addTo(41, new Node("", 6, 83));
//		BTree.addTo(42, new Node("", 6, 84));
//		BTree.addTo(42, new Node("", 6, 85));
//		BTree.addTo(43, new Node("", 6, 86));
//		BTree.addTo(43, new Node("", 6, 87));
//		BTree.addTo(44, new Node("", 6, 88));
//		BTree.addTo(44, new Node("", 6, 89));
//		BTree.addTo(45, new Node("", 6, 90));
//		BTree.addTo(45, new Node("", 6, 91));
//		BTree.addTo(46, new Node("", 6, 92));
//		BTree.addTo(46, new Node("", 6, 93));
//		BTree.addTo(47, new Node("", 6, 94));
//		BTree.addTo(47, new Node("", 6, 95));
//		BTree.addTo(48, new Node("", 6, 96));
//		BTree.addTo(48, new Node("", 6, 97));
//		BTree.addTo(49, new Node("", 6, 98));
//		BTree.addTo(49, new Node("", 6, 99));
//		BTree.addTo(50, new Node("", 6, 100));
//		BTree.addTo(50, new Node("", 6, 101));
//		BTree.addTo(51, new Node("", 6, 102));
//		BTree.addTo(51, new Node("", 6, 103));
		BTree.addTo(52, new Node("Al quedarse mucho tiempo parada, se hizo de noche sabiendo que no podr�a avanzar durante la noche lanz� un rayo de luz"
				+ " a la lejan�a para ver su camino y sin quererlo le golpe� al Rey atormentado de la Tormenta Tormentosa derrotando as� al enemigo sin avanzar"
				+ " en la elaborada y refinada histor�a narrativa de nuestra protagonista. Fue recordada por su haza�a y su heroicidad y se brinda"
				+ " el d�a del vago de Aguas Claras en su nombre.", 6, 104));
		BTree.addTo(52, new Node("Al estar tanto tiempo quieta "+ name + " se le habian dormido las piernas y cuando intent� moverse, torpemente se le"
				+ " cruzar�n las piernas y cay� entre el acantilado y las nubes, precipitandose al vacio.", 6, 105));
		BTree.addTo(53, new Node("Contra todo pronostico " + name + " realmente le hab�an gustado las flores elaboradas por la imaginaci�n del jugador"
				+ " y decidi� pararse a contemplarlas un poco m�s, despu�s de inmediato y sin ninguna pausa m�s, decidi� que tenia que proseguir su"
				+ " aventura.", 6, 106));
		BTree.addTo(53, new Node(name + " no se di� cuenta de que el tiempo pasaba a su alrededor y Aguas Claras ya habia sufrido una inundaci�n, adem�s"
				+ " el Rey atormentado hab�a muerto antes de poder enfrentarse a ella. Nuestra protagonista ya no ten�a objetivo y decidi� exiliarse.", 6, 107));
		BTree.addTo(54, new Node("", 6, 108));
		BTree.addTo(54, new Node("", 6, 109));
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidi� sustuir a " + name + " por Boby."
				+ " Que mat� al Rey atormentado salvando Aguas Claras y convirtiendose en un heroe reconocido por todos. Deber�as tomar nota de ello para"
				+ " la pr�xima.", 6, 110));
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidi� sustuir a " + name + " por Boby."
				+ " Que muri� nada m�s enfrentarse al Rey atormentado pero al menos se movi�. Deber�as tomar nota de ello para la pr�xima.", 6, 111));
//		BTree.addTo(56, new Node("", 6, 112));
//		BTree.addTo(56, new Node("", 6, 113));
//		BTree.addTo(57, new Node("", 6, 114));
//		BTree.addTo(57, new Node("", 6, 115));
//		BTree.addTo(58, new Node("", 6, 116));
//		BTree.addTo(58, new Node("", 6, 117));
//		BTree.addTo(59, new Node("", 6, 118));
//		BTree.addTo(59, new Node("", 6, 119));
//		BTree.addTo(60, new Node("", 6, 120));
//		BTree.addTo(60, new Node("", 6, 121));
//		BTree.addTo(61, new Node("", 6, 122));
//		BTree.addTo(61, new Node("", 6, 123));
//		BTree.addTo(62, new Node("", 6, 124));
//		BTree.addTo(62, new Node("", 6, 125));
//		BTree.addTo(63, new Node("", 6, 126));
//		BTree.addTo(63, new Node("", 6, 127));
		
		BTree.addTo(64, new Node("1.Atacar", 7, 128));
		BTree.addTo(64, new Node("2.Gritar", 7, 129));
		BTree.addTo(65, new Node("1.Pueblo", 7, 130));
		BTree.addTo(65, new Node("2.Niebla", 7, 131));
		BTree.addTo(66, new Node("1.Entrar", 7, 132));
		BTree.addTo(66, new Node("2.Inspeccionar", 7, 133));
//		BTree.addTo(67, new Node("", 7, 134));
//		BTree.addTo(67, new Node("", 7, 135));
		BTree.addTo(68, new Node("1.Comprar", 7, 136));
		BTree.addTo(68, new Node("2.Descansar", 7, 137));
//		BTree.addTo(69, new Node("", 7, 138));
//		BTree.addTo(69, new Node("", 7, 139));
		BTree.addTo(70, new Node("1.Ir a la tormenta", 7, 140));
		BTree.addTo(70, new Node("2.Descansar", 7, 141));
//		BTree.addTo(71, new Node("", 7, 142));
//		BTree.addTo(71, new Node("", 7, 143));
		BTree.addTo(72, new Node("1.Tomar", 7, 144));
		BTree.addTo(72, new Node("2.Rechazar", 7, 145));
//		BTree.addTo(73, new Node("", 7, 146));
//		BTree.addTo(73, new Node("", 7, 147));
//		BTree.addTo(74, new Node("", 7, 148));
//		BTree.addTo(74, new Node("", 7, 149));
//		BTree.addTo(75, new Node("", 7, 150));
//		BTree.addTo(75, new Node("", 7, 151));
		BTree.addTo(76, new Node("1.Mostrar el coraz�n", 7, 152));
		BTree.addTo(76, new Node("2.Romper el coraz�n", 7, 153));
//		BTree.addTo(77, new Node("", 7, 154));
//		BTree.addTo(77, new Node("", 7, 155));
//		BTree.addTo(78, new Node("", 7, 156));
//		BTree.addTo(78, new Node("", 7, 157));
//		BTree.addTo(79, new Node("", 7, 158));
//		BTree.addTo(79, new Node("", 7, 159));
//		BTree.addTo(80, new Node("", 7, 160));
//		BTree.addTo(80, new Node("", 7, 161));
//		BTree.addTo(81, new Node("", 7, 162));
//		BTree.addTo(81, new Node("", 7, 163));
//		BTree.addTo(82, new Node("", 7, 164));
//		BTree.addTo(82, new Node("", 7, 165));
//		BTree.addTo(83, new Node("", 7, 166));
//		BTree.addTo(83, new Node("", 7, 167));
//		BTree.addTo(84, new Node("", 7, 168));
//		BTree.addTo(84, new Node("", 7, 169));
//		BTree.addTo(85, new Node("", 7, 170));
//		BTree.addTo(85, new Node("", 7, 171));
//		BTree.addTo(86, new Node("", 7, 172));
//		BTree.addTo(86, new Node("", 7, 173));
//		BTree.addTo(87, new Node("", 7, 174));
//		BTree.addTo(87, new Node("", 7, 175));
//		BTree.addTo(88, new Node("", 7, 176));
//		BTree.addTo(88, new Node("", 7, 177));
//		BTree.addTo(89, new Node("", 7, 178));
//		BTree.addTo(89, new Node("", 7, 179));
//		BTree.addTo(90, new Node("", 7, 180));
//		BTree.addTo(90, new Node("", 7, 181));
//		BTree.addTo(91, new Node("", 7, 182));
//		BTree.addTo(91, new Node("", 7, 183));
//		BTree.addTo(92, new Node("", 7, 184));
//		BTree.addTo(92, new Node("", 7, 185));
//		BTree.addTo(93, new Node("", 7, 186));
//		BTree.addTo(93, new Node("", 7, 187));
//		BTree.addTo(94, new Node("", 7, 188));
//		BTree.addTo(94, new Node("", 7, 189));
//		BTree.addTo(95, new Node("", 7, 190));
//		BTree.addTo(95, new Node("", 7, 191));
//		BTree.addTo(96, new Node("", 7, 192));
//		BTree.addTo(96, new Node("", 7, 193));
//		BTree.addTo(97, new Node("", 7, 194));
//		BTree.addTo(97, new Node("", 7, 195));
//		BTree.addTo(98, new Node("", 7, 196));
//		BTree.addTo(98, new Node("", 7, 197));
//		BTree.addTo(99, new Node("", 7, 198));
//		BTree.addTo(99, new Node("", 7, 199));
//		BTree.addTo(100, new Node("", 7, 200));
//		BTree.addTo(100, new Node("", 7, 201));
//		BTree.addTo(101, new Node("", 7, 202));
//		BTree.addTo(101, new Node("", 7, 203));
//		BTree.addTo(102, new Node("", 7, 204));
//		BTree.addTo(102, new Node("", 7, 205));
//		BTree.addTo(103, new Node("", 7, 206));
//		BTree.addTo(103, new Node("", 7, 207));
//		BTree.addTo(104, new Node("", 7, 208));
//		BTree.addTo(104, new Node("", 7, 209));
//		BTree.addTo(105, new Node("", 7, 210));
//		BTree.addTo(105, new Node("", 7, 211));
		BTree.addTo(106, new Node("1.Proseguir", 7, 212));
		BTree.addTo(106, new Node("2.Pararse", 7, 213));
//		BTree.addTo(107, new Node("", 7, 214));
//		BTree.addTo(107, new Node("", 7, 215));
//		BTree.addTo(108, new Node("", 7, 216));
//		BTree.addTo(108, new Node("", 7, 217));
//		BTree.addTo(109, new Node("", 7, 218));
//		BTree.addTo(109, new Node("", 7, 219));
//		BTree.addTo(110, new Node("", 7, 220));
//		BTree.addTo(110, new Node("", 7, 221));
//		BTree.addTo(111, new Node("", 7, 222));
//		BTree.addTo(111, new Node("", 7, 223));
//		BTree.addTo(112, new Node("", 7, 224));
//		BTree.addTo(112, new Node("", 7, 225));
//		BTree.addTo(113, new Node("", 7, 226));
//		BTree.addTo(113, new Node("", 7, 227));
//		BTree.addTo(114, new Node("", 7, 228));
//		BTree.addTo(114, new Node("", 7, 229));
//		BTree.addTo(115, new Node("", 7, 230));
//		BTree.addTo(115, new Node("", 7, 231));
//		BTree.addTo(116, new Node("", 7, 232));
//		BTree.addTo(116, new Node("", 7, 233));
//		BTree.addTo(117, new Node("", 7, 234));
//		BTree.addTo(117, new Node("", 7, 235));
//		BTree.addTo(118, new Node("", 7, 236));
//		BTree.addTo(118, new Node("", 7, 237));
//		BTree.addTo(119, new Node("", 7, 238));
//		BTree.addTo(119, new Node("", 7, 239));
//		BTree.addTo(120, new Node("", 7, 240));
//		BTree.addTo(120, new Node("", 7, 241));
//		BTree.addTo(121, new Node("", 7, 242));
//		BTree.addTo(121, new Node("", 7, 243));
//		BTree.addTo(122, new Node("", 7, 244));
//		BTree.addTo(122, new Node("", 7, 245));
//		BTree.addTo(123, new Node("", 7, 246));
//		BTree.addTo(123, new Node("", 7, 247));
//		BTree.addTo(124, new Node("", 7, 248));
//		BTree.addTo(124, new Node("", 7, 249));
//		BTree.addTo(125, new Node("", 7, 250));
//		BTree.addTo(125, new Node("", 7, 251));
//		BTree.addTo(126, new Node("", 7, 252));
//		BTree.addTo(126, new Node("", 7, 253));
//		BTree.addTo(127, new Node("", 7, 254));
//		BTree.addTo(127, new Node("", 7, 255));
		
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Y al fin se despej� el cielo de Aguas Claras."
				+ " Y se celebr� una fiesta en su honor, " + name + " fue la hero�na m�s recordada de la historia de Aguas Claras", 8, 256));
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Pero, al despejarse el cielo de Aguas Claras,"
				+ " nuestra hero�na cay� debido a que en la nube en la que se encontraba se evapor� junto al rey ca�do. Nunca m�s se supo de " + name + " en"
				+ " Aguas Claras. Aunque ser� recordada como la hero�na que despej� los cielos.", 8, 257));
		BTree.addTo(129, new Node(name + " alarm� al Rey atormentado de la Tormenta Tormentosa y este le lanz� un rayo que ella consigui� esquivar, cayendo"
				+ " fuera de la nube, en Aguas Claras. Quedando completamente incosciente. El rey, ya no tuvo ning�n adversario que pudiera hacerle frente"
				+ " por lo que sigui� atormentando Aguas Claras por mucho tiempo.", 8, 258));
		BTree.addTo(129, new Node(name + " alarm� al Rey atormentado de la Tormenta Tormentosa y este le lanz� un rayo que la alcanz� desintegrandola en el"
				+ " acto.", 8, 259));
		BTree.addTo(130, new Node(name + " lleg� al pueblo, y nada m�s llegar se dio cuenta de que esa gente eran can�bales. Lanz� todo su poder, cre� una"
				+ " nova de luz acabando con todo ser vivo en el pueblo. Y se desmay� de tanto poder liberado. Aguas Claras nunca volvi� a tener noticias"
				+ " sobre ella.", 8, 260));
		BTree.addTo(130, new Node(name + " lleg� al pueblo, y nada m�s llegar se dio cuenta de que esa gente eran can�bales. Para su sorpresa, dos hombres"
				+ " se acercaron por su espalda apres�ndola. Esa noche hubo un gran banquete con nuestra querida " + name + ".", 8, 261));
		BTree.addTo(131, new Node("Pero antes, decidi� dar una vuelta m�s por la niebla, donde acab� perdi�ndose para siempre. Aguas Claras nunca volvi�"
				+ " a saber de ella.", 8, 262));
		BTree.addTo(131, new Node("Pero antes, decidi� dar una vuelta m�s por la niebla, para su desgracia el rey la hab�a visto y le lanz� un rayo que la"
				+ " desintegr� en el acto. Aguas Claras nunca volvi� a saber de ella.", 8, 263));
		BTree.addTo(132, new Node("Encontr� la corona del Rey atormentado de la Tormenta Tormentosa y se la devolvi� a su leg�timo due�o, acabando con el"
				+ " problema. Aguas Claras recuper� sus cielos despejados gracias a nuestra querida " + name + ".", 8, 264));
		BTree.addTo(132, new Node("Encontr� la corona del Rey atormentado de la Tormenta Tormentosa, entonces se la qued� y a partir de ese momento"
				+ " se la conoci� como la Reina de la Tormenta tormentosa, controlando con ella los cielos pero el poder la ceg� y olvid� su verdadero objetivo,"
				+ " dejando a Aguas Claras a merced del Rey sin corona de la tormenta tormentosa.", 8, 265));
		BTree.addTo(133, new Node("Nuestra protagonista, se da cuenta de que es un submarino de papel. No existen submarinos de papel en la vida real."
				+ " " +name+ " se depierta. Todo fue un sue�o.", 8, 266));
		BTree.addTo(133, new Node(name + " se acerco al submarino pero el miedo a su interior la paraliz� causandola una fobia que la mantuvo mucho tiempo"
				+ " alejada de los cielos. As� el Rey de la tormenta tormentosa sigui� atormentando a Aguas Claras por mucho tiempo.", 8, 267));
//		BTree.addTo(134, new Node("", 8, 268));
//		BTree.addTo(134, new Node("", 8, 269));
//		BTree.addTo(135, new Node("", 8, 270));
//		BTree.addTo(135, new Node("", 8, 271));
		BTree.addTo(136, new Node(name + " cuando alcanz� a ver Aguas Claras ya no existia nadie all�, un gran rayo cay� sobre la poblaci�n dejando"
				+ " la ciudad en cenizas. Ya quedaba nadie a quien salvar. Nuestra protagonista se sinti� derrotada.", 8, 272));
		BTree.addTo(136, new Node(name + " lleg� a Aguas Claras y pidi� una poci�n de vida al comerciante, este le estaf� debido a que sabia quien era"
				+ " y solo le interesaba su negocio, nuestra protagonista no pudo retomar su viaje por problemas econ�micos.", 8, 273));
		BTree.addTo(137, new Node("Nuestra protagonista, descanso esa noche en Aguas Claras, al despertar el cielo estaba despejado y habia una fiesta en"
				+ " nombre de otro Heroe, que consigui� derrotar al Rey atormentado de la Tormenta Tormentosa, aqu� acabar�n las haza�as de "+ name, 8, 274));
		BTree.addTo(137, new Node("Nuestra protagonista, no pudo recuperarse de las heridas a pesar de la ayuda de los curanderos de Aguas Claras y acab�"
				+ " muriendo d�as despu�s de llegar. Nadie pudo hacer frente al Rey atormentado de la Tormenta Tormentosa.", 8, 275));
//		BTree.addTo(138, new Node("", 8, 276));
//		BTree.addTo(138, new Node("", 8, 277));
//		BTree.addTo(139, new Node("", 8, 278));
//		BTree.addTo(139, new Node("", 8, 279));
		BTree.addTo(140, new Node(name + "lleg� a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio. �l le lanz� el rayo el�ctrico y ella su"
				+ " ataque de luz. Los dos alcanzaron su blanco mortalmente.", 8, 280));
		BTree.addTo(140, new Node(name + "lleg� a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio y le lanz� un rayo, que " + name + " no"
				+ " pudo esquivar muriendo en el acto.", 8, 281));
		BTree.addTo(141, new Node(name + " descans� en medio de las nubes. Mientras dorm�a otro h�roe se adelant� y acab� con la vida del Rey atormentado"
				+ " de la Tormenta Tormentosa liberando la ciudad de su cruel tiran�a.", 8, 282));
		BTree.addTo(141, new Node(name + " descans� en medio de las nubes. Mientras dorm�a un rat�n-nube se acerc� hambriento y se avalanz� sobre su yugular"
				+ " acabando con su vida entre terribles sufrimientos.", 8, 283));
//		BTree.addTo(142, new Node("", 8, 284));
//		BTree.addTo(142, new Node("", 8, 285));
//		BTree.addTo(143, new Node("", 8, 286));
//		BTree.addTo(143, new Node("", 8, 287));
		BTree.addTo(144, new Node(name + " se bebi� la poci�n y result� ser una p�cima alucin�gena que le hizo olvidar su objetivo. Qued�ndose con los"
				+ " Goblins de las Nubes toda su vida.", 8, 288));
		BTree.addTo(144, new Node(name + " se bebi� la poci�n y result� ser una p�cima de veneno. En realidad, los Goblins de las Nubes eran malos y hab�an"
				+ " enga�ado a " + name + ".", 8, 289));
		BTree.addTo(145, new Node(name + " rechaz� la poci�n cortesmente y al darse la vuelta los Goblins de las Nubes, saltaron sobre ella para encadenarla."
				+ "Preferi� la muerte a ser esclava. Pero nadie pudo complacer su deseo.", 8, 290));
		BTree.addTo(145, new Node(name + " rechaz� la poci�n cortesmente. Los Goblins se sintienro muy ofendidos y al darse la vuelta ella, la molieron a palos. Nunca"
				+ " m�s se supo de ella en Aguas Claras.", 8, 291));
//		BTree.addTo(146, new Node("", 8, 292));
//		BTree.addTo(146, new Node("", 8, 293));
//		BTree.addTo(147, new Node("", 8, 294));
//		BTree.addTo(147, new Node("", 8, 295));
//		BTree.addTo(148, new Node("", 8, 296));
//		BTree.addTo(148, new Node("", 8, 297));
//		BTree.addTo(149, new Node("", 8, 298));
//		BTree.addTo(149, new Node("", 8, 299));
//		BTree.addTo(150, new Node("", 8, 300));
//		BTree.addTo(150, new Node("", 8, 301));
//		BTree.addTo(151, new Node("", 8, 302));
//		BTree.addTo(151, new Node("", 8, 303));
		BTree.addTo(152, new Node(name + " una vez le muestra el coraz�n al Rey atormentado de la Tormenta tormentosa, est� horririzado de ver que han matado a"
				+ " su �nico hijo no tiene fuerzas para seguir viviendo, entonces se precipita lanzadose de la nube en la que se encontraba hacia el vacio."
				+ " Nuestra protagonista fue y sigue siendo recordada como una heroina durante muchos a�os, salvando Aguas Claras del terrible Rey atormentado.", 8, 304));
		BTree.addTo(152, new Node(name + " una vez le muestra el coraz�n al Rey atormentado de la Tormenta tormentosa, est� con odio le lanza el m�s grande"
				+ " y poderoso rayo que pod�a lanzar, destruyendo a nuestra protagonista y a todo lo que se encontraba a su paso, incluido Aguas Claras."
				+ " El rey atormentado habia hecho desaparecer esa peque�a ciudad de un solo golpe.", 8, 305));
		BTree.addTo(153, new Node(name + " delante del Rey atormentado de la Tormenta tormentosa, rompi� el coraz�n de su hijo postumo haciendo mella en el"
				+ " coraz�n del rey, provocandole un pavor irracional el cual, el rey no pudo soportar y huyo del lugar.", 8, 306));
		BTree.addTo(153, new Node("Nuestra protagonista delante del Rey atormentado de la Tormenta tormentosa, rompi� el coraz�n de su hijo postumo lo que enoj� al rey"
				+ " tanto que est� le lanz� un rayo de odio infinito que desintegro a "+ name + ".", 8, 307));
//		BTree.addTo(154, new Node("", 8, 308));
//		BTree.addTo(154, new Node("", 8, 309));
//		BTree.addTo(155, new Node("", 8, 310));
//		BTree.addTo(155, new Node("", 8, 311));
//		BTree.addTo(156, new Node("", 8, 312));
//		BTree.addTo(156, new Node("", 8, 313));
//		BTree.addTo(157, new Node("", 8, 314));
//		BTree.addTo(157, new Node("", 8, 315));
//		BTree.addTo(158, new Node("", 8, 316));
//		BTree.addTo(158, new Node("", 8, 317));
//		BTree.addTo(159, new Node("", 8, 318));
//		BTree.addTo(159, new Node("", 8, 319));
//		BTree.addTo(160, new Node("", 8, 320));
//		BTree.addTo(160, new Node("", 8, 321));
//		BTree.addTo(161, new Node("", 8, 322));
//		BTree.addTo(161, new Node("", 8, 323));
//		BTree.addTo(162, new Node("", 8, 324));
//		BTree.addTo(162, new Node("", 8, 325));
//		BTree.addTo(163, new Node("", 8, 326));
//		BTree.addTo(163, new Node("", 8, 327));
//		BTree.addTo(164, new Node("", 8, 328));
//		BTree.addTo(164, new Node("", 8, 329));
//		BTree.addTo(165, new Node("", 8, 330));
//		BTree.addTo(165, new Node("", 8, 331));
//		BTree.addTo(166, new Node("", 8, 332));
//		BTree.addTo(166, new Node("", 8, 333));
//		BTree.addTo(167, new Node("", 8, 334));
//		BTree.addTo(167, new Node("", 8, 335));
//		BTree.addTo(168, new Node("", 8, 336));
//		BTree.addTo(168, new Node("", 8, 337));
//		BTree.addTo(169, new Node("", 8, 338));
//		BTree.addTo(169, new Node("", 8, 339));
//		BTree.addTo(170, new Node("", 8, 340));
//		BTree.addTo(170, new Node("", 8, 341));
//		BTree.addTo(171, new Node("", 8, 342));
//		BTree.addTo(171, new Node("", 8, 343));
//		BTree.addTo(172, new Node("", 8, 344));
//		BTree.addTo(172, new Node("", 8, 345));
//		BTree.addTo(173, new Node("", 8, 346));
//		BTree.addTo(173, new Node("", 8, 347));
//		BTree.addTo(174, new Node("", 8, 348));
//		BTree.addTo(174, new Node("", 8, 349));
//		BTree.addTo(175, new Node("", 8, 350));
//		BTree.addTo(175, new Node("", 8, 351));
//		BTree.addTo(176, new Node("", 8, 352));
//		BTree.addTo(176, new Node("", 8, 353));
//		BTree.addTo(177, new Node("", 8, 354));
//		BTree.addTo(177, new Node("", 8, 355));
//		BTree.addTo(178, new Node("", 8, 356));
//		BTree.addTo(178, new Node("", 8, 357));
//		BTree.addTo(179, new Node("", 8, 358));
//		BTree.addTo(179, new Node("", 8, 359));
//		BTree.addTo(180, new Node("", 8, 360));
//		BTree.addTo(180, new Node("", 8, 361));
//		BTree.addTo(181, new Node("", 8, 362));
//		BTree.addTo(181, new Node("", 8, 363));
//		BTree.addTo(182, new Node("", 8, 364));
//		BTree.addTo(182, new Node("", 8, 365));
//		BTree.addTo(183, new Node("", 8, 366));
//		BTree.addTo(183, new Node("", 8, 367));
//		BTree.addTo(184, new Node("", 8, 368));
//		BTree.addTo(184, new Node("", 8, 369));
//		BTree.addTo(185, new Node("", 8, 370));
//		BTree.addTo(185, new Node("", 8, 371));
//		BTree.addTo(186, new Node("", 8, 372));
//		BTree.addTo(186, new Node("", 8, 373));
//		BTree.addTo(187, new Node("", 8, 374));
//		BTree.addTo(187, new Node("", 8, 375));
//		BTree.addTo(188, new Node("", 8, 376));
//		BTree.addTo(188, new Node("", 8, 377));
//		BTree.addTo(189, new Node("", 8, 378));
//		BTree.addTo(189, new Node("", 8, 379));
//		BTree.addTo(190, new Node("", 8, 380));
//		BTree.addTo(190, new Node("", 8, 381));
//		BTree.addTo(191, new Node("", 8, 382));
//		BTree.addTo(191, new Node("", 8, 383));
//		BTree.addTo(192, new Node("", 8, 384));
//		BTree.addTo(192, new Node("", 8, 385));
//		BTree.addTo(193, new Node("", 8, 386));
//		BTree.addTo(193, new Node("", 8, 387));
//		BTree.addTo(194, new Node("", 8, 388));
//		BTree.addTo(194, new Node("", 8, 389));
//		BTree.addTo(195, new Node("", 8, 390));
//		BTree.addTo(195, new Node("", 8, 391));
//		BTree.addTo(196, new Node("", 8, 392));
//		BTree.addTo(196, new Node("", 8, 393));
//		BTree.addTo(197, new Node("", 8, 394));
//		BTree.addTo(197, new Node("", 8, 395));
//		BTree.addTo(198, new Node("", 8, 396));
//		BTree.addTo(198, new Node("", 8, 397));
//		BTree.addTo(199, new Node("", 8, 398));
//		BTree.addTo(199, new Node("", 8, 399));
//		BTree.addTo(200, new Node("", 8, 400));
//		BTree.addTo(200, new Node("", 8, 401));
//		BTree.addTo(201, new Node("", 8, 402));
//		BTree.addTo(201, new Node("", 8, 403));
//		BTree.addTo(202, new Node("", 8, 404));
//		BTree.addTo(202, new Node("", 8, 405));
//		BTree.addTo(203, new Node("", 8, 406));
//		BTree.addTo(203, new Node("", 8, 407));
//		BTree.addTo(204, new Node("", 8, 408));
//		BTree.addTo(204, new Node("", 8, 409));
//		BTree.addTo(205, new Node("", 8, 410));
//		BTree.addTo(205, new Node("", 8, 411));
//		BTree.addTo(206, new Node("", 8, 412));
//		BTree.addTo(206, new Node("", 8, 413));
//		BTree.addTo(207, new Node("", 8, 414));
//		BTree.addTo(207, new Node("", 8, 415));
//		BTree.addTo(208, new Node("", 8, 416));
//		BTree.addTo(208, new Node("", 8, 417));
//		BTree.addTo(209, new Node("", 8, 418));
//		BTree.addTo(209, new Node("", 8, 419));
//		BTree.addTo(210, new Node("", 8, 420));
//		BTree.addTo(210, new Node("", 8, 421));
//		BTree.addTo(211, new Node("", 8, 422));
//		BTree.addTo(211, new Node("", 8, 423));
//		BTree.addTo(212, new Node("", 8, 424));
//		BTree.addTo(212, new Node("", 8, 425));
		BTree.addTo(213, new Node(name + " era realmente vaga, y sin darse cuenta, al volver a pararse y contemplar todo su alrededor, empezar�n"
				+ " a desaparecer los monstruos, posteriormente la tormenta y lo �ltimo el suelo a su alrededor dejandola unicamente a ella"
				+ " como el �nico elemento de la trama narrativa. Entonces nunca m�s pud� moverse de ese lugar.", 8, 426));
		BTree.addTo(213, new Node("ERROR: �NO TE DAS CUENTA QUE EL JUEGO NECESITA AVANZAR?, �POR QU� HACES ESTO?, NO TIENES SENSIBILIDAD NINGUNA"
				+ " SE ACABO NO, JUEGUES M�S. --Cerrando aplicaci�n...--", 8, 427));
//		BTree.addTo(214, new Node("", 8, 428));
//		BTree.addTo(214, new Node("", 8, 429));
//		BTree.addTo(215, new Node("", 8, 430));
//		BTree.addTo(215, new Node("", 8, 431));
//		BTree.addTo(216, new Node("", 8, 432));
//		BTree.addTo(216, new Node("", 8, 433));
//		BTree.addTo(217, new Node("", 8, 434));
//		BTree.addTo(217, new Node("", 8, 435));
//		BTree.addTo(218, new Node("", 8, 436));
//		BTree.addTo(218, new Node("", 8, 437));
//		BTree.addTo(219, new Node("", 8, 438));
//		BTree.addTo(219, new Node("", 8, 439));
//		BTree.addTo(220, new Node("", 8, 440));
//		BTree.addTo(220, new Node("", 8, 441));
//		BTree.addTo(221, new Node("", 8, 442));
//		BTree.addTo(221, new Node("", 8, 443));
//		BTree.addTo(222, new Node("", 8, 444));
//		BTree.addTo(222, new Node("", 8, 445));
//		BTree.addTo(223, new Node("", 8, 446));
//		BTree.addTo(223, new Node("", 8, 447));
//		BTree.addTo(224, new Node("", 8, 448));
//		BTree.addTo(224, new Node("", 8, 449));
//		BTree.addTo(225, new Node("", 8, 450));
//		BTree.addTo(225, new Node("", 8, 451));
//		BTree.addTo(226, new Node("", 8, 452));
//		BTree.addTo(226, new Node("", 8, 453));
//		BTree.addTo(227, new Node("", 8, 454));
//		BTree.addTo(227, new Node("", 8, 455));
//		BTree.addTo(228, new Node("", 8, 456));
//		BTree.addTo(228, new Node("", 8, 457));
//		BTree.addTo(229, new Node("", 8, 458));
//		BTree.addTo(229, new Node("", 8, 459));
//		BTree.addTo(230, new Node("", 8, 460));
//		BTree.addTo(230, new Node("", 8, 461));
//		BTree.addTo(231, new Node("", 8, 462));
//		BTree.addTo(231, new Node("", 8, 463));
//		BTree.addTo(232, new Node("", 8, 464));
//		BTree.addTo(232, new Node("", 8, 465));
//		BTree.addTo(233, new Node("", 8, 466));
//		BTree.addTo(233, new Node("", 8, 467));
//		BTree.addTo(234, new Node("", 8, 468));
//		BTree.addTo(234, new Node("", 8, 469));
//		BTree.addTo(235, new Node("", 8, 470));
//		BTree.addTo(235, new Node("", 8, 471));
//		BTree.addTo(236, new Node("", 8, 472));
//		BTree.addTo(236, new Node("", 8, 473));
//		BTree.addTo(237, new Node("", 8, 474));
//		BTree.addTo(237, new Node("", 8, 475));
//		BTree.addTo(238, new Node("", 8, 476));
//		BTree.addTo(238, new Node("", 8, 477));
//		BTree.addTo(239, new Node("", 8, 478));
//		BTree.addTo(239, new Node("", 8, 479));
//		BTree.addTo(240, new Node("", 8, 480));
//		BTree.addTo(240, new Node("", 8, 481));
//		BTree.addTo(241, new Node("", 8, 482));
//		BTree.addTo(241, new Node("", 8, 483));
//		BTree.addTo(242, new Node("", 8, 484));
//		BTree.addTo(242, new Node("", 8, 485));
//		BTree.addTo(243, new Node("", 8, 486));
//		BTree.addTo(243, new Node("", 8, 487));
//		BTree.addTo(244, new Node("", 8, 488));
//		BTree.addTo(244, new Node("", 8, 489));
//		BTree.addTo(245, new Node("", 8, 490));
//		BTree.addTo(245, new Node("", 8, 491));
//		BTree.addTo(246, new Node("", 8, 492));
//		BTree.addTo(246, new Node("", 8, 493));
//		BTree.addTo(247, new Node("", 8, 494));
//		BTree.addTo(247, new Node("", 8, 495));
//		BTree.addTo(248, new Node("", 8, 496));
//		BTree.addTo(248, new Node("", 8, 497));
//		BTree.addTo(249, new Node("", 8, 498));
//		BTree.addTo(249, new Node("", 8, 499));
//		BTree.addTo(250, new Node("", 8, 500));
//		BTree.addTo(250, new Node("", 8, 501));
//		BTree.addTo(251, new Node("", 8, 502));
//		BTree.addTo(251, new Node("", 8, 503));
//		BTree.addTo(252, new Node("", 8, 504));
//		BTree.addTo(252, new Node("", 8, 505));
//		BTree.addTo(253, new Node("", 8, 506));
//		BTree.addTo(253, new Node("", 8, 507));
//		BTree.addTo(254, new Node("", 8, 508));
//		BTree.addTo(254, new Node("", 8, 509));
//		BTree.addTo(255, new Node("", 8, 510));
//		BTree.addTo(255, new Node("", 8, 511));

		
		return BTree;
	}
//	public BinaryTree generateBinaryTreeTest(){
//		String name = "Babah";
//		BinaryTree BTree = new BinaryTree();
//		BTree.addRoot(new Node(name + " era la maga m�s reconocida y m�s poderosa del reino. Y hac�a ya un tiempo, que los habitantes del valle del \n Agua Clara estaban siendo afectado por unas tormentas bestiales. Por eso, le hab�an encargado derrotar al gran rey de la Tormenta, \n y ah� estaba ella, decidida a acabar con �l. Nuestra protagonista " + name + " estaba en un acantilado, a lo lejos pod�a ver la tormenta. \n Entonces " + name + " decidi� atravesar las nubes hacia la tormenta.", 0, 1));
//		
//		Node root2 = BTree.add(BTree.getRoot(), new Node("1.Caminar",1 ,2));
//		Node root3 = BTree.add(BTree.getRoot(), new Node("2.Pararse",1 ,3));
//		
//		BTree.add(root2, new Node(name + " vi� que hab�a dos caminos hacia dos acantilados nuevos. Se dirigi� a la izquierda, hacia la tormenta.", 2, 4));
//		BTree.add(root2, new Node(name + " camin� hacia una neblina y se perdi� en ella durante mucho, mucho tiempo hasta que muri� por su avanzada edad.\n Nunca m�s se supo de ella y el Rey atormentado sigui� atormentado la preciosa ciudad de Aguas Claras.", 2, 5));
//		BTree.add(root3, new Node("Nuestra hero�na a�n sabiendo que tenia que ir hacia la tormenta decidi� pararse a tomar un cucurucho de helado \n en un apacible puesto de comerciantes de las nubes. Despu�s de ello decidi� retomar la aventura y andar hacia la tormenta.", 2, 6));
//		BTree.add(root3, new Node(name + " a�n sabiendo que tenia que ir hacia la tormetna decidi� quedarse quieta, pero la roca en la que se encontraba"
//				+ " empez� a temblar y se desplom� la zona en la que se encontraba precipitandose al vacio, acto seguido fue aplastada por las rocas"
//				+ " y muri�. Nunca m�s se supo de nuetra hero�na en Aguas Claras.", 2, 7));
//		return BTree;
//
//	}
}
