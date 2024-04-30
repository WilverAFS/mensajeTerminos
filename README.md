# Elemento visual mensajeTerminos

## Descripcion

El componente **mensajeTerminos** fue diseñado para mostrar un mensaje (terminos y condiciones) al dar clic sobre un texto, y habilitar un boton solo si se marca la casilla del mismo componente.
Este elemento visual es un componete de tipo `JPanel` que hace uso de otros componentes como `JLabel` y `JButton`.
En el proyecto puedes encontra dos classes de las cuales "panelTC" es la principal y la clase "Archivo" es una clase secundaria de ayuda para implementar cierta funcionalidad con archivos.


## Usos
<P>
Tiene aplicaciones especificas, pues fue pensado para ser usado en algun tipo de registro en el que es necesario aceptar haber leido y estar de acuerdo con las politicas de privacidad de la app. Sin embargo puede ser modificado para contener otros tipos de mensajes como lo son contratos, politicas de privacidad, cookies, etc.
</P>

## Caracteristicas

Modificacion de propiedades intuitiva.
Con el uso de IDE's como NetBens es posible visualizar el elemento graficamente.
Permite integrarse facilmente a otros componente contenedores.
**ADVERTENCIA:** Hay que tener cuidado con su ejecucion con el tipo de **layout** pues el componente es inicializado como *Absolute Layout*.

## Requisitos

<p>
- JDK 22, java version "22.0.1" o una version superior.
- NetBeans IDE 20 ó algun IDE con soporte grafico.
  
**NOTA:** El proyecto fue creado con Windows 11.
</p>

## API 

### Clase panelTC

<p>
Esta es la clase principal y contiene el elemento grafico de tipo JPanel.
</p>

#### Variables


| Tipo  | Nombre  | Descripcion  |
| :------------ |---------------| -----|
| `dialogoMensaje`      | `terminos` | Contiene el dialogo con el mensaje de los terminos y condiciones, este puede modificarse. |
| `String`     |  `textoTerminos`        |  Guarda el contenido del mensaje de los terminos y condiciones. |
| `String` | `titulo`        |     Almacena el texto con el que se accede al dialogo con el mensaje. |
|  `boolean`  | `estado`        |    Es una bandera que indica si la casilla esta selecciona.  |
#### Constructor
| Nombre  | Parametros  | Descripción  |
| :------------ |---------------| -----|
| `panelTC`      | `()` | Crea el componente con los valores predeterminados en todas sus variables.|
| `panelTC`     |  `(String titulo, String textoTerminos)`        |  Crea el componente asignado los valores recibidos a las variables `titulo` y `textoTerminos`. |

#### Metodos
-----
| Tipo| Return  | Nombre  | Parametros  | Descripcion |
| :--------| :------------ |---------------| --------| --------|
|`public`| `boolean`  | `getBandera`  | `()` |  Devuelve true si la casilla esta seleccionada o false en caso contrario. |
|`public`| `String`     |  `getTextoTerminos`  | `()` |  Retorna el contenido de texto del mensaje de los terminos y condiciones. |
|`public`| `String`     | `getTitulo`        |  `()`  |   Regresa el texto por el cual se accede al mensaje de los terminos y condiciones. |
|`public`|  `JButton` | `getBoton`        |     `()` |  Devuleve el boton "Aceptar" del componente. | 
--------
|Tipo| Return  | Nombre  | Parametros  | Descripcion |
| :-----| :------------ |---------------| --------| --------|
|`public`| `void`  | `setTtitulo`  | `(String titulo)` |  Modifica el contenido de la variable `terminos`. |
|`public`| `void`     |  `setTextoTerminos`  | `(String texto)` |  Modifica el contenido de la variable `textoTerminos` y en consecuencia el mensaje. |
|`public`| `void`     | `setArchivo`        |  `(String ruta)`  |  Modifica el contenido de la variable `textoTerminos` por el contenido del archivo .txt  en la ruta especificada y asu vez el mensaje.  |


### Clase Archivo


#### Metodos
| Tipo| Return  | Nombre  | Parametros  | Descripcion |
| :--------| :------------ |---------------| --------| --------|
|`public static`| `string`  | `leerArchivo`  | `(String rutaArchivo)` |  Devuelve un String con el contenido del archivo .txt desde una ruta dada. |
## Instalacion
Para hacer uso de este componete puedes:
1. Descargar desde github el proyecto `.ZIP` 
2. Obtener el repositorio clon desde github.
Despues simplemente extrae el proyecto en tu ordenar y abrelo desde NetBeans (o el IDE de tu preferencia), luego compila el proyecto verificando que no haya errores y finalmente crea el `.JAR` con el cual podas agregar a todos tus proyectos esta libreria e incluso agregarlo a tu paleta de componentes.

## Implementacion
Imagenes

## Funcionamiento
Para conocer mas acerca de este elemento vea el video: --> [Componente mensajeTerminos](https://youtu.be/j5lzZMBQiAQ?si=3cRFS9V3Ml82ZRO7 "Componente mensajeTerminos")
## Autores
- Flores Santiago Wilver Alfredo - *Estudiante* 
- Roque Hernández Diego Misael- *Estudiante* 
### Final
Gracias por ver ;)

