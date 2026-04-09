package com.harsh.oop.accessmodifiers;

public class Player {
    String name;
    private int guess;
    public String handle;

    public int setGuess(int guess) {
        if (guess >= 0) {
            this.guess = guess;
        }
        return this.guess;
    }

    public int getGuess() {
        return guess;
    }

    private void assignItem(){
        // what this code/method does? write here ------------------
    }
    public void setName(int teamId){
        //        -------
    }
}


//public - The access level of a public modifier is everywhere. It can be accessed from within the class,
//          outside the class, within the package and outside the package
//
//protected - The access level of a protected modifier is within the package and outside the package
//             through child class. If you do not make the child class, it cannot be accessed from outside the package.
//
//private - The access level of a private modifier is only within the class. It cannot be accessed from
//          outside the class.
//
//default - The access level of a default modifier is only within the package. It cannot be accessed from
//          outside the package. If you do not specify any access level, it will be the default.