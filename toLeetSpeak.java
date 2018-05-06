import java.util.*;
import java.lang.*;

class Kata {
    static String toLeetSpeak(final String speak) {
    // initialize StringBuilder, which will give the answer
    StringBuilder answer = new StringBuilder();
    // first take the string and analyze each character
    for (char letter : speak.toCharArray())
    {
      switch(letter)
      {
        case 'A': answer.append('@');
                  break;
        case 'B': answer.append('8');
                  break;
        case 'C': answer.append('(');
                  break;
        case 'D': answer.append('D');
                  break;
        case 'E': answer.append('3');
                  break;
        case 'F': answer.append('F');
                  break;
        case 'G': answer.append('6');
                  break;
        case 'H': answer.append('#');
                  break;
        case 'I': answer.append('!');
                  break;
        case 'J': answer.append('J');
                  break;
        case 'K': answer.append('K');
                  break;
        case 'L': answer.append('1');
                  break;
        case 'M': answer.append('M');
                  break;
        case 'N': answer.append('N');
                  break;
        case 'O': answer.append('0');
                  break;
        case 'P': answer.append('P');
                  break;
        case 'Q': answer.append('Q');
                  break;
        case 'R': answer.append('R');
                  break;
        case 'S': answer.append('$');
                  break;
        case 'T': answer.append('7');
                  break;
        case 'U': answer.append('U');
                  break;
        case 'V': answer.append('V');
                  break;
        case 'W': answer.append('W');
                  break;
        case 'X': answer.append('X');
                  break;
        case 'Y': answer.append('Y');
                  break;
        case 'Z': answer.append('2');
                  break;
        case ' ': answer.append(' ');
                  break;
        default: answer.append(letter);
                break;
      }
    }
    return answer.toString();
    }
}
