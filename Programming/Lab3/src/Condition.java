public enum Condition {

    SILENCE{
        @Override
        public String toString() {
            return "silence and immobility ";//безмолвие
        }
    },

    SCARY{
        @Override
        public String toString(){
            return " scary and look around ";
        }
    },

    SHIVER{
        @Override
        public String toString(){
            return " began shiver ";
        }
    };

    @Override
    public String toString() {
        return "Condition{}";
    }
}


