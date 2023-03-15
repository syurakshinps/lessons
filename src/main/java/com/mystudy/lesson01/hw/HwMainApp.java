package com.mystudy.lesson01.hw;

/*
1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих
класса).
2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
препятствия.
3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
проплыть.
5. * Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.

 */

import com.mystudy.lesson01.hw.animal.*;

public class HwMainApp {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat(200, 0,"Murzik"),
                new Dog(500, 0, "Bobik"),
                new Dog(10, 20, "Bobik2"),
                new Tiger(1000, 100, "Sherkhan"),
                new GenericAnimal(100, 1000, "BigFoot")};

        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(90);
        }

        System.out.println("I created " + Cat.count + " cat(s)");
        System.out.println("I created " + Dog.count + " dog(s)");
        System.out.println("I created " + Tiger.count + " tiger(s)");
        System.out.println("I created " + GenericAnimal.count + " generic animal(s)");
        System.out.println("I created " + Animal.counterAnimal + " animal(s)");

    }

}
