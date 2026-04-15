1. ¿Qué hace la anotación @BeforeEach?
Indica que el método debe ejecutarse antes de cada una de las pruebas. Es ideal para configurar el entorno, como inicializar el driver del navegador o abrir la URL base, asegurando que cada test empiece desde un estado limpio.

2. ¿Para qué sirve assertTrue?
Es una aserción que verifica que una condición booleana sea verdadera. Si la condición es false, la prueba falla inmediatamente y muestra un mensaje (opcional). Es el "juez" que decide si el test pasó o no.

3. ¿Qué diferencia hay entre findElement() y findElements()?
findElement(): Busca un único elemento. Si no lo encuentra, lanza una excepción (NoSuchElementException).

findElements(): Busca todos los elementos que coincidan con el selector. Devuelve una List<WebElement>. Si no encuentra ninguno, devuelve una lista vacía en lugar de lanzar una excepción.

4. ¿Por qué utilizamos una clase LoginPage en lugar de escribir todo en el test?
Esto se conoce como Page Object y sus ventajas son:

Mantenibilidad: Si el ID del botón de login cambia en la web, solo lo corriges en la clase LoginPage, no en los 50 tests que lo usen.

Reutilización: Puedes usar los mismos métodos en diferentes scripts de prueba.

Legibilidad: El código del test es mucho más claro (parece lenguaje humano: loginPage.login(...)) en lugar de estar lleno de localizadores complejos.

<img width="1788" height="957" alt="image" src="https://github.com/user-attachments/assets/51a5219b-2b3c-4482-a87c-39c1bb0b715b" />


