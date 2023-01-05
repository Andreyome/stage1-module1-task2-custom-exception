package com.epam.mjc;

import java.util.IllegalFormatException;

public class WrongIdException extends IllegalArgumentException {
    public WrongIdException ( long id){
        super ("Could not find student with ID "+ id);
    }


 }

