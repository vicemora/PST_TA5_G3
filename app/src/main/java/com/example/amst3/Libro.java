package com.example.amst3;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    public static final ArrayList<Libro> listLibrosDatos = new ArrayList<>();
    static {
        listLibrosDatos.add(new Libro("MIL RAZONES PARA QUEDARME", "PORTAL ARRAEZ NACARID", "DEJAVU", "¿Te quedarías sabiendo " +
                "que puedes ser lastimado, o serías prudente y preferirías dejar ir? El segundo libro de la saga Renacer nos " +
                "presenta a Abril Salvat dirigiéndose al internado Origen, donde el proyecto que " +
                "intenta acabar con la raza humana, se puso en marcha. Sin medir en los " +
                "peligros, va en busca de Shantal porque se resiste a que esté muerta. El amor " +
                "que siente por ella va por encima de sus miedos y no va a descansar hasta " +
                "encontrarla. En el internado Renacer Aaron Cevallos, presidente estudiantil, " +
                "está a punto de recibir a cien becados con habilidades especiales. Ahora, ¿cómo " +
                "controla a cientos de estudiantes que están atrapados? Es el presidente y su " +
                "misión inmediata es que el resto de alumnos no caigan en pánico, pero están " +
                "encerrados a su suerte y acaban de recibir la noticia de que son parte de un " +
                "proyecto que espera acabar con un porcentaje de la humanidad. Un experimento " +
                "hizo humanos con cualidades extraordinarias, pero sólo dos de ellos alcanzaron " +
                "el 100% y se consideran armas letales. Los líderes mundiales están conscientes " +
                "de su importancia porque son la última oportunidad para llevar a cabo el " +
                "experimento. Los elegidos tienen la decisión de luchar, o ser parte de una " +
                "bestial estrategia para comenzar de cero a través de la exterminación. ¡Una saga " +
                "adictiva que te mantiene en vilo hasta la última página!", R.drawable.bart, "Romance", 27.50));
        listLibrosDatos.add(new Libro("REMEMBER. UN AMOR INOLVIDABLE", "ROYER ASHLEY", "CROSS BOOKS", "Nada puede consolar " +
                "a Levi. Tras la muerte de su novia en un trágico accidente, nada le merece la pena. " +
                "Ni siquiera quiere hablar. Nunca. Con nadie. Pero aun así? la vida sigue, y en su " +
                "camino se cruzara? lo inesperado: una chica tan parecida a su antigua novia, que le " +
                "resulta doloroso incluso mirarla... Aunque siente que con ella si? merecería la pena " +
                "hablar. Levi y ella se acercan, se alejan, se fascinan, se repelen. Atracción y rechazo " +
                "luchan en una relación tan tensa como romántica. ¿Es posible enamorarse de nuevo cuando " +
                "aún no has superado tu primer amor auténtico? ", R.drawable.burns, "Romance", 14.00));
        listLibrosDatos.add(new Libro("P.D TODAVIA TE QUIERO", "HAN JENNY", "CROSS BOOKS", "Lara Jean no esperaba enamorarse. Mucho menos enamorarse en serio de Peter. Al principio era una fantasía. Pero de pronto, ya no es sólo eso, y ahora Lara Jean está muy confundida. Otro chico del pasado vuelve a su vida y lo que sentía por él también resurge", R.drawable.flanders, "Romance", 17.00));
        listLibrosDatos.add(new Libro("EVERYTHING, EVERYTHING", "YOON NICOLA", "EMBER", "Arriesgue todo . . . por amor. ¿Qué pasaría si no pudieras tocar nada en el mundo exterior? Nunca respires el aire fresco, siente que el sol calienta tu cara. . . o besar al niño de al lado? En Everything, Everything, Maddy es una chica que es literalmente alérgica al mundo exterior, y Olly es el chico que se muda a la puerta de al lado. . . y se convierte en el mayor riesgo que ha tomado.", R.drawable.bart, "Romance", 16.00));
        listLibrosDatos.add(new Libro("DINOSAURIOS ESCENARIOS 3D", "LEXUS", "LEXUS", "Entretenido libro que muestra curiosidades sobre impresionantes criaturas pre-históricas y contiene divertidas escenas 3D.", R.drawable.burns, "Infantil", 22.50));
        listLibrosDatos.add(new Libro("PALETA DE SONIDOS VEHICULOS", "LATINBOOKS", "LATINBOOKS", "Este libro presenta diversos vehículos, y reproduce el sonido que emite cada uno.", R.drawable.flanders, "Infantil", 20.75));
        listLibrosDatos.add(new Libro("TOUCH ADN FEEL FARM", "VARIOS AUTORES", "SCHOLASTIC", "This program teaches toddlers early learning concepts such as colors, numbers, shapes, and opposites using multi-sensory novelties in every book for maximum interactivity, play, and discovery!", R.drawable.bart, "Infantil", 11.76));
        listLibrosDatos.add(new Libro("ARTISTAS (MIS PRIMEROS HEROES)", "GENTILESCHI ARTEMISIA", "BEASCOA", "Empuja, tira y desliza las escenas para aprender sobre sus inspiradoras vidas y su increíble trabajo. En este título de la colección Mis primeros héroes, los más pequeños descubrirán algunos de los artistas más importantes de nuestra historia, como la pintora barroca Artemisia Gentileschi, el pintor postimpresionista Vincent van Gogh, la pintora surrealista Frida Kahlo y el artista de pop art Andy Warhol. Los libros con el sello Pequeñas Manitas están pensados específicamente para los lectores más pequeños de la casa. Adaptados a sus necesidades especiales, tienen el tamaño adecuado para sus manitas y están impresos en materiales resistentes a su infinita energía.", R.drawable.burns, "Infantil", 11.00));
        listLibrosDatos.add(new Libro("EL FANTASMA DE CANTERVILLE", "WILDE OSCAR", "AUSTRAL", "El despiadado fantasma de Lord Simon de Canterville durante más de tres siglos logro atormentar a todos los habitantes de una antigua casa inglesa. La llegada de unos nuevos habitantes, una familia norteamericana moderna y práctica, le pone el humor por el piso al fantasma. El fantasma de Canterville no logra asustarlos y más bien pasa a ser víctima de las bromas de los terribles gemelos y en general, de todos los miembros de la familia, por lo que cae en depresión hasta que finalmente, con ayuda de Virginia, logra alcanzar la paz de la muerte.", R.drawable.flanders, "Clasicos", 9.00));
        listLibrosDatos.add(new Libro("ALICIA EN EL PAIS DE LAS MARAVILLAS", "CARROLL LEWIS", "AUSTRAL", "Las obras más emblemáticas de la literatura juvenil, dirigida a niños, jóvenes y adultos. Su diseño especial da valor al libro como objeto exclusivo, además de ser un clásico indispensable en la biblioteca de cualquier lector. Aquí todos estamos locos. Yo estoy loco. Tú estás loca. ¿Cómo sabes que estoy loca?—dijo Alicia.Tienes que estarlo -dijo el Gato—, de otro modo no habrías venido", R.drawable.bart, "Clasicos", 9.00));
        listLibrosDatos.add(new Libro("OSCAR WILDE CLASSIC TALES + CD", "WILDE OSCAR", "EDELVIVES", "El polémico y admirado escritor irlandés se une a esta colección con tres relatos: The Happy Prince, una alegoría sobre la bondad y la verdadera riqueza; The Fisherman and his Soul, una extraña aventura sobre un hombre que pierde su alma y recorre el mundo en busca del sentido de la vida, y Lord Arthur Savile¿s Crime, donde Oscar Wilde despliega todo su ingenio para relatar un crimen movido por el miedo y por el azar.", R.drawable.burns, "Clasicos", 16.50));
        listLibrosDatos.add(new Libro("LAS AVENTURAS DE PINOCHO", "COLLODI CARLO", "AUSTRAL", "Geppetto tomó en seguida las herramientas y se puso a esculpir y a fabricar su muñeco. ¿Qué nombre le pondré? se preguntó. Le voy a llamar Pinocho. Este nombre le traerá suerte", R.drawable.flanders, "Clasicos", 8.50));
        listLibrosDatos.add(new Libro("LA REALIDAD NO ES TODO LO QUE VE", "DANGELIS LUNA", "MR", "Unos meses después de su viaje al mundo de los sueños, Luna apenas recuerda a Dariel; él no quiere perderla y desea contactar con ella de nuevo. Pero Luna ha madurado, ha conocido a otras personas y se ha enamorado. Itaken, que continúa siendo un puente entre la realidad y el universo imaginario, tratará de advertir a Luna del peligro que la amenaza si se deja llevar por sus sentimientos. Tanto él como Dariel continuarán protegiéndola, como han hecho siempre.", R.drawable.bart, "Fantasia", 14.00));
        listLibrosDatos.add(new Libro("HARRY POTTER Y EL LEGADO MALDITO", "ROWLING J.K.", "SALAMANDRA", "Ser Harry Potter nunca ha sido tarea fácil, menos aún desde que se ha convertido en un ocupadísimo empleado del Ministerio de Magia, un hombre casado y padre de tres hijos. Mientras Harry planta cara a un pasado que se resiste a quedar atrás, su hijo menor, Albus, ha de luchar contra el peso de una herencia familiar de la que él nunca ha querido saber nada. Cuando el destino conecte el pasado con el presente, padre e hijo deberán afrontar una verdad muy incómoda: a veces, la oscuridad surge de los lugares más insospechados. Harry Potter y el legado maldito es una obra de teatro de Jack Thorne basada en una historia original de J. K. Rowling, John Tiffany y Jack Thorne. Es la octava historia de la saga de Harry Potter y la primera que se representa oficialmente en los escenarios.", R.drawable.burns, "Fantasia", 17.00));
        listLibrosDatos.add(new Libro("GATOS GUERREROS 3 EL BOSQUE DE LOS SECRETOS", "HUNTER ERIN", "SALAMANDRA", "La escasez de comida y la crecida del río a causa del " +
                "deshielo ponen a prueba la relación entre los clanes. Látigo Gris no ha podido " +
                "elegir peor momento para enamorarse de una gata de un clan rival, situación que " +
                "se tornará insostenible cuando la pareja tenga dos cachorros. Por su parte, " +
                "Corazón de Fuego se empeña en averiguar la verdad sobre la misteriosa muerte de " +
                "Cola Roja, un antiguo lugarteniente, lo que le llevará a descubrir una serie de " +
                "secretos que algunos creen que sería mejor no revelar jamás. Y es que, en el " +
                "seno de su propio clan, un traidor se dispone a conquistar el poder del modo " +
                "más artero y siniestro. A raíz de estos acontecimientos, las jerarquías del " +
                "Clan del Trueno cambiarán para siempre. El bosque de los secretos es la tercera " +
                "entrega de Los gatos guerreros. Traducida a veintiocho idiomas, la serie lleva " +
                "más de diez millones de ejemplares vendidos en Estados Unidos y más de dos años " +
                "en la lista de grandes éxitos del New York Times.", R.drawable.flanders, "Fantasia", 15.45));

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
