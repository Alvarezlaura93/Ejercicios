public class reverseword {


    public static void main(String[] args) {
        String str = "hola como estas ";
        System.out.println(reverseword(str));
        System.out.println("-------------------------");
        System.out.println(reversewordmanually(str));

    }
    public  static String reverseword(String str){
        return new StringBuilder(str)
                .reverse().toString();

        }

        public static String reversewordmanually(String str){
        StringBuilder sb= new StringBuilder();
            for (int i =str.length()-1  ; i >=0 ; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }

    }

///StringBuilder y StringBuffer son clases que permiten crear objetos
// que almacenan cadenas de caracteres que pueden ser modificadas sin necesidad
// de crear nuevos objetos. Los métodos append, replace e insert que poseen StringBuilder
// y StringBuffer, permiten manipular las cadenas de caracteres.