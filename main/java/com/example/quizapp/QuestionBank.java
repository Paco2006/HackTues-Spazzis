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