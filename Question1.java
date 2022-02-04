//Program to count vowels, consonants, digits, and spaces
class Question1 {

    public static void main(String[] args) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        
        String line = "This is programming exercise 1";
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            //Solution 1
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
            consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
            digits++;
            }
            else if (ch == ' ') {
            spaces++;
            }

            //Solution 2
            // if(Character.isDigit(ch))
            //     digits++;
            // else if(Character.isWhitespace(ch))
            //     spaces++;
            // else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            //     vowels++;
            // else
            //     consonants++;
      }
  
      System.out.println("Vowels: " + vowels);
      System.out.println("Spaces: " + spaces);
      System.out.println("Consonants: " + consonants);
      System.out.println("Digits: " + digits);
    }
  }