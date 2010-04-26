/**
 * 
 */
package ar.com.futbolprode.negocio.logica.util;

/**
 * Breve enumeracion de clubes y sus descripciones que me permite completar
 * tablas para realizar tareas de test
 * 
 * @author acabrera
 * @since 22 Nov,2009
 */
public enum Clubes {

	CENTRAL_NORTE, JUVENTUD_ANTONIANA, GIMNASIA_Y_TIRO, COMERCIO, CACHORROS, ATLAS, SAN_MARTIN, SAN_ANTONIO, UNION, PENAROL, ATLETICO_SALTA, ARGENTINOS_DEL_NORTE, MITRE, SAN_FRANCISCO, BELGRANO, PELLEGRINI, SANIDAD;

	public enum ClubesDescripcion {
		cuervo, santo, albo, mercantil, cachorros, atlas, oeste, villa, cartero, mirasol, gaucho, militar, ciclon, sanfra, belgrano, adoquinero, sanidad;
	}

	public enum ClubesEstado {
		activo, desactivo;
	}

	public enum ClubesLiga {
		salta, jujuy, primera, nacionalB, argentinoA, argentinoB, primeraB, primeraC, primeraD,mundial;
	}

	public enum PaisesMundial2010 {
		sudafrica, uruguay, mexico, francia, argentina, coreaDelSur, grecia, nigeria, inglaterra, estadosUnidos, argelia, eslovenia, alemania, serbia, ghana, australia, holanda, japon, dinamarca, camerun, italia, paraguay, nuevaZelanda, eslovaquia, brasil, portugal, costaDeMarfil, coreaDelNorte, espania, chile, suiza, honduras;
	}
}
