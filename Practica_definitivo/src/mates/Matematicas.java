/*
Copyright 2021 Javier García Carbia
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.
 */
package mates;

/**
 * @author Javier García Carbia
 */

public class Matematicas{
    public static double generarNumeroPi(int puntosTotales) {
        double x;
        double y; //Definimos x e y
        int aciertos = 0; //Establecemos el parámetro aciertos
        for(int i=1; i<=puntosTotales; i++){ //Creamos la condición for
            x=Math.random(); //Establecemos que los parámetros x e y sean aleatorios
            y=Math.random();
            if(x*x+y*y<1) aciertos++; //Si los parámetros x e y son menores que 1 el número de aciertos aumentará
        }
        double numeroPi = 4.0*aciertos/puntosTotales; //Realizamos la fórmula del área del círculo previamente comentada en el enunciado
        return numeroPi;
    }
    

}