package com.example.quizapp;

import java.util.ArrayList;
import java.util.Random;

public class QuestionRepository {
    private ArrayList<Question> questions;

    public QuestionRepository() {
        questions.add(
                new Question(
                        "Which disease devastated livestock across the UK during 2001?",
                        new String[]{
                                "Hand-and-foot",
                                "Foot-in-mouth",
                                "Hand-to-mouth",
                                "Foot-and-mouth"
                        },
                        1
                ));
        questions.add(
                new Question(
                        "Which of these kills its victims by constriction?",
                        new String[] {
                                "Andalucia",
                                "Anaconda",
                                "Andypandy",
                                "Annerobinson"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "Which of these might be used in underwater naval operations?",
                        new String[] {
                                "Frogmen",
                                "Newtmen",
                                "Toadmen",
                                "Tadpolemen"
                        },
                        0
                )
        );
        questions.add(
                new Question(
                        "In the UK, VAT stands for value-added ...?",
                        new String[] {
                                "Transaction",
                                "Total",
                                "Tax",
                                "Trauma"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "What are you said to do a habit when you break it?",
                        new String[] {
                                "Throw it",
                                "Punch it",
                                "Kick it",
                                "Eat it"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "Where do you proverbially wear your heart, if you show your true feelings?",
                        new String[] {
                                "On your collar",
                                "On your lapel",
                                "On your cuff",
                                "On your sleeve"
                        },
                        3
                )
        );
        questions.add(
                new Question(
                        "What might an electrician lay?",
                        new String[] {
                                "Tables",
                                "Gables",
                                "Cables",
                                "Stables"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "What would a 'tattie picker' harvest?",
                        new String[] {
                                "Raspberries",
                                "Corn",
                                "Potatoes",
                                "Apples"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "Which of these means adequate space for moving in?",
                        new String[] {
                                "Elbow room",
                                "Foot rest",
                                "Ear hole",
                                "Knee lounge"
                        }, 0
                )
        );
        questions.add(
                new Question(
                        "How is a play on words commonly described?",
                        new String[] {
                                "Pan",
                                "Pin",
                                "Pen",
                                "Pun"
                        },
                        3
                )
        );
        questions.add(
                new Question(
                        "Which colour is used as a term to describe an illegal market in rare goods?",
                        new String[] {
                                "Blue",
                                "Red",
                                "Black",
                                "White"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "Which character was first played by Arnold Schwarzenegger in a 1984 film?",
                        new String[] {
                                "The Demonstrator",
                                "The Instigator",
                                "The Investigator",
                                "The Terminator"
                        },
                        3
                )
        );
        questions.add(
                new Question(
                        "Which of these would a film actor like to receive?",
                        new String[] {
                                "Oliver",
                                "Oscar",
                                "Oliphant",
                                "Osbert"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "In which country would you expect to be greeted with the word 'bonjour'?",
                        new String[] {
                                "Italy",
                                "France",
                                "Spain",
                                "Wales"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "What name is given to the person traditionally attends the groom on his wedding?",
                        new String[] {
                                "Best man",
                                "Top man",
                                "Old man",
                                "Poor man"
                        },
                        0
                )
        );
        questions.add(
                new Question(
                        "Which word follows 'North' and 'South' to give the names of two continents?",
                        new String[] {
                                "Africa",
                                "America",
                                "Asia",
                                "Australia"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "Which country is not the name of an English country?",
                        new String[] {
                                "Madagascar",
                                "Cuba",
                                "Germany",
                                "Jamaica"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "Which is not the name of an English county?",
                        new String[] {
                                "Lancashire",
                                "Leicestershire",
                                "Liverpoolshire",
                                "Lincolnshire"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "Which of these is a fashionable district of London?",
                        new String[] {
                                "Bulgaria",
                                "Belgravia",
                                "Belgrade",
                                "Belgium"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "What name is given to a playing card with a single symbol on it?",
                        new String[] {
                                "Whizz",
                                "Hotshot",
                                "Ace",
                                "Star"
                        },
                        2
                )
        );
        questions.add(
                new Question(
                        "What would you normally do with a beret?",
                        new String[] {
                                "Eat it",
                                "Play it",
                                "Sit on it",
                                "Wear it"
                        },
                        3
                )
        );
        questions.add(
                new Question(
                        "Which of these is a tool for shaping and smoothing wood?",
                        new String[] {
                                "Train",
                                "Plane",
                                "Car",
                                "Bike"
                        },
                        1
                )
        );
        questions.add(
                new Question(
                        "What do the Americans call what we call sweets?",
                        new String[] {
                                "Randy",
                                "Dandy",
                                "Sandy",
                                "Candy"
                        },
                        3
                )
        );
        questions.add(
                new Question(
                        "Which of these is a spicy, Cajun chicken or seafood dish?",
                        new String[] {
                                "Gumbo",
                                "Dumbo",
                                "Bimbo",
                                "Rambo"
                        },
                        0
                )
        );
        questions.add(
                new Question(
                        "What would you expect to see at the London Aquarium?",
                        new String[] {
                                "Flowers",
                                "Trees",
                                "Steam rollers",
                                "Fish"
                        }, 3
                )
        );
    }

    public Question getRandomQuestion() {
        Random r = new Random();
        int questionIndex = r.nextInt(questions.size()) + 1;
        return questions.get(questionIndex);
    }
}
