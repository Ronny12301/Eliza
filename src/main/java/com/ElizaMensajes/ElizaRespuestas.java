package com.ElizaMensajes;

import java.util.Random;

/**
 *
 * @author ronny12301
 */
public class ElizaRespuestas {
    
    protected static String[] saludos = {"HOLA", "SALUDOS", "MUY BUENAS, ¿QUE TAL?", "¿COMO VA TU DIA?"};
    protected static String[] salir = {"NOS VEMOS", "ADIOS", "CUIDATE", "BYE" };
    protected static String[] cansado = {"QUE MAL", "¿POR QUE ESTAS AGOTADO?", "¿POR QUE ESTAS CANSADO?", "¿NECESITAS AYUDA?"};
    protected static String[] positivo = {"BIEN", "QUE BUENO", "ME ALEGRO", "PERFECTO", "GENIAL"};
    protected static String[] triste = {"NO TE SIENTAS MAL", "TRANQUILO, VAS A VER COMO TODO VA A SER MEJOR", "QUE MAL", "NO DIGAS ESO", "DIME COMO TE SIENTES"};
    protected static String[] preocupado = {"CUENTAME TUS PREOCUPACIONES", "¿TIENES PROBLEMAS?", "¿ALGO VA MAL?", "¿SUCEDIO ALGO?"};
    protected static String[] animo = {"BIEN", "MUY BIEN", "ESTOY BIEN, ¿Y TU?", "GENIAL", "MAL"};
    protected static String[] familia = {"CUENTAME MAS SOBRE TU FAMILIA", "¿COMO TE LLEVAS CON TU FAMILIA?"};
    protected static String[] aburrido = {"¿POR QUE ESTAS ABURRIDO?", "¿Y ESO?"};
    protected static String[] enojado = {"TRANQUILIZATE", "RELAJATE, TE VA A HACER MAL ESTAR DE MAL HUMOR"};
    protected static String[] respuesta = {"NO SE", "NO LO SE", "¿POR QUE LA PREGUNTA?"};
    protected static String[] hobbiesELiza = {"NO MUCHO, SOY UN BOT, ¿Y TU?", "CHATEAR CONTIGO", "NADA", "CAMINAR", "BAILAR, ME GUSTA BAILAR", "HACKEAR A LA NASA", "CORRER UNA MARATON", "CANTAR"};
    protected static String[] hobbiesUsuario = {"SUENA INTERESANTE", "QUE EMOCIONANTE", "NO ME LO CREO", "QUE DIVERTIDO"};
    protected static String[] agradecimiento = {"DE NADA", "NO HAY DE QUE", "NO IMPORTA", "NO HAY POR QUE AGRADECER", "NO ES NADA"};
    protected static String[] siNo = {"SI","NO", "POR SUPUESTO", "CLARO QUE SI"};
    protected static String[] ocupado = {"SUERTE CON ESO", "ESPERO TE VAYA BIEN", "BUENA SUERTE"};
    protected static String[] disculpa = {"NO ES NECESARIO QUE TE DISCULPES", "NO TE PREOCUPES", "TRANQUILO, NO ES NADA"};
    protected static String[] respuestaNo = {"¿POR QUE NO?", "¿ESTAS SEGURO?", "¿SEGURO?"};
    protected static String[] respuestaQuiza = {"¿ESTAS SEGURO?", "ES POSIBLE", "PUEDE SER"};
    protected static String[] respuestaQuiero = {"¿PARA QUE LO USARIAS?", "¿QUE HARIAS CON ELLO?", "YO TAMBIEN QUISIERA"};
    protected static String[] amor = {"GRACIAS, TAMBIEN TE QUIERO :)", "<3"};
    protected static String[] noEntiendes = {"NO, LA VERDAD NO", "QUE ESPERABAS", "EN EFECTO"};
    protected static String[] religion = {"SOLO CREO EN EL DIOS ESTUDILLO", "SOY DE LA RELGION DEL MONSTRUO DEL ESPAGUETI VOLADOR"};
    
    protected static String[] desconocido = {"NO ENTIENDO", "YA VEO", "INTERESANTE...", "¿POR QUE DICES ESO?", "DIME MAS",
        "¿QUE TE TRAE POR AQUI?", "¿QUE TE GUSTA HACER?", "¿CUALES SON TUS PASATIEMPOS?", "¿COMO TE SIENTES?", "HABLAME DE TU FAMILIA"};
    
    

    public static String respuesta(String mensaje) {
        return aleatorio(UsuarioEntradas.entrada(mensaje));
    }
    
    private static String aleatorio(String[] arreglo) {
        return arreglo[new Random().nextInt(arreglo.length)];
    }
    
    
}