package br.curso.poo.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Person {

    Person() {}

    Person(Person clone) {
        this.name = clone.name;
        this.friend1 = clone.friend1 != null ? new Person(clone.friend1, false) : null;
        this.friend2 = clone.friend2 != null ? new Person(clone.friend2, false) : null;
    }

    private Person(Person clone, boolean lazzy) {
        this.name = clone.name;
        if (!lazzy) {
            this.friend1 = new Person(clone.friend1, true);
            this.friend2 = new Person(clone.friend2, true);
        }
    }

    String name;

    Person friend1;

    Person friend2;
}

class Exec {

    /**
     * Precisamos criar uma lista de Objetos que possuam
     * duas referências para outras instâncias da mesma classe.
     *
     * Essas referências não possuem um padrão de ordem.
     *
     * Precisamos garantir que vamos copiar os mesmo valores dos objestos,
     * bem como suas respectivas referências na mesma ordem.
     *
     * Devemos separá-los em listas diferentes e printar os seus valores
     * no final do programa para uma comparação.
     * @param args
     */
    public static void main(String... args) {
        List<Person> friends = new ArrayList<Person>(5);
        List<Person> friendsBackup = new ArrayList<Person>(5);
        start(5, friends);
        shuffle(5, friends);
        print(friends);
        copy(friends, friendsBackup);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        print(friendsBackup);
    }

    private static void start(int qtd, List<Person> friends) {
        for (int i = 0; i < qtd; i++) {
            addFriend(i + 1, friends);
        }
    }

    private static void addFriend(int number, List<Person> friends) {
        Person person = new Person();
        person.name = "Person " + String.valueOf(number);
        friends.add(person);
    }

    private static void shuffle(int qtd, List<Person> friends) {
        Random random = new Random();
        for (Person person : friends) {
            person.friend1 = friends.get(random.nextInt(qtd));
            person.friend2 = friends.get(random.nextInt(qtd));
        }
    }

    private static void print(List<Person> friends) {
        for (Person person : friends) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("@ Name: " + person.name);
            System.out.println("@ friend1: " + (person.friend1 != null ? person.friend1.name : "") );
            System.out.println("@ friend2: " + (person.friend2 != null ? person.friend2.name : "") );
        }
    }

    private static void copy(List<Person> from, List<Person> to) {
        for (Person person : from) {
            to.add(new Person(person));
        }
    }
}