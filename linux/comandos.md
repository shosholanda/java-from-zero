## Comandos básicos

1. Lista los contenidos de un directorio 
-la para más información
```bash
$ ls
$ ls -la
```

2. Cambia de carpeta a la de la ruta especificada
 - .. = carpeta arriba
 - carpeta/ = dentro de la carpeta "carpeta/"
```bash
$ cd ..
$ cd carpeta/
```

3. Imprime el texto dentro de " " en la terminal
```bash
$ echo "Mensaje"
```

4. Limpia el espacio de trabajo de la terminal
```bash
$ clear
```

5. Muestra el historial de los últimos 2000 comandos
```bash
$ history
```

6. Completar con tabulador x2
Ahorra tiempo al escribir el nombre de un archivo que ya sabemos que existe. Ejemplo
```bash
$ ls
 Descargas   Documentos   Escritorio   Imágenes   Música   Plantillas   Público   snap   Vídeos  'VirtualBox VMs'
$ cd D   (Apretar 2 veces tab)
Descargas/  Documentos/ (apretar o y una vez tab)
$ cd Documentos/
/Documentos$
```

7. Manual de cualquier comando
Una guía de cómo usar y para qué sirve un comando X. Apretar "q" para salir.
```bash
$ man history
LS(1)                                               User Commands                                               LS(1)

NAME
       ls - list directory contents

SYNOPSIS
       ls [OPTION]... [FILE]...

DESCRIPTION
       List  information  about the FILEs (the current directory by default).  Sort entries alphabetically if none of
       -cftuvSUX nor --sort is specified.

       Mandatory arguments to long options are mandatory for short options too.

       -a, --all
```
8. Muestra el orden jerárquico de las carpetas y subcarpetas de una ruta
Ojo: Si no está instalado, puedes instalarlo con: *sudo apt install tree*
```bash
$ tree
```

## Comandos para archivos

1. Crear un archivo llamado "linux"
```bash
$ touch linux
```

2. Crea una carpeta llamada "tux"
```bash
$ mkdir tux
```

3. Elimina un archivo llamado "penny"
si penny no es un archivo, no se borra.
```bash
$ rm penny
```

4. Elimina una carpeta llamada "nolok" y todos sus contenidos.

Si "nolok" no es una carpeta, no se borra
```bash
$ rm -r nolok
```

5. Mueve el archivo *A* a una ruta *B*
También sirve para renombrar archivos
```bash
$ mv linux tux/
(renombrar archivos)
$ mv linux linux_nuevo 
```

6. Muestra el contenido "tal cual" de un archivo
```bash
$ cat linux_nuevo
```

7. Ejecuta el comando X como super usuario (admin)
```bash
$ sudo X
```
8. Abrir con el programa *A* el archivo *X*
```bash
$ A X
ejemplo
$ nano linux_nuevo
```

9. Salir de una terminal
```bash
$ exit
```

## Comandos terminal
- Copiar una selección en la terminal
```bash
Ctrl Shift C
```
- Pegar un texto copiado
```bash
Ctrl Shift V
```
- Matar un comando ejecutado
```bash
Ctrl C
```
- 