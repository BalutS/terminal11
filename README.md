se le quiere dar funcionalidad a los botones de "cancelar" y "borrar" en las vistas administrar de "terminal"

cada una debe tener restricciones para garantizar el correcto funcionamiento del codigo

Equipaje:
se puede borrar sin restricciones

Pasajero:
no se permite borrar si existe algun equipaje o tiquete que tenga al pasajero seleccionado. Mostrar un mensaje de advertencia en ese caso

Tiquete:
se puede borrar sin restricciones
garantizar que el estado del asiento relacionado a dicho tiquete pase de "true" a "false"

Asiento:
no se permite borrar si existe algun tiquete que tenga al asiento seleccionado. Mostrar un mensaje de advertencia en ese caso

Bus:
no se permite borrar si existe algun viaje que tenga al bus seleccionado. Mostrar un mensaje de advertencia en ese caso

Conductor:
no se permite borrar si existe algun viaje que tenga al conductor seleccionado. Mostrar un mensaje de advertencia en ese caso

Ruta: 
no se permite borrar si existe algun viaje que tenga la ruta seleccionada. Mostrar un mensaje de advertencia en ese caso

Empresa:
no se permite borrar si existe algun bus que tenga la empresa seleccionada. Mostrar un mensaje de advertencia en ese caso

Viaje:
no se permite borrar si existe algun tiquete que tenga el viaje seleccionado. Mostrar un menaje de advertencia en ese caso

Para poder hacer las implementaciones de borrar y cancelar, sigue como guia al proyecto "guia" siguiendo la sintaxis, organizamiento de metodos y clases

