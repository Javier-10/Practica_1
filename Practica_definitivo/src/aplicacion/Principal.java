/*
Copyright 2021 Javier García Carbia
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.
 */

package aplicacion;

/** 
 *   @author Javier García Carbia
 */

 import mates.Matematicas;

/**
 *  Esto servirá a la hora de ejecutar el programa, que se realice mediante el comando "java -cp bin aplicacion.Principal" seguido del número de puntos aleatorios a usar para calcular el número Pi
 */
public class Principal{
    public static void main (String[] args){
        System.out.println("El número PI es " + Matematicas.generarNumeroPi (Integer.parseInt(args[0])));
    }
}