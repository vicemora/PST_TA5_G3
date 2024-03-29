package com.example.amst3;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    public static final ArrayList<Libro> listLibrosDatos = new ArrayList<>();
    static {
        listLibrosDatos.add(new Libro("MIL RAZONES PARA QUEDARME", "PORTAL ARRAEZ NACARID", "DEJAVU", "Sin medir en los peligros, va en busca de Shantal porque se resiste a que esté muerta. El amor que siente por ella va por encima de sus miedos y no va a descansar hasta encontrarla. En el internado Renacer Aaron Cevallos, presidente estudiantil, está a punto de recibir a cien becados con habilidades especiales.", R.drawable.mrpq, "Romance", 27.50));
        listLibrosDatos.add(new Libro("REMEMBER. UN AMOR INOLVIDABLE", "ROYER ASHLEY", "CROSS BOOKS", "Nada puede consolar " +
                "a Levi. Tras la muerte de su novia en un trágico accidente, nada le merece la pena. " +
                "Ni siquiera quiere hablar. Nunca. Con nadie. Pero aun así? la vida sigue, y en su " +
                "camino se cruzara? lo inesperado: una chica tan parecida a su antigua novia, que le " +
                "resulta doloroso incluso mirarla... Aunque siente que con ella si? merecería la pena " +
                "hablar. Levi y ella se acercan, se alejan, se fascinan, se repelen. Atracción y rechazo " +
                "luchan en una relación tan tensa como romántica. ¿Es posible enamorarse de nuevo cuando " +
                "aún no has superado tu primer amor auténtico? ", R.drawable.remember, "Romance", 14.00));
        listLibrosDatos.add(new Libro("P.D TODAVIA TE QUIERO", "HAN JENNY", "CROSS BOOKS", "Lara Jean no esperaba enamorarse. Mucho menos enamorarse en serio de Peter. Al principio era una fantasía. Pero de pronto, ya no es sólo eso, y ahora Lara Jean está muy confundida. Otro chico del pasado vuelve a su vida y lo que sentía por él también resurge", R.drawable.pd, "Romance", 17.00));
        listLibrosDatos.add(new Libro("EVERYTHING, EVERYTHING", "YOON NICOLA", "EMBER", "Arriesgue todo . . . por amor. ¿Qué pasaría si no pudieras tocar nada en el mundo exterior? Nunca respires el aire fresco, siente que el sol calienta tu cara. . . o besar al niño de al lado? En Everything, Everything, Maddy es una chica que es literalmente alérgica al mundo exterior, y Olly es el chico que se muda a la puerta de al lado. . . y se convierte en el mayor riesgo que ha tomado.", R.drawable.everything, "Romance", 16.00));
        listLibrosDatos.add(new Libro("DINOSAURIOS ESCENARIOS 3D", "LEXUS", "LEXUS", "Entretenido libro que muestra curiosidades sobre impresionantes criaturas pre-históricas y contiene divertidas escenas 3D.", R.drawable.dinosaurios, "Infantil", 22.50));
        listLibrosDatos.add(new Libro("PALETA DE SONIDOS VEHICULOS", "LATINBOOKS", "LATINBOOKS", "Este libro presenta diversos vehículos, y reproduce el sonido que emite cada uno.", R.drawable.paletas, "Infantil", 20.75));
        listLibrosDatos.add(new Libro("TOUCH ADN FEEL FARM", "VARIOS AUTORES", "SCHOLASTIC", "This program teaches toddlers early learning concepts such as colors, numbers, shapes, and opposites using multi-sensory novelties in every book for maximum interactivity, play, and discovery!", R.drawable.pio, "Infantil", 11.76));
        listLibrosDatos.add(new Libro("ARTISTAS (MIS PRIMEROS HEROES)", "GENTILESCHI ARTEMISIA", "BEASCOA", "Empuja, tira y desliza las escenas para aprender sobre sus inspiradoras vidas y su increíble trabajo. En este título de la colección Mis primeros héroes, los más pequeños descubrirán algunos de los artistas más importantes de nuestra historia, como la pintora barroca Artemisia Gentileschi, el pintor postimpresionista Vincent van Gogh, la pintora surrealista Frida Kahlo y el artista de pop art Andy Warhol. Los libros con el sello Pequeñas Manitas están pensados específicamente para los lectores más pequeños de la casa.", R.drawable.artistas, "Infantil", 11.00));
        listLibrosDatos.add(new Libro("EL FANTASMA DE CANTERVILLE", "WILDE OSCAR", "AUSTRAL", "El despiadado fantasma de Lord Simon de Canterville durante más de tres siglos logro atormentar a todos los habitantes de una antigua casa inglesa. La llegada de unos nuevos habitantes, una familia norteamericana moderna y práctica, le pone el humor por el piso al fantasma. El fantasma de Canterville no logra asustarlos y más bien pasa a ser víctima de las bromas de los terribles gemelos y en general, de todos los miembros de la familia, por lo que cae en depresión hasta que finalmente, con ayuda de Virginia, logra alcanzar la paz de la muerte.", R.drawable.elfantasma, "Clasicos", 9.00));
        listLibrosDatos.add(new Libro("ALICIA EN EL PAIS DE LAS MARAVILLAS", "CARROLL LEWIS", "AUSTRAL", "Las obras más emblemáticas de la literatura juvenil, dirigida a niños, jóvenes y adultos. Su diseño especial da valor al libro como objeto exclusivo, además de ser un clásico indispensable en la biblioteca de cualquier lector. Aquí todos estamos locos. Yo estoy loco. Tú estás loca. ¿Cómo sabes que estoy loca?—dijo Alicia.Tienes que estarlo -dijo el Gato—, de otro modo no habrías venido", R.drawable.alicia, "Clasicos", 9.00));
        listLibrosDatos.add(new Libro("OSCAR WILDE CLASSIC TALES + CD", "WILDE OSCAR", "EDELVIVES", "El polémico y admirado escritor irlandés se une a esta colección con tres relatos: The Happy Prince, una alegoría sobre la bondad y la verdadera riqueza; The Fisherman and his Soul, una extraña aventura sobre un hombre que pierde su alma y recorre el mundo en busca del sentido de la vida, y Lord Arthur Savile¿s Crime, donde Oscar Wilde despliega todo su ingenio para relatar un crimen movido por el miedo y por el azar.", R.drawable.oscar, "Clasicos", 16.50));
        listLibrosDatos.add(new Libro("LAS AVENTURAS DE PINOCHO", "COLLODI CARLO", "AUSTRAL", "Geppetto tomó en seguida las herramientas y se puso a esculpir y a fabricar su muñeco. ¿Qué nombre le pondré? se preguntó. Le voy a llamar Pinocho. Este nombre le traerá suerte", R.drawable.pinocho, "Clasicos", 8.50));
        listLibrosDatos.add(new Libro("LA REALIDAD NO ES TODO LO QUE VE", "DANGELIS LUNA", "MR", "Unos meses después de su viaje al mundo de los sueños, Luna apenas recuerda a Dariel; él no quiere perderla y desea contactar con ella de nuevo. Pero Luna ha madurado, ha conocido a otras personas y se ha enamorado. Itaken, que continúa siendo un puente entre la realidad y el universo imaginario, tratará de advertir a Luna del peligro que la amenaza si se deja llevar por sus sentimientos. Tanto él como Dariel continuarán protegiéndola, como han hecho siempre.", R.drawable.larealidad, "Fantasia", 14.00));
        listLibrosDatos.add(new Libro("HARRY POTTER Y EL LEGADO MALDITO", "ROWLING J.K.", "SALAMANDRA", "Harry Potter y el legado maldito trata del viaje de Albus en su infancia y de los papeles que desempeñan él y su mejor amigo, Scorpius (hijo de Draco Malfoy), cuando las fuerzas oscuras, posiblemente aliadas con Voldemort, vuelven a poner en peligro el destino del planeta.", R.drawable.harry, "Fantasia", 17.00));
        listLibrosDatos.add(new Libro("GATOS GUERREROS 3 EL BOSQUE DE LOS SECRETOS", "HUNTER ERIN", "SALAMANDRA", "La escasez de comida y la crecida del río a causa del deshielo ponen a prueba la relación entre los clanes. Látigo Gris no ha podido elegir peor momento para enamorarse de una gata de un clan rival, situación que se tornará insostenible cuando la pareja tenga dos cachorros.", R.drawable.gatos, "Fantasia", 15.45));
    }

    private String nombre;
    private String autor;
    private String editorial;
    private String descripcion;
    private int foto;
    private String categoria;
    private double precio;

    public Libro(String nombre, String autor, String editorial, String descripcion, int foto, String categoria, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.foto = foto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

}
