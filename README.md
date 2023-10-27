# Proyecto Final

## Grupo 22 - FRAVEMAX - Argentina Programa - ULP

### Integrantes del Proyecto:
- Mariana Cristaldo
- Andres Carrasco
- Rodrigo Rivolta
- Leonel Alejandro Ranieri

------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------
## Formas de Ejecutar la Aplicación

La aplicación está diseñada en NetBeans y utiliza el lenguaje Java. Para ejecutarla, sigue estos pasos:

1. Instalar XAMPP para la gestión de la base de datos.
2. Diseñar la base de datos con las siguientes tablas: cliente, producto, venta, detalle venta.
3. Cargar las librerías necesarias: jcalendar-1.4, mariadb-java-client-3.0.11, miglayout-4.0, TimingFramework-0.55.
4. Ejecutar la aplicación desde: `Source Packages/menu/main.java`.

------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------

## Modo de Uso de la Aplicación

A continuación, te proporcionamos algunas aclaraciones importantes para garantizar una experiencia de uso óptima:

- En 'productos-registrar productos' y en 'administrar-clientes', el botón 'agregar' habilita el botón 'guardar' para registrar nuevos productos o clientes. El botón 'buscar' permite editar y eliminar. En el caso de los clientes, si el cliente está inactivo, se puede dar de alta nuevamente utilizando el botón 'modificar' y seleccionando la opción de 'cliente activo'. Tanto para los productos como para los clientes, la eliminación es una baja lógica en la base de datos.

- En 'ventas-realizar ventas', haz clic en el cuerpo del desplegable del campo 'Seleccione un cliente' para habilitar los clientes. Lo mismo se aplica a 'ventas-detalle de ventas', solo que el campo es 'Seleccione una venta'.

- Se aplica el mismo funcionamiento descrito en el punto anterior para 'buscar-mostrar clientes por producto', en este caso, el despliegue corresponde al campo 'Seleccionar un producto'.

---------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------
