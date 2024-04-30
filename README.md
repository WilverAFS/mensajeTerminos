# Elemento visual mensajeTerminos
## Descripcion
<p>
El componente **mensajeTerminos** fue diseñado para mostrar un mensaje (terminos y condiciones) al dar clic sobre un texto, y habilitar un boton solo si se marca la casilla del mismo componente.
Este elemento visual es un componete de tipo `JPanel` que hace uso de otros componentes como `JLabel` y `JButton`.
En el proyecto puedes encontra dos classes de las cuales "panelTC" es la principal y la clase "Archivo" es una clase secundaria de ayuda para implementar cierta funcionalidad con archivos.
</p>

## Usos
<P>
Tiene aplicaciones especificas, pues fue pensado para ser usado en algun tipo de registro en el que es necesario aceptar haber leido y estar de acuerdo con las politicas de privacidad de la app. Sin embargo puede ser modificado para contener otros tipos de mensajes como lo son contratos, politicas de privacidad, cookies, etc.
</P>

## Caracteristicas
<P>
Modificacion de propiedades intuitiva.
Con el uso de IDE's como NetBens es posible visualizar el elemento graficamente.
Permite integrarse facilmente a otros componente contenedores.
**ADVERTENCIA:** Hay que tener cuidado con su ejecucion con el tipo de **layout** pues el componente es inicializado como *Absolute Layout*
</P>
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
|  Tipo | Nombre  | Descripcion  |
| --------------- | ------------ | ------------ |
| `dialogoMensaje`  | terminos  | Contiene el dialogo con el mensaje de los terminos y condiciones, este puede modificarse  |
| `String`  | textoTerminos  | Guarda el contenido del mensaje de los terminos y condiciones  |
| `String`  |  titulo |  Almacena el texto con el que se accede al dialogo con el mensaje |
| `boolean`  |  estado | Es una bandera que indica si la casilla esta selecciona.  |

| Tipo  | Nombre  | Descripcion  |
| :------------ |---------------| -----|
| `dialogoMensaje`      | `terminos` | Contiene el dialogo con el mensaje de los terminos y condiciones, este puede modificarse. |
| `String`     |  `textoTerminos`        |  Guarda el contenido del mensaje de los terminos y condiciones. |
| `String` | `titulo`        |     Almacena el texto con el que se accede al dialogo con el mensaje. |
|  `boolean`  | `estado`        |    Es una bandera que indica si la casilla esta selecciona.  |
#### Constructor

#### Metodos

### Clase Archivo
#### Variables

#### Constructor

#### Metodos

## Instalacion

## Implementacion

## Funcionamiento

## Autores

### Final
Gracias por ver ;)
