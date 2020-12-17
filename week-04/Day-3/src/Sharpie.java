public class Sharpie {

        public String color;
        public float width;
        public float inkAmount;


        public Sharpie(String color, float width) {
            this.color = color;
            this.width = width;
            this.inkAmount = 100;
        }

        public void use(float usedAmount) {
            this.inkAmount = this.inkAmount - usedAmount;
        }
}
