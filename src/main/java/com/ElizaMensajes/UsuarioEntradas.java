package com.ElizaMensajes;

/**
 *
 * @author ronny12301
 */
public class UsuarioEntradas {
    
    protected static String[] saludos = {"Hola","hola", "Saludos","saludos", "buenos dias", "Buenas", "Buenos dias", "buenas tardes", "buenas noches"};
    protected static String[] salir = {"Adios", "adios", "nos vemos", "chau", "chao", "bye", "Bye", "Salir"};
    protected static String[] cansado = {"cansado", "agotado", "no he dormido"};
    protected static String[] triste = {"Mal", "mal", "no soy feliz", "triste", "deprimido", "no puedo", "dificil"};
    protected static String[] preocupado = {"problemas", "preocupado"};
    protected static String[] positivo = {"Bien", "bien", "Feliz", "feliz", "genial", "perfecto", "me alegro", "bueno"};
    protected static String[] familia = {"mama", "papa", "madre", "padre", "hermano", "hermana", "hijo", "hija", "familia", "abue", "tia", "tio","prima", "primo", "sobrin"};
    protected static String[] aburrido = {"aburrido", "Aburrido"};
    protected static String[] enojado = {"enojado", "mal humor", "Enojado", "odio"};
    protected static String[] hobbiesELiza = {"te gusta", "que haces", "Que haces", "tus pasatiempos", "tu tiempo libre", "tus hobbies", "y los tuyos", "que mas", "que sabes hacer"};
    protected static String[] pregunta = {"Por que", "que opinas de", "por que", "?", "y eso", "como?"};
    protected static String[] hobbiesUsuario = {"me gusta", "voy a", "salgo a", "practico", "ar"};
    protected static String[] talentos = {"tocas algun instrumento", "sabes hacer", "sabes", "interesante", "y a ti"};
    protected static String[] agradecimiento = {"gracias", "Gracias", "agradezco", "tenkiu", "grax", "agradecido", "agradecida", "amable", "te debo una", "aprecio"};
    protected static String[] ocupado = {"ocupado", "atareado", "estoy", "programando", "patinando", "compitiendo", "estudiando", "aprendiendo"};
    protected static String[] preguntaAnimo = {"que tal", "como estas", "todo bien?", "y tu", "Que tal", "como te sientes"};
    protected static String[] no = {"no", "negativo", "nel"};
    protected static String[] quiza = {"quiza","probable", "acaso", "posible"};
    protected static String[] quiero = {"quiero", "gustaria tener"};
    protected static String[] disculpa = {"disculpa", "lo siento", "perdon", "lo lamento"};
    protected static String[] noEntiendes = {"entiendes nada", "nunca entiendes"};
    protected static String[] religion = {"religion", "en que crees", "creencias", "religios"};
    protected static String[] amor = {"amo", "te quiero", "tkm", "tqm"};
    
    
    public static boolean verificarArreglo(String mensaje, String[] arreglo) {
        for (String texto : arreglo) {
            if (mensaje.contains(texto)) {
                return true;
            }
        }
        return false;
    }
    
    
    protected static String[] entrada(String mensaje) {
        if (verificarArreglo(mensaje, saludos)) {
            return ElizaRespuestas.saludos;
        } 
        else if (verificarArreglo(mensaje, salir)) {
            return ElizaRespuestas.salir;
        } 
        else if (verificarArreglo(mensaje, cansado)) {
            return ElizaRespuestas.cansado;
        } 
        else if (verificarArreglo(mensaje, positivo)) {
            return ElizaRespuestas.positivo;
        } 
        else if (verificarArreglo(mensaje, triste)) {
            return ElizaRespuestas.triste;
        } 
        else if (verificarArreglo(mensaje, preguntaAnimo)) {
            return ElizaRespuestas.animo;
        } 
        else if (verificarArreglo(mensaje, familia)) {
            return ElizaRespuestas.familia;
        } 
        else if (verificarArreglo(mensaje, aburrido)) {
            return ElizaRespuestas.aburrido;
        } 
        else if (verificarArreglo(mensaje, enojado)) {
            return ElizaRespuestas.enojado;
        } 
        else if (verificarArreglo(mensaje, pregunta)) {
            return ElizaRespuestas.respuesta;
        } 
        else if (verificarArreglo(mensaje, hobbiesELiza)) {
            return ElizaRespuestas.hobbiesELiza;
        } 
        else if (verificarArreglo(mensaje, hobbiesUsuario)) {
            return ElizaRespuestas.hobbiesUsuario;
        } 
        else if (verificarArreglo(mensaje, talentos)) {
            return ElizaRespuestas.siNo;
        } 
        else if (verificarArreglo(mensaje, agradecimiento)) {
            return ElizaRespuestas.agradecimiento;
        } 
        else if (verificarArreglo(mensaje, ocupado)) {
            return ElizaRespuestas.ocupado;
        } 
        else if (verificarArreglo(mensaje, no)) {
            return ElizaRespuestas.respuestaNo;
        } 
        else if (verificarArreglo(mensaje, quiza)) {
            return ElizaRespuestas.respuestaQuiza;
        } 
        else if (verificarArreglo(mensaje, quiero)) {
            return ElizaRespuestas.respuestaQuiero;
        } 
        else if (verificarArreglo(mensaje, disculpa)) {
            return ElizaRespuestas.disculpa;
        } 
        else if (verificarArreglo(mensaje, religion)) {
            return ElizaRespuestas.religion;
        } 
        else if (verificarArreglo(mensaje, noEntiendes)) {
            return ElizaRespuestas.noEntiendes;
        }
        else if (verificarArreglo(mensaje, amor)) {
            return ElizaRespuestas.amor;
        }
        
        else {
            return ElizaRespuestas.desconocido;
        }

        
    }
    
    public static String[] getSalir() {
        return salir;
    }

}
