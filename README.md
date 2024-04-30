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

![WhatsApp Image 2024-04-29 at 10 08 45 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/1cb7770f-fd47-4a7e-8313-9ae81b0225b3)

Vemos que se descargo, por lo cual debemos dirigirnos a mostrarlo en la carpeta y descomprimirlo.

![WhatsApp Image 2024-04-29 at 10 10 49 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/cc523475-d1c5-4900-9496-4ae97e1ae9ed)

![WhatsApp Image 2024-04-29 at 10 12 23 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/c8bf5b8e-4e52-4dcb-a6ec-a48e5704342d)

Ahora movemos la carpeta que anteriormente descargamos y descomprimimos, a la carpeta de NetBeansProject para poder utilizarlo.

![WhatsApp Image 2024-04-29 at 10 13 08 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/6764b6c9-82e6-475e-b12a-a42b0aedde03)

Para poder habrir el proyecto nos dirijimos a NetBeans y le damos abrir proyecto y seleccionamos la carpeta.

![WhatsApp Image 2024-04-29 at 10 14 22 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/20f2ea22-599e-4e9f-8cf2-f74d72447408)

![WhatsApp Image 2024-04-29 at 10 19 15 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/ea99e5be-d5a4-4fe2-9012-209d3af3ddde)

![WhatsApp Image 2024-04-29 at 10 19 41 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/40a69e61-50bc-42ec-9d78-0afb8d3a6a27)

Vemos como ya nos muestra nuestro proyecto, pero se muestra en rojo, lo cual nos dice que hay un posible error, para lo cual nos dirigimos con click derecho a Resolve Project Problems...

![WhatsApp Image 2024-04-29 at 10 20 01 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/dd136961-5143-4301-bf5b-651a3c20b517)

Le picamos al boton de resolver.

![WhatsApp Image 2024-04-29 at 10 20 27 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/e3751e30-646b-40cd-a867-ceedcd8f26da)

Ahora seleccionamos la casilla de Downgrade Project Sourse/Binary Format to 21.

![WhatsApp Image 2024-04-29 at 10 20 41 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/97797b3a-e991-4f27-94ce-f9203f70105d)

Y vemos como se ha corregido y ya podemos ocupar nuestro proyecto.

![WhatsApp Image 2024-04-29 at 10 23 58 PM](https://github.com/WilverAFS/mensajeTerminos/assets/168376977/7255a059-b858-4339-8d39-1634f3b81daf)



## Funcionamiento
Para conocer mas acerca de este elemento vea el video: --> [Componente mensajeTerminos](https://youtu.be/j5lzZMBQiAQ?si=3cRFS9V3Ml82ZRO7 "Componente mensajeTerminos")
## Autores
- Flores Santiago Wilver Alfredo - *Estudiante* 
- Roque Hernández Diego Misael- *Estudiante* 
### Final
Gracias por ver ;)

