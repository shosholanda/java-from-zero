# Introducción a Java

Antes de empezar a programar, sería bueno entrar un poco en contexto, además de que no se volverá a repetir esta información por el resto de la guía (o tal vez de sus vidas).

### *¿Qué es Java?*
Java es un lenguaje de programación orientado a objetos, creado en 1995 por Oracle. Es usado por más de 3 billones de dispositivos como
- Teléfonos celulares (Android)
- Aplicaciones Web (Linkedin, Aliexpress, blogspot...)
- Aplicaciones de escritorio (Oficina, editores, navegadores...)
- Juegos (Minecraft por supuesto!)
- Dispositivos electrónicos (impresoras, refrigeradores, pantallas...)
- Y mucho más!
     
Así como del castellano salió el español, Java fue creado e inspirado en C, otro lenguaje de programación más antiguo, y por lo mismo es como si aprendieras 2 lenguajes al mismo tiempo! Además de que es seguro, eficiente, es multiplataforma, es decir se puede ejecutar en cualquier sistema operativo.

### *¿Qué es un lenguaje de programación?*
Un lenguaje de programación es un **idioma** que nos permite comunicarnos de una manera más fácil con la computadora. Cualquier dispositivo electrónico, ya sea calculadora, microondas, lavadora, computadora, televisión etc, su forma de operar es utilizando binario, el 0 y 1, o sea bits.

Un simple texto que podemos leer, para la computadora es una cosa totalmente diferente (izquierda). 
```
$ echo "Si siempre haces lo que sabes hacer, no llegarás a ser más de lo que ya eres." | hexdump -C
00000000  53 69 20 73 69 65 6d 70  72 65 20 68 61 63 65 73  |Si siempre haces|
00000010  20 6c 6f 20 71 75 65 20  73 61 62 65 73 20 68 61  | lo que sabes ha|
00000020  63 65 72 2c 20 6e 6f 20  6c 6c 65 67 61 72 c3 a1  |cer, no llegar..|
00000030  73 20 61 20 73 65 72 20  6d c3 a1 73 20 64 65 20  |s a ser m..s de |
00000040  6c 6f 20 71 75 65 20 79  61 20 65 72 65 73 2e 0a  |lo que ya eres..|
00000050
```

Cada caracter significa un número para la computadora, un numero que ha sido construido utilizando números binarios. Más adelante veremos que un caracter representa un byte (8 bits).

Por lo que, para nosotros, es más fácil entender y escribir cosas de la derecha, que de la izquierda. (Obviamente hay gente mazoquista, pero eso es otro tema). Así los lenguajes de programación nos facilitan la traducción de palabras que entendemos a estos números raros que solo la computadora conoce, y así podemos transmitir nuestras ideas y algoritmos para que la computadora los entienda y los realice con la ventaja de que es muy muy precisa y rápida! (no es inteligente nunca).

### *¿Qué es la orientación a objetos?*
Este es un concepto que irá quedando más claro conforme vayas avanzando en esta guía. Por lo mientras, puedes pensar que el propósito es que podemos "meter" objetos de la vida real (un avión, un gato, una persona, una manzana etc) dentro de la computadora.

Claramente no es posible meter 100 personas dentro de una computadora, (tal vez en los años 50 cuando las computadoras eran del tamaño de una casa), pero podemos "transformar" los objetos a algo que pueda la computadora leer, guardar y operar, como lo son los números enteros, números de punto decimal, texto, valores de verdadero o falso etc.

Por ejemplo, podemos representar un gato dentro de la computadora si nos fijamos en las cualidades o características del gato de la vida real como:
    - edad del gato
    - peso del gato
    - nombre del gato
    - está vivo o esta muerto
    - número de patas
    - macho o hembra
    - color del gato
    - etc.

Podemos definir tantas cosas quereamos, mientras más características, más preciso será nuestro objeto dentro de la computadora. Sin embargo, todo son números y texto que la computadora puede operar. Ya si queremos generar una imagen del gato 3D o un dibujo que lo represente debemos acudir al tema de "graficación" pero esto es solo una representación visual del objeto, lo importante es que internamente esté definido.

La programación orientada a objetos es un "**Paradigma**" de programación, una religión, una forma de programar. No existe el lenguaje supremo, o menos valioso, todos los lenguajes contribuyen a solucionar ciertos tipos de problemas. Para nuestra fortuna, Java es de propósito general, o sea

## Si lo puedes imaginar, lo puedes programar. - Alejandro Taboada (Programación ATS).

La cuestión está solo en imaginarlo correctamente, y todo lo demás es apretar teclas !