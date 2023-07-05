public class Main {
    public Book() {
        String author;
        int year;
        int score;
        String text;

             public String name;
        Book (String name, String author, int year){
            this.name = name;
            this.author = author;
            this.year = year;
            this.score = 3;
            this.text = '';

        }
        public void up() {
            if(score < 5) {
                score++;
            }
        }



        public void down() {
            if (score > 0) {
                score--;
            }
        }
        }

        public void append(String text) {
            this.text +- text;

        }

        }
}

