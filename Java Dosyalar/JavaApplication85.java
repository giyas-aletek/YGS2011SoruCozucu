package javaapplication85;

public class JavaApplication85 {
    public static double eval(String str) {
    return new Object() {
        int pos = -1, ch;

        void nextChar() {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }

        boolean eat(int charToEat) {
            while (ch == ' ') nextChar();
            if (ch == charToEat) {
                nextChar();
                return true;
            }
            return false;
        }

        double parse() {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }

        // kural:
        // ifade = term | ifade `+` term | ifade `-` term
        // term = factor | term `*` factor | term `/` factor
        // factor = `+` factor | `-` factor | `(` ifade `)`
        //        | rakam | fonksiyon factor | factor `^` factor

        double parseExpression() {
            double x = parseTerm();
            for (;;) {
                if      (eat('+')) x += parseTerm(); // ekleme
                else if (eat('-')) x -= parseTerm(); // cikarma
                else return x;
            }
        }

        double parseTerm() {
            double x = parseFactor();
            for (;;) {
                if      (eat('*')) x *= parseFactor(); // carpma
                else if (eat('/')) x /= parseFactor(); // bolme
                else return x;
            }
        }

        double parseFactor() {
            if (eat('+')) return parseFactor(); // tekli artı
            if (eat('-')) return -parseFactor(); // tekli eksi

            double x;
            int startPos = this.pos;
            if (eat('(')) { // parantezler
                x = parseExpression();
                eat(')');
            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // rakamlar
                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } else if (ch >= 'a' && ch <= 'z') { // fonkisyonlar
                while (ch >= 'a' && ch <= 'z') nextChar();
                String func = str.substring(startPos, this.pos);
                x = parseFactor();
                if (func.equals("sqrt")) x = Math.sqrt(x);
                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                else throw new RuntimeException("Unknown function: " + func);
            } else {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }

            if (eat('^')) x = Math.pow(x, parseFactor()); // üs alma

            return x;
        }
    }.parse();
}

    public static void main(String[] args) {

        System.out.println(eval("((5 - 2 + 1) * 2 ^ 1)"));
    }
    
}
