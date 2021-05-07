# java-timezone

Api para convetir una hora en UTC

Parametro que recibe son:

{
"hour": "10:43:20",
"timezone": "utc" //no hace nada
}

se pidio en el documento que agregara el timezone que obtendria valor numero ej: +4. pero esta parte no la entendi bien, lo que hice fue pasarle a java la hora y que sea el mismo java el que lo transforme a la zona horaria UTC.

El servicio devuelve la hora transformada.

Una vez descargado y ejecutado el proyecto la url es http://localhost:8080/timezone/convert
Se puede enviar los datos por postman
