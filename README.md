# Ordenar arreglos utilizando el algoritmo Merge-Sort
Este repositorio contiene la implementación de un algoritmo llamado *Merge-Sort*, que sirve para ordenar arreglos de números de menor a mayor. 

## Tabla de contenidos
- [Información general](#información-general)
- [Tecnologías Usadas](#tecnologías-usadas)
- [Funcionalidades](#funcionalidades)
- [¿Cómo configurar el proyecto?](#cómo-configurar-el-proyecto)
- [¿Cómo utilizar el proyecto?](#cómo-utilizar-el-proyecto)
- [Estátus del proyecto](#estátus-del-proyecto)
- [Áreas de Mejora](#áreas-de-mejora)
- [Agradecimientos](#agradecimientos)
- [Contacto](#contacto)

## Información General

### ¿Por qué usar algoritmos de ordenamiento?
**Orenar un arreglo de números es un proceso extremadamente importante en la computación.** Es relevante saber ordenar un conjunto de datos porque es mucho más eficiente hacer búsquedas sobre un conjunto de datos ordenados que sobre uno no ordenado. Por lo tanto, es importante conocer diferentes algorítmos de ordenamiento que se podrían usar optimizar procesos como búsquedas, por ejemplo. "Merge-Sort", el algorítmo que explicaremos a continuación, es un algorítmo que hace justamente eso: ordenar datos. 

### Características generales
Algunas características del algoritmo son: 
- Puede ordenar números de cualquier signo, sean positivos o negativos. 
- Tiene una complejidad logarítmica, por lo que es más rápido que un ordenamiento tradicional. 
- Divide al arreglo en múltiples partes, y las ordena por separado para optimizar el tiempo de procesamiento. 

### ¿Cómo funciona?
En términos simples, **el algorítmo divide el arreglo de números en partes iguales** (o casi iguales). Por ejemplo, un arreglo de 6 números se partiría en dos fracciones de 3 números. Luego, vuelve a hacer esto hasta que todas las partes estén conformadas por uno o dos números. Una vez que llega a este punto, el programa ordena los "pequeños arreglos" de números y los vuelve a juntar, asegurándose que, cuando lo haga, sea de menor a mayor, hasta terminar con un arreglo del mismo tamaño que el inicial, con los mismos números ordenados de menor a mayor. Si no ha quedado claro como funciona el algorítmo, pasemos a un **ejemplo**.

### Ejemplo con representación Visual

## Tecnologías Usadas
Este proyecto fue desarrollado en el lenguaje *Java*. Además, se utilizó *NetBeans* como nuestro entorno de desarrollo. 
Para más información sobre Java, hacer click [aqui](https://www.java.com/es/)
Para más información sobre NetBeans, hacer click [aqui](https://netbeans.apache.org/download/index.html).

## Funcionalidades
Como fue explicado en la [información general](#información-general), **el propósito principal del algorítmo "Merge-Sort" es ordenar números de menor a mayor**. Por lo tanto, la única funcionalidad de nuestro código es ordenar un arreglo de números enteros definido por el usuario. 

## ¿Cómo configurar el proyecto?
### Instalar el ambiente de desarrollo
Le recomendamos utilizar netbeans para para poder ver y operar el código. Si no lo ha descargado, puede hacerlo [aqui](https://netbeans.apache.org/download/index.html).
### Descargar el repositorio de código
Una vez que haya instalado netbeans, por favor descargue el código. En la [página principal de github del repositorio](https://github.com/rogergelio/Merge-Sort), haga click en **código-->descargar como zip**.
Si no logra encontrar el bóton, por favor utilice esta imagen como apoyo:

![Captura de pantalla (42)](https://user-images.githubusercontent.com/87195114/158710387-ce6248ac-74b3-480a-9325-b525e66527a8.png)

Posteriormente, usted deberá de crear una nueva carpeta en su computadora, y nombrarla como prefiera. Luego, en su carpeta de descargas, seleccione el archivo y descomprímalo dentro de la carpeta recién creada. 

### Agregar el código a NetBeans
Una vez que su carpeta con el código esté lista, abra NetBeans. Una vez dentro del programa, haga click en file-->Open Project en la esquina superior derecha. Luego, busque su carpeta utilizando la barra de búsqueda que está en la parte superior de la ventana que se acaba de abrir. Una vez que la haya encontrado, seleccionela y de click en Open Project. Si no logra encontrar los botones, por favor apóyese en la siguiente imagen: 

![Captura de pantalla (44)](https://user-images.githubusercontent.com/87195114/158711049-40a4d14b-a7c6-4855-b18a-b19a24861781.png)

## ¿Cómo utilizar el proyecto?
Una vez que haya importado el proyecto correctamente, dirígase al método "main", ubicado hasta el final del código. Si no lo logra localizar, la siguiente imagen podría serle de utilidad:
![Captura de pantalla (43)](https://user-images.githubusercontent.com/87195114/158709686-017bb96f-05c2-42e8-8347-f99020cb2c60.png)
Para darle al programa un arrelgo de números, ingreselos dentro de los corchetes a la derecha de la variable p. Los números deben de ir seguidos por una coma, excepto por el útlimo. Un ejemplo de un arreglo podría ser [2,3,7,-1,5]. Es importante aclarar que el programa no procesará números que no sean enteros. 
Una vez que se haya terminado de declarar el arreglo de números haga click en el botón de "run". Si no lo encuentra, puede apoyarse en este imagen:

![Captura de pantalla (45)](https://user-images.githubusercontent.com/87195114/158712070-21aae597-9059-4326-858d-aa4aabc1bded.png)

Posteriormente, verá dos arreglos impresos en consola. El primero será su arreglo original. El segundo será su arreglo ordenado de mayor a menor. 

## Estátus del proyecto
Este proyecto fue completado en diciembre del 2020. 
## Áreas de Mejora
Aunque el algoritmo Merge-Sort sin duda es mejor que un algorítmo tradicional de ordenamiento para ordenar un arreglo de números de menor a mayor, es importante aclarar que todavía existen muchos algoritmos de ordenamiento aún más rápidos, como por ejemplo el [quicksort](https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm).
## Agradecimientos
Este proyecto fue realizado con la ayuda de mi compañero Alexander Perelman. 
## Contacto
Para cualquier duda sobre el proyecto, por favor mándeme un correo a: *rogergeliotorres@gmail.com*. 
