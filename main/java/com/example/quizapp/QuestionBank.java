package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> planetLayoutQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which is the smallest planet within our solar system?", "Venus", "Mars", "Uranus", "Mercury", "Mercury", "");
        final QuestionsList question2 = new QuestionsList("The moon called Titan orbits which planet?", "Saturn", "Jupiter", "Mercury", "Earth", "Saturn", "");
        final QuestionsList question3 = new QuestionsList("Which is the brightest planet in the night’s sky?", "Earth", "Jupiter", "Neptune", "Venus", "Venus", "");
        final QuestionsList question4 = new QuestionsList("Uranus has only been visited by what spacecraft?", "Pioneer 11", "The Voyager 2", "New Horizons", "The Voyager 1", "", "");
        final QuestionsList question5 = new QuestionsList("On which planet have been more missions versus any other planet?", "Mars", "Venus", "Uranus", "Jupiter", "", "");
        final QuestionsList question6 = new QuestionsList("Which of these planets can’t be seen without a telescope?", "Venus", "Neptune", "Mars", "Mercury", "", "");
        final QuestionsList question7 = new QuestionsList("Phobos and Deimos are the Moons of which planet?", "Jupiter", "Mars", "Earth", "Venus", "", "");
        final QuestionsList question8 = new QuestionsList("Which planet is closest in size to Earth?", "Uranus", "Mars", "Venus", "Mercury", "", "");
        final QuestionsList question9 = new QuestionsList("Which planet has the most moons?", "Earth", "Venus", "Saturn", "Mars", "", "");
        final QuestionsList question10 = new QuestionsList("Which planets have no moons?", "Uranus and Jupiter ", "Mercury and Mars", "Mercury and Earth", "Mercury and Venus", "", "");
        final QuestionsList question11 = new QuestionsList("Which planet has supersonic winds?", "Jupiter", "Neptune", "Saturn", "Earth", "", "");
        final QuestionsList question12 = new QuestionsList("Which planet has the fastest rotation?", "Earth", "Jupiter", "Venus", "Neptune", "", "");
        final QuestionsList question13 = new QuestionsList("How long is one year on Jupiter?", "24 Earth years", "12 Earth years", "5 Earth years", "7 Earth years", "", "");
        final QuestionsList question14 = new QuestionsList("Which is the oldest planet in our solar system?", "Jupiter", "Mars", "Earth", "Neptune", "", "");
        final QuestionsList question15 = new QuestionsList("Which planet is known as the Morning Star?", "Mercury", "Mars", "Venus", "Saturn", "", "");
        final QuestionsList question16 = new QuestionsList("Which planet is known as the Evening Star?", "Venus", "Neptune", "Uranus","Mercury","Venus" , "");
        final QuestionsList question17 = new QuestionsList("Which planet doesn’t have rings around them?", "Neptune", "Uranus", "Earth", "Saturn", "Earth", "");
        final QuestionsList question18 = new QuestionsList("Which planet has the most volcanoes?", "Earth", "Venus", "Jupiter", "Saturn", "Venus", "");
        final QuestionsList question19 = new QuestionsList("In what year did Pluto become reclassified as a dwarf planet?", "1997", "2002", "2005", "2006", "2006", "");
        final QuestionsList question20 = new QuestionsList("Which planet rotates on its side?", "Uranus", "Mars", "Venus", "Jupiter", "Uranus", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);


        return questionsLists;

    }


    private static List<QuestionsList> astrouLayoutQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Who was the first astronaut that went to space?", "Alan Shepard", "Percy Greg", "Yuri Gagarin", "Pavel Popovich", "Yuri Gagarin", "");
        final QuestionsList question2 = new QuestionsList("The first bulgarian astronaut is?", "Georgi Aleksandrov", "Aleksandar Aleksandrov", "Valentina Teshkerova", "Georgi Ivanov", "Georgi Ivanov", "");
        final QuestionsList question3 = new QuestionsList("The second bulgarian astronaut is?", "Aleksandar Aleksandrov", "Georgi Popov", "Georgi Ivanov", "Ivan Todorov", "Aleksandar Aleksandrov", "");
        final QuestionsList question4 = new QuestionsList("The first person to step on the Moon is?", "James Lovell", "Harrison Schmitt", "Yuri Gagarin", "Neil Armstrong", "Neil Armstrong", "");
        final QuestionsList question5 = new QuestionsList("From which county was the first Asian astronaut?", "Vietnam", "China", "Japan", "India", "Vietnam", "");
        final QuestionsList question6 = new QuestionsList("Who holds the record for being the oldest person in space?", "Scott Kelly", "Mark Vande Hei", "Guion Bluford", "John Glenn", "John Glenn", "");
        final QuestionsList question7 = new QuestionsList("Which is the first private manned spacecraft?", "V-2", "SpaceShipOne", "Sputnik 1", "Luna 3", "SpaceShipOne", "");
        final QuestionsList question8 = new QuestionsList("Who holds the record for the longest single stay in space?", "Pyotr Dubrov", "Oleg Novitsky", "Valeri Polyakov", "Anton Shkaplerov", "Valeri Polyakov", "");
        final QuestionsList question9 = new QuestionsList("Who was the first american astronaut?", "Neil Armstrong", "Alan Shepard", "Scott Kelly", "Ronald McNair", "Alan Shepard", "");
        final QuestionsList question10 = new QuestionsList("The farthest distance that humans have traveled goes to the crew of which spacecraft?", "Apollo 11", "Apollo 13", "V-2", "Pioneer 10", "Apollo 13", "");
        final QuestionsList question11 = new QuestionsList("Which astronaut is \"The hero of Soviet Union\"?", "Yuri Gagarin", "Sergei Krikalev", "Valeri Polyakov", "Antom Shkaplerov", "Sergei Krikalev", "");
        final QuestionsList question12 = new QuestionsList("Who was the first space tourist?", "Dennis Tito", "Ronald McNair", "James Adamson", "Hazza AI Mansouri", "Dennis Tito", "");
        final QuestionsList question13 = new QuestionsList("When was the first monkey sent into space?", "1949", "1964", "1948", "1952", "1948", "");
        final QuestionsList question14 = new QuestionsList("Who has spent the most time in space?", "Sergei Krikalev", "Gennady Padalka", "Yuri Malenchenko", "Fyodor Yurchikhin", "Gennady Padalka", "");
        final QuestionsList question15 = new QuestionsList("Frank Borman, Jim Lovell and Bill Anders became the first humans to orbit the moon and were crew of which sapcecraft?", "Vanguard 1", "Prospero X-3", "Apolo 11", "Apolo 8", "Apolo 8", "");
        final QuestionsList question16 = new QuestionsList("Which language must astronauts know?", "english", "russian", "french", "chinese", "russian", "");
        final QuestionsList question17 = new QuestionsList("Who was the last man to walk on the moon?", "Alan Bean", "David Scott", "Ed White", "Eugene Cernan", "Eugene Cernan", "");
        final QuestionsList question18 = new QuestionsList("When did US left a memorial on the Moon for every astronaut who died in the pursuit of space exploration, including Russian Cosmonauts?", "1988", "1971", "1987", "2001", "1971", "");
        final QuestionsList question19 = new QuestionsList("which female astronaut holds the NASA record for the longest single spaceflight?", "Christina Koch", "Jessoca Meir", "Jessoca Watkins", "Anne McClain", "Christina Koch", "");
        final QuestionsList question20 = new QuestionsList("Which female engineer helped to launch Apollo 11?", "Ellen Ochoa", "Jeanette Scissum", "JoAnn Morgan", "Mary Jackson", "JoAnn Morgan", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        return questionsLists;

    }

    private static List<QuestionsList> rocketLayoutQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList();
        final QuestionsList question2 = new QuestionsList();
        final QuestionsList question3 = new QuestionsList();
        final QuestionsList question4 = new QuestionsList();
        final QuestionsList question5 = new QuestionsList();
        final QuestionsList question6 = new QuestionsList();


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    public static List<QuestionsList> getQuestion(String selectedTopic){
        switch(selectedTopic){

            case "planetLayout":
                return planetLayoutQuestions();
            case "astrouLayout":
                return astrouLayoutQuestions();
            default:
                return rocketLayoutQuestions();
        }
    }
}