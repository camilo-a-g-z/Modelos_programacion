# Personajes con patron de diseño
En este repositorio se encuentra un código encargado de solicitar al usuario una clase de personaje (barbaro, duende, mago, etc) y una cantidad de éstos que desee crear, a lo que el código devolvera los personajes creados con caracteristicas y estadisticas aleatorias específicas para cada uno de estos con su respectiva imagen.

El patron de diseño utilizado en este proyecto es Factory Method, debido a que se necesita crear objetos de una superclase, pero permitiendo que las subclases cambien el tipo de objeto, en este caso la superclase es personaje, y las subclases lo modifican para que sea del tipo que desee el usuario (barbaro, duende, etc.).

En este proyecto no se utilizaron los siguientes patrones:
1. Abstract Factory, debido a que mezclarlo con el Factory Method podría producir problemas.
1. Prototype, porque no se necesita clonar los objetos, sino poder editarlos según lo que pida el usuario.
1. Singleton, porque no se necesita que exista una única instancia ni un único punto de acceso a la superclase.

**Diagrama de clases**

![Diagrama de clases](UML_PersonajesCOC.png)