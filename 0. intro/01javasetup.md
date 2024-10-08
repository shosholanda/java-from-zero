# Instalación de Java

Cuando instalamos nuestro sistema operativo, normalmente no viene con el lenguaje Java instalado por omisión. Debemos descargarlo e instalarlo. Podemos verificar si ya está instalado con el comando
```bash
$ java --version ; javac --version
```

Si nos manda error, significa que hay que instalarlo.

Antes de instalar cualquier programa en nuestro sistema UNIX, debemos tener conexión a internet, y tener actualizado el gestor de paquetes de UNIX. El gestor de paquetes es básicamente el instalador que tenemos desde la terminal. Lo actualizamos de la siguiente manera.

```bash
$ sudo apt update && sudo apt upgrade
```

*Ojo: Tener actualizado el gestor nos garantizará descargar la última versión disponible del programa que queremos instalar*

Una vez puesta nuestra contraseña, y esperar a que se actualice, usaremos el siguiente comando para instalar la versión de java 11 (la más usada hasta la fecha). Ya existen versiones más recientes, pero con la 11 es más que suficiente para poder explotar al máximo el poder de este lenguaje. Para ahorrarnos un poco de detalles técnicos como instalar para nuestra distribución de Linux exactamente, o la versión de las actualizaciones de java, usamos.

```bash
$ sudo apt install default-jre
$ sudo apt install default-jdk
```

En realidad, se van a instalar 2 cosas.

1. El ejecutador de aplicaciones de java (Java Running Enviroment)
2. El compilador de código de java (Java Development Kit)

El primero nos ayudará a ejecutar nuestros programas, que deben ser primero compilados (traducidos) a lenguaje de máquina (bytecode) por el segudo programita. Con estos 2 es más que suficiente para poder empezar a trabajar con Java!

Si no se pudo instalar, habría que buscar en internet cómo instalar java para tu caso particular (si usas otra distro o no tienes los controladores instalados. Siempre puedes pedir ayuda a los ayudantes de cualquier materia de computación y te pueden guiar!)

Finamente, hay que revisar si se instaló correctamente utilizando el comando del inicio.
